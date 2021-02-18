package cuentas;
import personas.Persona;

public class Cuenta {
    private Persona titular;
    private double cantidad;
    
    public Cuenta(Persona titular) {
        this.titular = titular;
    }
    
    public Cuenta(Persona titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public Persona getTitular() {
        return titular;
    }
    
    public void setTitular(Persona titular) {
        this.titular = titular;
    }
    
    public double getCantidad() {
        return cantidad;
    }
    
    public String mostrar() {
        String info = "==========Titular============ \n"+this.titular.mostrar()+
                "\n==========Cantidad===========\n"+this.cantidad;
        
        return info;
    }
    
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }
    
    public void retirar(double cantidad) {
        if (cantidad < 0) {
            this.cantidad += cantidad;
        } else {
            this.cantidad -= cantidad;
        }
    }
}
