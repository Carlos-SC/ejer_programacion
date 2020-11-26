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
public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Introduce una hora: ");
        int hora = s.nextInt();
        
        if ((hora>=6) && (hora<=12)) {
            System.out.println("¡Buenos días!");
        }
        
        if ((hora>=13) && (hora<=20)) {
            System.out.println("¡Buenas tardes!");
        }
        
        if ((hora>=21 && hora<=23) || (hora>=0 && hora<=5)) {
            System.out.println("¡Buenas noches!");
        }
            
    }
}
