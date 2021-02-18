package examen3;

import java.util.Scanner;

public class ejercicio1_A {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 2);
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("");
        }

        System.out.print("Introduce unas coordenadas: ");
        int x = s.nextInt();
        int y = s.nextInt();

        while ((x > array.length || x <= 0) || (y > array[0].length || y <= 0)) {
            System.out.print("Introduce unas coordenadas válidas: ");
            x = s.nextInt();
            y = s.nextInt();
        }

        System.out.print("Introduce un arco(-1 para salir): ");
        int arco = s.nextInt();
        while (arco != -1) {
            int contUnos = 0;
            
            int iniF = x - 1;
            int finF = iniF + arco;
            if (iniF < 0) {
                iniF = 0;
            }
            if (finF > array.length - 1) {
                finF = array.length - 1;
            }
            int iniC = y - 1;
            int finC = iniF + arco;
            if (iniC < 0) {
                iniC = 0;
            }
            if (finC > array[0].length - 1) {
                finC = array[0].length - 1;
            }

            for (int i = iniF; i <= finF; i++) {
                for (int j = iniC; j <= finC; j++) {
                    if (array[i][j] == 1) {
                        contUnos++;
                    }
                }
            }
            System.out.println("Partiendo de "+x+" "+y+" y un arco de "+arco+" habría "+contUnos+" asteroides.");
            System.out.print("Introduce un arco(-1 para salir): ");
            arco = s.nextInt();
        }
    }
}
