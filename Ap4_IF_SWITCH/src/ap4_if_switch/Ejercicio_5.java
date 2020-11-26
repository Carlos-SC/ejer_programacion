package ap4_if_switch;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce los valores de A y B: ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        
        if (a==0) {
            System.out.println("No se puede dividir entre 0");
        } else {
            System.out.println("El valor de x en ax+b=0 es: "+(-b/a));
        }
    }
}
