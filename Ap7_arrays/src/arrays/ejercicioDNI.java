package arrays;

import java.util.Scanner;

public class ejercicioDNI {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] letra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        System.out.print("Introduce un número de DNI: ");
        int dni = s.nextInt();

        int resto = dni % 23;

        System.out.println("Su DNI completo es " + dni + "-" + letra[resto]);
    }
}
