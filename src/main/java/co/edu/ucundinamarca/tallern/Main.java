
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        log.debug("Hello World : this is a debug message");
        log.info("Hello World : this is an info message");
        TADsGato gaspar=new TADsGato();
        log.debug(" Datos del gato ");
        gaspar.mostrarAnimal();
        gaspar.Comunicar();
        TADsPerro sasuke=new TADsPerro();
        log.debug(" Datos del perro ");
        sasuke.mostrarAnimal();
        sasuke.Comunicar();
    }

}
