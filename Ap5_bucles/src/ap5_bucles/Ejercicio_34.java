package ap5_bucles;

import java.util.Scanner;

public class Ejercicio_34 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        long num1 = s.nextInt();
        System.out.print("Introduce otro número: ");
        long num2 = s.nextInt();

        long inv1 = 0;
        long inv2 = 0;

        long numPar = 0;
        long numImpar = 0;

        while (num1 > 0) {
            inv1 = (inv1 * 10) + (num1 % 10);
            inv2 = (inv2 * 10) + (num2 % 10);

            num1 /= 10;
            num2 /= 10;
        }

        while (inv1 > 0) {
            long dig1 = inv1 % 10;
            long dig2 = inv2 % 10;

            if (dig1 % 2 == 0) {
                numPar = numPar * 10 + dig1;
            } else {
                numImpar = numImpar * 10 + dig1;
            }

            if (dig2 % 2 == 0) {
                numPar = numPar * 10 + dig2;
            } else {
                numImpar = numImpar * 10 + dig2;
            }

            inv1 /= 10;
            inv2 /= 10;
        }

        System.out.println("El número formado por los dígitos pares es: " + numPar);
        System.out.println("El número formado por los dígitos impares es: " + numImpar);
    }
}
