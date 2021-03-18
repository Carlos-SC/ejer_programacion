package ejercicio3;

public class Llamada {

    private String numeroTelefono;
    private Hora comienzoLlamada;
    private Hora finLlamada;

    public Llamada() {

    }

    public Llamada(String num, Hora inicio, Hora fin) {
        this.numeroTelefono = num;
        this.comienzoLlamada = inicio;
        this.finLlamada = fin;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Hora getComienzoLlamada() {
        return comienzoLlamada;
    }

    public void setComienzo(Hora comienzoLlamada) {
        this.comienzoLlamada = comienzoLlamada;
    }

    public Hora getFinLlamada() {
        return finLlamada;
    }

    public void setFin(Hora finLlamada) {
        this.finLlamada = finLlamada;
    }

    public String escribeHoraComienzo() {
        return this.comienzoLlamada.mostrarHora();
    }

    public String escribeHoraFin() {
        return this.finLlamada.mostrarHora();
    }

    public int duracionLlamada() {
        if (this.comienzoLlamada.getHora() > this.finLlamada.getHora()) {
            return -1;
        }

        int seg1 = (this.comienzoLlamada.getHora() * 3600)
                + (this.comienzoLlamada.getMinutos() * 60)
                + this.comienzoLlamada.getSegundos();
        int seg2 = (this.finLlamada.getHora() * 3600)
                + (this.finLlamada.getMinutos() * 60)
                + this.finLlamada.getSegundos();
        
        return seg2-seg1;
    }
}
