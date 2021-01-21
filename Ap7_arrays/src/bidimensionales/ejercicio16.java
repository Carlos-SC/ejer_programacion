package bidimensionales;

public class ejercicio16 {

    public static void main(String[] args) {
        int matriz[][][] = new int[10][5][12];
        int tiendas[] = new int[10];
        String mes[] = {"Enero     ", "Febrero   ", "Marzo     ", "Abril    ", "Mayo      ", "Junio     ", "Julio    ", "Agosto   ", "Septiembre", "Octubre  ", "Noviembre", "Diciembre"};

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Tienda\tCaja\tMes");
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    matriz[i][j][k] = (int) (Math.random() * 6001 + 6000);
                    System.out.println((i + 1) + "\t" + (j + 1) + "\t" + mes[k] + "\t" + matriz[i][j][k]);
                    tiendas[i] += matriz[i][j][k];
                }
            }
            System.out.println("Total\t\t\t" + tiendas[i]);
        }
    }
}
