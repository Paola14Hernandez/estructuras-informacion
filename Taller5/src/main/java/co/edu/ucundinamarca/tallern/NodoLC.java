
package co.edu.ucundinamarca.tallern;

/**
 *
 * @author Paola Hernandez
 */
public class NodoLC {
    int dato;
    NodoLC siguiente;
    
    public NodoLC(int d){
        dato=d;
        siguiente=this;
    }
    
}
