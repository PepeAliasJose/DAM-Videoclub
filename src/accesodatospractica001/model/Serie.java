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
public class Serie implements Serializable {

    String title;
    String sinopsis;
    String director;
    boolean emision;
    ArrayList<Temporada> temporadas;

    public Serie() {
    }

    public Serie(String title, String sinopsis, String director, boolean emision, ArrayList<Temporada> temporadas) {
        setTitle(title);
        setSinopsis(sinopsis);
        setDirector(director);
        setEmision(emision);
        setTemporadas(temporadas);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean isEmision() {
        return emision;
    }

    public void setEmision(boolean emision) {
        this.emision = emision;
    }

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(ArrayList<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {

        String res = String.format("%-20s %-15s %10s%n%47s%n%36s temporadas",
                title, director, emision ? "En emision" : "Terminada",
                sinopsis, temporadas.size()
        );

        return res;
    }

}
