package examen4;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce el número de provincias: ");
        int provincias = s.nextInt();

        int[][] arrayLluvia = new int[provincias][7];
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        int menor = Integer.MAX_VALUE;
        int posMenorDia = 0;
        int posMenorPro = 0;
        for (int i = 0; i < arrayLluvia.length; i++) {
            for (int j = 0; j < arrayLluvia[0].length; j++) {
                arrayLluvia[i][j] = (int) (Math.random() * 151);
                if (arrayLluvia[i][j] < menor) {
                    menor = arrayLluvia[i][j];
                    posMenorDia = j;
                    posMenorPro = i;
                }
            }
        }

        int mediaTotal = 0;
        System.out.println("        " + "\tLunes\tMartes\tMierc\tJueves\tViernes\tSabado\tDomingo\tMediaSem");
        for (int i = 0; i < arrayLluvia.length; i++) {
            System.out.print("Provincia" + (i + 1) + "\t");
            int mediaPro = 0;
            for (int j = 0; j < arrayLluvia[0].length; j++) {
                System.out.print(arrayLluvia[i][j] + "\t");
                mediaPro += arrayLluvia[i][j];
                mediaTotal += arrayLluvia[i][j];
            }
            System.out.print(mediaPro / 7);
            System.out.println("");
        }

        System.out.println("");
        System.out.print("Media Dia\t");
        for (int i = 0; i < arrayLluvia[0].length; i++) {
            int mediaDia = 0;
            for (int j = 0; j < arrayLluvia.length; j++) {
                mediaDia += arrayLluvia[j][i];
            }
            System.out.print(mediaDia / provincias + "\t");
        }

        System.out.println("");
        System.out.print("Dia mas lluvia\t");
        for (int i = 0; i < arrayLluvia[0].length; i++) {
            int mayor = 0;
            int pos = 0;
            for (int j = 0; j < arrayLluvia.length; j++) {
                if (arrayLluvia[j][i] > mayor) {
                    mayor = arrayLluvia[j][i];
                    pos = j;
                }
            }
            System.out.print("prov" + (pos + 1) + "\t");
        }

        System.out.println("");
        System.out.println("\nProvincia en la que menos llovió: provincia" + (posMenorPro + 1) + ", dia: " + dias[posMenorDia]);

        System.out.println("\nMedia general: " + (mediaTotal / (provincias * 7)));
    }
}
