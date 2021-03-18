package ejercicio1;

public class Calzado {

    private double numero;
    private double precio;
    private int existencias;
    private String tipo;
    private String sexo;

    public static double[] numEU = {36, 36.5, 37, 37.5, 38,
        38.5, 39, 39.5, 40, 41, 42, 42.5, 43, 44, 44.5};

    public Calzado() {

    }

    public Calzado(double numero, double precio, int existencias, String tipo, String sexo) {
        this.numero = numero;
        this.precio = precio;
        this.existencias = existencias;
        this.tipo = tipo;
        this.sexo = sexo;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Calzado{" + "numero=" + numero + ", precio=" + precio + ", existencias=" + existencias + ", tipo=" + tipo + ", sexo=" + sexo + '}';
    }

    /**
     *
     * @return devuelve la talla en formato estadounidense
     */
    public double getTallaUS() {

        double[] array = {5.5, 6, 6.5, 7, 7.5, 8, 8.5,
            9, 9.5, 10, 10.5, 11, 11.5, 12, 12.5};

        for (int i = 0; i < numEU.length; i++) {
            if (this.numero == numEU[i]) {
                return array[i];
            }
        }

        return -1;
    }

    /**
     *
     * @return devuelve la talla en formato inglés
     */
    public double getTallaUK() {

        double[] array = {3, 3.5, 4, 4.5, 5, 5.5, 6,
            6.5, 7, 7.5, 8, 8.5, 9, 9.5, 10};

        for (int i = 0; i < numEU.length; i++) {
            if (this.numero == numEU[i]) {
                return array[i];
            }
        }

        return -1;
    }
}
