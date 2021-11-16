
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 *
 * @author Paola Hernandez
 */
public class NodoPrincipal {
    
    static Logger log = Logger.getLogger(NodoPrincipal.class.getName());
    
    String info;
    int numHijos;
    NodoPrincipal hijo[];
    NodoPrincipal hijosT[];

    public NodoPrincipal() {
    }
    
    
    public NodoPrincipal(String dato){
        this.info=dato;
        this.numHijos=0;
    }
    
    
    public void copiarHijos(){
        hijosT=new NodoPrincipal[numHijos + 1];
        for(int i =0; i<this.numHijos; i++){
            hijosT[i]=hijo[i];
        }
    }
    public void aumentarHijos(NodoPrincipal nodo){
        copiarHijos();
        hijosT[this.numHijos]=nodo;
        hijo=hijosT;
        this.numHijos++;
    }

    public String getDato() {
        return info;
    }

    public void setDato(String dato) {
        info = dato;
    }
    public void verNodo(){
        log.info(" " + info + " ");
    }
    public void insertar(NodoPrincipal nodo, String dato, String padre){
        NodoPrincipal nuevo=new NodoPrincipal(dato);
        
        if (nodo.getDato().equals(padre)){
            nodo.aumentarHijos(nuevo);
        }else{
            for(int i=0; i<nodo.numHijos;i++){
                if(nodo.hijo[i].getDato().equals(padre)){
                    nodo.hijo[i].aumentarHijos(nuevo);
                }else{
                    insertar(nodo.hijo[i],dato, padre);
                } 
            }
        } 
    }
    NodoPrincipal raiz;
    public NodoPrincipal insertarRaiz(String dato){
        raiz=new NodoPrincipal(dato);
        return raiz;
    }
    public void verHijos(NodoPrincipal nodo){
        for(int i=0; i<nodo.numHijos; i++){
           nodo.hijo[i].verNodo();
           verHijos(nodo.hijo[i]);
        }
    }
            
    
}
