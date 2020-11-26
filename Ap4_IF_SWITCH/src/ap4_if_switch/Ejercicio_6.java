package ap4_if_switch;

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce una altura: ");
        double h = s.nextDouble();

        if (h < 0) {
            System.out.println("La altura debe ser un valor positivo");
        } else {
            double t = Math.sqrt((2 * h) / 9.81);

            System.out.println("El tiempo de caída será de: " + t);
        }
    }
}
