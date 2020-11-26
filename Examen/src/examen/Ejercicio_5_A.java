package examen;

import java.util.Scanner;

public class Ejercicio_5_A {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int contAl = 0;

        double altura;
        double peso;

        double sumaAlt = 0;

        int contDebajo = 0;
        int contSaludable = 0;
        int contSobrepeso = 0;
        int contObeso = 0;
        int contExtremo = 0;

        System.out.println("Introduce una altura y un peso para cada alumno (0 0 para salir): ");
        do {
            contAl++;
            System.out.print("Alumno " + contAl + ": ");
            altura = s.nextDouble();
            peso = s.nextDouble();

            sumaAlt += altura;

            if (peso / Math.pow(altura, 2) < 18.5) {
                contDebajo++;
            } else if (peso / Math.pow(altura, 2) < 24.9) {
                contSaludable++;
            } else if (peso / Math.pow(altura, 2) < 29.9) {
                contSobrepeso++;
            } else if (peso / Math.pow(altura, 2) < 39.9) {
                contObeso++;
            } else if (peso / Math.pow(altura, 2) > 40) {
                contExtremo++;
            }
        } while (altura != 0 && peso != 0);

        System.out.println("La estatura media es: " + (sumaAlt / (contAl - 1)));
        System.out.println("IMC debajo del peso: " + contDebajo);
        System.out.println("IMC saludable: " + contSaludable);
        System.out.println("IMC sobrepeso: " + contSobrepeso);
        System.out.println("IMC obeso: " + contObeso);
        System.out.println("IMC obesidad extrema: " + contExtremo);
    }
}
