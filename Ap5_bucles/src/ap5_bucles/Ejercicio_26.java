package ap5_bucles;

import java.util.Scanner;

public class Ejercicio_26 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = s.nextInt();
        
        System.out.print("Introduce un dígito del número: ");
        int dig = s.nextInt();

        int inv = 0;
        int cont = 1;
        
        while (num > 0) {
            inv = (inv * 10) + (num % 10);
            num = num / 10;
        }
        
        while (inv > 0) {
            if (dig==inv%10) {
                System.out.println("Posición "+cont);
            }
            inv = inv / 10;
            cont++;
        }
    }
}
