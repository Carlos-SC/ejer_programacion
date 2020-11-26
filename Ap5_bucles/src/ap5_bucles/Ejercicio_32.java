package ap5_bucles;

import java.util.Scanner;

public class Ejercicio_32 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long inv = 0;
        long suma = 0;

        System.out.println("Por favor, introduzca un número entero positivo: ");
        long num = s.nextLong();

        System.out.print("Dígitos pares: ");
        while (num > 0) {
            inv = inv * 10 + num % 10;
            num = num / 10;
        }

        while (inv > 0) {
            long dig = inv % 10;

            if (inv%2 == 0) {
                System.out.print(dig + " ");
                suma = suma + dig;
            }
            inv = inv / 10;
        }
        System.out.println("");
        System.out.println("Suma de los dígitos pares: " + suma);
    }
}
