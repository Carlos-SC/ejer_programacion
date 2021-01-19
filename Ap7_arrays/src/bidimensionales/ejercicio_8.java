package bidimensionales;

public class ejercicio_8 {

    public static void main(String[] args) {
        int matriz[][] = new int[3][7];

        for (int i = 0; i < matriz.length; i++) {
            int menorFila = Integer.MAX_VALUE;
            int posCol = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 16 + 5);
                if (matriz[i][j] < menorFila) {
                    menorFila = matriz[i][j];
                    posCol = j + 1;
                }
            }
            System.out.println("Número menor fila " + (i + 1) + " *" + menorFila + "* está en la columa " + posCol);
        }

        for (int i = 0; i < matriz[0].length; i++) {
            int mayorCol = 0;
            int posFila = 0;
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[j][i] > mayorCol) {
                    mayorCol = matriz[j][i];
                    posFila = j + 1;
                }
            }
            System.out.println("Número mayor columna " + (i + 1) + " *" + mayorCol + "* está en la fila " + posFila);
        }
    }
}
