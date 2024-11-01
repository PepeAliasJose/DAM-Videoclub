/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatospractica001.controller;

import accesodatospractica001.dao.*;
import accesodatospractica001.exceptions.CapituloException;
import accesodatospractica001.exceptions.PeliculaException;
import accesodatospractica001.exceptions.SerieException;
import accesodatospractica001.exceptions.TemporadaException;
import accesodatospractica001.model.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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

    /**
     *
     * Crea una instancia del controlador de la aplicacion lanza IOException si
     * no se ha podido leer ningun dato del XML
     *
     * @throws java.io.IOException
     */
    public ApplicationController() throws IOException {

        pc = new PeliculaController();
        sc = new SerieController();

        videoclub = new Importar().leerXML();
    }

    /**
     *
     * Lista todas las peliculas
     *
     */
    public void listPeliculas() {
        System.out.println("*** PELICULAS ***");
        for (Pelicula p : videoclub.getPeliculas()) {
            System.out.println(p);
            System.out.println("");
        }
    }

    /**
     *
     * Lista todas las series
     *
     */
    public void listSeries() {
        System.out.println("**** SERIES ****");
        for (Serie s : videoclub.getSeries()) {
            System.out.println(s);
            System.out.println("");
        }

    }

    /**
     *
     * Lista todo el contenido del XML
     *
     */
    public void listAll() {
        listPeliculas();
        listSeries();
    }

    /**
     *
     * Filtra las series del videoclub por su titulo
     *
     * @param title fragmeto de titulo para filtrar
     *
     * @return ArrayList -Serie- de las series cuyo titulo tenga parte del
     * buscado
     *
     */
    public ArrayList<Serie> getSerieByTitlePiece(String title) {

        ArrayList<Serie> listaFiltrada = new ArrayList<Serie>();
        for (Serie s : videoclub.getSeries()) {

            if (s.getTitle().contains(title)) {
                listaFiltrada.add(s);
            }

        }

        return listaFiltrada;

    }

    /**
     *
     * Filtra las series del videoclub por su año
     *
     * @param year año por el que buscar series
     *
     * @return ArrayList -Serie- de las series que tengan una temporada de ese
     * año
     *
     */
    public ArrayList<Serie> getSerieByYear(String year) {

        ArrayList<Serie> listaFiltrada = new ArrayList<Serie>();
        for (Serie s : videoclub.getSeries()) {
            for (Temporada t : s.getTemporadas()) {
                if (t.getYear().equals(year)) {
                    listaFiltrada.add(s);
                }
            }
        }

        return listaFiltrada;

    }

    /**
     *
     * Lista las series del videoclub por su titulo
     *
     */
    public void listSerieByTitlePiece() {
        System.out.println("Escribe el titulo:");
        ArrayList<Serie> lista = getSerieByTitlePiece(sca.nextLine());
        for (Serie s : lista) {
            System.out.println(s);
            System.out.println("");
        }

    }

    /**
     *
     * Lista las series del videoclub por su año
     *
     */
    public void listSerieByYear() {
        System.out.println("Escribe el año:");
        ArrayList<Serie> lista = getSerieByYear(sca.nextLine());
        for (Serie s : lista) {
            System.out.println(s);
            System.out.println("");
        }

    }

    /**
     *
     * Filtra las peliculas del videoclub por su titulo
     *
     * @param title fragmeto de titulo para filtrar
     *
     * @return ArrayList -Pelicula- de las peliculas cuyo titulo tenga parte del
     * buscado
     *
     */
    public ArrayList<Pelicula> getPeliculaByTitlePiece(String title) {

        ArrayList<Pelicula> listaFiltrada = new ArrayList<Pelicula>();
        for (Pelicula p : videoclub.getPeliculas()) {

            if (p.getTitle().contains(title)) {
                listaFiltrada.add(p);
            }

        }

        return listaFiltrada;

    }

    /**
     *
     * Filtra las peliculas del videoclub por su año
     *
     * @param year año por el que buscar peliculas
     *
     * @return ArrayList -Pelicula- de las peliculas que sean del año buscado
     *
     */
    public ArrayList<Pelicula> getPeliculaByYear(String year) {

        ArrayList<Pelicula> listaFiltrada = new ArrayList<Pelicula>();
        for (Pelicula p : videoclub.getPeliculas()) {

            if (p.getYear().equals(year)) {
                listaFiltrada.add(p);
            }

        }

        return listaFiltrada;

    }

    /**
     *
     * Lista las peliculas del videoclub por su titulo
     *
     */
    public void listPeliculaByTitlePiece() {
        System.out.println("Escribe el titulo:");
        ArrayList<Pelicula> lista = getPeliculaByTitlePiece(sca.nextLine());
        for (Pelicula p : lista) {
            System.out.println(p);
            System.out.println("");
        }

    }

    /**
     *
     * Lista las peliculas del videoclub por su año
     *
     */
    public void listPeliculaByYear() {
        System.out.println("Escribe el año:");
        ArrayList<Pelicula> lista = getPeliculaByYear(sca.nextLine());
        for (Pelicula p : lista) {
            System.out.println(p);
            System.out.println("");
        }

    }

    /**
     *
     * Pide al controllador de peliculas que cree una pelicula y la mete en el
     * videoclub y actualiza el documento XML
     *
     */
    public void newPelicula() {

        //Pedir una nueva pelicula al controlador
        Pelicula newPelicula;
        try {
            newPelicula = pc.createPelicula();

            //Agregar la pelicula a la lista de peliculas
            ArrayList<Pelicula> peliculas = videoclub.getPeliculas();
            peliculas.add(newPelicula);
            videoclub.setPeliculas(peliculas);

            //Actualizar xml
            new Exportar().escribirXML(videoclub);
        } catch (PeliculaException ex) {
            System.err.println(ex.getMessage());
        }

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
        Serie newSerie;
        try {
            newSerie = sc.createSerie();

            //Agregar la serie a la lista de series
            ArrayList<Serie> series = videoclub.getSeries();
            series.add(newSerie);
            videoclub.setSeries(series);

            //Actualizar xml
            new Exportar().escribirXML(videoclub);
        } catch (SerieException | TemporadaException | CapituloException ex) {
            System.err.println(ex.getMessage());
        }

    }

    /**
     * Le pide al usuario el titulo de la pelicula que quiere buscar y le
     * devuelve el objeto pelicula.
     *
     * @return una pelicula si se encuentra la pelicula, null si no existe la
     * pelicula
     *
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
     * El usuario selecciona lo que quiere hacer con la pelicula y luego esta
     * funcion se la manda a peliculaController para que salte el otro switch de
     * este.
     *
     * @param p pelicula a modificar
     * @param eleccion seleccion de campo a modificar
     */
    public void modificarPelicula(Pelicula p, String eleccion) {
        ArrayList<Pelicula> listaPeliculas = videoclub.getPeliculas();

        Pelicula pNueva;
        try {
            pNueva = pc.modifyPelicula(p, eleccion);
            listaPeliculas.remove(p);
            listaPeliculas.add(pNueva);
            //Actualizar xml
            videoclub.setPeliculas(listaPeliculas);
            new Exportar().escribirXML(videoclub);
        } catch (PeliculaException ex) {
            System.err.println(ex.getMessage());
        }

    }

    /**
     *
     * Borra la pelicula que seleccione el usuario por consola
     *
     */
    public void deletePelicula() {
        ArrayList<Pelicula> listaPeliculas = videoclub.getPeliculas();
        Pelicula p = getPeliculaPorTitulo();
        if (p != null) {
            listaPeliculas.remove(p);
            videoclub.setPeliculas(listaPeliculas);
            //Actualizar xml
            new Exportar().escribirXML(videoclub);
        } else {
            System.err.println("NO SE HA PODIDO BORRAR LA PELICULA");
        }
    }

    /**
     *
     * Borra la serie que seleccione el usuario por consola
     *
     */
    public void deleteSerie() {
        //Aqui se recogen las excepciones
        System.out.println("Escribe el titulo de la serie a borrar");
        Serie s = searchSerieByTitle(sca.nextLine());

        if (s != null) {
            System.out.printf("Seguro que quieres borrar %s?(s/n)%n", s.getTitle());
            if (sca.nextLine().equalsIgnoreCase("S")) {

                //Agregar la serie a la lista de series
                ArrayList<Serie> series = videoclub.getSeries();
                series.remove(s);
                videoclub.setSeries(series);

                //Actualizar xml
                new Exportar().escribirXML(videoclub);

            } else {
                System.out.println("Cancelando borrado ... ");
            }
        } else {
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
    public Serie searchSerieByTitle(String title) {

        for (Serie s : videoclub.getSeries()) {

            if (s.getTitle().equalsIgnoreCase(title)) {
                return s;
            }

        }

        return null;
    }

    /**
     *
     * Modifica los atributos de una serie
     *
     * @param s serie a modificar
     * @param campo opcion a modificar de la serie
     *
     *
     */
    public void modifySerieAtribute(Serie s, String campo) {

        try {
            Serie modifiedSerie = sc.modificateSerie(s, campo);

            //Agregar la serie a la lista de series
            ArrayList<Serie> series = videoclub.getSeries();
            series.remove(s);
            series.add(modifiedSerie);
            videoclub.setSeries(series);

            //Actualizar xml
            new Exportar().escribirXML(videoclub);
        } catch (SerieException ex) {
            System.err.println(ex.getMessage());
        }

    }

    /**
     *
     * Lista las temporadas de una serie
     *
     * @param s serie la cual se van a mostrar sus temporadas
     *
     *
     */
    public void listTemporadas(Serie s) {
        System.out.println("*** TEMPORADAS ***");
        for (Temporada t : s.getTemporadas()) {
            System.out.println(t);
            System.out.println("");
        }

    }

    /**
     *
     * Agrega una nueva temporada a una serie
     *
     * @param s serie la cual se va a agregar una temporada
     *
     *
     */
    public void newTemporada(Serie s) {

        try {
            ArrayList<Temporada> listaTemporada = s.getTemporadas();

            Temporada newTemporada = sc.createTemporada();

            for (Temporada t : listaTemporada) {

                if (t.getSeasonNumber().equals(newTemporada.getSeasonNumber())) {

                    throw new TemporadaException();

                }

            }

            listaTemporada.add(newTemporada);
            s.setTemporadas(listaTemporada);

            new Exportar().escribirXML(videoclub);
        } catch (TemporadaException | CapituloException ex) {
            System.err.println(ex.getMessage());
        }

    }

    /**
     *
     * Borra una temporada de una serie
     *
     * @param s serie la cual se va a borrar la temporada
     *
     *
     */
    public void deleteTemporada(Serie s) {

        System.out.println("Escribe el numero de temporada a borrar");
        String numero = sca.nextLine();

        ArrayList<Temporada> listaTemporada = s.getTemporadas();

        for (int x = 0; x < listaTemporada.size(); x++) {

            if (listaTemporada.get(x).getSeasonNumber().equals(numero)) {

                listaTemporada.remove(listaTemporada.get(x));

            }

        }

        s.setTemporadas(listaTemporada);

        new Exportar().escribirXML(videoclub);

    }

    /**
     *
     * Devuelve una temporada de una serie
     *
     * @param s serie la cual se va a borrar la temporada
     * @param seasonNumber numero de temporada a buscar
     *
     * @return una Temporada si se encuentra, null si no se encuentra la
     * temporada
     *
     */
    public Temporada findTemporadaByNumber(Serie s, String seasonNumber) {

        ArrayList<Temporada> listaTemporada = s.getTemporadas();

        for (Temporada t : listaTemporada) {

            if (t.getSeasonNumber().equals(seasonNumber)) {

                return t;

            }

        }

        return null;

    }

    /**
     *
     * Lista los capitulos de una temporada
     *
     * @param temp la temporada de donde se van a listar los capitulos
     *
     */
    public void listCapitulos(Temporada temp) {

        System.out.println("*** CAPITULOS ***");
        System.out.println("");

        for (Capitulo c : temp.getCapitulos()) {
            System.out.println(c);
            System.out.println("");
        }

    }

    /**
     *
     * Agrega un capitulo a una temporada
     *
     * @param t la temporada a la que agregar un capitulo
     *
     */
    public void newCapitulo(Temporada t) {

        try {
            ArrayList<Capitulo> listaCapitulos = t.getCapitulos();

            Capitulo c = sc.createCapitulo();
            listaCapitulos.add(c);
            t.setCapitulos(listaCapitulos);

            new Exportar().escribirXML(videoclub);
        } catch (CapituloException ex) {
            System.err.println(ex.getMessage());
        }

    }

    /**
     *
     * Borra un capitulo de una temporada
     *
     * @param t la temporada a la que borrar un capitulo
     *
     */
    public void deleteCapitulo(Temporada t) {

        ArrayList<Capitulo> listaCapitulos = t.getCapitulos();

        System.out.println("Escriba el numero de capitulo a borrar:");

        int cont = 1;
        for (Capitulo c : listaCapitulos) {

            System.out.printf("Capitulo %s - %s%n", cont, c.getTitle());
            cont++;
        }

        String borrar = sca.nextLine();

        try {

            listaCapitulos.remove(Integer.parseInt(borrar) - 1);

            t.setCapitulos(listaCapitulos);

            new Exportar().escribirXML(videoclub);

        } catch (Exception e) {

            //Lanzar excepcion
            System.err.println("NO EXISTE ESE NUMERO DE CAPITULO");
        }

    }

    /**
     *
     * Modifica los atributos de un capitulo de una temporada
     *
     * @param temp temporada a la que modificar el capitulo
     * @param opcion seleccion de que opcion vas a cambiar
     *
     */
    public void modificarCapituloAtribute(Temporada temp, String opcion) {

        ArrayList<Capitulo> listaCapitulos = temp.getCapitulos();
        System.out.println("Escriba el numero de capitulo a modificar:");

        int cont = 1;
        for (Capitulo c : listaCapitulos) {
            System.out.printf("Capitulo %s - %s%n", cont, c.getTitle());
            cont++;
        }

        String modificar = sca.nextLine();

        try {

            Capitulo c = listaCapitulos.get(Integer.parseInt(modificar) - 1);
            c = sc.modificateCapitulo(c, opcion);

            new Exportar().escribirXML(videoclub);

        } catch (Exception e) {
            System.err.println("NO EXISTE ESE NUMERO DE CAPITULO");
        }

    }

    /**
     *
     * Modifica los atributos de una temporada
     *
     * @param temp temporada a la que modiifcar los atributos
     * @param opcion seleccion del atributo a modificar
     *
     */
    public void modificarTemporadaAtribute(Temporada temp, String opcion) {

        try {
            sc.modificateTemporada(temp, opcion);

            new Exportar().escribirXML(videoclub);
        } catch (TemporadaException ex) {
            System.err.println(ex.getMessage());
        }

    }

    /**
     *
     *
     * Saca las peliculas a un archivo CSV en la carpeta csvIO
     *
     *
     */
    public void exportarPeliculasCSV() {
        ArrayList<Pelicula> listaPeliculas = videoclub.getPeliculas();

        File f = new File("csvIO/peliculas.csv");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            for (int i = 0; i < listaPeliculas.size(); i++) {

                bw.write(listaPeliculas.get(i).getTitle() + "," + listaPeliculas.get(i).getYear() + "," + listaPeliculas.get(i).getSynopsis() + "," + listaPeliculas.get(i).getDuration() + ","
                        + listaPeliculas.get(i).getDirector());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     *
     *
     * Mete las peliculas de un CSV al videoclub, el CSV esta en carpeta csvIO
     *
     *
     */
    public void importarPeliculasCSV() {
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

        File f = new File("csvIO/peliculas.csv");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                String[] cachos = linea.split(",");
                listaPeliculas.add(new Pelicula(cachos[0], cachos[1], cachos[2], cachos[3], cachos[4]));
            }
            videoclub.setPeliculas(listaPeliculas);
            //Actualizar xml
            new Exportar().escribirXML(videoclub);
        } catch (IOException e) {
            System.err.println("ERROR LEYENDO EL ARCHIVO CSV");
        } catch (PeliculaException ex) {
            System.err.println(ex.getMessage());
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("EL FORMATO DEL CSV NO ES CORRECTO");
        }
    }
}
