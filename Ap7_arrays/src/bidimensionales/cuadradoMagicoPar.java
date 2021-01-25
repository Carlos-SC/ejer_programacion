package bidimensionales;

import java.util.Scanner;

public class cuadradoMagicoPar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce una dimensión par: ");
        int n = s.nextInt();

        int matriz[][] = new int[n][n];
        int array[] = new int[n * n / 2];

        for (int i = 0; i < matriz.length; i++) {
            matriz[i][i] = i * matriz.length + (i + 1);
        }

        int j = matriz.length - 1;
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][j] = i * matriz.length + (j + 1);
            j--;
        }

        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[i].length; k++) {
                if (matriz[i][k] == 0) {
                    array[cont] = i * n + (k + 1);
                    cont++;
                }
            }
        }
        
        cont=0;
        for (int i = matriz.length-1; i >= 0; i--) {
            for (int k = matriz[i].length-1; k >= 0; k--) {
                if (matriz[i][j]==0) {
                    matriz[i][j] = array[cont];
                    cont++;
                }
            }
        }
        mostrarMatriz(matriz);
    }

    public static void mostrarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
