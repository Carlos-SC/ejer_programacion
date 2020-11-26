package ap5_bucles;

import java.util.Scanner;

public class Ejercicio_16_while {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un número para saber si es primo: ");
        int num = s.nextInt();
        int cont = 2;
        
        while (num % cont != 0 && cont<=num/2){
            cont++;
        }

        if (cont > num/2) {
            System.out.println("El número es primo ");
        } else {
            System.out.println("El número no es primo ");
        }
    }
}