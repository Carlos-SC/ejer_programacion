package Practica;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int contCiclos = 0;

        System.out.print("Introduce un número: ");
        int num = s.nextInt();

        System.out.println("n = " + num + " se genera la siguiente secuencia de números: ");
        System.out.print(num + " ");
        while (num > 1) {
            if (num % 2 == 0) {
                num = num / 2;
                System.out.print(num + " ");
            } else {
                num = (num * 3) + 1;
                System.out.print(num + " ");
            }
            contCiclos++;
        }

        System.out.println("\nSe realizaron " + (contCiclos + 1) + " ciclos");
    }
}
