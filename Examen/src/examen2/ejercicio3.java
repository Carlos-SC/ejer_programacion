package examen2;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = 1;
        int b = 1;
        int aux;

        do {
            System.out.print("Intoduce un número positivo: ");
            a = s.nextInt();
        } while (a < 0);

        do {
            System.out.print("Introduce otro número positivo: ");
            b = s.nextInt();
        } while (b < 0);

        if (b < a) {
            aux = b;
            b = a;
            a = aux;
        }

        System.out.println("Números perfectos entre "+a+" y "+b+": ");
        for (int i = a; i <= b; i++) {
            int suma = 0;

            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    suma += j;
                }
            }
            
            if (suma==i) {
                System.out.println(i);
            }
        }
    }
}
