/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.tallern;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
/**
 *
 * @author  Paola Hernandez
 */
public class Funcionestest {
    
    @Test
    public void testfactorialRec(){
        //Arrange
        Funciones funciones=new Funciones();
        //Act
        int res=funciones.factorialRec(5);
        //Asert
        assertEquals(120,res);
        
    }
}
