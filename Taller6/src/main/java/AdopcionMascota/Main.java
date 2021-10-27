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
            log.info("1. Ingresar datos al nodo");
            log.info("2. Mostrar la lista");
            log.info("3. Buscar en la lista por edad");
            log.info("4. Buscar en la lista por la especie");
            log.info("5. Buscar en la lista por el sexo");
            log.info("6. Buscar en la lista por la raza");
            log.info("7. Eliminar Nodo");
            log.info("8. Salir");
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
                case 3:
                    log.info("Buscar");
                    log.info("Ingrese un dato a buscar por la edad:");
                    int edad1=teclado.nextInt();
                    lista.BuscarEdad(edad1);
                    break;
                case 4:
                    log.info("Buscar");
                    log.info("Ingrese un dato a buscar por la especie:");
                    String especie1=teclado.next();
                    lista.BuscarEspecie(especie1);
                    break;
                case 5:
                    log.info("Buscar");
                    log.info("Ingrese un dato a buscar por el sexo:");
                    String sexo1=teclado.next();
                    lista.BuscarSexo(sexo1);
                    break;
                case 6:    
                    log.info("Buscar");
                    log.info("Ingrese un dato a buscar por la raza");
                    String raza=teclado.next();
                    lista.BuscarRaza(raza);
                    break;
                case 7:    
                    log.info("Eliminar Nodo");
                    log.info("Ingrese la raza de la mascota:");
                    String Raza1 = teclado.next();
                    log.info("Ingrese la edad:");
                    int edad2 = teclado.nextInt();
                    log.info("Ingrese el sexo:");
                    String sexo2 = teclado.next();
                    log.info("Ingresa la especie de la mascota:");
                    String especie2 = teclado.next();
                    lista.eliminar(Raza1, edad2, sexo2, especie2);
                   break;
            }    
        } while (opcion != 8);

    }

}
