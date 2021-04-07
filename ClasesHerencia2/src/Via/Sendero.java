package Via;

import java.time.LocalDate;

public class Sendero extends Via {

    private boolean estaPavimentada;

    public Sendero() {
        super();
        this.estaPavimentada = false;
    }

    public Sendero(String codigo, String titular, double numKm, double numKmdef,
            int ancho, LocalDate fecha, boolean pavimentada) {

        super(codigo, titular, numKm, numKmdef, ancho, fecha);
        this.estaPavimentada = pavimentada;
    }

    public boolean isEstaPavimentada() {
        return estaPavimentada;
    }

    public void setEstaPavimentada(boolean estaPavimentada) {
        this.estaPavimentada = estaPavimentada;
    }

    @Override
    public double costeMantenimiento() {
        double mant = 0;

        if (this.estaPavimentada) {
            mant = super.numKm * 110.15;
        } else {
            mant = super.numKm * 145.45;
        }

        return mant;
    }

    @Override
    public String toString() {
        String info = "Codigo: " + super.codigo
                + "\nTitular: " + super.titular
                + "\nNº de km: " + super.numKm + "\tNº km deficientes " + super.numKmDeficientes
                + "\nAncho: " + super.anchoMetros
                + "\nPavimento: " + this.estaPavimentada
                + "\nCoste mantenimiento: " + this.costeMantenimiento();

        return info;
    }
}
