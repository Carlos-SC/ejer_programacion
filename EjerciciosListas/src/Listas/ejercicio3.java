package Listas;

import java.util.ArrayList;

public class ejercicio3 {

    public static void main(String[] args) {
        ArrayList<Integer> Lista = new ArrayList<Integer>();
        ArrayList<Integer> ListaPosi = new ArrayList<Integer>();
        ArrayList<Integer> ListaNeg = new ArrayList<Integer>();

        rellenarLista(Lista);
        clasificarNum(Lista, ListaPosi, ListaNeg);
    }

    public static void rellenarLista(ArrayList<Integer> lista) {
        for (int i = 0; i < 20; i++) {
            lista.add((int)(Math.random()*100)-50);
        }
    }
    
    public static void clasificarNum(ArrayList<Integer> lista1, ArrayList<Integer> lista2, ArrayList<Integer> lista3){
        for (int i = 0; i < lista1.size(); i++) {
            if (lista1.get(i)>0) {
                lista2.add(lista1.get(i));
            } else {
                lista3.add(lista1.get(i));
            }
        }
        
        System.out.println("Lista Positivos: ");
        for (int i = 0; i < lista2.size(); i++) {
            System.out.print(lista2.get(i)+" ");
        }
        System.out.println("");
        System.out.println("Lista Negativos: ");
        for (int i = 0; i < lista3.size(); i++) {
            System.out.print(lista3.get(i)+" ");
        }
    }
}
