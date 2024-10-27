/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatospractica001.controller;

import accesodatospractica001.exceptions.CapituloException;
import accesodatospractica001.exceptions.SerieException;
import accesodatospractica001.exceptions.TemporadaException;
import accesodatospractica001.model.*;
import java.util.ArrayList;
import java.util.Scanner;
        
/**
 *
 * @author pepe
 */
public class SerieController {
    public SerieController(){}
    
    
    /**
    * 
    * Crea una serie, 
    * 
    * 
    * @return new Serie created by user input
    * 
    * @since 1.0
    * 
    * @throws SerieException,TemporadaException, CapituloException if any data is incorrect 
    * 
    */
    public Serie createSerie() throws TemporadaException, CapituloException, SerieException{
    
        Serie serie = new Serie();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe el titulo:");
        serie.setTitle(sc.nextLine());
        
        System.out.println("Escribe la sinopsis:");
        serie.setSinopsis(sc.nextLine());
     
        System.out.println("Escribe el director:");
        serie.setDirector(sc.nextLine());
        
        System.out.println("Esta en emision? (s/n)");
        String emision = sc.nextLine();
        if(emision.equals("s")){
            serie.setEmision(true);
        }else if (emision.equals("n")){
            serie.setEmision(false);
        }else{
            throw new SerieException("Emision");
        }
      
        ArrayList<Temporada> listTemporadas = new ArrayList<Temporada>();
        System.out.println("Agregar temporadas? (s/n)");
        boolean agregaTemp = (sc.nextLine().equalsIgnoreCase("s"))?true:false;
        
        //Bucle para agregar temporadas a la serie indefinidamente
        while(agregaTemp){
        
            listTemporadas.add(createTemporada());
            System.out.println("Agregar otra temporada? (s/n)");
            agregaTemp = (sc.nextLine().equalsIgnoreCase("s"))?true:false;
            
        }
        serie.setTemporadas(listTemporadas);
        
        return serie;
    
    }
    
    /**
    * 
    * Crea una nueva temporada
    * 
    * 
    * @return new Temporada created by user input
    * 
    * @since 1.0
    * 
    * throws TemporadaException, CapituloException si cualquier dato esta mal
    * 
    */
    public Temporada createTemporada() throws TemporadaException, CapituloException{
    
        Temporada tmp = new Temporada();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce numero de temporada:");
        tmp.setSeasonNumber(sc.nextLine());
        
        System.out.println("Introduce titulo de temporada:");
        tmp.setTitle(sc.nextLine());
        
        System.out.println("Introduce la sinopsis:");
        tmp.setSinopsis(sc.nextLine());
        
        System.out.println("Introduce el año de emision:");
        tmp.setYear(sc.nextLine());
        
        ArrayList<Capitulo> listCapitulos = new ArrayList<Capitulo>();
        System.out.println("Agregar capitulos? (s/n)");
        boolean agregaCap = (sc.nextLine().equalsIgnoreCase("s"))?true:false;
        
        //Bucle para agregar temporadas a la serie indefinidamente
        while(agregaCap){
        
            listCapitulos.add(createCapitulo());
            System.out.println("Agregar otro capitulo? (s/n)");
            agregaCap = (sc.nextLine().equalsIgnoreCase("s"))?true:false;
            
        }
        tmp.setCapitulos(listCapitulos);
        
        return tmp;
    
    }
    
    /**
    * 
    * Crea un capitulo
    * 
    * 
    * @return new Capitulo created by user input
    * 
    * @since 1.0
    * 
    * throws CapituloException if any data is incorrect 
    * 
    */
    public Capitulo createCapitulo() throws CapituloException{
    
        Capitulo cap = new Capitulo();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce titulo del capitulo:");
        cap.setTitle(sc.nextLine());
        
        System.out.println("Introduce la sinopsis:");
        cap.setSinopsis(sc.nextLine());
        
        System.out.println("Introduce la duracion en minutos:");
        cap.setDuration(sc.nextLine());
        
        
        return cap;
    
    }
    
    /**
    * 
    * Modifica la serie
    * 
    * @param s serie a modificar
    * @param campo opcion de la serie a modificar
    * 
    * @return una version modificada de la serie introducida
    * 
    * @since 1.0
    * 
    * throws SerieException si algun dato esta mal
    * 
    */
    public Serie modificateSerie(Serie s,String campo) throws SerieException{
    
        Scanner sc = new Scanner(System.in);
        
        switch (campo) {
            case "1":{
                //Cambiar titulo
                System.out.println("Escribe el nuevo titulo");
                s.setTitle(sc.nextLine());
                break;
            }   
            case "2":{
                //Cambiar sinpsis
                System.out.println("Escribe la nueva sinopsis");
                s.setSinopsis(sc.nextLine());
                break;
            } 
            case "3":{
                //Cambiar director
                System.out.println("Escribe el nuevo director");
                s.setDirector(sc.nextLine());
                break;
            } 
            case "4":{
                //Cambiar estado
                System.out.println("Pon el nuevo estado");
                String emision = sc.nextLine();
                if(emision.equals("s")){
                    s.setEmision(true);
                }else if (emision.equals("n")){
                    s.setEmision(false);
                }else{
                    throw new SerieException("Emision");
                }
                break;
            } 
            default:{
                System.err.println("Opcion invalida >:(");
            }
                
        }
    
        return s;
    }
    
    
    /**
    * 
    * 
    * throws TemporadaException si algun dato esta mal
    * 
    * @param t temporada a modificar
    * @param option opcion a cambiar de la temporada
    * 
    * @return una version modificada de la temporada introducida
    * 
    * @since 1.0
    * 
    * 
    */
    public Temporada modificateTemporada(Temporada t, String option) throws TemporadaException{
    
        switch (option) {
            case "1":{
                //Cambiar numero
                System.out.println("Nuevo numero de temporada");
                t.setSeasonNumber(new Scanner(System.in).nextLine());
                break;
            }   
            case "2":{
                //Cambiar titulo
                System.out.println("Nuevo titulo");
                t.setTitle(new Scanner(System.in).nextLine());
                break;
            } 
            case "3":{
                //Cambiar sinopsis
                System.out.println("Nueva sinopsis");
                t.setSinopsis(new Scanner(System.in).nextLine());
                break;
            } 
            case "4":{
                //Cambiar año
                System.out.println("Nuevo año de emision");
                t.setYear(new Scanner(System.in).nextLine());
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
        
        return t;
    
    }
    
    /**
    * 
    * 
    * throws CapituloException si algun dato esta mal
    * 
    * @param c capitulo a modificar
    * @param option opcion a cambiar del capitulo
    * 
    * @return una version modificada del capitulo introducido
    * 
    * 
    * @since 1.0
    * 
    * 
    */
    public Capitulo modificateCapitulo(Capitulo c, String option) throws CapituloException{
    
        
        
         switch (option) {
            case "1":{
                //Cambiar titulo
                System.out.println("Nuevo nombre de capitulo");
                c.setTitle(new Scanner(System.in).nextLine());
                break;
            }   
            case "2":{
                //Cambiar sinopsis
                System.out.println("Nueva sinopsis");
                c.setSinopsis(new Scanner(System.in).nextLine());
                break;
            } 
            case "3":{
                //Cambiar duracion
                System.out.println("Nueva duracion");
                c.setDuration(new Scanner(System.in).nextLine());
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
        
         return c;
        
    }
}
