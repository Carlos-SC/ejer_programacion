package SeleccionFutbol;

public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;
    
    public Futbolista() {
        super();
    }
    
    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }
    
    
    
    public void jugarPartido() {
    
    }
    
    public void entrenar() {
    
    }
}
