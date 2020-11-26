package ap5_bucles;

import java.util.Scanner;

public class Ejercicio_28 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        int num = s.nextInt();
        
        long fact = 1;
        
        for (int i = num; i > 0 ; i--) {
            fact = fact*i;
        }
        
        System.out.println("El factorial de "+num+" es "+fact);
    }
}
