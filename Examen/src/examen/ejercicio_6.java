package examen;

import java.util.Scanner;

public class ejercicio_6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int contAl = 1;

        int edad;
        double estatura;

        int sumaEdad = 0;
        double sumaEst = 0;

        int contEdad = 0;
        int contEst = 0;

        System.out.println("Introduce la edad y la estatura de un alumno (introduzca 0 para parar): ");
        do {
            System.out.print("Alumno " + contAl + ":");
            edad = s.nextInt();
            estatura = s.nextDouble();

            sumaEdad += edad;
            sumaEst += estatura;

            if (edad > 18) {
                contEdad++;
            }
            if (estatura > 1.75) {
                contEst++;
            }

            contAl++;
        } while (edad != 0 && estatura != 0);

        System.out.println("La media de edad es de: " + (sumaEdad / (contAl-2)));
        System.out.println("La media de estatura es de: " + (sumaEst / (contAl-2)));
        System.out.println("Hay " + contEdad + " alumnos mayores de 18 años");
        System.out.println("Hay " + contEst + " alumnos que miden más de 1.75");
    }
}
