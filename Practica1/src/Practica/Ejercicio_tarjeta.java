package Practica;

import java.util.Scanner;

public class Ejercicio_tarjeta {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long impar = 0;
        long par = 0;
        long suma = 0;

        System.out.print("Introduce un número de tarjeta de crédito (11 dígitos): ");
        long num = s.nextLong();

        do {
            impar = num % 10;
            num = num / 10;

            par = (num % 10) * 2;
            if (par > 9) {
                par = (par / 10) + (par % 10);
            }

            suma = suma + (par + impar);
            num = num / 10;
        } while (num > 0);

        if (suma % 10 == 0) {
            System.out.println("La tarjeta ES válida.");
        } else {
            System.out.println("La tarjeta NO es válida.");
        }
        System.out.println("La suma del algoritmo de Luhn es: " + suma);
    }
}
