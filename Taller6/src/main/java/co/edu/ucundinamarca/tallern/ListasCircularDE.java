
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 *
 * @author Paola Hernandez
 */
public class ListasCircularDE {
    static Logger log = Logger.getLogger(ListasCircularDE.class.getName());
    
    Nodo primero;
    Nodo ultimo;
     int dato;
    
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
    public void Mostrar(){
        Nodo actual=new Nodo();
        actual=primero;
        do{
            log.info(actual.dato);
            actual=actual.siguiente;
        }while(actual!=primero);
    } 
    public void Buscar(int x){
        Nodo actual=new Nodo();
        actual=ultimo;
        boolean encontrado=false;
        do{
            if(actual.dato==x){
                encontrado=true;
                dato=actual.dato;
            }
            actual=actual.anterior;
        }while(actual!=ultimo);
        if(encontrado==true){
            log.info("Nodo encontrado");
            log.info(dato);
        }else{
            log.info("Nodo no encontrado");
        }
    }
    
}
