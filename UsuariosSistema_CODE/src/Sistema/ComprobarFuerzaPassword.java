package Sistema;

public class ComprobarFuerzaPassword {

    private int longitudPass;
    private int letrasMayus;
    private int letrasMinus;
    private int numeros;

    public ComprobarFuerzaPassword(int longitud, int mayus, int minus, int num) {
        if (mayus + minus + num < longitud) {
            this.longitudPass = mayus + minus + num;
        } else {
            this.longitudPass = longitud;
        }

        this.letrasMayus = mayus;
        this.letrasMinus = minus;
        this.numeros = num;
    }

    public int getLongitudPass() {
        return this.longitudPass;
    }

    public void setLongitudPass(int longitudPass) {
        this.longitudPass = longitudPass;
    }

    public int getLetrasMayus() {
        return this.letrasMayus;
    }

    public void setLetrasMayus(int letrasMayus) {
        this.letrasMayus = letrasMayus;
    }

    public int getLetrasMinus() {
        return this.letrasMinus;
    }

    public void setLetrasMinus(int letrasMinus) {
        this.letrasMinus = letrasMinus;
    }

    public int getNumeros() {
        return this.numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public boolean esFuerte(String pass) {
        int contMayus = 0;
        int contMinus = 0;
        int contNum = 0;
        for (int i = 0; i < pass.length(); i++) {
            if ((int) pass.charAt(i) >= 65 && (int) pass.charAt(i) <= 90) {
                contMayus++;
            } else if ((int) pass.charAt(i) >= 97 && (int) pass.charAt(i) <= 127) {
                contMinus++;
            } else if ((int) pass.charAt(i) >= 48 && (int) pass.charAt(i) <= 57) {
                contNum++;
            }
        }
        if (contMayus >= this.letrasMayus && contMinus >= this.letrasMinus && contNum >= this.numeros && pass.length() >= this.longitudPass) {
            return true;
        }

        return false;
    }
}
