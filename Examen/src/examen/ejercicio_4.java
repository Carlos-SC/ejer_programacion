package examen;

import java.util.Scanner;

public class ejercicio_4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduce un número para saber si es abundante: ");
        int num = s.nextInt();

        int suma = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }

        if (suma > num * 2) {
            System.out.println("El número " + num + " ES abundante.");
        } else {
            System.out.println("El número " + num + " NO es abundante.");
        }
    }
}
