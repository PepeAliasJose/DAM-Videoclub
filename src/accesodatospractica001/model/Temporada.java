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
public class Temporada implements Serializable{
    
    String seasonNumber;
    String title;
    String sinopsis;
    String year;
    ArrayList<Capitulo> capitulos;
    
    public Temporada(){}

    public Temporada(String seasonNumber, String title, String sinopsis, String year, ArrayList<Capitulo> capitulos) {
        this.seasonNumber = seasonNumber;
        this.title = title;
        this.sinopsis = sinopsis;
        this.year = year;
        this.capitulos = capitulos;
    }

    public String getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(String seasonNumber) {
        this.seasonNumber = seasonNumber;
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

    public void setYear(String year) {
        this.year = year;
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
            title,seasonNumber,capitulos.size(),sinopsis);
        
        return res;
        
    
    }
    
    
    
}
