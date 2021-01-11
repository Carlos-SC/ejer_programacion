package bidimensionales;

import java.util.Scanner;

public class ejercicio_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int matriz[][] = new int[5][6];
        int sumaFila = 0;
        int sumaCol = 0;

        for (int i = 0; i < matriz.length - 1; i++) {
            sumaFila = 0;
            for (int j = 0; j < matriz[i].length - 1; j++) {
                matriz[i][j] = (int)(Math.random()*10+1);
                sumaFila += matriz[i][j];
                System.out.print(matriz[i][j]+"\t");
            }
            matriz[i][5]=sumaFila;
            System.out.print(sumaFila);
            System.out.println("");
        }
        
        for (int i = 0; i < matriz[0].length - 1; i++) {
            sumaCol = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumaCol += matriz[j][i];
            }
            System.out.print(sumaCol+"\t");
        }
        System.out.print("TOTAL");
        System.out.println("");
        
    }
}
