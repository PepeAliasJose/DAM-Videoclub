/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatospractica001.exceptions;

/**
 *
 * @author pepe
 */
public class TemporadaException extends Exception{
    public TemporadaException(){
        super("Error, temporada erronea");
    }
    public TemporadaException(String campo){
        super(String.format("El campo ( %s ) tiene un valor erroneo",campo));
    }
}
