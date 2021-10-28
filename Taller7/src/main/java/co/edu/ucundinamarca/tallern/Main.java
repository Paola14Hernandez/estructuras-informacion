
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void pila(){
        PilaLista pila=new PilaLista();
        pila.insertar(1);
        pila.insertar(2);
        pila.insertar(3);
        pila.insertar(4);
        pila.insertar(5);
        pila.insertar(6);
        
        log.info(pila.quitar());
        log.info(pila.quitar());
        log.info(pila.quitar());
        log.info(pila.quitar());
        log.info(pila.quitar());
        log.info(pila.quitar());        
    }
    public static void cola(){
        ColaLista cola=new ColaLista();
        
        cola.insertar(1);
        cola.insertar(2);
        cola.insertar(3);
        cola.insertar(4);
        cola.insertar(5);
        cola.insertar(6);
        
        log.info(cola.quitar());
        log.info(cola.quitar());
        log.info(cola.quitar());
        log.info(cola.quitar());
        log.info(cola.quitar());
        log.info(cola.quitar());
        
    }
    
    public static void main(String[] args) {
        pila();
        cola();
    }
    

}
