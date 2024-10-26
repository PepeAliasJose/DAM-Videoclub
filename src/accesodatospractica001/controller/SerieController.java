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
public class SerieController {
    public SerieController(){}
    
    
    /**
    * 
    * 
    * throws SerieException if any data is incorrect 
    * 
    * @return new Serie created by user input
    * 
    * @since 1.0
    * 
    * 
    */
    public Serie createSerie(){
    
        Serie serie = new Serie();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe el titulo:");
        serie.setTitle(sc.nextLine());
        
        System.out.println("Escribe la sinopsis:");
        serie.setSinopsis(sc.nextLine());
     
        System.out.println("Escribe el director:");
        serie.setDirector(sc.nextLine());
        
        System.out.println("Esta en emision? (s/n)");
      
        return serie;
    
    }
    
    /**
    * 
    * 
    * throws TemporadaException if any data is incorrect 
    * 
    * @return new Temporada created by user input
    * 
    * @since 1.0
    * 
    * 
    */
    public Temporada createTemporada(){
    
        Temporada tmp = new Temporada();
        
        
        
        
        return tmp;
    
    }
    
    /**
    * 
    * 
    * throws CapituloException if any data is incorrect 
    * 
    * @return new Capitulo created by user input
    * 
    * @since 1.0
    * 
    * 
    */
    public Capitulo createCapitulo(){
    
        Capitulo cap = new Capitulo();
        
        
        
        
        return cap;
    
    }
}
