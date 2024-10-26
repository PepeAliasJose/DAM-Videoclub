/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import accesodatospractica001.model.Videoclub;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Federico
 */
public class Exportar {
    public void exportar(Videoclub vc){
        try{
        XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("videoclub.xml")));
        x.writeObject(vc);
        x.close();
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
