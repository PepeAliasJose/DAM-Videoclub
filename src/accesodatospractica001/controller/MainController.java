/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatospractica001.controller;

import accesodatospractica001.view.Menu;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author pepe
 */
public class MainController {
    
    Scanner consola ;
    Menu menu;
    ApplicationController ac;
    
    
    public MainController(){
        consola = new Scanner(System.in);
        menu = new Menu();
        try {
            ac = new ApplicationController();
                    
            while(mainMenuController()){
                continue;
            }
        } catch (IOException ex) {
            System.err.println("Error leyendo el videoclub, saliendo ...");
        }

        
    }
    
    public boolean mainMenuController(){
    
        //LLamar funcion mostrar menu principal
        menu.menuPrincipal();
        String opcion = consola.nextLine();
        
        switch (opcion) {
            case "1":{
                //Menu de listar peliculas y series
                menuListado();
                break;
            }   
            case "2":{
                //Menu de modificar peliculas
                menuModificarPeliculas();
                break;
            } 
            case "3":{
                //Menu de modificar series
                menuModificarSeries();
                break;
            } 
            case "4":{
                //Menu de busqueda
                menuBusquedaAvanzada();
                break;
            } 
            case "5":{
                //Menu de importar/Exportar
                menuImportarExportar();
                break;
            } 
            case "6":{
                //Salir
                return false;
            } 
            default:{
                System.err.println("Opcion invalida >:(");
            }
                
        }
        return true;
    
    }
    
    public void menuImportarExportar(){
    
        //LLamar funcion mostrar menu importar exportar
        menu.importarExportar();
        String opcion = consola.nextLine();
        
        switch (opcion) {
            case "1":{
                //Importar
                break;
            }   
            case "2":{
                //Exportar
                break;
            } 
            case "3":{
                //Salir
                break;
            } 
            default:{
                System.err.println("Opcion invalida >:(");
            }
                
        }
    
    }
    
    public void menuBusquedaAvanzada(){
    
        //LLamar funcion mostrar menu busqueda avanzada
        menu.busqueda();
        String opcion = consola.nextLine();
        
        switch (opcion) {
            case "1":{
                //Busqueda por titulo
                break;
            }   
            case "2":{
                //Busqueda por año
                break;
            } 
            case "3":{
                //Salir
                break;
            } 
            default:{
                System.err.println("Opcion invalida >:(");
            }
                
        }
    
    }
    
    public void menuModificarSeries(){
    
        //LLamar funcion mostrar menu modificar series
        menu.modificarSeries();
        String opcion = consola.nextLine();
        
        switch (opcion) {
            case "1":{
                //Nueva serie
                ac.newSerie();
                break;
            }   
            case "2":{
                //Modificar serie
                menuModificarUnaSerie();
                break;
            } 
            case "3":{
                //Borrar serie
                ac.deleteSerie();
                break;
            } 
            case "4":{
                //Salir
                break;
            } 
            default:{
                System.err.println("Opcion invalida >:(");
            }
                
        }
    
    }
    
    public void menuModificarUnaSerie(){
    
        //LLamar funcion mostrar menu modificar una pelicula
        menu.modificarSerie();
        String opcion = consola.nextLine();
        
        switch (opcion) {
            case "1":{
                //Cambiar atributos de la serie
                menuCambiarAtributosSerie();
                break;
            }   
            case "2":{
                //Modificar una temporada
                menuModificarTemporada();
                break;
            } 
            case "3":{
                //Nueva temporada
                break;
            } 
            case "4":{
                //Borrar temporada
                break;
            } 
            case "5":{
                //Listar temporadas
                break;
            } 
            case "6":{
                //Salir
                break;
            } 
            default:{
                System.err.println("Opcion invalida >:(");
            }
                
        }
    
    }
    
    public void menuModificarTemporada(){
    
        //LLamar funcion mostrar menu modificar temporadas
        menu.modificarTemporada();
        String opcion = consola.nextLine();
        
        switch (opcion) {
            case "1":{
                //Cambiar atributos de la temporada
                menuCambiarAtributosTemporada();
                break;
            }   
            case "2":{
                //Modificar capitulo de la temporada
                menuModificarAtributosCapitulos();
                break;
            } 
            case "3":{
                //Nuevo capitulo
                break;
            } 
            case "4":{
                //Borrar capitulo
                break;
            } 
            case "5":{
                //Listar capitulos
                break;
            } 
            case "6":{
                //Salir
                break;
            } 
            default:{
                System.err.println("Opcion invalida >:(");
            }
                
        }
    
    }
    
    public void menuModificarAtributosCapitulos(){
    
        //LLamar funcion mostrar menu modificar atributos del capitulo
        menu.modificarUnCapitulo();
        String opcion = consola.nextLine();
        
        switch (opcion) {
            case "1":{
                //Cambiar titulo
                break;
            }   
            case "2":{
                //Cambiar sinopsis
                break;
            } 
            case "3":{
                //Cambiar duracion
                break;
            } 
            case "4":{
                //Salir
                break;
            } 
            default:{
                System.err.println("Opcion invalida >:(");
            }
                
        }
    
    }
    
    public void menuCambiarAtributosTemporada(){
    
        //LLamar funcion mostrar menu cambiar atributos temporada
        menu.modificarUnaTemporada();
        String opcion = consola.nextLine();
        
        switch (opcion) {
            case "1":{
                //Cambiar numero
                break;
            }   
            case "2":{
                //Cambiar titulo
                break;
            } 
            case "3":{
                //Cambiar sinopsis
                break;
            } 
            case "4":{
                //Cambiar año
                break;
            } 
            case "5":{
                //Salir
                break;
            } 
            default:{
                System.err.println("Opcion invalida >:(");
            }
                
        }
        
    }
    
    public void menuCambiarAtributosSerie(){
        
        //LLamar funcion mostrar menu cambiar atributos serie
        menu.modificarUnaSerie();
        String opcion = consola.nextLine();
        
        switch (opcion) {
            case "1":{
                //Cambiar titulo
                break;
            }   
            case "2":{
                //Cambiar sinpsis
                break;
            } 
            case "3":{
                //Cambiar director
                break;
            } 
            case "4":{
                //Cambiar estado
                break;
            } 
            case "5":{
                //Salir
                break;
            } 
            default:{
                System.err.println("Opcion invalida >:(");
            }
                
        }
    }
    
    public void menuModificarPeliculas(){
    
        //LLamar funcion mostrar menu modificar peliculas
        menu.modificarPeliculas();
        String opcion = consola.nextLine();
        
        switch (opcion) {
            case "1":{
                //Nueva pelicula
                ac.newPelicula();
                break;
            }   
            case "2":{
                //Modificar pelicula
                menuModificaUnaPelicula();
                break;
            } 
            case "3":{
                //Borrar pelicula
                break;
            } 
            case "4":{
                //Salir
                break;
            } 
            default:{
                System.err.println("Opcion invalida >:(");
            }
                
        }
    
    }
    
    public void menuModificaUnaPelicula(){
    
        //LLamar funcion mostrar menu modificar una pelicula
        menu.modificarUnaPelicula();
        String opcion = consola.nextLine();
        
        switch (opcion) {
            case "1":{
                //Cambiar titulo
                break;
            }   
            case "2":{
                //Cambiar año
                break;
            } 
            case "3":{
                //Cambiar sinopsis
                break;
            } 
            case "4":{
                //Cambiar duracion
                break;
            } 
            case "5":{
                //Cambiar director
                break;
            } 
            case "6":{
                //Salir
                break;
            } 
            default:{
                System.err.println("Opcion invalida >:(");
            }
                
        }
    
    }
    
    public void menuListado(){
    
        //LLamar funcion mostrar menu listado
        menu.listados();
        String opcion = consola.nextLine();
        
        switch (opcion) {
            case "1":{
                //Mostrar todo
                ac.listAll();
                break;
            }   
            case "2":{
                //Mostrar todas la series
                ac.listSeries();
                break;
            } 
            case "3":{
                //Mostrar todas las peliculas y series
                ac.listPeliculas();
                break;
            } 
            case "4":{
                //Salir
                break;
            } 
            default:{
                System.err.println("Opcion invalida >:(");
            }
                
        }
    
    }
}
