
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

/**
 *
 * @author Paola Hernandez
 */
public class NodoPrincipal {
    
    static Logger log = Logger.getLogger(NodoPrincipal.class.getName());
    String info;
    int numHijos;
    NodoPrincipal hijo[];
    NodoPrincipal hijosT[];
    
    public NodoPrincipal(String dato){
        this.info=dato;
        this.numHijos=0;
    }
    
    public void copiarHijos(){
        hijosT=new NodoPrincipal[numHijos + 1];
        for(int i =0; i<this.numHijos; i++){
            hijosT[i]=hijo[i];
        }
    }
    public void aumentarHijos(NodoPrincipal nodo){
        copiarHijos();
        hijosT[this.numHijos]=nodo;
        hijo=hijosT;
        this.numHijos++;
    }

    public String getDato() {
        return info;
    }

    public void setDato(String dato) {
        info = dato;
    }
    public void verNodo(){
        log.info(" " + info + " ");
    }         
}
