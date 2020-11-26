package ap5_bucles;

import java.util.Scanner;

public class Ejercicio_18 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un número");
        int num1 = s.nextInt();
        int num2;
        int aux;

        do {
            System.out.println("Introduce un número distinto al anterior: ");
            num2 = s.nextInt();
        } while (num1 == num2);

        if (num2 < num1) {
            aux = num2;
            num2 = num1;
            num1 = aux;
        }
        for (int i = num1; i <= num2; i += 7) {
            System.out.println(i);
        }
    }
}
