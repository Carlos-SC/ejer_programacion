package Sistema;

public class Usuario {

    protected String login;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private long passCifrada;

    public Usuario(String n, String ap1, String ap2, String pass) {
        this.login = "" + ap1.toLowerCase().charAt(0) + ap1.charAt(1)
                + ap2.toLowerCase().charAt(0) + ap2.charAt(1)
                + n.toLowerCase().charAt(0) + n.charAt(1);
        this.nombre = n;
        this.apellido1 = ap1;
        this.apellido2 = ap2;
        this.passCifrada = pass.hashCode();
    }

    public String getLogin() {
        return this.login;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
        this.login = "" + this.apellido1.toLowerCase().charAt(0) + this.apellido1.charAt(1)
                + this.apellido2.toLowerCase().charAt(0) + this.apellido2.charAt(1)
                + this.nombre.toLowerCase().charAt(0) + this.nombre.charAt(1);
    }

    public String getApellido1() {
        return this.apellido1;
    }

    public void setApellido1(String ap1) {
        this.apellido1 = ap1;
        this.login = "" + this.apellido1.toLowerCase().charAt(0) + this.apellido1.charAt(1)
                + this.apellido2.toLowerCase().charAt(0) + this.apellido2.charAt(1)
                + this.nombre.toLowerCase().charAt(0) + this.nombre.charAt(1);
    }

    public String getApellido2() {
        return this.apellido2;
    }

    public void setApellido2(String ap2) {
        this.apellido1 = ap2;
        this.login = "" + this.apellido1.toLowerCase().charAt(0) + this.apellido1.charAt(1)
                + this.apellido2.toLowerCase().charAt(0) + this.apellido2.charAt(1)
                + this.nombre.toLowerCase().charAt(0) + this.nombre.charAt(1);
    }

    public boolean comprobarPass(String pass) {
        if (pass.hashCode() == this.passCifrada) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String info = "Usuario: " + this.login
                + "\nNombre completo: " + this.nombre + " "
                + this.apellido1 + " " + this.apellido2;

        return info;
    }
}
