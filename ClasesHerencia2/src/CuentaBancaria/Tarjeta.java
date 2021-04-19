package CuentaBancaria;

import java.time.LocalDate;

public class Tarjeta extends CuentaBancaria {

    private String numeroTarjeta;
    private String nombre;
    private TipoTarjeta tipoTarjeta;

    public Tarjeta() {
        super();
    }

    public Tarjeta(String numeroTarjeta, String nombre, TipoTarjeta tipoTarjeta, String nombreCliente, String numCuenta, LocalDate fechaApertura, double tipoInteres, double saldo) {
        super(nombreCliente, numCuenta, fechaApertura, tipoInteres, saldo);
        this.numeroTarjeta = numeroTarjeta;
        this.nombre = nombre;
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoTarjeta getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(TipoTarjeta tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + super.toString() + "numeroTarjeta=" + numeroTarjeta + ", nombre=" + nombre + ", tipoTarjeta=" + tipoTarjeta + '}';
    }

    public String visualizaDatos() {
        String info = "Tarjeta Num: " + this.numeroTarjeta
                + "\nTipo: " + this.tipoTarjeta
                + "\nNúmero de cuenta: " + super.numeroCuenta
                + "\nSaldo: " + super.saldo;

        return info;
    }

    public enum TipoTarjeta {
        CREDITO, DEBITO, MONEDERO, FINANCIACION
    }
}
