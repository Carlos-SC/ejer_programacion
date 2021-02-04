
public class ISBN {

    public static boolean esValido(String isbn) {

        if (isbn.length() != 17) {
            return false;
        }

        int contGuion = 0;
        char ultDig = ' ';
        String digitosValidos = "0123456789-";
        int suma = 0;
        int contPos = 1;
        int r = 0;

        for (int i = 0; i < isbn.length()-1; i++) {
            if (isbn.charAt(i) == ultDig && ultDig == '-') {
                return false;
            }
            if (isbn.charAt(i) == '-') {
                contGuion++;
            }
            if (digitosValidos.indexOf(isbn.charAt(i)) < 0) {
                return false;
            }
            if (isbn.charAt(i) != '-' && contPos % 2 != 0) {
                suma += Integer.parseInt("" + isbn.charAt(i));
                contPos++;
            } else if (isbn.charAt(i) != '-' && contPos % 2 == 0) {
                suma += Integer.parseInt("" + isbn.charAt(i))*3;
                contPos++;
            }
            ultDig = isbn.charAt(i);
        }
        if (contGuion != 4) {
            return false;
        }

        if (isbn.charAt(15) != '-') {
            return false;
        }

        r = suma % 10;
        int digFinal = Integer.parseInt(""+isbn.charAt(16));
        if (r == 0 && digFinal != r) {
                return false;
        } else if ((10 - r) != digFinal) {
                return false;
        }

        return true;
    }
}
