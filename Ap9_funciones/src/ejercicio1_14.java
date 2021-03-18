
public class ejercicio1_14 {

    public static void main(String[] args) {
        int numCapi = 5665;
        System.out.println("Capicua: " + esCapicua(numCapi));

        int numPri = 14;
        System.out.println("Primo: " + esPrimo(numPri));

        int base = 5;
        int exp = 4;
        System.out.println("Potencia: " + potencia(base, exp));

        int numDigitos = 5674832;
        System.out.println("Digitos: " + digitos(numDigitos));

        int inverNum = 123456789;
        System.out.println("Invertido: " + voltea(inverNum));

        int digitoN = 235643;
        int pos = 5;
        System.out.println("DigitoN: " + digitoN(digitoN, pos));

        int numPos = 123456789;
        int posDig = 4;
        System.out.println("Posición dígito: " + posicionDeDigito(numPos, posDig));

        int numQuitarDetras = 123456789;
        int digQuitarDetras = 4;
        System.out.println("Quitar por detrás: " + quitaPorDetras(numQuitarDetras, digQuitarDetras));

        int numTrozo = 123456789;
        int posIni = 3;
        int posFin = 7;
        System.out.println("Trozo: " + trozoDeNumero(numTrozo, posIni, posFin));

        int num1Juntar = 12345;
        int num2Juntar = 67890;
        System.out.println("Juntar: " + juntaNumeros(num1Juntar, num2Juntar));
    }

    /* 1
     *Recibe un número y devuelve si es capicua
     *@param num recibe un entero
     *@return devuelve verdadero o falso si es o no capicua
     */
    public static boolean esCapicua(int num) {
        String numero = "" + num;
        for (int i = 0; i < numero.length() / 2; i++) {
            if (numero.charAt(i) != numero.charAt((numero.length() - 1) - i)) {
                return false;
            }
        }

        return true;
    }

    /* 2
     *Recibe un número y devuelve si es primo
     *@param num recibe un entero
     *@return verdadero o falso si es no número primo
     */
    public static boolean esPrimo(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    /* 4
     *Recibe una base y un exponente y devuelve la potencia
     *@param base, exp recibe una base y un exponente
     *@reurn devuelve la potencia
     */
    public static long potencia(int base, int exp) {
        int potencia = base;
        for (int i = 0; i < exp - 1; i++) {
            potencia *= base;
        }

        return potencia;
    }

    /* 5
     *Recibe un número y devuelve el número de digitos que tiene
     *@param num recibe un entero
     *@return devuelve un entero con la cantidad de digitos
     */
    public static int digitos(int num) {
        String numero = "" + num;
        int dig = numero.length();

        return dig;
    }

    /* 6
     *Recibe un entero y le da la vuelta
     *@param num recibe un entero
     *@return devuelve como entero el número invertido
     */
    public static int voltea(int num) {
        String numero = "" + num;
        String inver = "";
        for (int i = numero.length() - 1; i >= 0; i--) {
            inver += numero.charAt(i);
        }
        int n = Integer.parseInt(inver);

        return n;
    }

    /* 7
     *Recibe un entero y una posición y devuelve el dígito en esa posición
     *@param num recibe un entero
     *@param pos recibe un entero con la posicion a devolver
     *@return devuelve un entero con el dígito en la posición
     */
    public static int digitoN(int num, int pos) {
        String numero = "" + num;
        if (pos > numero.length()) {
            pos = numero.length();
        }
        if (pos <= 0) {
            pos = 1;
        }
        int dig = Integer.parseInt("" + numero.charAt(pos - 1));

        return dig;
    }

    /* 8
     *Recibe un número y un digito, devuelve la posicion del digito en el numero
     *@param num recibe un entero
     *@param dig recibe un entero con el digito a buscar
     *@return devuelve un entero con la posicion del digito o -1 si no existe
     */
    public static int posicionDeDigito(int num, int dig) {
        String numero = "" + num;
        int pos = numero.indexOf("" + dig);

        return pos + 1;
    }

    /* 9
     *Recibe un numero y un digito, devuelve el número sin los digitos por la derecha
     *@param num recibe un entero
     *@param dig recibe un entero con el numero de digitos a quitar
     *@return devuelve un entero con los digitos quitados
     */
    public static int quitaPorDetras(int num, int dig) {
        for (int i = 0; i < dig; i++) {
            num /= 10;
        }

        return num;
    }

    /* 13
     *Recibe un número y la posiciion de dos digitos, devolviendo lo que hay entre ellos
     *@param num recibe un entero
     *@param posIni recibe un entero con la posición inicial del digito
     *@param posFin recibe un entero con la posicion final del digito
     *@return devuelve un entero con el número entre las dos posiciones
     */
    public static int trozoDeNumero(int num, int posIni, int posFin) {
        String numero = "" + num;
        String trozo = "";
        if (posFin > numero.length()) {
            posFin = numero.length();
        }
        if (posIni <= 0) {
            posIni = 1;
        }
        for (int i = posIni - 1; i <= posFin - 1; i++) {
            trozo += numero.charAt(i);
        }
        int n = Integer.parseInt(trozo);

        return n;
    }

    /* 14
     *Recibe dos números y los junta
     *@param num1 recibe un entero
     *@param num2 recibe un entero
     *@return devuelve un entero con los números juntados
     */
    public static long juntaNumeros(int num1, int num2) {
        long numero = Integer.parseInt(num1 + "" + num2);

        return numero;
    }
}
