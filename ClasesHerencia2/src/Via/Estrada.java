package Via;

import java.time.LocalDate;

public class Estrada extends Via {

    private int numCarriles;

    public Estrada() {
        super();
        this.numCarriles = 2;
    }

    public Estrada(String codigo, String titular, double numKm, double numKmdef,
            int ancho, LocalDate fecha, int numCarriles) {

        super(codigo, titular, numKm, numKmdef, ancho, fecha);
        this.numCarriles = numCarriles;
    }

    public int getNumCarriles() {
        return numCarriles;
    }

    public void setNumCarriles(int numCarriles) {
        this.numCarriles = numCarriles;
    }

    @Override
    public double costeMantenimiento() {
        double mant = super.numKm * 206.03 * this.numCarriles;

        return mant;
    }

    @Override
    public String toString() {
        String info = "Codigo: " + super.codigo
                + "\nTitular: " + super.titular
                + "\nNº de km: " + super.numKm + "\tNº km deficientes: " + super.numKmDeficientes
                + "\nAncho: " + super.anchoMetros + "\tNº Carriles: " + this.numCarriles
                + "\nCoste mantenimiento: " + this.costeMantenimiento();

        return info;
    }
}
