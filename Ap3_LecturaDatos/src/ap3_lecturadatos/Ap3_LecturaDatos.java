/*
 * Apartado 3, Lectura de datos desde teclado
 * Ejercicio 1
 */
package ap3_lecturadatos;

/**
 *
 * @author DAM127
 */
import java.util.Scanner;

public class Ap3_LecturaDatos {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce dos números");
        int num1=s.nextInt();
        int num2=s.nextInt();
        
        System.out.println("El producto de "+num1+"*"+num2+" es "+(num1*num2));
    }
    
}
