package ap5_bucles;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int comb = 4512;
        for (int i = 1; i < 5; i++) {
            System.out.println("Introduzca la combinación");
            int intento = s.nextInt();

            if (intento == comb) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                i = 5;
            } else {
                System.out.println("Lo siento, esa no es la combinación");
            }
        }
    }
}
