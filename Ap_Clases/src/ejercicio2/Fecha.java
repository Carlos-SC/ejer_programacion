package ejercicio2;

public class Fecha {

    private int dia;
    private int mes;
    private int anyo;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anyo = 2013;
    }

    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    /**
     *
     * @param dia
     * @param mes
     * @param anyo
     */
    public void asignate(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    /**
     *
     * @param dia
     */
    public void incrementate(int dia) {
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < dia; i++) {
            this.dia++;
            if (this.dia > dias[this.mes - 1]) {
                this.dia = 1;
                this.mes++;
                if (this.mes > 12) {
                    this.mes = 1;
                    this.anyo++;
                }
            }
        }
    }

    /**
     *
     */
    public void imprimete() {
        System.out.println(this.dia + "-" + mesLetra() + "-" + this.anyo);
    }

    /**
     *
     * @param num
     */
    public void imprimete(int num) {
        String dia = "";
        String mes = "";

        if (this.dia < 10) {
            dia = "0" + this.dia;
        }
        if (this.mes < 10) {
            mes = "0" + this.mes;
        }

        System.out.println(dia + "-" + mes + "-" + this.anyo);
    }

    /**
     *
     * @return
     */
    private String mesLetra() {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        return meses[this.mes - 1];
    }

    /**
     *
     * @return
     */
    public String getFecha() {
        String info = this.dia + "-" + mesLetra() + "-" + this.anyo;
        return info;
    }

    /**
     * 
     * @param num
     * @return 
     */
    public String getFecha(int num) {
        String dia = "";
        String mes = "";

        if (this.dia < 10) {
            dia = "0" + this.dia;
        }
        if (this.mes < 10) {
            mes = "0" + this.mes;
        }

        String info = dia + "-" + mes + "-" + this.anyo;
        return info;
    }
}
