/* 
* Permite teclear dos valores enteros m y n y visualiza:
* -El factorial de m.
* -El factorial de n.
* -El número de variaciones sin repetición de m elementos tomados de n en n.
* -El número de combinaciones sin repetición de m elementos tomados de n en n.
* -El número de variaciones con repetición de m elementos tomados de n en n.
* Se utiliza la clase Estadisticos
*/
package estadisticos;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("\nCALCULOS ESTADÍSTICOS\n");

        Scanner teclado = new Scanner(System.in);
        boolean error;
        int m, n;

        do {
            try {
                error = false;
                System.out.print("Teclee m (>=0): ");
                m = teclado.nextInt();
                System.out.print("Teclee n (>=0 y <= m): ");
                n = teclado.nextInt();
                Estadisticos es = new Estadisticos(m, n);
                System.out.printf("Permutaciones(%d) = %f\n", n, es.factorial(n));
                System.out.printf("Permutaciones(%d) = %f\n", m, es.factorial(m));
                System.out.printf("Variaciones(%d,%d) = %f\n", m, n, es.variaciones());
                System.out.printf("Combinaciones(%d,%d) = %f\n", m, n, es.combinaciones());
                System.out.printf("Variaciones con repetición(%d,%d)= %f\n", m, n, es.variaciones_repeticion());
            } catch (NumberFormatException e) {
                teclado.nextLine(); //para limpiar INTRO del bufferde teclado
                System.out.println("Error en la conversión");
                error = true;
            } catch (InputMismatchException e) {
                teclado.nextLine(); //para limpiar INTRO del buffer de teclado
                System.out.println("Error. El dato tecleado no es válido");
                error = true;
            } catch (Exception e) {
                teclado.nextLine(); //para limpiar INTRO del buffer de teclado
                System.out.println(e.getMessage()); // Muestra el error
                error = true;
            }
        } while (error);
    }
}
