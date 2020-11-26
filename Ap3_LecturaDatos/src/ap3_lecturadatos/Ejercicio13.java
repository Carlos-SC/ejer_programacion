
package ap3_lecturadatos;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduce la nota del primer examen: ");
        double nota1 = s.nextDouble();
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        double notaTri = s.nextDouble();
        System.out.println("Para tener un "+notaTri+" en el trimestre necesitas sacar un "+((notaTri-(nota1*0.4))/0.6)+" en el segundo examen");
    }
}
