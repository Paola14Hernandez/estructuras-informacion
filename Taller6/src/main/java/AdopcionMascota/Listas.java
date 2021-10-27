package AdopcionMascota;

import java.util.Scanner;
import org.apache.log4j.Logger;

/**
 *
 * @author Paola Hernandez
 */
public class Listas {
    static Logger log = Logger.getLogger(Listas.class.getName());
    Nodo primero;
    Nodo ultimo;
    String Raza;
    int Edad;
    String sexo;
    String especie;
    Scanner teclado=new Scanner(System.in);
    
    public Listas(){
        primero=null;
        ultimo=null;
    }
    
    //metodo ingresar
    
    public void Ingresar(String Raza, int edad, String sexo, String especie) {
        Nodo nuevo = new Nodo();
        nuevo.Raza = Raza;
        nuevo.Edad = edad;
        nuevo.sexo = sexo;
        nuevo.especie = especie;
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = primero;
            primero.anterior = ultimo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
            primero.anterior = ultimo;
        }
    }
    //metodo mostrar
     public void Mostrar(){
        Nodo actual=new Nodo();
        actual=primero;
        do{
            log.info(actual.Raza+" "+actual.Edad+" "+actual.sexo+" "+actual.especie);
            actual=actual.siguiente;
        }while(actual!=primero);
    } 
     //metodos buscar
     
}
