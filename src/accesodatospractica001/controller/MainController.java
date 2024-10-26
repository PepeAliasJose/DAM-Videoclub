/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatospractica001.controller;

import java.util.Scanner;

/**
 *
 * @author pepe
 */
public class MainController {
    
    Scanner consola ;
    
    public MainController(){
        consola = new Scanner(System.in);
    }
    
    public void MainMenuController(){
    
        //LLamar funcion mostrar menu principal
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
                break;
            } 
            default:{
                System.err.println("Opcion invalida >:(");
            }
                
        }
    
    }
    
    public void menuImportarExportar(){
    
        //LLamar funcion mostrar menu importar exportar
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
        String opcion = consola.nextLine();
        
        switch (opcion) {
            case "1":{
                //Nueva serie
                break;
            }   
            case "2":{
                //Modificar serie
                menuModificarUnaSerie();
                break;
            } 
            case "3":{
                //Borrar serie
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
        String opcion = consola.nextLine();
        
        switch (opcion) {
            case "1":{
                //Nueva pelicula
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
        String opcion = consola.nextLine();
        
        switch (opcion) {
            case "1":{
                //Mostrar todo
                break;
            }   
            case "2":{
                //Mostrar todas la series
                break;
            } 
            case "3":{
                //Mostrar todas las peliculas
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
