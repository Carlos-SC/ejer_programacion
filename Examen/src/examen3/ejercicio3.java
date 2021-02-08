package examen3;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String[] morse = {".-", "-...", "-.-.", "-..",
            ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.",
            "---", ".--.", "--.-", ".-.", "...",
            "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", "-----", ".----", "..---",
            "...--", "....-", ".....", "-....", "--...",
            "---..", "----.", ".-.-.-", "--..--", "---...",
            "..--..", ".----.", "-....-", "-..-.", ".--.-.",
            "-...-", ".-..-.", "-.-.--"
        };

        String simbolos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.,:?'-/@=\\!";

        System.out.println("Introduce un texto: ");
        String texto = s.nextLine();
        texto = texto.toUpperCase();
        
        String[] palabra = texto.split(" ");
        
        for (int i = 0; i < palabra.length; i++) {
            System.out.print(palabra[i]+" (");
            for (int j = 0; j < palabra[i].length(); j++) {
                System.out.print(morse[simbolos.indexOf(palabra[i].charAt(j))]);
            }
            System.out.print(")");
            System.out.println("");
        }
    }
}
