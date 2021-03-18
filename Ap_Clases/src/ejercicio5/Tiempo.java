package ejercicio5;

public class Tiempo {

    private int minutos;
    private int segundos;

    public Tiempo() {

    }
    
    public Tiempo(int min, int seg) {
        this.minutos = min;
        this.segundos = seg;
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
    
    public String mostrarTiempo() {
        return this.minutos+":"+this.segundos;
    }
}
