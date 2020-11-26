/*
 * Ejercicio 12
 */
package ap3_lecturadatos;

import java.util.Scanner;
        
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduzca la base imponible: ");
        int baseImp = s.nextInt();
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tipoIVA = s.next();
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPro = s.next();
        
        System.out.println("Base imponible \t"+(double)baseImp);
        double precioIVA = (double)baseImp*0.1;
        System.out.println("IVA (10%) \t"+precioIVA);
        System.out.println("Precio con IVA \t"+((double)baseImp+precioIVA));
        System.out.println("Cod. promo. ("+codigoPro+"): \t"+(-((double)baseImp+precioIVA)/2));
        System.out.println("Total \t"+((double)baseImp+precioIVA-((double)baseImp+precioIVA)/2));
    }
}
