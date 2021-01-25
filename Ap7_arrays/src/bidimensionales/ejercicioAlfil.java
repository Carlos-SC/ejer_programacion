package bidimensionales;

import java.util.Scanner;

public class ejercicioAlfil {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int f;
        int c;
        do {
            System.out.print("Introduzca la posición del alfil: ");
            f = s.nextInt();
            c = s.nextInt();
        } while ((f > 8 | f < 0) | (c > 8 | c < 0));

        int tablero[][] = new int[8][8];
        f = tablero.length - f;
        c = c - 1;

        int j = c + 1;
        for (int i = f - 1; i >= 0 && j < tablero.length - 1; i--) {
            System.out.println((8 - i) + " " + (j + 1));
            j++;
        }

        j = c - 1;
        for (int i = f - 1; i >= 0 && j >= 0; i--) {
            System.out.println((8 - i) + " " + (j + 1));
            j--;
        }

        j = c - 1;
        for (int i = f + 1; i < tablero.length && j >= 0; i++) {
            System.out.println((8 - i) + " " + (j+1));
            j--;
        }

        j = c + 1;
        for (int i = f + 1; i < tablero.length && j >= 0; i++) {
            System.out.println((8 - i) + " " + (j+1));
            j++;
        }

    }
}
