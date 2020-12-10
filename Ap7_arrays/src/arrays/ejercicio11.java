package arrays;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arrayI[] = new int[10];
        int arrayAux[] = new int[10];
        int cont = 0;

        System.out.println("Introduce 10 números: ");
        for (int i = 0; i < arrayI.length; i++) {
            arrayI[i] = s.nextInt();
        }
        
        for (int i = 0; i < arrayI.length; i++) {
            System.out.print(" " + arrayI[i]);
        }
        
        for (int i = 0; i < arrayI.length; i++) {
            boolean primo = true;
            for (int j = 2; j <= arrayI[i] / 2; j++) {
                if (arrayI[i] % j == 0) {
                    primo = false;
                    j = arrayI[i];
                }
            }
            if (primo) {
                arrayAux[cont] = arrayI[i];
                arrayI[i] = 0;
                cont++;
            }
        }

        for (int i = 0; i < arrayI.length; i++) {
            if (arrayI[i] != 0) {
                arrayAux[cont] = arrayI[i];
                cont++;
            }
        }

        System.out.println("");

        for (int i = 0; i < arrayAux.length; i++) {
            System.out.print(" " + arrayAux[i]);
        }
    }
}
