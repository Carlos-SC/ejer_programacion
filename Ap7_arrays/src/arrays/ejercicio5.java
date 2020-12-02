package arrays;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] num = new int[10];
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.print("Introduce 10 números: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = s.nextInt();

            if (num[i] < menor) {
                menor = num[i];
            }

            if (num[i] > mayor) {
                mayor = num[i];
            }
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] == mayor) {
                System.out.print("Mayor " + num[i]);
            }
            if (num[i] == menor) {
                System.out.print("Menor " + num[i]);
            }
            if (!(num[i] == mayor || num[i] == menor)) {
                System.out.println(num[i]);
            }
        }

    }
}
