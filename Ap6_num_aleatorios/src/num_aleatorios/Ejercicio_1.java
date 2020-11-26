package num_aleatorios;

public class Ejercicio_1 {

    public static void main(String[] args) {
        int dado1 = (int) (Math.random() * 6 + 1);
        int dado2 = (int) (Math.random() * 6 + 1);
        int dado3 = (int) (Math.random() * 6 + 1);

        System.out.println("Dado 1: " + dado1 + "\nDado 2: " + dado2 + "\nDado 3: " + dado3);
        System.out.println("Suma " + (dado1 + dado2 + dado3));
    }

}
