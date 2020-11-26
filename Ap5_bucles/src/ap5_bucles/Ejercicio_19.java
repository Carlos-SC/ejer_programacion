package ap5_bucles;

import java.util.Scanner;

public class Ejercicio_19 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce un caracter: ");
        String simb = s.next();
        System.out.print("Introduce una altura: ");
        int h = s.nextInt();

        for (int i = 0; i < h; i++) {
            System.out.println("");
            for (int z = i; z < h-1; z++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(simb);
            }
        }

    }
}
