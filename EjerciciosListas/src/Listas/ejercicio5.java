package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ejercicio5 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();

        for (int i = 1; i < 50; i++) {
            lista.add(i);
        }
        
        sorteoBonolotoUno(lista);
        System.out.println("");
        sorteoBonolotoDos();

    }

    public static void sorteoBonolotoUno(ArrayList<Integer> lista) {
        Collections.shuffle(lista);
        System.out.println("Combinación Bonoloto 1: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(lista.get(i) + " ");
        }
    }

    public static void sorteoBonolotoDos() {
        HashSet<Integer> lista = new HashSet();

        while (lista.size() < 6) {
            lista.add((int) (Math.random() * 49) + 1);
        }

        System.out.println("Combinación Bonoloto 2: ");
        for (Integer x : lista) {
            System.out.print(x + " ");
        }
    }
}
