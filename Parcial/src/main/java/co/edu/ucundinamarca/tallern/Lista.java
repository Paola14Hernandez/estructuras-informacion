package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 *
 * @author Paola Hernandez
 */
public class Lista {
    
    static Logger log = Logger.getLogger(Lista.class.getName());
    Nodo primero;
    Nodo ultimo;
    
    public  Lista(){
        primero=null;
        ultimo =null;         
    }
    
    public void ingresar(int dato){
        Nodo nuevo=new Nodo();
        nuevo.dato=dato;
        
        if(primero==null){
            primero=nuevo;
            primero.siguiente=null;
            ultimo = primero;
        }else{
            ultimo.siguiente=nuevo;
            nuevo.siguiente=null;
            ultimo=nuevo;
        }
    }
    
    public void Mostrar(){
        Nodo actual=new Nodo();
        actual=primero;
        while(actual != null){
        log.info(actual.dato);
        actual=actual.siguiente;
        }
    }
    public void Encontrar(){
        
    }
}
