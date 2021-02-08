package cuentas;

public class ProgramaCuentas {

    public static void main(String[] args) {
        Cuenta primera = new Cuenta("Ramon Perez", 500);
        Cuenta segunda = new Cuenta("Sara Pozo", 890.45);
        Cuenta tercera = new Cuenta("Alberto Gonzalez");
        System.out.println(primera.mostrar());
        System.out.println("");
        System.out.println(segunda.mostrar());
        System.out.println("");
        System.out.println(tercera.mostrar());

        primera.ingresar(-100);
        segunda.ingresar(300.10);
        tercera.retirar(100);
        
        System.out.println("Despues de operaciones: ");
        System.out.println(primera.mostrar());
        System.out.println("");
        System.out.println(segunda.mostrar());
        System.out.println("");
        System.out.println(tercera.mostrar());
    }
}
