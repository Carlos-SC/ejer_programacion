package libros;

import java.util.Scanner;


public class ProgramaLibros {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduce un título: ");
        String titulo = s.nextLine();
        System.out.print("Introduce una fecha: ");
        String fecha = s.nextLine();
        System.out.print("Introduce un ISBN: ");
        String ISBN = s.nextLine();
        /*"Introducción a java", "2021-01-01", "84-226-1586-X"*/
        Libro miLibro = new Libro(titulo, fecha, ISBN);
        
        System.out.println(miLibro.mostrar());
    }

}
