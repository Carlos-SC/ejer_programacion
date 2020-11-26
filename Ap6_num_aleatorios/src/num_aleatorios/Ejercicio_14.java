package num_aleatorios;

import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce un número entre 0 y 100 que intentará adivinar la máquina: ");
        int numAdiv = s.nextInt();

        int num;
        int intento = 5;

        int c1 = 101;
        int c2 = 0;

        do {
            num = (int) (Math.random() * (c1-c2) + (c2));
            intento--;
            System.out.println("Mi intento: " + num);

            if (num == numAdiv) {
                System.out.println("He ganado, humano");
            } else if (intento != 0) {
                System.out.print("He fallado, ¿el número a adivinar es mayor o menor?: ");
                String pista = s.next();

                if (pista.equals("mayor")) {
                    c2 = num;
                } else {
                    c1 = num;
                }
            }
        } while (num != numAdiv && intento > 0);

        if (num != numAdiv && intento == 0) {
            System.out.println("He perdido esta vez.");
        }
    }
}