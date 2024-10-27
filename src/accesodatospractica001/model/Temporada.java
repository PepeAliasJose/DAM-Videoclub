/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatospractica001.model;

import accesodatospractica001.exceptions.TemporadaException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author pepe
 */
public class Temporada implements Serializable {

    String seasonNumber;
    String title;
    String sinopsis;
    String year;
    ArrayList<Capitulo> capitulos;

    public Temporada() {
    }

    public Temporada(String seasonNumber, String title, String sinopsis, String year, ArrayList<Capitulo> capitulos) throws TemporadaException {
        setSeasonNumber(seasonNumber);
        setTitle(title);
        setSinopsis(sinopsis);
        setYear(year);
        setCapitulos(capitulos);
    }

    public String getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(String seasonNumber) throws TemporadaException {
        try {
            if (Integer.parseInt(seasonNumber) < 0) {
                throw new TemporadaException("Numero de temporada");
            }
            this.seasonNumber = seasonNumber;
        } catch (NumberFormatException e) {
            throw new TemporadaException("Numero de temporada");
        }

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

    public String getYear() {
        return year;
    }

    public void setYear(String year) throws TemporadaException {
        try {
            if (Integer.parseInt(year) < 0) {
                throw new TemporadaException("Año");
            }
            this.year = year;
        } catch (NumberFormatException e) {
            throw new TemporadaException("Año");
        }
    }

    public ArrayList<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(ArrayList<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    @Override
    public String toString() {

        String res = String.format("%-20s Temporada: %-3s %10s capitulos%n%-56s",
                title, seasonNumber, capitulos.size(), sinopsis);

        return res;

    }

}
