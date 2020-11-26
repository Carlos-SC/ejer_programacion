/*
 * 
 */
package ap4_if_switch;

import java.util.Scanner;

public class Ejercicio_22 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numDia = 0;

        System.out.print("Introduce un día, una hora y minutos (separados por un espacio): ");
        String dia = s.next();
        int hora = s.nextInt();
        int minutos = s.nextInt();

        if (!((dia.equals("Viernes")) && (hora >= 15))) {

            switch (dia) {
                case "Lunes":
                    numDia = 4;
                    System.out.println("¡Quedan " + ((((numDia * 24) - hora) * 60) + minutos) + " minutos para el finde!");
                    break;
                case "Martes":
                    numDia = 3;
                    System.out.println("¡Quedan " + ((((numDia * 24) - hora) * 60) + minutos) + " minutos para el finde!");
                    break;
                case "Miercoles":
                    numDia = 2;
                    System.out.println("¡Quedan " + ((((numDia * 24) - hora) * 60) + minutos) + " minutos para el finde!");
                    break;
                case "Jueves":
                    numDia = 1;
                    System.out.println("¡Quedan " + ((((numDia * 24) - hora) * 60) + minutos) + " minutos para el finde!");
                    break;
                case "Viernes":
                    System.out.println("¡Quedan " + (((15 - hora) * 60) + minutos) + " minutos para el finde!");
                    break;
                case "Sabado":
                    System.out.println("¡Ya es fin de semana!");
                    break;
                case "Domingo":
                    System.out.println("¡Ya es fin de semana!");
                    break;

                default:
                    System.out.println(dia + " no se corresponde con ningún día de la semana");
            }

        } else {
            System.out.println("¡Empezó hoy el finde!");
        }
    }
}
