package examen;

import java.util.Scanner;

public class ejercicio_5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número entero comprendido entre 3 y 10: ");
        int num = s.nextInt();

        while (num < 3 || num > 10) {
            System.out.print("Número fuera de rango, introduce otro: ");
            num = s.nextInt();
        }

        for (int i = 0; i < (num * 2) - 1; i++) {
            if (i < num) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("A");
                }
            }

            if (i >= num) {
                for (int z = i; z < (num * 2) - 1; z++) {
                    System.out.print("A");
                }
            }
            System.out.println("");
        }

    }
}
