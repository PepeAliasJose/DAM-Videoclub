/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatospractica001.controller;

import accesodatospractica001.dao.*;
import accesodatospractica001.model.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pepe
 */
public class ApplicationController {

    Scanner sca = new Scanner(System.in);
    PeliculaController pc;
    SerieController sc;

    Videoclub videoclub;

    public ApplicationController() throws IOException {

        pc = new PeliculaController();
        sc = new SerieController();

        videoclub = new Importar().leerXML();
    }

    public void listPeliculas() {
        System.out.println("*** PELICULAS ***");
        for (Pelicula p : videoclub.getPeliculas()) {
            System.out.println(p);
            System.out.println("");
        }
    }

    public void listSeries() {
        System.out.println("**** SERIES ****");
        for (Serie s : videoclub.getSeries()) {
            System.out.println(s);
            System.out.println("");
        }
//        ArrayList<Temporada> prueba = new ArrayList<Temporada>();
//        
//        prueba.add(new Temporada());
//        prueba.add(new Temporada());
//        prueba.add(new Temporada());
//        
//        System.out.println(new Serie("Breaking bad", 
//                "Jessi donde esta la merca jessi",
//                "el director", true, prueba));
//        System.out.println("");
//        System.out.println(new Serie("Breaking bad", 
//                "Jessi donde esta la merca jessi",
//                " el director", false, prueba));
    }

    public void listAll() {
        listPeliculas();
        listSeries();
    }

    /**
     *
     * Pide al controllador de peliculas que cree una pelicula y la mete en el
     * videoclub y actualiza el documento XML
     *
     */
    public void newPelicula() {
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
    public void newSerie() {
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
     * Le pide al usuario el titulod e la pelicula que quiere buscar y le
     * devuelve el objeto pelicula.
     */
    public Pelicula getPeliculaPorTitulo() {
        System.out.println("Dime el nombre de la pelicula que quieres modificar");
        String nPelicula = sca.nextLine();
        ArrayList<Pelicula> listaPeliculas = videoclub.getPeliculas();

        for (int i = 0; i < listaPeliculas.size(); i++) {
            if (listaPeliculas.get(i).getTitle().equalsIgnoreCase(nPelicula)) {
                return listaPeliculas.get(i);
            }
        }
        return null;
    }
/**
 * El usuario selecciona lo que quiere hacer con la pelicula y luego esta funcion se la manda a peliculaController
 * para que salte el otro switch de este.
 * @param p
 * @param eleccion 
 */
    public void modificarPelicula(Pelicula p, String eleccion) {
        ArrayList<Pelicula> listaPeliculas = videoclub.getPeliculas();

        
        Pelicula pNueva=pc.modifyPelicula(p, eleccion);
        listaPeliculas.remove(p);
        listaPeliculas.add(pNueva);
    }
}
