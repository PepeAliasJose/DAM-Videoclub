/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatospractica001.exceptions;

/**
 *
 * @author pepe
 */
public class PeliculaException extends Exception{
    public PeliculaException(){
        super("Error, pelicula invalida");
    }
    
    public PeliculaException(String campo){
        super(String.format("El campo ( %s ) tiene un valor erroneo",campo));
    }
}
