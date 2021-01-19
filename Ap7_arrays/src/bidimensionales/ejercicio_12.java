package bidimensionales;

public class ejercicio_12 {
    
    public static void main(String[] args) {
        int matriz[][] = {{9,8,6,7},{1,3,1,4},{2,5,2,7}};
        
        for (int i = 0; i < matriz.length; i++) {
            int menorFila = Integer.MAX_VALUE;
            int pos = 0;
            boolean puntoSilla = true;
            
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menorFila) {
                    menorFila = matriz[i][j];
                    pos = j;
                }
            }
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[j][pos] > menorFila) {
                    puntoSilla = false;
                }
            }
            
            if (puntoSilla) {
                System.out.println("Hay un punto de silla.");
                i = matriz.length;
            }
        }
    }
}
