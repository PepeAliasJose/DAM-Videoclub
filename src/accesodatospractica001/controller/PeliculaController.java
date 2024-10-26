/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatospractica001.controller;

import accesodatospractica001.model.*;
import java.util.Scanner;

/**
 *
 * @author pepe
 */
public class PeliculaController {

    public PeliculaController() {
    }

    /**
     *
     *
     * throws PeliculaException if any data is incorrect
     *
     * @return new Pelicula created by user input
     *
     * @since 1.0
     *
     *
     */
    public Pelicula createPelicula() {
        //Aqui se lanzan las excepciones

        Scanner sc = new Scanner(System.in);
        Pelicula p = new Pelicula();

        System.out.println("Escribe el titulo:");
        p.setTitle(sc.nextLine());

        System.out.println("Escribe el año:");
        p.setYear(sc.nextLine());

        System.out.println("Escribe la sinopsis:");
        p.setSynopsis(sc.nextLine());

        System.out.println("Escribe la duracion:");
        p.setDuration(sc.nextLine());

        System.out.println("Escribe el director:");
        p.setDirector(sc.nextLine());

        return p;
    }
/**
   *
   * La funcion recibe una pelicula junto con la elección y con el switch
   * y ejecuta la funcion que haya elegido el usuario y devuelve la pelicula modificada.
   * 
*/
    public Pelicula modifyPelicula(Pelicula p, String eleccion) {
        Scanner sca = new Scanner(System.in);
        switch (eleccion) {
            case "1": {
                System.out.println("Dime el titulo nuevo que le quieres poner");
                
                p.setTitle(sca.nextLine());
                return p;
            }
            case "2": {
                System.out.println("Dime el año que le quieres poner");
                
                p.setYear(sca.nextLine());
                return p;
            }
            case "3": {
                System.out.println("Dime la nueva sinopsis");
                p.setSynopsis(sca.nextLine());
                return p;
            }
            case "4": {
                System.out.println("Dime la nueva duracion");
                p.setDuration(sca.nextLine());
                return p;
            }
            case "5": {
                System.out.println("Dime el nuevo director");
                p.setDirector(sca.nextLine());
                return p;
            }
            default:{
                return null;
            }
        }
    }
}
