package ejercicio4;

public class CuentaCorriente {

    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String NIF;
    private double saldo;

    public CuentaCorriente() {

    }

    public CuentaCorriente(String n, String a, String d, String t, String nif, double saldo) {
        this.nombre = n;
        this.apellidos = a;
        this.direccion = d;
        this.telefono = t;
        this.NIF = nif;
        this.saldo = saldo;
    }

    private void sacarDinero(double num) {
        if (num > 0) {
            this.saldo -= num;
        } else {
            this.saldo += num;
        }
    }

    private void ingresarDinero(double num) {
        if (num > 0) {
            this.saldo += num;
        } else {
            this.saldo -= num;
        }
    }

    private String consultarNombre() {
        return nombre;
    }

    private void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    private String consultarApellidos() {
        return apellidos;
    }

    private void establecerApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    private String consultarDireccion() {
        return direccion;
    }

    private void establecerDireccion(String direccion) {
        this.direccion = direccion;
    }

    private String consultarTelefono() {
        return telefono;
    }

    private void establecerTelefono(String telefono) {
        this.telefono = telefono;
    }

    private String consultarNIF() {
        return NIF;
    }

    private void establecerNIF(String NIF) {
        this.NIF = NIF;
    }

    private double consultarSaldo() {
        return saldo;
    }

    private void establecerSaldo(double saldo) {
        this.saldo = saldo;
    }

    private String consultarCuenta() {
        String info = "Titular: " + this.nombre + " " + this.apellidos
                + "\nDirección: " + this.direccion
                + "\nTeléfono: " + this.telefono
                + "\nNIF: " + this.NIF
                + "\nSaldo: " + this.saldo;

        return info;
    }

    private boolean saldoNegativo() {
        if (this.saldo < 0) {
            return true;
        }
        return false;
    }
}
