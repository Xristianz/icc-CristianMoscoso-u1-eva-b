package controllers;

import models.Book;

public class BookController {
    // Método para ordenar libros por nombre en orden descendente
    public void sortByName(Book[] libros) {
    Book aux;
    for(int i=0; i<libros.length; i++ ){
        for (int j=0; j<libros.length-1-i;j++ ){
            if (libros[j].getNombre().compareToIgnoreCase(libros[j+1].getNombre())<0){
                aux=libros[j];
                libros[j]=libros[j+1];
                libros[j+1]=aux;


            }
        }
    }
    

    }

}
