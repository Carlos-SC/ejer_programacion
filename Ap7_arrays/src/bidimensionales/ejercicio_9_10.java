
package bidimensionales;

public class ejercicio_9_10 {
    public static void main(String[] args) {
        int matriz[][]= new int[4][5];
        int sumaFila[] = new int[4];
        int sumaCol[] = new int[5];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()*10+1);
                sumaFila[i] += matriz[i][j];
                
                if (matriz[i][j]%2==0) {
                    sumaCol[j] += matriz[i][j];
                }
                
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.print(sumaFila[i]);
            System.out.println("");
        }
        
        for (int i = 0; i < sumaCol.length; i++) {
            System.out.print(sumaCol[i]+"\t");
        }
        
        System.out.println("");
    }
}
