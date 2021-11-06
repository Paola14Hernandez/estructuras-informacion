
package Punto1;


import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 *
 * @author Paola Hernandez
 */
public class Cola {
    static Logger log = Logger.getLogger(Cola.class.getName());
    Nodo primero;
    Nodo ultimo;
    String nombre;
    int cedula;
    int turno=0;
    String nombreLibro;
    Scanner teclado= new Scanner(System.in);
    
    public Cola (){
        primero=null;
        ultimo=null;
    }
    
    //metodo ingresar
    public void ingresar(String nombre, int cedula,int turno,String nombreLibro){
        Nodo nuevo=new Nodo();
        nuevo.nombre=nombre;
        nuevo.cedula=cedula;
        nuevo.turno=turno;
        nuevo.nombreLibro=nombreLibro;
        if (primero ==null){
            primero=nuevo;
            primero.siguiente=primero;
            primero.anterior=ultimo;
            ultimo=nuevo;
            turno= turno + 1;
        }else {
            ultimo.siguiente=nuevo;
            nuevo.siguiente=primero;
            ultimo=nuevo;
            primero.anterior=ultimo;
            turno=turno +1;
        }  
    }
}
