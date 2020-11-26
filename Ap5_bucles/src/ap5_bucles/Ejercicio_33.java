package ap5_bucles;

import java.util.Scanner;

public class Ejercicio_33 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce una altura: ");
        int h = s.nextInt();

        for (int i = 0; i < h-1; i++) {
            System.out.print("*");
            for (int j = 0; j < h - 2; j++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        System.out.print(" ");
        for (int i = 0; i < h-2; i++) {
            System.out.print("* ");
        }
        System.out.println("");
    }
}
