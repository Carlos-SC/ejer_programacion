
package bidimensionales;

public class ejercicio_11 {
    public static void main(String[] args) {
        int matriz[][]= new int[5][5];
        int cont = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (cont < 5) {
                    cont++;
                } else {
                    cont = 1;
                }
                matriz[i][j] = cont;
            }
            cont--;
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
