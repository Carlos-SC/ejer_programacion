package ejercicio1;

import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*
        Calzado calzado1 = new Calzado(40, 50.5, 70, "Botas", "Hombre");
        
        System.out.println("Introduce: Numero, Precio, Existencias, Tipo y Sexo.");
        int num = s.nextInt();
        double precio = s.nextDouble();
        int existencias = s.nextInt();
        String tipo = s.next();
        String sexo = s.next();
        
        Calzado calzado2 = new Calzado(num, precio, existencias, tipo, sexo);
        Calzado calzado3 = new Calzado();
        
        System.out.println(calzado1.toString());
        System.out.println(calzado2.toString());
        System.out.println(calzado3.toString());
        
        System.out.println("Formato inglés: ");
        System.out.println(calzado1.getTallaUK());
        
        System.out.println("Formato americano: ");
        System.out.println(calzado2.getTallaUS());
        
        System.out.println("Existencias: ");
        if (calzado3.getExistencias() > 10) {
            System.out.print("Las existencias del calzado superan 10.");
        } else {
            System.out.print("Las existencias NO superan 10.");
        }
        */
        Calzado[] arrayCalzado = new Calzado[10];
        rellenarArray(arrayCalzado);
        visualizarArray(arrayCalzado);
    }
    
    public static void rellenarArray(Calzado[] array) { 
        int pos = 0;
        double numCalzado = 0;
        int precio = 0;
        int existencias = 0;
        String tipo = "";
        String sexo = "";
        for (int i = 0; i < array.length; i++) {
            pos = (int)(Math.random()*15);
            numCalzado = Calzado.numEU[pos];
            precio = (int) (Math.random()*120)+1;
            existencias = (int) (Math.random()*100);
            
            array[i] = new Calzado(numCalzado, precio, existencias, null, null);
        }
    }
    
    public static void visualizarArray(Calzado[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
    }
}
