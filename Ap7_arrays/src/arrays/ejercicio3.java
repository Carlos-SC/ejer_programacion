package arrays;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        System.out.println("Introduce 10 números: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = s.nextInt();
        }
        
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
    }
}