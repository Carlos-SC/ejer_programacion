
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un número de tarjeta.");
        String tarjeta = s.nextLine();
        int suma = 0;
        char caracter;
        int numero;
        for (int i = tarjeta.length() - 1; i > 0; i -= 2) {
            caracter = tarjeta.charAt(i);
            suma += Integer.parseInt("" + caracter);
            
            caracter = tarjeta.charAt(i - 1);
            numero = Integer.parseInt("" + caracter);
            if (numero * 2 > 9) {
                suma += (numero*2 / 10) + (numero*2 % 10);
            } else {
                suma += numero * 2;
            }
        }

        if (tarjeta.length() % 2 != 0) {
            suma += Integer.parseInt("" + tarjeta.charAt(0));
        }
        System.out.println(suma);
        if (suma % 10 == 0) {
            System.out.println("La tarjeta ES válida.");
        } else {
            System.out.println("La tarjeta NO es válida.");
        }
    }
}
