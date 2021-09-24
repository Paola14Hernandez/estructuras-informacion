/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;


import java.util.Scanner;
import org.apache.log4j.Logger;
import java.math.*;

/**
 *
 * @author Paola Hernandez
 */
public class Funciones {
     static Logger log = Logger.getLogger(Funciones.class.getName());

    //atributos
    private int numero;
    private double base;
    private double exponente;
    
    //Constructor
    public Funciones(int numero,double base,double exponente) {
        this.numero = numero;
        this.base=base;
        this.base=exponente;
    }

    public Funciones() {
    }
    
    //Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }
    
    //algoritmo recursivo
    public int factorialRec(int numero){
       
        int resultado;
        if(numero==0){
            return resultado=1;
        }
        else{
           return  resultado=numero*factorialRec(numero-1);
        }
    }
    //algoritmo iterativo
    public static int factorial(int numero){
          int resultado=1;
          for(int i=1;i<=numero;i++){
          resultado=resultado*i;
         }
           return resultado;
        }
    public static double potencia(double base,double exponente){
       
        if(exponente==0){
            return 1;
        }else{
            return Math.pow(base, exponente);
        }
            
    }
    
}
