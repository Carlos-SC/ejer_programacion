package num_aleatorios;

public class Ejercicio_13 {

    public static void main(String[] args) {

        int dado1;
        int dado2;

        do {
            dado1 = (int) (Math.random() * 6 + 1);
            dado2 = (int) (Math.random() * 6 + 1);
        } while (dado1 != dado2);

        System.out.println("Dado 1: " + dado1 + "\nDado 2: " + dado2);
    }
}
