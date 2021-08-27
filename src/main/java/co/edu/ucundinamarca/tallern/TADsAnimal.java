/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

/**
 *
 * @author Paola 
 */
public class TADsAnimal {
    //atributos
    private String nombre;
    private int edad;
    private String raza;
//constructor
    public TADsAnimal(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }
//getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    //metodo
     public void mostrarAnimal(){
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nRaza: "+ raza);  
     }
    
}
