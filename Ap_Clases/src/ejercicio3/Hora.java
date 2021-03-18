package ejercicio3;

public class Hora {

    private int hora;
    private int minutos;
    private int segundos;

    public Hora() {
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Hora(int hora, int min, int seg) {
        if (hora < 0 || hora > 23) {
            this.hora = 0;
        } else {
            this.hora = hora;
        }
        this.minutos = min;
        this.segundos = seg;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void setHora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public String mostrarHora() {
        return this.hora+":"+this.minutos+":"+this.segundos;
    }
}
