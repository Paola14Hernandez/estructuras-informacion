/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 *
 * @author Paola Hernandez
 */
public class MainColegio {

   Map alumno= new HashMap<>();
   
    static Logger log = Logger.getLogger(MainColegio.class.getName());
    public static void main(String[] args) {
    
    Colegio colegio1=new Colegio("Colombiana");
    Colegio colegio2=new Colegio();
    Colegio colegio3=new Colegio();
       colegio1.agregarAlumno("COLOMBIANA");
    
    }
  
}

