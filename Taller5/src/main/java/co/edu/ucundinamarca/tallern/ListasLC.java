package co.edu.ucundinamarca.tallern;


import org.apache.log4j.Logger;

/**
 *
 * @author Paola Hernandez
 */
public class ListasLC {
    static Logger log = Logger.getLogger(Main.class.getName());
      NodoLC ultimo;
      public ListasLC(){
          ultimo=null;
      }
    //metodo lista vacia
      public boolean estaVacia(){
          return ultimo==null;
      }
     //metod para insertar nodos
      public ListasLC insertar(int elemento){
       NodoLC nuevo=new NodoLC(elemento);
       if (ultimo!= null){
           nuevo.siguiente=ultimo.siguiente;
           ultimo.siguiente=nuevo;
       }
       ultimo=nuevo;
       return this;
      } 
      
      // metodo para mostrar la lista
      public void mostrarLista(){
          NodoLC auxiliar=ultimo.siguiente; 
          String cadena=" ";
          do{
              cadena=cadena+"{"+auxiliar.dato+"}->";
              auxiliar=auxiliar.siguiente;
          } while(auxiliar != ultimo.siguiente);
          log.info(cadena);
      }
}
