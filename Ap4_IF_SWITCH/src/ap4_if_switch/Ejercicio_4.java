package ap4_if_switch;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("¿Cuántas horas has trabajado esta semana? (Mínimo 40)");
        int horas = s.nextInt();
        
        if (horas>40) {
            
            System.out.println("Tu salario semanal es: "+((40*12)+((horas-40)*16)) );
        
        } else {
            System.out.println("Tu salario semanal es: "+40*12);
        }
    }
}
