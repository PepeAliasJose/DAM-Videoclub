/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatospractica001.controller;


import accesodatospractica001.dao.*;
import accesodatospractica001.model.*;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author pepe
 */
public class ApplicationController {
    
    PeliculaController pc;
    SerieController sc;
    
    Videoclub videoclub;
    
    public ApplicationController() throws IOException{
    
        pc = new PeliculaController();
        sc = new SerieController();
    
        videoclub = new Importar().leerXML();
    }
    
    public void listPeliculas(){
        System.out.println("*** PELICULAS ***");
        for(Pelicula p : videoclub.getPeliculas()){
            System.out.println(p);
            System.out.println("");
        }
    }
    
    public void listSeries(){
        System.out.println("**** SERIES ****");
        for(Serie s : videoclub.getSeries()){
            System.out.println(s);
            System.out.println("");
        }

    }
    
    public void listAll(){
        listPeliculas();
        listSeries();
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
        
        //Actualizar xml
        new Exportar().escribirXML(videoclub);
        
    }
    
    /**
    * 
    * Pide al controllador de series que cree una serie y la mete en el 
    * videoclub y actualiza el documento XML
    * 
    */
    public void newSerie(){
        //Aqui se recogen las excepciones
        
        
        //Pedir una nueva serie al controlador
        Serie newSerie = sc.createSerie();
        
        //Agregar la serie a la lista de series
        ArrayList<Serie> series = videoclub.getSeries();
        series.add(newSerie);
        videoclub.setSeries(series);
        
        //Actualizar xml
        new Exportar().escribirXML(videoclub);
        
    }
    
    /**
    * 
    * Borra la serie especificada del videoclub y actualiza el XML
    * 
    */
    public void deleteSerie(){
        //Aqui se recogen las excepciones
        System.out.println("Escribe el titulo de la serie a borrar");
        Serie s = seachSerieByTitle(new java.util.Scanner(System.in).nextLine());
        
        if(s!=null){
            System.out.printf("Seguro que quieres borrar %s?(s/n)%n",s.getTitle());
            if(new java.util.Scanner(System.in).nextLine().equalsIgnoreCase("S")){

                //Agregar la serie a la lista de series
                ArrayList<Serie> series = videoclub.getSeries();
                series.remove(s);
                videoclub.setSeries(series);

                //Actualizar xml
                new Exportar().escribirXML(videoclub);

            }else{
                System.out.println("Cancelando borrado ... ");
            }
        }else{
            System.err.println("SERIE NO ENCONTRADA");
        }
        
    }
    
    /**
    * 
    * Busca una serie por su titulo
    * 
    * @param title Titulo de la serie a buscar
    * 
    * @return Objeto serie buscado por titulo; null si no se encuentra la serie
    * 
    *  
    */
    public Serie seachSerieByTitle(String title){
        
        for(Serie s: videoclub.getSeries()){
            
            if(s.getTitle().equalsIgnoreCase(title)){
                return s;
            }
        
        }
        
        return null;
    }

    /**
    * 
    * Busca una serie por su titulo
    * 
    * @param s serie a modificar
    * @param campo opcion a modificar de la serie
    * 
    * 
    */
    public void modifySerieAtribute(Serie s, String campo){
    
        Serie modifiedSerie = sc.modificateSerie(s,campo);
        
        //Agregar la serie a la lista de series
        ArrayList<Serie> series = videoclub.getSeries();
        series.remove(s);
        series.add(modifiedSerie);
        videoclub.setSeries(series);
        
        //Actualizar xml
        new Exportar().escribirXML(videoclub);
    
    
    }
    
    
    /**
    * 
    * Busca una serie por su titulo
    * 
    * @param s serie la cual se van a mostrar sus temporadas
    * 
    * 
    */
    public void listTemporadas(Serie s){
        
        
    }
}
