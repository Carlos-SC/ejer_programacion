
public class DNI {

    public static boolean esValido(String dni) {

        String numeros = "0123456789";
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        String letrasNIE = "XYZ";

        if (dni.length() != 9) {
            return false;
        }

        char primeraLetra = dni.toUpperCase().charAt(0);

        if (letrasNIE.indexOf(primeraLetra) < 0 && numeros.indexOf(primeraLetra) < 0) {
            return false;
        } else if (letrasNIE.indexOf(primeraLetra) >= 0) {
            dni = letrasNIE.indexOf(primeraLetra) + dni.substring(1);
        }

        for (int i = 0; i < dni.length() - 1; i++) {
            if (numeros.indexOf(dni.charAt(i)) < 0) {
                return false;
            }
        }

        char ultimaLetra = dni.toUpperCase().charAt(8);

        if (letras.indexOf(ultimaLetra) < 0) {
            return false;
        }

        int valorNumericoDNI = Integer.parseInt(dni.substring(0, 8));

        if (valorNumericoDNI % 23 != letras.indexOf(ultimaLetra)) {
            return false;
        }

        return true;
    }
}
