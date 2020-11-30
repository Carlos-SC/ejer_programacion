package Practica;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String numBi = "";
        int contUnos = 0;

        System.out.print("Introduce un número para pasarlo a binario (menor de 9999): ");
        int num = s.nextInt();

        while (num > 0) {
            int resto = num % 2;

            if (resto == 1) {
                contUnos++;
            }

            numBi = resto + "" + numBi;

            num = num / 2;

        }

        System.out.println("Su binario es: " + numBi);
        System.out.println("Tiene " + contUnos + " unos");
    }
}
