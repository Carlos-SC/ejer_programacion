package ap4_if_switch;

import java.util.Scanner;

public class Ejercicio_7_8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce 3 notas: ");
        double nota1 = s.nextDouble();
        double nota2 = s.nextDouble();
        double nota3 = s.nextDouble();

        if ((nota1 > 10) || (nota1 < 0) || (nota2 > 10) || (nota2 < 0) || (nota3 > 10) || (nota3 < 0)) {

            System.out.println("Los valores de las notas deben estar entre 0 y 10");

        } else {

            double media = (nota1 + nota2 + nota3) / 3;

            if (media < 5) {
                System.out.println("Insuficiente, nota: " + media);
            } else if ((media >= 5) && (media < 6)) {
                System.out.println("Suficiente, nota: " + media);
            } else if ((media >= 6) && (media < 7)) {
                System.out.println("Bien, nota: " + media);
            } else if ((media >= 7) && (media <= 8)) {
                System.out.println("Notable, nota: " + media);
            } else if ((media >= 9) && (media <= 10)) {
                System.out.println("Sobresaliente, nota: " + media);
            }

        }
    }
}
