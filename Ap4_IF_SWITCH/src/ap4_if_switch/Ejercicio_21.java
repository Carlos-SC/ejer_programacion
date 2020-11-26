/*
 * 
 */
package ap4_if_switch;

import java.util.Scanner;

public class Ejercicio_21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Nota del primer control: ");
        double nota1 = s.nextDouble();
        System.out.print("Nota del segundo control: ");
        double nota2 = s.nextDouble();
        
        double media = (nota1+nota2)/2;
        
        if (media<5) {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String recu = s.next();
            
            if (recu.equals("apto")) {
                System.out.println("Tu nota de Programación es 5");
            } else {
                System.out.println("Tu nota de Programación es "+media);
            }
        } else {
            System.out.println("Tu nota de Programación es "+media);
        }
    }
}
