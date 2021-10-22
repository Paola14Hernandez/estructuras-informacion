
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
        Scanner teclado=new Scanner(System.in);
       ListasCircularDE lista=new ListasCircularDE();
       
       int opcion=0;
       do{
            log.info("1. Ingresar un Nodo");
            log.info("2. Mostrar la lista");
            log.info("3. Buscar en la lista");
            log.info("4. Modificar");
            log.info("5. Salir");
            log.info("Elija una Opcion");
            opcion=teclado.nextInt();
            
            switch(opcion){
                case 1:
                    log.info("Ingrese un Nodo: ");
                    int dato=teclado.nextInt();
                    lista.Ingresar(dato);
                    break;
                case 2:
                    log.info("Mostrar lista");
                    lista.Mostrar();
                    break;
                case 3:
                    log.info("Buscar");
                    log.info("Ingrese un dato a buscar");
                    int dato3=teclado.nextInt();
                    lista.Buscar(dato3);
                    break;
            }
                    
       }while(opcion!=5);
       
    }

}
