package AdopcionMascota;

import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 *
 * @author Paola Hernandez
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Listas lista = new Listas();
        int opcion = 0;
        do {
            log.info("1. Ingresar un Nodo");
            log.info("2. Mostrar la lista");
            log.info("3. Buscar en la lista");
            log.info("4. Modificar");
            log.info("5. Salir");
            log.info("Elija una Opcion");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    log.info("Agregar datos al Nodo: ");
                    log.info("Ingrese la raza de la mascota:");
                    String Raza = teclado.next();
                    log.info("Ingrese la edad:");
                    int edad = teclado.nextInt();
                    log.info("Ingrese el sexo:");
                    String sexo = teclado.next();
                    log.info("Ingresa la especie de la mascota:");
                    String especie = teclado.next();
                    lista.Ingresar(Raza, edad, sexo, especie);
                    break;
                case 2:
                    log.info("Mostrar lista");
                    lista.Mostrar();
                    break;
            }    
        } while (opcion != 5);

    }

}
