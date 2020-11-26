
package ap5_bucles;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        int num = s.nextInt();
        
        int x=0;
        int y=1;
        int z=0;
        System.out.print(x+ " ");
        System.out.print(y);
        for (int i=0; i<num; i++) {
            z=x+y;
            System.out.print(" "+z);
            x=y;
            y=z;
        }
        System.out.println("");
    }
}
