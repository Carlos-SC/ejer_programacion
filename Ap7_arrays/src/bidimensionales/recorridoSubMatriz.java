package bidimensionales;

import java.util.Scanner;

public class recorridoSubMatriz {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int matriz[][] = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 51);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }

        /* Dando un punto central y un arco.
        
        int fc, cc;

        do {
            System.out.println("Introduce un punto central (Fila y columna)");
            fc = s.nextInt();
            cc = s.nextInt();
        } while ((fc >= matriz.length) || (cc >= matriz[0].length));

        System.out.println("Introduce el número de casillas que abarca");
        int arco = s.nextInt();

        int fi = fc - arco;
        if (fi < 0) {
            fi = 0;
        }
        int ff = fc + arco;
        if (ff >= matriz.length) {
            ff = matriz.length - 1;
        }
        int ci = cc - arco;
        if (ci < 0) {
            ci = 0;
        }
        int cf = cc + arco;
        if (cf >= matriz[0].length) {
            cf = matriz[0].length - 1;
        }
        
        for (int i = fi; i <= ff; i++) {
            for (int j = ci; j <= cf; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
        
        //------------------------------------------------------------------*/
 /* De arriba a abajo recorrer cada columna.
        
        System.out.println("");
        for (int i = 0; i < matriz[0].length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print(matriz[j][i]+"\t");
                }
            } else {
                for (int j = matriz.length-1; j >=0; j--) {
                    System.out.print(matriz[j][i]+"\t");
                }
            }
            System.out.println("");
        }
        
        //------------------------------------------------------------------*/
 /* Recorrido por filas de derecha a izquierda empezando por el final.
        System.out.println("");
        
        for (int i = matriz.length-1; i >= 0; i--) {
            for (int j = matriz.length-1; j >= 0; j--) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
        
        //------------------------------------------------------------------*/
 
        /*Recorrer las casillas adyacentes a un punto (usando solo if)(otra opción: usar el método de arco sin mostrar el punto central).
        int fc, cc;

        do {
            System.out.println("Introduce un punto de la matriz (Fila y columna)");
            fc = s.nextInt();
            cc = s.nextInt();
        } while ((fc > matriz.length) || (cc > matriz[0].length));

        if (fc - 1 >= 0) {
            if (cc - 1 >= 0) {
                System.out.println(matriz[fc - 1][cc - 1]);
            }
            System.out.println(matriz[fc - 1][cc]);
            if (cc + 1 < matriz[0].length) {
                System.out.println(matriz[fc - 1][cc + 1]);
            }
        }
        if (fc + 1 < matriz.length) {
            if (cc - 1 >= 0) {
                System.out.println(matriz[fc + 1][cc - 1]);
            }
            System.out.println(matriz[fc + 1][cc]);
            if (cc + 1 < matriz[0].length) {
                System.out.println(matriz[fc + 1][cc + 1]);
            }
        }

        if (cc-1 >= 0) {
            System.out.println(matriz[fc][cc-1]);
        }
        if (cc+1 < matriz[0].length) {
            System.out.println(matriz[fc][cc+1]);
        }
        
        -------------------------------------------------------------------*/
    }
}
