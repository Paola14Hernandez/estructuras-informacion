package co.edu.ucundinamarca.tallern;

/**
 *
 * @author Paola Hernandez
 */
public class CaminosMinimo {
   
    //agoritmo de floyd
    
    public String algoritmoFloyd(long[][] matriz){
        int vertices = matriz.length;
         long matrizAdy[][]=matriz;
         String caminos[][]=new String[vertices][vertices];
         String caminosAuxiliares[][]=new String[vertices][vertices];
         String caminoRecorrido=" ",cadena=" ",caminitos=" ";
         int i,j,k;
         float temporal1,temporal2,temporal3,temporal4,minimo;
         for(i=0;i<vertices;i++){
             for(j=0;j<vertices;j++){
                 caminos[i][j]=" ";
                 caminosAuxiliares[i][j]=" ";
             }
         }
         for(k=0;k<vertices;k++){
             for(i=0;i<vertices;i++){
                 for(j=0;j<vertices;j++){
                     temporal1=matrizAdy[i][j];
                     temporal2=matrizAdy[i][k];
                     temporal3=matrizAdy[k][j];
                     temporal4=temporal2 + temporal3;
                     //Encontar distancia minima
                     minimo=Math.min(temporal1,temporal4);
                     if(temporal1 != temporal4){
                         if (minimo==temporal4){
                             caminoRecorrido="";
                             caminosAuxiliares[i][j]= k + " ";
                              caminos[i][j]=caminoR(i,k,caminosAuxiliares,caminoRecorrido)+ (k+1);
                         }
                     }
                     matrizAdy[i][j]=(long) minimo;
                 }
             }
         }
         //Agregamos el camino minimo a la cadena
         for(i=0;i<vertices;i++){
             for(j=0;j<vertices;j++){
                 //matriz minimos
                 cadena= cadena + "{ " + matrizAdy[i][j] + "]";
             }
             cadena = cadena +"\n";  
         }
         for(i=0;i<vertices;i++){
             for(j=0;j<vertices;j++){
                 if(matrizAdy[i][j] != 10){
                     if(i!=j ){
                         if(caminos[i][j].equals(" ")){
                             caminitos += "De (" + (i+1) + "--->"+(j+1)+") irse por..("+(i+1)+","+(j+1)+")\n";
                         }else{
                             caminitos += "De (" + (i+1) + "--->"+(j+1)+") irse por..("+(i+1)+","+caminos[i][j]+","+(j+1)+")\n";
                         }
                     }
                 }     
             }
         }
         return " La matriz de canbimos mas cortos engtre los diferebntes vertices es:"+cadena+"\n los diferentes canimos mas cortos entre vertices son:"+ caminitos;
    }
    
    public String caminoR(int i,int k,String [][] caminosAuxiliares,String caminoRecorrido){
        if(caminosAuxiliares[i][k]==""){
            return " ";
        }else{
            caminoRecorrido += caminoR(i,Integer.parseInt(caminosAuxiliares[i][k].toString()),caminosAuxiliares,caminoRecorrido)+(Integer.parseInt(caminosAuxiliares[i][k].toString())+1+",");
         return caminoRecorrido;
        }
    }
}
