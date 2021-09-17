/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import static co.edu.ucundinamarca.tallern.Main.log;
import org.apache.log4j.Logger;

/**
 *
 * @author Paola Hernandez
 */
public class Funciones {
     static Logger log = Logger.getLogger(Main.class.getName());

    //atributos
    private int numero;
    //Constructor
    public Funciones(int numero) {
        this.numero = numero;
    }
    //Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //algoritmo recursivo
    public static int factorial(int numero){
         
        
        if(numero==0){
            return 1;
        }
        else{
            return numero*factorial(numero-1);
        }
    }
}
