package examen4;

public class Carretera {

    private String codigo;
    private String titular;
    private double numKm;
    private double numKmDeficientes;
    private int anchoMetros;
    private int numCarriles;
    private String fechaInauguracion;

    public Carretera() {
        this.titular = "local";
    }

    public Carretera(String codigo, String titular, double numKm,
            double numKmDeficientes, int anchoMetros, int numCarriles,
            String fechaInauguracion) {

        this.codigo = codigo;
        this.titular = titular;

        if (numKm < 0) {
            System.out.println("El valor de numKm es negativo. Tomará el valor por defecto.");
            this.numKm = 0;
        } else {
            this.numKm = numKm;
        }

        this.numKmDeficientes = numKmDeficientes;

        if (anchoMetros < 0) {
            System.out.println("El valor de anchoMetros es negativo. Tomará el valor por defecto.");
            this.anchoMetros = 0;
        } else {
            this.anchoMetros = anchoMetros;
        }

        if (numCarriles < 0) {
            System.out.println("El valor de numCarriles es negativo. Tomará el valor por defecto.");
            this.numCarriles = 0;
        } else {
            this.numCarriles = numCarriles;
        }

        this.fechaInauguracion = fechaInauguracion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getNumKm() {
        return numKm;
    }

    public void setNumKm(double numKm) {
        this.numKm = numKm;
    }

    public double getNumKmDeficientes() {
        return numKmDeficientes;
    }

    public void setNumKmDeficientes(double numKmDeficientes) {
        this.numKmDeficientes = numKmDeficientes;
    }

    public int getAnchoMetros() {
        return anchoMetros;
    }

    public void setAnchoMetros(int anchoMetros) {
        this.anchoMetros = anchoMetros;
    }

    public int getNumCarriles() {
        return numCarriles;
    }

    public void setNumCarriles(int numCarriles) {
        this.numCarriles = numCarriles;
    }

    public String getFechaInauguracion() {
        return fechaInauguracion;
    }

    public void setFechaInauguracion(String fechaInauguracion) {
        this.fechaInauguracion = fechaInauguracion;
    }

    @Override
    public String toString() {
        String info = "Codigo: " + this.codigo
                + "\nTitular: " + this.titular
                + "\nNº de km: " + this.numKm + "\tNº km deficientes " + this.numKmDeficientes
                + "\nAncho: " + this.anchoMetros + "\tNº de carriles: " + this.numCarriles
                + "\nCoste mantenimiento: " + costeMantenimiento(this.numKm, this.numCarriles);

        return info;
    }

    public double costeMantenimiento(double numKm, int numCarriles) {
        double mant = numKm * 206.03 * numCarriles;

        return mant;
    }

    public String arreglar(double km) {
        String info = "";
        if (km < 0) {
            info = "El número de kilometros pasado es negativo.";
        } else if ((this.numKmDeficientes - km) < 0) {
            info = "El número de kilometros deficientes ha quedado en negativo. Estableciendo a 0";
            this.numKmDeficientes = 0;
        } else {
            info = "Arreglados " + km + " kilometros de carretera.";
            this.numKmDeficientes -= km;
        }

        return info;
    }

    public String comunicarDeficiencia(double km) {
        String info = "";
        if (km < 0) {
            info = "El número de kilometros pasado es negativo.";
        } else if ((this.numKmDeficientes + km) > this.numKm) {
            info = "El número de kilometros deficiente es superior al "
                    + "numero de kilometros de la carretera. Estableciendo al"
                    + "máximo de kilometros de la carretera";
            this.numKmDeficientes = this.numKm;
        } else {
            info = "Informada la deficiencia en " + km + " kilometros de carretera.";
            this.numKmDeficientes += km;
        }

        return info;
    }
}
