package Listas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class ejercicio4 {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();

        rellenarLista(lista);
        borrarDuplicados(lista);
        palabrasDiferentes();

    }

    public static void rellenarLista(ArrayList<Integer> lista) {
        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * 11));
            System.out.print(lista.get(i) + " ");
        }
    }

    public static void borrarDuplicados(ArrayList<Integer> lista) {
        HashSet<Integer> lista2 = new HashSet<Integer>();

        for (int i = 0; i < lista.size(); i++) {
            lista2.add(lista.get(i));
        }
        System.out.println("Elementos no repetidos: ");
        for (Integer x : lista2) {
            System.out.print(x + " ");
        }
    }

    public static void palabrasDiferentes() {
        String texto = "hola buenas tardes las tardes son buenas";

        String[] palabras = texto.split("[ ,.;]+");

        TreeSet<String> lista = new TreeSet();
        for (int i = 0; i < palabras.length; i++) {
            lista.add(palabras[i].toLowerCase());
        }
        
        int mayor = 0;
        for (String x : lista) {
            System.out.println(x + " " + x.length());
            if (x.length() > mayor) {
                mayor = x.length();
            }
        }
        System.out.print("Las palabras mas larga es: ");
        for (String x: lista) {
            if (x.length()==mayor) {
                System.out.print(x+ " ");
            }
        }
        System.out.println("");
        System.out.println("El texto tiene " + lista.size() + " palabras diferentes.");
    }
}
