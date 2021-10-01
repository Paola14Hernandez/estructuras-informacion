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
public class Libro {
    private String titulo;
    private String autor;
    private String  isbn;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }
    
    public String getTitulo(){return titulo;}
}
