package SeleccionFutbol;

import java.util.Scanner;

public class ClasePrincipal {

    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Entrenador delBosque = new Entrenador("284EZ89",1,"Vicente","Del Bosque", 60);
        Futbolista iniesta = new Futbolista(6, "Interior Derecho", 2, "Andres","Iniesta",29);
        Masajista raulMartinez = new Masajista("Licenciado en masajes",20 , 3, "Raúl", "Martinez",41);
        
        
    }
}
