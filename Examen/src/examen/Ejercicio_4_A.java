package examen;

import java.util.Scanner;

public class Ejercicio_4_A {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        int mayor;
        int menor;
        int resto;

        do {
            System.out.print("Introduce dos números: ");
            a = s.nextInt();
            b = s.nextInt();
        } while (a < 0 || b < 0);

        if (a > b) {
            mayor = a;
            menor = b;
        } else {
            mayor = b;
            menor = a;
        }

        do {
            resto = mayor % menor;
            mayor = menor;
            menor = resto;
        } while (resto != 0);

        System.out.println("El MCD es: "+mayor);
    }
}
