package examen;

import java.util.Scanner;

public class Ejercicio_6_A {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduce un número entero comprendido entre 3 y 10: ");
        int num = s.nextInt();
        
        while (num<3 || num>10) {
            System.out.print("Número fuera de rango, introduce otro: ");
            num = s.nextInt();
        }
        
        System.out.print("Introduce un caracter: ");
        String caracter = s.next();
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if ((i+j)<num-1) {
                    System.out.print(" ");
                } else {
                    System.out.print(caracter);
                }
            }
            System.out.println("");
        }
        
        for (int i = 0; i < num-1; i++) {
            System.out.print(" ");
            for (int j = 0; j < num-1; j++) {
                if (i>j) {
                    System.out.print(" ");
                } else {
                    System.out.print(caracter);
                }
            }
            System.out.println("");
        }
        
        
    }
}
