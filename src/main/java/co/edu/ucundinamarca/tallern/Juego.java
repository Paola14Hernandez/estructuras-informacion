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

public class Juego {
     static Logger log = Logger.getLogger(Main.class.getName());
    //atributo
    public int NumVidas=5;
    private int Vidas=5;
    private int record=0;
    //constructor
    public Juego(int NumVidas,int record,int Vidas) {
        this.NumVidas = NumVidas;
        this.record=record;
        this.Vidas=Vidas;
    }
    public Juego() {
    }
   //GETS Y SETS
    public int getNumVidas() {
        return NumVidas;
    }

    public void setNumVidas(int NumVidas) {
        this.NumVidas = NumVidas;
    }
    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public int getVidas() {
        return Vidas;
    }

    public void setVidas(int Vidas) {
        this.Vidas = Vidas;
    }
    
    
    //metodo
    public void mostrarVidasRestantes(){
        log.info("Su numero de vidas es: "+NumVidas);  
     }
    public void  QuitarVidas(){
       boolean vida=true;
       for(int i=NumVidas;i>=0;i--){
         if(i==0){
            log.info("Juego Terminado");
          }
       else{
           log.info(vida);
       }
      }
    }
    public void ReiniciaPartida(){
        log.info(Vidas);
    }
    public void ActualizarRecord(){
       for(int i=record;i<=Vidas;i++){
           for( int j=NumVidas;j>=0;j--){
              if(record==NumVidas){
               log.info("Se alcanzo el record");
              }
              else{
                 if(NumVidas>record){
                  log.info("Se ha batido el record "+record);
                 }
                 else{
                   if(NumVidas<record){
    
                }
            }
        }
      }
    }
  }     
}
