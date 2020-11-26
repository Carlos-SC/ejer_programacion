
package ap5_bucles;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int cont=0;
        
        System.out.print("Introduce un número: ");
        int num = s.nextInt();
        
        while (num>0) {
            num=num/10;
            cont=cont+1;
        }
        
        System.out.println("El número introducido tiene "+cont+" dígito/s");
    }
}
