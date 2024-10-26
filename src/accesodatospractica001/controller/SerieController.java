/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatospractica001.controller;

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
    * 
    * throws SerieException if any data is incorrect 
    * 
    * @return new Serie created by user input
    * 
    * @since 1.0
    * 
    * 
    */
    public Serie createSerie(){
    
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
            //Lanzar excepcion
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
    * 
    * throws TemporadaException if any data is incorrect 
    * 
    * @return new Temporada created by user input
    * 
    * @since 1.0
    * 
    * 
    */
    public Temporada createTemporada(){
    
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
    * 
    * throws CapituloException if any data is incorrect 
    * 
    * @return new Capitulo created by user input
    * 
    * @since 1.0
    * 
    * 
    */
    public Capitulo createCapitulo(){
    
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
}
