package cuentas;

public class Cuenta {
    private String titular;
    private double cantidad;
    
    public Cuenta(String titular) {
        this.titular = titular;
    }
    
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getCantidad() {
        return cantidad;
    }
    
    public String mostrar() {
        String info = "Titular: "+this.titular+
                "\nCantidad: "+this.cantidad;
        
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
