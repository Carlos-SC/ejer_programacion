
package cuentas;
import personas.Persona;

public class CuentaJoven extends Cuenta {
    private byte bonificacion;
    
    public CuentaJoven(Persona p) {
        super(p);
    }
    
    public CuentaJoven(Persona p, double c, byte b) {
        super(p, c);
        this.bonificacion = b;
    }
    
    public byte getBonificacion() {
        return this.bonificacion;
    }
    
    public void setBonificacion(byte b) {
        this.bonificacion = b;
    }
    
    public boolean esTitularValido() {
        if (this.getTitular().esMayorDeEdad() && this.getTitular().getEdad() <= 25) {
            return true;
        }
        return false;
    }
    
    @Override
    public void retirar(double c) {
        if (esTitularValido()) {
            super.retirar(c);
        }
    }
    
    @Override
    public String mostrar() {
        String info = super.mostrar();
        info = "=====CUENTA JOVEN======\n"
                +info
                +"\nBonificación"+this.bonificacion;
        return info;
    }
}
