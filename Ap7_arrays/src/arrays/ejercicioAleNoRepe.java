package arrays;

import java.util.Scanner;

public class ejercicioAleNoRepe {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce la cantidad de números: ");
        int num = s.nextInt();

        int[] ArrayNum = new int[num];
        int suma = 0;

        for (int i = 0; i < ArrayNum.length; i++) {
            boolean repe = false; 
            int azar = (int) (Math.random() * 101);

            for (int j = 0; j <= i; j++) {
                if (azar == ArrayNum[j]) {
                    j = i;
                    i--;
                    repe = true;
                }
            }
            
            if (!repe) {
                ArrayNum[i] = azar;
                suma += azar;
            }
        }
        
        for (int i = 0; i < ArrayNum.length; i++) {
            System.out.print(ArrayNum[i]+" ");
        }
        System.out.println("\nLa media es: "+(suma/num));
    }
}
