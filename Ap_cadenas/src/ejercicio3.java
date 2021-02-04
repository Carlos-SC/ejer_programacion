
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int contLetras[] = new int[27];

        System.out.print("Introduzca un texto: ");
        String texto = s.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            int c = texto.toUpperCase().charAt(i);
            if (c != 32 && c != 165) {
                contLetras[c - 65]++;
            } else if (c == 165) {
                contLetras[26]++;
            }
        }

        for (int i = 0; i < contLetras.length; i++) {
            int codAsci = 65 + i;
            if (contLetras[i] != 0 && i != 26) {
                System.out.println((char) codAsci + ": " + contLetras[i]);
            } else if (contLetras[i] != 0) {
                System.out.println(((char)165) + ": " + contLetras[i]);
            }
        }
    }
}
