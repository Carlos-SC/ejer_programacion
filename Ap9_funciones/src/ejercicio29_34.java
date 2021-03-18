
import java.util.Scanner;

public class ejercicio29_34 {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static int[] diagonal(int[][] array, int fila, int col, String dire) {
        int dim = 0;
        
        if (array.length < array[0].length) {
            dim = array.length;
        } else {
            dim = array[0].length;
        }
        
        int[] arrayUni = new int[dim];
        
        if (dire.toLowerCase().equals("nose")) {
            for (int i = 0; i < dim; i++) {
                arrayUni[i] = array[i][i];
            }
        } else if (dire.toLowerCase().equals("neso")) {
            for (int i = 0; i < 10; i++) {
                arrayUni[i] = array[i][col];
                col--;
            }
        }
        
        return arrayUni;
    }
}
