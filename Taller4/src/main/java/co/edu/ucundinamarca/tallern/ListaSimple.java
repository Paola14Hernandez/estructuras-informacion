/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import java.util.Iterator;
import org.apache.log4j.Logger;

/**
 *
 * @author Paola Hernandez
 */


public class ListaSimple implements Listable {
    
    static Logger log = Logger.getLogger(Dulces.class.getName());
    
    private Nodo cabeza = null;
    
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
   
   
    public void agregar() {
       Nodo nodo = new Nodo();
        if (cabeza == null) {
            cabeza = nodo;
        } else {
            Nodo puntero = cabeza;
            while (puntero.sgte != null) {
                puntero = puntero.sgte;
            }
            puntero.sgte = nodo;
        }
        longitud++;
                  
    }

  /*
    public boolean contiene() {
        return true;
    }

    
    public Iterator iterador() {
       
    }

  
    public void eliminiar() {
       
    }

   
    public boolean estaVacia() {
        
    }

  
    public void primerElemento() {
    
    }

    public void sustituir() {
        
    }

   
    public void vaciar() {
       
    }
    */
}


