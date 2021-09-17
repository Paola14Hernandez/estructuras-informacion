
package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        log.info("Ingrese el numero para calcular su factorial: ");
        int numero=entrada.nextInt();
        log.info(Funciones.factorial(40));
    }

}
