
package co.edu.ucundinamarca.tallern;

/**
 *
 * @author Paola Hernandez
 */
public class ListasCircularDE {
    Nodo primero;
    Nodo ultimo;
    
    public ListasCircularDE(){
        primero=null;
        ultimo=null;
    }
    //metodo ingresar
    public void Ingresar(int a){
        Nodo nuevo=new Nodo();
        nuevo.dato=a;
        if(primero==null){
            primero=nuevo;
            primero.siguiente=primero;
            primero.anterior=ultimo;
            ultimo=nuevo;
        }else{
            ultimo.siguiente=nuevo;
            nuevo.siguiente=primero;
            ultimo=nuevo;
            primero.anterior=ultimo;
        }
    }
    
}
