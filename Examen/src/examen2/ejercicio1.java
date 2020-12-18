package examen2;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca el número de alumnos: ");
        int n = s.nextInt();

        int[] estatura = new int[n];
        int mayor = 0;
        int n_mayor = 0;
        int sumaMedia = 0;
        int sumaDesvia = 0;

        for (int i = 0; i < estatura.length; i++) {
            int azar = (int) (Math.random() * 161) + 90;

            estatura[i] = azar;
            sumaMedia += azar;
            if (mayor < azar) {
                mayor = azar;
                n_mayor = i;
            }
        }
        System.out.print("Estaturas: ");
        for (int i = 0; i < estatura.length; i++) {
            sumaDesvia += Math.pow((estatura[i] - (sumaMedia / n)), 2);

            System.out.print(estatura[i] + " | ");
        }

        System.out.println("\nMedia: " + (sumaMedia / n) + " - NºAlumnos: " + n);
        System.out.println("Alumno más alto: " + (n_mayor + 1));
        System.out.println("Desviación: " + (Math.sqrt((sumaDesvia / n))));
    }
}
