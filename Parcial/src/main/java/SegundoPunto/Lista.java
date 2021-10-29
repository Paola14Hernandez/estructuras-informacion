/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundoPunto;

import org.apache.log4j.Logger;

/**
 *
 * @author Paola Hernandez
 */
public class Lista {
     static Logger log = Logger.getLogger(co.edu.ucundinamarca.tallern.Lista.class.getName());
    Nodo inicio;
    Nodo fin;
    
    public Lista(){
        inicio=null;
        fin=null;
    }
    public boolean vacia(){
        return inicio==null;
    }
    public void agregar(int dato){
        if(!vacia()){
            inicio=new Nodo(dato,inicio,null);
            inicio.siguiente.anterior=inicio;
        }else{
            inicio=fin;
            fin=new Nodo(dato);
        }
    }
    public void Mostrar(){
        if(!vacia()){
            Nodo auxiliar=inicio;
            while(auxiliar!= null){
                log.info(auxiliar.dato);
                auxiliar=auxiliar.siguiente;
            }
          log.info(auxiliar.dato);
        }
    }
}
