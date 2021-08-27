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
public class TADsPerro  extends TADsAnimal {
    //atributos
    private  boolean domestico;
    //constructor
    public TADsPerro(){
        super("Sasuke",7,"Schnauzer");
        this.domestico=true;
    }
    //getters y setters

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }
    //metodos
    public void Comunicar(){
        System.out.println("WOFF!!!");
    } 
}
