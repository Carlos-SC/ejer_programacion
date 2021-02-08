package examen3;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce las filas: ");
        int n = s.nextInt();
        System.out.print("Introduce las columnas: ");
        int m = s.nextInt();
        int[][] arrayBi = new int[n][m];

        int sumaFila = 0;
        int sumaCol = 0;
        int sumaTotal = 0;

        for (int i = 0; i < arrayBi.length; i++) {
            sumaFila = 0;
            for (int j = 0; j < arrayBi[i].length; j++) {
                arrayBi[i][j] = (int) (Math.random() * 10 + 10);
                System.out.print(arrayBi[i][j] + "\t");

                sumaFila += arrayBi[i][j];
                sumaTotal += arrayBi[i][j];
            }
            System.out.print("\t" + "Suma fila " + (i + 1) + " = " + sumaFila);
            System.out.println("");
        }

        System.out.println("");
        for (int i = 0; i < arrayBi[0].length; i++) {
            sumaCol = 0;
            for (int j = 0; j < arrayBi.length; j++) {
                sumaCol += arrayBi[j][i];
            }
            System.out.println("MC " + (i + 1) + ": " + (double) sumaCol / m + " ");
        }
        System.out.println("");
        System.out.println("Suma de todos los elementos: " + sumaTotal);

        System.out.println("\nMenores columnas impares: ");
        for (int i = 0; i < arrayBi.length; i++) {
            int menor = Integer.MAX_VALUE;
            int posJ = 0;
            if (i % 2 == 0) {
                for (int j = 0; j < arrayBi[i].length; j++) {
                    if (arrayBi[i][j] < menor) {
                        menor = arrayBi[i][j];
                        posJ = j;
                    }
                }
                System.out.print("Fila "+(i+1)+" Col "+(posJ+1)+" = "+menor);
                System.out.println("");
            }
        }
    }
}
