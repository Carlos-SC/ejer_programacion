
package ap5_bucles;

import java.util.Scanner;


public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        int num = s.nextInt();
        
        for (int i=num+1; i<=(num+5); i++) {
            System.out.println(i+"");
        }
    }
}
