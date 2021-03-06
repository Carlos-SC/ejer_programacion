package personas;

public class Persona {

    private String nombre;
    private int edad;
    private String dni;

    public Persona() {

    }

    public Persona(String nombre, int edad, String dni) {
        if (DNI.esValido(dni)) {
            this.dni = dni;
        } else {
            throw new IllegalArgumentException("El dni no es válido");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return dni;
    }

    public void setDNI(String dni) {
        if (DNI.esValido(dni)) {
            this.dni = dni;
        } else {
            throw new IllegalArgumentException("El dni no es válido");
        }
    }

    public String mostrar() {
        String info = "Nombre: " + this.nombre
                + "\nEdad: " + this.edad
                + "\nDNI: " + this.dni;

        return info;
    }

    public boolean esMayorDeEdad() {
        if (this.edad >= 18) {
            return true;
        }
        return false;
    }
}
