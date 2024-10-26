/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatospractica001.controller;


import accesodatospractica001.model.*;
import java.util.ArrayList;

/**
 *
 * @author pepe
 */
public class ApplicationController {
    
    PeliculaController pc;
    SerieController sc;
    
    Videoclub videoclub;
    
    public ApplicationController(){
    
        pc = new PeliculaController();
        sc = new SerieController();
    
        videoclub = new Videoclub();
    }
    
    /**
    * 
    * Pide al controllador de peliculas que cree una pelicula y la mete en el 
    * videoclub y actualiza el documento XML
    * 
    */
    public void newPelicula(){
        //Aqui se recogen las excepciones
        
        
        //Pedir una nueva pelicula al controlador
        Pelicula newPelicula = pc.createPelicula();
        
        //Agregar la pelicula a la lista de peliculas
        ArrayList<Pelicula> peliculas = videoclub.getPeliculas();
        peliculas.add(newPelicula);
        videoclub.setPeliculas(peliculas);
        
        //Actualziar xml
        System.out.println(newPelicula);
        
    }
    
}
