
import java.util.Scanner;

public class ejercicio20_28 {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Arrray de enteros generado: ");
        generaArrayInt(5, 10, 20);
        System.out.println("");

        System.out.print("Mínimo del array: ");
        int[] arrayMin = {7, 9, 3, 4, 7};
        System.out.print(minimoArrayInt(arrayMin));
        System.out.println("");

        System.out.print("Máximo del array: ");
        int[] arrayMax = {1, 2, 3, 4, 5};
        System.out.print(maximoArrayInt(arrayMax));
        System.out.println("");

        System.out.print("Media del array: ");
        System.out.print(mediaArrayInt(arrayMax));
        System.out.println("");

        System.out.print("Está en el array: ");
        System.out.print(estaEnArrayInt(arrayMax, 4));
        System.out.println("");

        System.out.print("Indice del número: ");
        System.out.print(posicionEnArray(arrayMax, 3));
        System.out.println("");

        System.out.print("Múltiples posiciones: ");
        int[] posiciones = posicionEnArrayB(arrayMax, 3);
        for (int i = 0; i < posiciones.length; i++) {
            if (posiciones[i] != 0) {
                System.out.print(posiciones[i] + " ");
            }
        }
        System.out.println("");

        System.out.print("Voltea array: ");
        volteaArrayInt(arrayMax);
        System.out.println("");

        System.out.print("Rotado derecha: ");
        visualizarArray(rotaDerechaArrayInt(arrayMax, 3));
        System.out.println("");
        
        System.out.print("Rotado izquierda: ");
        visualizarArray(rotaIzquierdaArrayInt(arrayMax, 1));
        System.out.println("");
    }

    public static void visualizarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void generaArrayInt(int tam, int min, int max) {
        int[] array = new int[tam];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min) + min);
            System.out.print(array[i] + " ");
        }
    }

    public static int minimoArrayInt(int[] array) {
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }

    public static int maximoArrayInt(int[] array) {
        int mayor = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }

    public static double mediaArrayInt(int[] array) {
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        double media = suma / array.length;

        return media;
    }

    /**
     * Dice si un número está o no en el array.
     *
     * @param array, num recibe un array y un entero a buscar.
     * @return devuelve verdadero o falso si encuentra o no dicho número.
     */
    public static boolean estaEnArrayInt(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static int posicionEnArray(int[] array, int num) {
        int pos = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                pos = i;
                i = array.length;
            }
        }

        return pos;
    }

    public static int[] posicionEnArrayB(int[] array, int num) {
        int[] pos = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                pos[i] = i;
            }
        }

        return pos;
    }

    public static void volteaArrayInt(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] rotaDerechaArrayInt(int[] array, int num) {
        int[] rotado = new int[array.length];
        int cont = num;

        for (int i = 0; i < array.length; i++) {
            if (cont > array.length - 1) {
                cont = 0;
                rotado[cont] = array[i];
                cont++;
            } else {
                rotado[cont] = array[i];
                cont++;
            }
        }

        return rotado;
    }

    public static int[] rotaIzquierdaArrayInt(int[] array, int num) {
        int[] rotado = new int[array.length];
        int cont = (array.length-1)-num;

        for (int i = array.length-1; i >= 0; i--) {
            if (cont < 0) {
                cont = array.length-1;
                rotado[cont] = array[i];
                cont--;
            } else {
                rotado[cont] = array[i];
                cont--;
            }
        }

        return rotado;
    }
}
