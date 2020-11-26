package ap5_bucles;

import java.util.Scanner;

public class Ejercicio_31 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce una altura: ");
        int h = s.nextInt();

        for (int i = 1; i < h; i++) {
            System.out.println("*");
        }
        for (int i = 0; i < (h / 2) + 1; i++) {
            System.out.print("* ");
        }
        System.out.println("");
    }
}
