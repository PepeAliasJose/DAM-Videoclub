/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatospractica001.model;

import accesodatospractica001.exceptions.PeliculaException;
import java.io.Serializable;

/**
 *
 * @author pepe
 */
public class Pelicula implements Serializable{
    String title;
    String year;
    String synopsis;
    String duration;
    String director;

    public Pelicula() {
    }

    public Pelicula(String title, String year, String synopsis, String duration, String director) throws PeliculaException {
        setTitle(title);
        setYear(year);
        setSynopsis(synopsis);
        setDirector(director);
        setDuration(duration);
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getDuration() {
        return duration;
    }

    public String getDirector() {
        return director;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(String year) throws PeliculaException {
        try {
            if(Integer.parseInt(year)<0){
                throw new PeliculaException("Año");
            }
            this.year = year;
        } catch (NumberFormatException e) {
            throw new PeliculaException("Año");
        }
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setDuration(String duration) throws PeliculaException {
        try {
            if(Integer.parseInt(duration)<0){
                throw new PeliculaException("Año");
            }
            this.duration = duration;
        } catch (NumberFormatException e) {
            throw new PeliculaException("Año");
        }
        
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        
        return String.format("%-20s %8s %12s%n%-42s%n%34s minutos",
                title.toUpperCase(),year,director,synopsis,duration);
    }
    
}
