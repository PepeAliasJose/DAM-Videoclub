/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatospractica001.exceptions;

/**
 *
 * @author pepe
 */
public class CapituloException extends Exception{
    public CapituloException(){
        super("Error, capitulo erroneo");
    }
    public CapituloException(String campo){
        super(String.format("El campo ( %s ) tiene un valor erroneo",campo));
    }
}
