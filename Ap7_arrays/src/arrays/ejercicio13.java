package arrays;

import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] numeros = new int[100];
        int mayor = 0;
        int menor = Integer.MAX_VALUE;
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*501);
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            } else if (numeros[i] < menor) {
                menor = numeros[i];
            }
            
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
        System.out.println("¿Qué quiere destacar? (1 - mínimo, 2 - máximo): ");
        int resp = s.nextInt();
        
        for (int i = 0; i < numeros.length; i++) {
            if (resp == 2 && mayor == numeros[i]) {
                System.out.print("**"+numeros[i]+"**");
            } else if (resp == 1 && menor == numeros[i]) {
                System.out.print("**"+numeros[i]+"**");
            } else {
                System.out.print(numeros[i]+" ");
            }
        }
    }
}
