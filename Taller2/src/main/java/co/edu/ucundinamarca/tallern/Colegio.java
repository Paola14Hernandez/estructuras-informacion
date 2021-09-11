/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.*;
import org.apache.log4j.Logger;
/**
 *
 * @author Paola Hernandez
 */
public class Colegio {
    
    static Logger log = Logger.getLogger(Animal.class.getName());
    
    //atributos
    private String Nacionalidad;
   
    //constructor
    public Colegio() {
    }

    public Colegio(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
        
    }
    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    
   Map alumno= new HashMap<>();
    
    //metodos
    @Override
    public String toString() {
        return "Colegio Nacionalidad=" + Nacionalidad + '}';
    }
    public void agregarAlumno(String nacionalidad){
        
        if(alumno.containsKey(nacionalidad)){
           Integer i=(Integer) alumno.get(nacionalidad);
           alumno.remove(nacionalidad);
           alumno.put(nacionalidad, i++);
        }
        else{
            alumno.put(nacionalidad,1);
        }
    }
    public void mostrarTodosAlumno(){
        Iterator it= alumno.keySet().iterator();
        while(it.hasNext()){
            Integer key=(Integer)it.next();
            log.info("Alumno: "+ key + " Nacionalidad: "+ alumno.get(key));
            
        }
    }
    
    
    
}
