
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author Paola 
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
         Juego jugador = new Juego();
         jugador.mostrarVidasRestantes();
         jugador.setNumVidas(5-1);
         jugador.mostrarVidasRestantes();
         Juego jugador1 = new Juego();
         jugador1.mostrarVidasRestantes();
         jugador.mostrarVidasRestantes();
         jugador1.QuitarVidas();
         jugador.ReiniciaPartida();
         jugador.ActualizarRecord();
         
    }

}
