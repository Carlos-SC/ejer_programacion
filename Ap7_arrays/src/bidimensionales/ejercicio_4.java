package bidimensionales;

public class ejercicio_4 {

    public static void main(String[] args) {
        int matriz[][] = new int[5][8];
        int mayor = 0;
        int menor = Integer.MAX_VALUE;
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String blanco = "\033[37m";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 21 + 20);
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == mayor) {
                    System.out.print(rojo + "*" + matriz[i][j] + "*" + "\t");
                } else if (matriz[i][j] == menor) {
                    System.out.print(verde + "*" + matriz[i][j] + "*" + "\t");
                } else {
                    System.out.print(blanco + matriz[i][j] + "\t");
                }

            }
            System.out.println("");
        }
    }
}
