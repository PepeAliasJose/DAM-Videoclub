/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatospractica001.model;

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

    public Pelicula(String title, String year, String synopsis, String duration, String director) {
        this.title = title;
        this.year = year;
        this.synopsis = synopsis;
        this.duration = duration;
        this.director = director;
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

    public void setYear(String year) {
        this.year = year;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "title=" + title + ", year=" + year + ", synopsis=" + synopsis + ", duration=" + duration + ", director=" + director + '}';
    }
    
}
