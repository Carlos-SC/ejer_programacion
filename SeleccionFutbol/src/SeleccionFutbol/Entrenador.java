package SeleccionFutbol;

public class Entrenador extends SeleccionFutbol {
    
    private String idFederacion;
    
    public Entrenador() {
        super();
    }
    
    public Entrenador(String idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "idFederacion=" + idFederacion + '}';
    }
    
    
    
    public void dirigirPartido() {
    
    }
    
    public void dirigirEntrenamiento() {
    
    }
}
