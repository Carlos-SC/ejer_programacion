package ap5_bucles;

import java.util.Scanner;

public class Ejercicio_17 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num;
        int suma=0;
        do {
            System.out.println("Introduce un número positivo: ");
            num = s.nextInt();
        } while (num < 0);
        
        for (int i = 0; i < 100; i++) {
            suma += (num+i);
        }

        System.out.println("La suma de los 100 siguientes números de "+num+" es "+suma);
    }
}
