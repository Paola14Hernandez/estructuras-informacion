
package co.edu.ucundinamarca.tallern;


import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class MainPruebaFunciones {

    static Logger log = Logger.getLogger(MainPruebaFunciones.class.getName());

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        log. info("  FACTORIAL  ");
        log.info("Ingrese el numero para calcular su factorial: ");
        int  numero=entrada.nextInt();
        log.info(Funciones.factorial(numero));
        log.info(Funciones.factorialRec(numero));
        log.info("  POTENCIA  ");
        log.info("Ingrese el primer numero: ");
        double base=entrada.nextInt();
        log.info("Ingrese el exponente: ");
        double exponente=entrada.nextInt();
        log.info(Funciones.potencia(base,exponente));
    }

}
