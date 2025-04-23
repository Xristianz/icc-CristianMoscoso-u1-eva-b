package view;

import models.Book;

public class ViewConsol {
    public void printList(Book[] libros){
        for (int i=0; i<libros.length; i++){
            System.out.println("nombre: " + libros[i].getNombre());
            System.out.println(" año " + libros[i].getYear());
        }
    }
}
