/*
 * Ejercicio 2
 */
package ap5_bucles;


public class Ap5_bucles {


    public static void main(String[] args) {
        int cont = 1;
        
        while (cont<101) {
            if (cont%5==0) {
                System.out.println(cont + " es múltiplo de 5");
            }
            
            cont++;
        }
        
    }
    
}
