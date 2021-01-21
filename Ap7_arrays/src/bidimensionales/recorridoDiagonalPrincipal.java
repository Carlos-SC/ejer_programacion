package bidimensionales;

public class recorridoDiagonalPrincipal {

    public static void main(String[] args) {
        int matriz[][] = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 51);
                if (i == j) {
                    System.out.print("*" + matriz[i][j] + "*\t");
                } else if ((i + j) == (matriz[i].length - 1)) {
                    System.out.print("*" + matriz[i][j] + "*\t");
                } else {

                    System.out.print(matriz[i][j] + "\t");
                }
            }
            System.out.println("");
        }

        //recorrer elementos de la diagonal principal
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println("");

        //recorrer elementos de la diagonal principal inversa
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][(matriz[0].length-1)-i] + " ");
        }
        System.out.println("");
    }
}