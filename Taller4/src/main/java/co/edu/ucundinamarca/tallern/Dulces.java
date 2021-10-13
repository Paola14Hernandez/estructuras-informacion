/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

/**
 *
 * @author Paola Hernandez
 */
public class Dulces {

    static Logger log = Logger.getLogger(Dulces.class.getName());
    ArrayList<String> dulces = new ArrayList();

    public static void main(String[] args) {

        ArrayList<String> dulces = new ArrayList();
        dulces.add("Chocolatina");
        dulces.add("ChocoRamo");
        dulces.add("Gomitas Trululu");
        dulces.add("Bom Bom Bum");
        dulces.add("Nucita");
        dulces.add("Galletas Oreo");
        dulces.add("Mini Chips");
        dulces.add("m&m's");
        dulces.add("Pinguinos");
        dulces.add("Choco Break");
        imprimirIterador(dulces);

    }

    public static void imprimirIterador(ArrayList dulces) {
       
      Iterator<String> it= dulces.iterator();
      while(it.hasNext()){
          log.info(it.next());
      }
    }
    public static void imprimirSinIterador(ArrayList dulces){
       dulces.forEach((item)->log.info(dulces));
    }
    
}