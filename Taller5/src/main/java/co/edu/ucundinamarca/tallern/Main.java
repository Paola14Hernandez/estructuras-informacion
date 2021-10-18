
package co.edu.ucundinamarca.tallern;

import java.util.Scanner;
//import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        ListasLC listica= new ListasLC();
        int opcion =0, elemento;
        do{
                log.info("1. Agregar un Nodo a la Lista Circular");
                log.info("2. Eliminar un Nodo de la Lista Circular");
                log.info("3. Mostrar la Lista Circular");
                log.info(" 4. Salir");
                log.info("¿Que opcion desea?");
                opcion=teclado.nextInt();
                switch(opcion){
                    case 1:
                        log.info("Ingresa el elemento del nodo");
                        elemento=teclado.nextInt();
                        listica.insertar(elemento);
                        break;
                    case 2: 
                        //log.info("");
                        break;
                    case 3:
                         if(!listica.estaVacia()){
                             listica.mostrarLista();
                         }else{
                             log.info("Aun no hay Nodos");
                         }
                        break;
                    case 4:
                        log.info("Aplicacion Finalizada");
                        break;
                    default:
                        log.info("La opcion no esta en el Menu");
                }  
           
        } while( opcion != 4);
        
    }

}
