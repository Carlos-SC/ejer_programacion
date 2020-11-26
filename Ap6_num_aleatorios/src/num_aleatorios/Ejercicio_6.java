package num_aleatorios;

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int azar = (int) (Math.random() * 101);
        int num;
        int intento = 5;

        System.out.println("Adivina el número");

        do {
            System.out.print("Introduce un número: ");
            num = s.nextInt();
            intento--;
            if (num > azar) {
                System.out.println("El número a adivinar es menor");
            } else {
                System.out.println("El número a adivinar es mayor");
            }

            if (num == azar) {
                System.out.println("¡Has acertado!");
            } else {
                System.out.println("Te quedan " + intento + " intentos");
            }
        } while (num != azar && intento > 0);

    }
}
