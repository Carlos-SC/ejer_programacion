
public class ISBN {

    public static boolean esValido(String isbn) {

        if (isbn.length() != 13) {
            return false;
        }

        int contGuion = 0;
        int contPos = 1;
        char ultDig = ' ';
        String digitosValidos = "0123456789-";
        int suma = 0;
        
        for (int i = 0; i < isbn.length() - 1; i++) {
            if (isbn.charAt(i) == ultDig && ultDig == '-') {
                return false;
            }
            if (isbn.charAt(i) == '-') {
                contGuion++;
            }
            if (digitosValidos.indexOf(isbn.charAt(i)) < 0) {
                return false;
            }
            if (isbn.charAt(i) != '-') {
                suma += Integer.parseInt(""+isbn.charAt(i)) * contPos;
                contPos++;
            }
            ultDig = isbn.charAt(i);
        }
        if (contGuion != 3) {
            return false;
        }

        if (isbn.charAt(11) != '-') {
            return false;
        }

        if (suma % 11 <= 9 && suma % 11 >= 0) {
            if (Integer.parseInt(""+isbn.charAt(12)) != suma % 11) {
                return false;
            }
        } else if (suma % 11 == 10) {
            if (isbn.toUpperCase().charAt(12) != 'X') {
                return false;
            }
        }

        return true;
    }
}
