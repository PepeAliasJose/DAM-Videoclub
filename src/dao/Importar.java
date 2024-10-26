/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import accesodatospractica001.model.Videoclub;
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Federico
 */
public class Importar {

    public Videoclub importar()throws IOException {
            XMLDecoder d = new XMLDecoder(new BufferedInputStream(new FileInputStream("videoclub.xml")));
            Videoclub vc= (Videoclub)d.readObject();
            return vc;
    }
}
