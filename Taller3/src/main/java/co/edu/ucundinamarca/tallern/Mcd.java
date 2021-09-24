/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;
import org.apache.log4j.Logger;
/**
 *
 * @author Paola hernandez
 */
public class Mcd {
     static Logger log = Logger.getLogger(Mcd.class.getName());
     
    public static int mcd(int a,int b){
        if(b==0){
            return a;
        }
        return mcd(b, a%b);
    }
    public static void main(String[] args) {
        int a=96, b=36;
        log.info("Inicio de MCD "+ a +","+ b );
        
        log.info(" Fin del MCD ("+ a +" , "+ b +" )="+mcd(a,b));
    }
    
}
