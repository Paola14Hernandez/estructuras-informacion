/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundoPunto;

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
        Lista lista = new Lista();
        int opcion =0;
        do {
            log.info("1. Ingresar un Nodo");
            log.info("2. Mostrar la lista");
            log.info("3. Encontrar mayor");
            log.info("4. Salir");
            log.info("Elija una Opcion");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    log.info("Ingrese un Nodo: ");
                    int dato = teclado.nextInt();
                    lista.agregar(dato);
                    break;
                case 2:
                    log.info("Mostrar la Lista");
                    //lista.Mostrar();
                    break;
                case 3:
                    log.info("Enconttrar mayor");
                    
                    break;
            }

        } while (opcion != 4);

    }
}
