package Via;

import java.time.LocalDate;

public class Ciclovia extends Via {

    private String color;

    public Ciclovia() {
        super();
        this.color = "#000000";
    }

    public Ciclovia(String codigo, String titular, double numKm, double numKmdef,
                    int ancho, LocalDate fecha, String color) {
        
        super(codigo, titular, numKm, numKmdef, ancho, fecha);

        if (comprobarColor(color)) {
            this.color = color;
        } else {
            this.color = "#000000";
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private boolean comprobarColor(String color) {
        if (color.length() != 7) {
            return false;
        }
        if (color.charAt(0) != '#') {
            return false;
        }
        for (int i = 1; i < color.length(); i++) {
            if (!(((int) color.charAt(i) >= 48 && (int) color.charAt(i) <= 57)
                    || ((int) color.charAt(i) >= 65 && (int) color.charAt(i) <= 70))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public double costeMantenimiento() {
        double mant = super.numKm * 308.15;

        return mant;
    }

    @Override
    public String toString() {
        String info = "Codigo: " + super.codigo
                + "\nTitular: " + super.titular
                + "\nNº de km: " + super.numKm + "\tNº km deficientes " + super.numKmDeficientes
                + "\nAncho: " + super.anchoMetros
                + "\nColor: " + this.color
                + "\nCoste mantenimiento: " + this.costeMantenimiento();

        return info;
    }
}
