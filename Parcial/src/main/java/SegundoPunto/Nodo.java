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
public class Nodo {
    int dato;
    Nodo siguiente;
    Nodo anterior;
    
    public Nodo(int dato) {
        this(dato,null,null);
    }

    public Nodo(int dato, Nodo siguiente, Nodo anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
}
