/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap4_if_switch;

import java.util.Scanner;

/**
 *
 * @author DAM127
 */
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce un número del 1 al 7: ");
        int num = s.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;

                default:
                    System.out.println(num + " no es un número válido");
            }

    }
}
