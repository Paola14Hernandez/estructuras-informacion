
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        long matrizA[][]={{0,1,1,9,9,9,9,9,9,9,9,1,9,9,9},
                          {1,0,9,1,9,9,9,1,9,9,9,9,9,9,9},
                          {1,9,0,9,9,9,9,9,9,9,1,9,9,9,9},
                          {9,1,9,0,9,1,9,9,9,9,9,9,9,9,9},
                          {9,9,9,9,0,9,9,9,9,9,9,9,1,9,1},
                          {9,9,9,1,9,0,9,9,9,1,9,9,9,9,1},
                          {9,9,9,9,9,9,0,9,9,9,1,9,9,9,9},
                          {9,1,9,9,9,9,9,0,1,9,9,9,9,9,9},
                          {9,9,9,9,9,9,9,1,0,9,9,9,9,1,9},
                          {9,9,9,9,9,1,9,9,9,0,9,9,9,9,9},
                          {9,9,1,9,9,9,1,9,9,9,0,9,9,9,9},
                          {1,9,9,9,9,9,9,9,9,9,9,0,9,9,9},
                          {9,9,9,9,1,9,9,9,9,9,9,9,0,1,9},
                          {9,9,9,9,9,9,9,9,1,9,9,9,1,0,9},
                          {9,9,9,9,1,1,9,9,9,9,9,9,9,9,0}};
        
        CaminosMinimo ruta= new CaminosMinimo();
        log.info(ruta.algoritmoFloyd(matrizA));
    }

}
