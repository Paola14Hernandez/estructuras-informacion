/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import java.util.Objects;
import org.apache.log4j.Logger;


/**
 *
 * @author Paola Hernandez
 */
public class Animal {
    static Logger log = Logger.getLogger(Animal.class.getName());
    //atributos

    private String nombre;
    private int NumPatas;
    private String especie;
    private int edad;
    private int identificacion;
//constructor vacio

    public Animal() {
    }
    //constructor

    public Animal(String nombre, int NumPatas, String especie, int edad, int identificacion) {
        this.nombre = nombre;
        this.NumPatas = NumPatas;
        this.especie = especie;
        this.edad = edad;
        this.identificacion = identificacion;
    }
    //gets y sets

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPatas() {
        return NumPatas;
    }

    public void setNumPatas(int NumPatas) {
        this.NumPatas = NumPatas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("Sasuke", 4, "Schnauzer", 6, 1893675465);
        Animal animal2 = new Animal("Gaspar", 4, "Criollo", 1, 1452675431);

        if (animal1.equals(animal2)) {
            log.info("******* Instacias Iguales *********");
        } else {
            log.info("******* Instacias Diferentes *********");
        }
    }

    @Override
    public String toString() {
        return "Animal{ nombre=" + nombre + ", NumPatas=" + NumPatas + ", especie=" + especie + ", edad=" + edad + ", identificacion=" + identificacion + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Animal that = (Animal) obj;

        return Objects.equals(this.getNombre(), that.getNombre())
                && Objects.equals(this.getNumPatas(), that.getNumPatas())
                && Objects.equals(this.getEspecie(), that.getEspecie())
                && Objects.equals(this.getEdad(), that.getEdad())
                && Objects.equals(this.getIdentificacion(), that.getIdentificacion());
    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 21* result + getEdad();
        result = 21 * result + getIdentificacion();
        return result;
    }
}
