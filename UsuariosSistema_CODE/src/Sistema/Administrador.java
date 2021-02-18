package Sistema;

public class Administrador extends Usuario {

    private boolean otorgaPrivi;

    public Administrador(String n, String ap1, String ap2, String pass, boolean privi) {
        super(n, ap1, ap2, pass);
        this.otorgaPrivi = privi;
        super.login = "super-" + ap1.toLowerCase().charAt(0) + ap1.charAt(1)
                + ap2.toLowerCase().charAt(0) + ap2.charAt(1)
                + n.toLowerCase().charAt(0) + n.charAt(1);

    }

    public boolean isOtorgaPrivi() {
        return this.otorgaPrivi;
    }

    public void setOtorgaPrivi(boolean otorgaPrivi) {
        this.otorgaPrivi = otorgaPrivi;
    }

    @Override
    public String toString() {
        String info = "Administrador: " + super.getLogin()
                + "\nNombre completo: " + super.getNombre() + " "
                + super.getApellido1() + " " + super.getApellido2();
        if (this.otorgaPrivi) {
            info += "\nPuede otorgar privilegios: si";
        } else {
            info += "\nPuede otorgar privilegios: no";
        }

        return info;
    }
}
