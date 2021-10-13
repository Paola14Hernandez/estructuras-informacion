/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 *
 * @author Paola Hernandez
 */


public class ListaSimple implements Listable {
    
    static Logger log = Logger.getLogger(ListaSimple.class.getName());
    
    private Nodo inicio= null;
    private Nodo fin=null;
    private Object elemento;
    
    private int longitud = 0;
    
    public class Nodo{
        
        public Object elemento;
        public Nodo sgte;
        
        Nodo(Object valor) {
            this(valor,null);
        }
        Nodo (Object valor,Nodo n){
            elemento=valor;
            sgte=n;
        }

        private Nodo() {
            
        }
        public Object obtenerElemento(){
            return elemento;
        }
        public Object obtenerSgte(){
            return sgte;
        }
    }
   
   @Override
    public void agregar() {
      if (estaVacia()){
	  inicio = fin = new Nodo(elemento);
       }else {
	  fin = fin.sgte = new Nodo(elemento);
       } 
        log.info("Digite el valor:");
        Scanner a = new Scanner(System.in);
        elemento = a.nextInt();
    }

  /*
    public boolean contiene() {
        return true;
    }

    
    public Iterator iterador() {
       
    }
*/
  
    public void eliminiar(int n) {
        
        if (inicio != null) {
            if (n == 0) {
                Nodo primer = inicio;
                inicio = inicio.sgte;
                primer.sgte = null;
                longitud--;
            } else if(n < longitud){
                Nodo puntero = inicio;
                int contador = 0;
                while (contador < (n - 1)) {
                    puntero = puntero.sgte;
                    contador++;
                }
                Nodo temp = puntero.sgte;
                puntero.sgte = temp.sgte;
                temp.sgte = null;
                longitud--;
            }
        }
    }    

   
    public boolean estaVacia() {
         return inicio == null && fin == null;
    }

  /*
    public void primerElemento() {
    
    }

    public void sustituir() {
        
    }

   
    public void vaciar() {
       
    }
    */
    public void mostrar(){
        Nodo recorrer=inicio;
        while(recorrer!= null){
            log.info(recorrer.elemento + ":");
            recorrer=recorrer.sgte;
        }
    }
    public static void main(String[] args) {
       ListaSimple lista= new ListaSimple();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion ; 
 
        while (!salir) {
 
            log.info("1. Agregar");
            log.info("2. Mostrar lista");
            log.info("3. Eliminar");
            log.info("4. Salir");
 
            try {
 
               log.info("Escribe una de las opciones");
               opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        lista.agregar();
                        log.info("se ha agregado a su lista");
                        break;
                    case 2:
                        lista.mostrar();
                        log.info(lista.longitud);
                        break;
                    case 3:
                        lista.eliminiar(3);
                        log.info("Se ha eliminado: " + lista.longitud);
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                       log.info("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                log.info("Debes insertar un número");
                sn.next();
            }
        }
       
    }
}


