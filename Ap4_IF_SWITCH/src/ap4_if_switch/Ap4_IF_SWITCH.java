package ap4_if_switch;

import java.util.Scanner;

public class Ap4_IF_SWITCH {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce un día de la semana: ");
        String dia = s.next();

        switch (dia) {
            case "Lunes":
                System.out.println("Los lunes hay programación a primera hora");
                break;
            case "Martes":
                System.out.println("Los martes hay programación a primera hora");
                break;
            case "Miercoles":
                System.out.println("Los miércoles hay programación a primera hora");
                break;
            case "Jueves":
                System.out.println("Los jueves hay programación a primera hora");
                break;
            case "Viernes":
                System.out.println("Los viernes hay Base de datos a primera hora");
                break;
            case "Sabado":
                System.out.println("¡Los sábados no hay clase!");
                break;
            case "Domingo":
                System.out.println("¡Los domingos no hay clase!");
                break;

            default:
                System.out.println("\n" + dia + " no es un día de la semana");
        }
    }

}
