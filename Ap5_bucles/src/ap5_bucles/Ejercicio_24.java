package ap5_bucles;

import java.util.Scanner;

public class Ejercicio_24 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = s.nextInt();

        for (int i = 0; i < num; i++) {

            int cont = 0;
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                if (j <= (i * 2 + 1) / 2) {
                    cont++;
                } else {
                    cont--;
                }
                System.out.print(cont);
            }

            System.out.println("");
        }
    }
}
