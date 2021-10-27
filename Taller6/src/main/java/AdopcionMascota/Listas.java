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
     //metodo buscar
     public void BuscarEdad(int edad1){
         Nodo nodo=new Nodo();
        nodo=primero;
        if (primero != null){
            do{
                if(nodo.Edad==edad1){
                    log.info("Datos encontrados: "+ nodo.Edad+" "+nodo.especie+" "+nodo.sexo+" "+nodo.Raza);
                }
                nodo=nodo.siguiente;
            }while(nodo!= primero);
        }else{
             log.info("Dato no encontrado");
        }
    }
      public void BuscarEspecie(String especie1){
         Nodo nodo=new Nodo();
        nodo=primero;
        if (primero != null){
            do{
                if(nodo.especie == especie1){
                    log.info("Datos encontrados: "+ nodo.especie+" "+nodo.Edad+" "+nodo.sexo+" "+nodo.Raza);
                }
                nodo=nodo.siguiente;
            }while(nodo!= primero);
        }else{
             log.info("Dato no encontrado");
        }
    }
     public void BuscarSexo(String sexo1){
         Nodo nodo=new Nodo();
        nodo=primero;
        if (primero != null){
            do{
                if(nodo.sexo == sexo1){
                    log.info("Datos encontrados: "+ nodo.sexo+" "+nodo.Edad+" "+nodo.especie+" "+nodo.Raza);
                }
                nodo=nodo.siguiente;
            }while(nodo!= primero);
        }else{
             log.info("Dato no encontrado");
        }
    }
     public void BuscarRaza(String raza){
         Nodo nodo=new Nodo();
        nodo=primero;
        if (primero != null){
            do{
                if(nodo.Raza ==raza ){
                    log.info("Datos encontrados: "+ nodo.Raza+" "+nodo.Edad+" "+nodo.especie+" "+nodo.sexo);
                }
                nodo=nodo.siguiente;
            }while(nodo!= primero);
        }else{
             log.info("Dato no encontrado");
        }
    }
     //metodo eliminar
     public void eliminar(String Raza, int edad, String sexo, String especie){
         Nodo actual=new Nodo();
         Nodo anterior=new Nodo();
         actual=primero;
         anterior=ultimo;
         do{
             if(actual.Raza==Raza && actual.Edad ==edad && actual.sexo==sexo && actual.especie==especie){
                 if(actual==primero){
                     primero=primero.siguiente;
                     ultimo.siguiente=primero;
                     primero.anterior=ultimo;
                 }else if(actual == ultimo){
                     ultimo=anterior;
                     primero.anterior=ultimo;
                     ultimo.siguiente=primero;
                 }else{
                     anterior.siguiente=actual.siguiente;
                     actual.siguiente.anterior=anterior;
                 }
             }
             anterior= actual;
             actual=actual.siguiente;
         }while(actual != primero);
     }
}
