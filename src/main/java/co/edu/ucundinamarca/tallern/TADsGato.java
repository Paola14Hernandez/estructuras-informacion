/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;

/**
 *
 * @author Paola Hernandez
 */
public class TADsGato extends TADsAnimal{
     //atributo
    private boolean cazar;
    //constructor
    public TADsGato(){
        super("Gaspar",1,"Criollo");
        this.cazar=true;
    }
    //get y set

    public boolean isCazar() {
        return cazar;
    }

    public void setCazar(boolean cazar) {
        this.cazar = cazar;
    }
    //metodos
    public void Comunicar(){
        System.out.println("MEOW!!!");
    }
    
}
