
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
       NodoPrincipal arbol=new NodoPrincipal();
       NodoPrincipal nodo=arbol.insertarRaiz("a");
       arbol.raiz.verNodo();
       
       arbol.insertar(nodo, "b", "a");
       arbol.insertar(nodo, "c", "a");
       arbol.insertar(nodo, "d", "a");
       arbol.insertar(nodo, "e", "c");
       arbol.insertar(nodo, "f", "c");
       arbol.insertar(nodo, "g", "f");
       arbol.verHijos(nodo);
    }

}
