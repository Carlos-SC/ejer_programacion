package ap5_bucles;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce números positivos y un negativo para parar: ");
        int num = s.nextInt();
        int cont = 0;
        int suma = 0;

        while (num >= 0) {
            cont++;
            suma = suma + num;
            num = s.nextInt();
        }

        System.out.println("La media de todos los números es " + suma / cont);
    }
}
