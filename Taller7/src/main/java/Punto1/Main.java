
package Punto1;

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
       Cola lista=new Cola();
       int opcion =0;
       
       do{
            log.info("1. Ingresar datos a la lista");
            log.info("2. Mostrar la lista");
            log.info("3. Salir");
            log.info("Elija una Opcion");
            opcion = teclado.nextInt();
           
           
            switch (opcion) {
                
                case 1:
                    log.info("Ingrese el nombre de la persona:");
                    String Nombre = teclado.next();
                    log.info("Ingrese la cedula:");
                    int cedula = teclado.nextInt();
                    log.info("Ingrese el nombre del Libro:");
                    teclado.nextLine();
                    String nombreLibro =teclado.nextLine();
                    lista.ingresar(Nombre,cedula,turno,nombreLibro);
                    break;
                case 2:
                    log.info("Mostrar lista");
                    lista.Mostrar();
                    break;
                    
                    
       }
        
    } while(opcion !=3); 
}
}
