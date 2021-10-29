/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundoPunto;

/**
 *
 * @author Paola Hernandez
 */
public class Lista {
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
}
