package num_aleatorios;

public class Ejercicio_2 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 13 + 1);
        int palo = (int) (Math.random() * 4 + 1);

        String sNum = null;
        String sPalo = null;

        switch (num) {
            case 1:
                sNum = "A";
                break;
            case 11:
                sNum = "J";
                break;
            case 12:
                sNum = "Q";
                break;
            case 13:
                sNum = "K";
                break;
            default:
                sNum = num + "";
        }

        switch (palo) {
            case 1:
                sPalo = "Picas";
                break;
            case 2:
                sPalo = "Tréboles";
                break;
            case 3:
                sPalo = "Corazones";
                break;
            case 4:
                sPalo = "Diamantes";
                break;
            default:
        }

        System.out.println(sNum + " de " + sPalo);
    }
}
