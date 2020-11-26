package ap5_bucles;

import java.util.Scanner;

public class Ejercicio_16 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce un número para saber si es primo: ");
        int num = s.nextInt();
        int i = 0;
        
        for (i = 2; i < num - 1; i++) {
            if (num%i==0) {
                System.out.println("El número no es primo");
                i=num;
            }
        }
        
        if (i == num-1) {
            System.out.println("El número es primo");
        }
    }
}