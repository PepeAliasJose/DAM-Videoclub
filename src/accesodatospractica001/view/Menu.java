/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatospractica001.view;

/**
 *
 * @author pepe
 */
public class Menu {

    public Menu() {
    }

    public void menuPrincipal() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1 - Listados");
        System.out.println("2 - Modificar Pelicula");
        System.out.println("3 - Modificar Serie");
        System.out.println("4 - Busqueda");
        System.out.println("5 - Importar/Exportar");
        System.out.println("6 - Salir");
    }

    public void listados() {
        System.out.println("MENU LISTADOS");
        System.out.println("1 - Mostrar Todo");
        System.out.println("2 - Mostrar Series");
        System.out.println("3 - Mostrar Peliculas");
        System.out.println("4 - Salir");

    }

    public void modificarPeliculas() {
        System.out.println("MENU MODIFICAR PELICULAS");
        System.out.println("1 - Nueva Película");
        System.out.println("2 - Modificar atributos");
        System.out.println("3 - Borrar Película");
        System.out.println("4 - Salir");
    }

    public void modificarUnaPelicula() {
        System.out.println("MENU MODIFICAR PELICULA");
        System.out.println("1 - Titulo");
        System.out.println("2 - Año");
        System.out.println("3 - Sinopsis");
        System.out.println("4 - Duración en minutos");
        System.out.println("5 - Director");
        System.out.println("6 - Salir");

    }

    public void modificarSeries() {
        System.out.println("MENU MODIFICAR SERIES");
        System.out.println("1 - Nueva Serie");
        System.out.println("2 - Modificar una Serie");
        System.out.println("3 - Borrar Serie");
        System.out.println("4 - Salir");
    }

    public void modificarSerie() {
        System.out.println("MENU MODIFICAR SERIE");
        System.out.println("1 - Modificar atributos");
        System.out.println("2 - Modificar Temporada");
        System.out.println("3 - Nueva Temporada");
        System.out.println("4 - Borrar Temporada");
        System.out.println("5 - Listar Temporadas");
        System.out.println("6 - Salir");
    }

    public void modificarUnaSerie() {
        System.out.println("MENU MODIFICAR UNA SERIE");
        System.out.println("1 - Modificar Titulo");
        System.out.println("2 - Modificar Sinopsis");
        System.out.println("3 - Modificar Director");
        System.out.println("4 - Modificar Estado");
        System.out.println("5 - Salir");
    }

    public void modificarTemporada() {
        System.out.println("MENU MODIFICAR TEMPORADA");
        System.out.println("1 - Modificar atributos");
        System.out.println("2 - Modificar Capitulo");
        System.out.println("3 - Nuevo Capitulo");
        System.out.println("4 - Borrar Capitulo");
        System.out.println("5 - Listar Capitulos");
        System.out.println("6 - Salir");
    }

    public void modificarUnaTemporada() {
        System.out.println("MENU MODIFICAR UNA TEMPORADA");
        System.out.println("1 - Modificar número de temporada");
        System.out.println("2 - Modificar Titulo");
        System.out.println("3 - Modificar Sinopsis");
        System.out.println("4 - Modificar año");
        System.out.println("5 - Salir");
    }

    public void modificarUnCapitulo() {
        System.out.println("MENU MODIFICAR UN CAPITULO");
        System.out.println("1 - Modificar Titulo");
        System.out.println("2 - Modificar Sinopsis");
        System.out.println("3 - Modificar Duración");
        System.out.println("4 - Salir");
    }

    public void busqueda() {
        System.out.println("MENU BUSQUEDA");
        System.out.println("1 - Buscar Título");
        System.out.println("2 - Buscar Año");
        System.out.println("3 - Salir");
    }

    public void importarExportar() {
        System.out.println("MENU IMPORTAR/EXPORTAR");
        System.out.println("1 - Importar");
        System.out.println("2 - Exportar");
        System.out.println("3 - Salir");
    }
}
