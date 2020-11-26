
package ap5_bucles;

import java.util.Scanner;

public class Ejercicio_29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        int num = s.nextInt();
        
        System.out.println("Introduce otro número: ");
        int num2 = s.nextInt();
        
        for (int i = num-1; i > 0; i--) {
            if (i%num2!=0) {
                System.out.print(i+" ");
            }
        }
    }
}
