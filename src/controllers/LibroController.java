package controllers;

import models.Book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LibroController {
    public Map<Book,Book> procesarLibros(List<Book> libros) {
        Map<Book,Book> librosMap = new TreeMap<>();
        for (Book libro : libros) {
            librosMap.put(libro, libro);
        }
        imprimirLibros(librosMap);
        return librosMap;
    }
    public void imprimirLibros(Map<Book,Book> libros) {
        for (Map.Entry<Book,Book> libro : libros.entrySet()) {
            System.out.print(libro.getKey());
            System.out.println(" → "+libro.getValue());
        }
    }
}
