/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;
import java.util.Objects;

/**
 *
 * @author Paola Hernandez
 */
public class Persona {
static Logger log = Logger.getLogger(Persona.class.getName());
    //atributos
    private String nombre;
    private int edad;
    private double altura;
    private int identificacion;

    //constructor vacio
    public Persona() {
    }

    //construtor
    public Persona(String nombre, int edad, double altura, int identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.identificacion = identificacion;
    }
    //gets y sets

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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Paula", 20, 1.50, 1999876234);
        Persona persona2 = new Persona("Sofia", 23, 1.56, 234534665);

        if (persona1.equals(persona2)) {
            log.info("******* Instacias Iguales *********");
        } else {
            log.info("******* Instacias Diferentes *********");
        }

    }

    @Override
    public String toString() {
        return "Persona { nombre:" + nombre + " edad:" + edad + " altura:" + altura + " identificacion:" + identificacion + '}';
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
        Persona that = (Persona) obj;

        return Objects.equals(this.getNombre(), that.getNombre())
                && Objects.equals(this.getEdad(), that.getEdad())
                && Objects.equals(this.getAltura(), that.getAltura())
                && Objects.equals(this.getIdentificacion(), that.getIdentificacion());
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + getEdad();
        result = 31 * result + getIdentificacion();
        return result;
    }

}
