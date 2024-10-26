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
    
    public PeliculaController(){}
    
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
    public Pelicula createPelicula(){
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
    
}
