/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatospractica001.model;

import accesodatospractica001.exceptions.CapituloException;
import java.io.Serializable;

/**
 *
 * @author pepe
 */
public class Capitulo implements Serializable {

    String title;
    String sinopsis;
    String duration;

    public Capitulo() {
    }

    public Capitulo(String title, String sinopsis, String duration) throws CapituloException {
        setTitle(title);
        setSinopsis(sinopsis);
        setDuration(duration);
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) throws CapituloException {
        try {
            if (Integer.parseInt(duration) < 0) {
                throw new CapituloException("Duracion");
            }
            this.duration = duration;
        } catch (NumberFormatException e) {
            throw new CapituloException("Duracion");
        }

    }

    @Override
    public String toString() {
        return String.format("%-15s %10s minutos %n%s%n", title, duration, sinopsis);
    }

}
