package ejercicio5;

public class TarjetaPrepago {

    private String telefono;
    private String nif;
    private double saldo;
    private Tiempo consumo;

    public TarjetaPrepago() {

    }

    public TarjetaPrepago(String telefono, String nif, double saldo) {
        this.telefono = telefono;
        this.nif = nif;
        this.saldo = saldo;
    }

    public void ingresarSaldo(int num) {
        if (num > 0) {
            this.saldo += num;
        }
    }

    public void enviarMensaje(int num) {
        this.saldo -= num * 0.09;
    }

    public void llamadaRealizada(int seg) {
        this.saldo -= 0.15;
        this.saldo -= seg * 0.01;
        this.consumo.setMinutos(this.consumo.getMinutos()+(seg/60));
        this.consumo.setSegundos(this.consumo.getSegundos()+(seg%60));
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNif() {
        return nif;
    }

    public double getSaldo() {
        return saldo;
    }

    public Tiempo getConsumo() {
        return consumo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String consultarNumero() {
        String info = "Teléfono: " + this.telefono
                + "\nNIF: "+this.nif
                + "\nSaldo: "+this.saldo
                + "\nConsumo: "+this.consumo.mostrarTiempo();

        return info;
    }
}
