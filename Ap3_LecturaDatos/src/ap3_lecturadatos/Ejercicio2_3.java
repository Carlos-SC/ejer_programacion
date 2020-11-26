/*
 * Ejercicios 2 y 3
 */
package ap3_lecturadatos;

import java.util.Scanner;

public class Ejercicio2_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduce una cantidad de Euros: ");
        double euros = s.nextDouble();
        System.out.println("Serían "+(euros*166.3)+" pesetas.");
        
        System.out.print("Introduce una cantidad de pesetas: ");
        int pesetas = s.nextInt();
        System.out.println("Serían "+(pesetas/166.3)+" Euros.");
    }
}
