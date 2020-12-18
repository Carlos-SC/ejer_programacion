package examen2;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Longitud Array de 2 cifras: ");
        int n = s.nextInt();
        System.out.print("Longitud Array de 3 cifras: ");
        int m = s.nextInt();

        int[] array2 = new int[n];
        int[] array3 = new int[m];
        int[] aux = new int[n + m];
        int contA = 0;
        int contB = 0;

        for (int i = 0; i < array2.length; i++) {
            int azar = (int) (Math.random() * 91) + 10;

            array2[i] = azar;
        }

        for (int i = 0; i < array3.length; i++) {
            int azar = (int) (Math.random() * 901) + 100;

            array3[i] = azar;
        }
        
        System.out.println("");
        
        for (int i = 0; i < aux.length; i++) {
            boolean dato = false;
            int azar = (int) (Math.random() * 2);

            if (azar == 0 && contA < n) {
                aux[i] = array2[contA];
                contA++;
                dato = true;
            } else if (azar == 1 && contB < m) {
                aux[i] = array3[contB];
                contB++;
                dato = true;
            }

            if (!dato) {
                i--;
            } else {
                System.out.print(aux[i]+" | ");
            }
        }
    }
}
