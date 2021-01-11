package bidimensionales;

public class ejercicio_5 {

    public static void main(String[] args) {
        int matriz[][] = new int[6][9];
        int mayor = 0;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 21 + 20);
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == mayor) {
                    System.out.println("El MAYOR se encuentra en la posición: " + (i+1) + " " + (j+1));
                } else if (matriz[i][j] == menor) {
                    System.out.println("El MENOR se encuentra en la posición: " + (i+1) + " " + (j+1));
                }
            }
        }
    }
}
