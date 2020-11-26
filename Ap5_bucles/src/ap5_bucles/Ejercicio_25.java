package ap5_bucles;

import java.util.Scanner;

public class Ejercicio_25 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = s.nextInt();

        int inv = 0;

        while (num > 0) {
            inv = (inv * 10) + (num % 10);
            num = num / 10;
        }
        System.out.println(inv);
    }
}
