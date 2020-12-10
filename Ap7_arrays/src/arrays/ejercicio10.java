package arrays;

public class ejercicio10 {

    public static void main(String[] args) {

        int num[] = new int[20];
        int aux[] = new int[20];
        int contPar = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 101);
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                aux[contPar] = num[i];

                contPar++;
            }
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                aux[contPar] = num[i];
                
                contPar++;
            }
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(" "+num[i]);
        }
        
        System.out.println("");
        
        for (int i = 0; i < aux.length; i++) {
            System.out.print(" "+aux[i]);
        }
    }
}
