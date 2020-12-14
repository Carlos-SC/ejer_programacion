package arrays;

import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String[] palabras = new String[8];
        String[] aux = new String[8];
        int cont = 0;
        
        System.out.print("Introduce 8 palabras: ");
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = s.next();
            System.out.print(palabras[i]+" ");
        }
        
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < colores.length; j++) {
                if (palabras[i].equals(colores[j])) {
                    aux[cont] = palabras[i];
                    cont++;
                    palabras[i] = "";
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < palabras.length; i++) {
            if (!(palabras[i].equals(""))) {
                aux[cont] = palabras[i];
                cont++;
            }
            System.out.print(aux[i]+" ");
        }
        System.out.println("");
    }
}
