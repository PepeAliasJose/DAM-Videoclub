/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatospractica001.controller;

import accesodatospractica001.view.Menu;
import accesodatospractica001.model.*;
import java.io.IOException;
import java.util.Scanner;
import accesodatospractica001.controller.*;

/**
 *
 * @author pepe
 */
public class MainController {

    Scanner consola;
    Menu menu;
    ApplicationController ac;

    /**
     *
     */
    public MainController() {
        consola = new Scanner(System.in);
        menu = new Menu();
        try {
            ac = new ApplicationController();

            while (mainMenuController()) {
                continue;
            }
        } catch (IOException ex) {
            System.err.println("Error leyendo el videoclub, saliendo ...");
        }

    }

    /**
     *
     * @return
     */
    public boolean mainMenuController() {

        //LLamar funcion mostrar menu principal
        menu.menuPrincipal();
        String opcion = consola.nextLine();

        switch (opcion) {
            case "1": {
                //Menu de listar peliculas y series
                menuListado();
                break;
            }
            case "2": {
                //Menu de modificar peliculas
                menuModificarPeliculas();
                break;
            }
            case "3": {
                //Menu de modificar series
                menuModificarSeries();
                break;
            }
            case "4": {
                //Menu de busqueda
                menuBusquedaAvanzada();
                break;
            }
            case "5": {
                //Menu de importar/Exportar
                menuImportarExportar();
                break;
            }
            case "6": {
                //Salir
                return false;
            }
            default: {
                System.err.println("Opcion invalida >:(");
            }

        }
        return true;

    }

    //TODO

    /**
     *
     */
    public void menuImportarExportar() {

        //LLamar funcion mostrar menu importar exportar
        menu.importarExportar();
        String opcion = consola.nextLine();

        switch (opcion) {
            case "1": {
                //Importar
                ac.importarPeliculasCSV();
                break;
            }
            case "2": {
                //Exportar
                ac.exportarPeliculasCSV();
                break;
            }
            case "3": {
                //Salir
                break;
            }
            default: {
                System.err.println("Opcion invalida >:(");
            }

        }

    }


    /**
     *
     */
    public void menuBusquedaAvanzada() {

        //LLamar funcion mostrar menu busqueda avanzada
        menu.busqueda();
        String opcion = consola.nextLine();

        switch (opcion) {
            case "1": {
                //Busqueda pelicula por titulo
                ac.listPeliculaByTitlePiece();
                break;
            }
            case "2": {
                //Busqueda pelicula por año
                ac.listPeliculaByYear();
                break;
            }
            case "3": {
                //Busqueda serie por titulo
                ac.listSerieByTitlePiece();
                break;
            }
            case "4": {
                //Busqueda serie por año
                ac.listSerieByYear();
                break;
            }
            
            case "5": {
                //Salir
                break;
            }
            default: {
                System.err.println("Opcion invalida >:(");
            }

        }

    }

    /**
     *
     */
    public void menuModificarSeries() {

        //LLamar funcion mostrar menu modificar series
        menu.modificarSeries();
        String opcion = consola.nextLine();

        switch (opcion) {
            case "1": {
                //Nueva serie
                ac.newSerie();
                break;
            }
            case "2": {
                //Modificar serie
                menuModificarUnaSerie();
                break;
            }
            case "3": {
                //Borrar serie
                ac.deleteSerie();
                break;
            }
            case "4": {
                //Salir
                break;
            }
            default: {
                System.err.println("Opcion invalida >:(");
            }

        }

    }

    /**
     *
     */
    public void menuModificarUnaSerie() {

        //LLamar funcion mostrar menu modificar una pelicula
        System.out.println("Titulo de la serie a modificar?");
        Serie serieModificar = ac.searchSerieByTitle(consola.nextLine());

        if (serieModificar != null) {

            menu.modificarSerie();
            String opcion = consola.nextLine();

            switch (opcion) {
                case "1": {
                    //Cambiar atributos de la serie
                    menuCambiarAtributosSerie(serieModificar);
                    break;
                }
                case "2": {
                    //Modificar una temporada
                    menuModificarTemporada(serieModificar);
                    break;
                }
                case "3": {
                    //Nueva temporada
                    ac.newTemporada(serieModificar);
                    break;
                }
                case "4": {
                    //Borrar temporada
                    ac.deleteTemporada(serieModificar);
                    break;
                }
                case "5": {
                    //Listar temporadas
                    ac.listTemporadas(serieModificar);
                    break;
                }
                case "6": {
                    //Salir
                    break;
                }
                default: {
                    System.err.println("Opcion invalida >:(");
                }

            }
        } else {
            System.err.println("SERIE NO ENCONTRADA");
        }

    }

    /**
     *
     * @param s
     */
    public void menuModificarTemporada(Serie s) {

        //LLamar funcion mostrar menu modificar temporadas
        System.out.println("Escribe el numero de temporada a buscar");
        String numeroTemporada = new Scanner(System.in).nextLine();

        Temporada temp = ac.findTemporadaByNumber(s, numeroTemporada);

        if (temp != null) {

            menu.modificarTemporada();
            String opcion = consola.nextLine();

            switch (opcion) {
                case "1": {
                    //Cambiar atributos de la temporada
                    menuCambiarAtributosTemporada(temp);
                    break;
                }
                case "2": {
                    //Modificar capitulo de la temporada
                    menuModificarAtributosCapitulos(temp);
                    break;
                }
                case "3": {
                    //Nuevo capitulo
                    ac.newCapitulo(temp);
                    break;
                }
                case "4": {
                    //Borrar capitulo
                    ac.deleteCapitulo(temp);
                    break;
                }
                case "5": {
                    //Listar capitulos
                    ac.listCapitulos(temp);
                    break;
                }
                case "6": {
                    //Salir
                    break;
                }
                default: {
                    System.err.println("Opcion invalida >:(");
                }

            }

        } else {
            System.err.println("TEMPORADA NO ENCONTRADA");
        }

    }

    /**
     *
     * @param temp
     */
    public void menuModificarAtributosCapitulos(Temporada temp) {
        //LLamar funcion mostrar menu modificar atributos del capitulo
        menu.modificarUnCapitulo();
        String opcion = consola.nextLine();

        ac.modificarCapituloAtribute(temp, opcion);

    }

    /**
     *
     * @param temp
     */
    public void menuCambiarAtributosTemporada(Temporada temp) {

        //LLamar funcion mostrar menu cambiar atributos temporada
        menu.modificarUnaTemporada();
        String opcion = consola.nextLine();

        ac.modificarTemporadaAtribute(temp, opcion);

    }

    /**
     *
     * @param s
     */
    public void menuCambiarAtributosSerie(Serie s) {

        //LLamar funcion mostrar menu cambiar atributos serie
        menu.modificarUnaSerie();
        String opcion = consola.nextLine();

        //Mandar la opcion seleccionada al selector en serie controller
        ac.modifySerieAtribute(s, opcion);

    }

    /**
     *
     */
    public void menuModificarPeliculas() {

        //LLamar funcion mostrar menu modificar peliculas
        menu.modificarPeliculas();
        String opcion = consola.nextLine();

        switch (opcion) {
            case "1": {
                //Nueva pelicula
                ac.newPelicula();
                break;
            }
            case "2": {
                //Modificar pelicula
                menuModificaUnaPelicula();
                break;
            }
            case "3": {
                //Borrar pelicula
                ac.deletePelicula();
                break;
            }
            case "4": {
                //Salir
                break;
            }
            default: {
                System.err.println("Opcion invalida >:(");
            }

        }

    }

    /**
     *
     */
    public void menuModificaUnaPelicula() {

        //LLamar funcion mostrar menu modificar una pelicula
        menu.modificarUnaPelicula();
        String opcion = consola.nextLine();
        Pelicula p = ac.getPeliculaPorTitulo();

        ac.modificarPelicula(p, opcion);

    }

    /**
     *
     */
    public void menuListado() {

        //LLamar funcion mostrar menu listado
        menu.listados();
        String opcion = consola.nextLine();

        switch (opcion) {
            case "1": {
                //Mostrar todo
                ac.listAll();
                break;
            }
            case "2": {
                //Mostrar todas la series
                ac.listSeries();
                break;
            }
            case "3": {
                //Mostrar todas las peliculas y series
                ac.listPeliculas();
                break;
            }
            case "4": {
                //Salir
                break;
            }
            default: {
                System.err.println("Opcion invalida >:(");
            }

        }

    }
}
