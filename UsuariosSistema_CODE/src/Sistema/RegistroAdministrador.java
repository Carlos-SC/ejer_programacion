package Sistema;

import java.util.Scanner;

public class RegistroAdministrador {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ComprobarFuerzaPassword fuerte = new ComprobarFuerzaPassword(8, 2, 2, 2);

        System.out.println("Introduce un nombre, apellido1, apellido2, contraseña y si puede dar privilegios(si/no): ");
        String n = s.next();
        String ap1 = s.next();
        String ap2 = s.next();
        String pass = s.next();
        String privi = s.next();
        boolean privilegios = false;

        if (privi.toUpperCase().equals("SI")) {
            privilegios = true;
        }

        if (fuerte.esFuerte(pass)) {
            Usuario usu1 = new Administrador(n, ap1, ap2, pass, privilegios);
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
