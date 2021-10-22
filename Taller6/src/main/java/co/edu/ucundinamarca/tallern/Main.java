
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
       ListasCircularDE lista=new ListasCircularDE();
       lista.Ingresar(12);
       lista.Ingresar(2);
       lista.Ingresar(22);
       lista.Mostrar();
    }

}
