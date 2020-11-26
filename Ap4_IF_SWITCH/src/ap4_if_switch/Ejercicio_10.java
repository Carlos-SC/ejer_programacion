package ap4_if_switch;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce un día y un mes");
        int dia = s.nextInt();
        String mes = s.next();

        switch (mes) {
            case "enero":
                if (dia >= 21) {
                    System.out.println("Tu signo es Acuario");
                } else {
                    System.out.println("Tu signo es Capricornio");
                }
                break;
            case "febrero":
                if (dia >= 19) {
                    System.out.println("Tu signo es Piscis");
                } else {
                    System.out.println("Tu signo es Acuario");
                }
                break;
            default:
                System.out.println("Mes no válido");
        }

    }
}
