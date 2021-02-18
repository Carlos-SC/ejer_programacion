package Sistema;

import java.util.Scanner;

public class RegistroUsuario {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ComprobarFuerzaPassword fuerte = new ComprobarFuerzaPassword(8, 2, 2, 2);

        System.out.print("Introduce un nombre, apellido1, apellido2 y contraseña: ");
        String n = s.next();
        String ap1 = s.next();
        String ap2 = s.next();
        String pass = s.next();

        if (fuerte.esFuerte(pass)) {
            Usuario usu1 = new Usuario(n, ap1, ap2, pass);
            System.out.println(usu1.toString());
        } else {
            System.out.println("CONTRASEÑA NO VALIDA"
                    + "\nLa contraseña ha de tener mínimo "
                    + fuerte.getLetrasMayus() + " mayusculas "
                    + fuerte.getLetrasMinus() + " minusculas "
                    + fuerte.getNumeros() + " numeros y una longitud minima de "
                    + fuerte.getLongitudPass() + " caracteres");
        }

    }
}
