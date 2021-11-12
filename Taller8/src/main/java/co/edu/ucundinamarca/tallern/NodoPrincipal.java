
package co.edu.ucundinamarca.tallern;

import java.util.ArrayList;

/**
 *
 * @author Paola Hernandez
 */
public class NodoPrincipal {
    String elemento;
   ArrayList<NodoPrincipal> hijos;   

    public NodoPrincipal(String elemento) {
        hijos=new ArrayList<>();
        this.elemento=elemento;
    } 
}
