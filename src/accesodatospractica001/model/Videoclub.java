/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatospractica001.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author pepe
 */
public class Videoclub implements Serializable{
    
    ArrayList<Serie> series;
    ArrayList<Pelicula> peliculas;
    
    public Videoclub(){
        series = new ArrayList<Serie>();
        peliculas = new ArrayList<Pelicula>();
    }

    public Videoclub(ArrayList<Serie> series, ArrayList<Pelicula> peliculas) {
        this.series = series;
        this.peliculas = peliculas;
    }

    public ArrayList<Serie> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<Serie> series) {
        this.series = series;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    
    
    
}
