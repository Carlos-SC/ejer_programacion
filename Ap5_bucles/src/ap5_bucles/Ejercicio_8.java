
package ap5_bucles;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce un número para multiplicar: ");
        int num1  = s.nextInt();
        
        for (int i=1; i<=10; i++) {
            System.out.println(num1+"x"+i+"="+num1*i);
        }
    }
}
