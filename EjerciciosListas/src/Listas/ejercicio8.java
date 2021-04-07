package Listas;

import java.util.ArrayList;
import java.util.HashSet;

public class ejercicio8 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        HashSet<Integer> listaDif = new HashSet<Integer>();

        rellenarLista(lista, listaDif);
        System.out.println("");
        modaLista(lista, listaDif);
    }

    public static void rellenarLista(ArrayList<Integer> lista, HashSet<Integer> lista2) {
        int x = 0;
        for (int i = 0; i < 100; i++) {
            x = (int) (Math.random() * 20) + 1;
            lista.add(x);
            lista2.add(x);
            System.out.print(lista.get(i) + " ");
        }
    }

    public static void modaLista(ArrayList<Integer> lista, HashSet<Integer> lista2) {
        ArrayList<Integer> listaCont = new ArrayList<Integer>();
        int cont = 0;

        for (Integer x : lista2) {
            cont = 0;

            for (int i = 0; i < lista.size(); i++) {
                if (x == lista.get(i)) {
                    cont++;
                }
            }

            listaCont.add(cont);
        }

        int i = 0;
        int mayor = 0;
        for (Integer x : lista2) {
            System.out.println("El valor " + x + " se repitió: " + listaCont.get(i));
            if (listaCont.get(i) > mayor) {
                mayor = listaCont.get(i);
            }
            i++;

        }
        System.out.println("");

        i = 0;
        for (Integer x : lista2) {
            if (mayor == listaCont.get(i)) {
                System.out.println("La moda es: " + x);
            }
            i++;
        }
    }
}
