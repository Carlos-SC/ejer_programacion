package arrays;

import java.util.Scanner;

public class ejercicio15 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] ocup = {3, 2, 0, 2, 4, 1, 0, 2, 1, 1};
        int num = 0;

        while (num != -1) {
            boolean libre = false;

            System.out.print("\nOcupación: ");
            for (int i = 0; i < ocup.length; i++) {
                System.out.print(ocup[i] + " | ");
            }
            System.out.println("\n");
            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            num = s.nextInt();
            
            if (num > 4 || num == 0) {
                System.out.println("Lo siento, no admitimos grupos de "+num+", haga grupos de 4 personas como máximo e intente de nuevo");
            } else {
                for (int i = 0; i < ocup.length; i++) {
                    if (ocup[i] == 0) {
                        System.out.println("Por favor, siéntese en la mesa número "+(i+1));
                        ocup[i] = num;
                        i = ocup.length;
                        libre = true;
                    }
                }
                if (!libre) {
                    for (int i = 0; i < ocup.length; i++) {
                        if ((ocup[i] + num) <= 4) {
                            System.out.println("Tendrán que compartir mesa. Por favor, siéntese en la mesa número "+(i+1));
                            ocup[i] += num;
                            i = ocup.length;
                            libre = true;
                        }
                    }
                }
                if (!libre) {
                    System.out.println("Lo siento, en estos momentos no queda sitio.");
                }
            }
        }
    }
}
