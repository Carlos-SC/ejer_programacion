
package ap5_bucles;

import java.util.Scanner;

public class Ejercicio_27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        int num = s.nextInt();
        
        int cont = 0;
        int suma = 0;
        
        for (int i = 3; i <= num; i=i+3) {
            System.out.print(i+" ");
            cont++;
            suma+=i;
        }
        System.out.println("");
        System.out.println("Hay "+cont+ " números");
        System.out.println("Su suma es: "+suma);
    }
}
