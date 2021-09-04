/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 *
 * @author Paola Hernandez
 */
public class Main2 {
    static Logger log = Logger.getLogger(Main.class.getName());
     public static void main(String[] args) {
         Juego jugador=new Juego();
         jugador.QuitarVidas();
         jugador.mostrarVidasRestantes();
         jugador.ReiniciaPartida();
         jugador.mostrarVidasRestantes();
         jugador.ActualizarRecord();
         
    }
}
