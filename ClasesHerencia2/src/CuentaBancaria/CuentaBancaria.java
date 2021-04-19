package CuentaBancaria;

import java.time.LocalDate;

public class CuentaBancaria implements Comparable<CuentaBancaria> {
    
    protected String nombre;
    protected String numeroCuenta;
    protected LocalDate fechaApertura;
    protected double interes;
    protected double saldo;
    
    public CuentaBancaria() {
        
    }
    
    public CuentaBancaria(String nombre, String numero, LocalDate fechaApertura, double interes, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numero;
        this.fechaApertura = fechaApertura;
        this.interes = interes;
        this.saldo = saldo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNumero() {
        return numeroCuenta;
    }
    
    public void setNumero(String numero) {
        this.numeroCuenta = numero;
    }
    
    public LocalDate getFechaApertura() {
        return fechaApertura;
    }
    
    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    
    public double getInteres() {
        return interes;
    }
    
    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public String toString() {
        return "CuentaBancaria{" + "nombre=" + nombre + ", numeroCuenta=" + numeroCuenta + ", fechaApertura=" + fechaApertura + ", interes=" + interes + ", saldo=" + saldo + '}';
    }
    
    public boolean ingreso(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            return true;
        }
        return false;
    }
    
    public boolean reintegro(double cantidad) {
        if (cantidad > 0) {
            if (this.saldo >= cantidad) {
                this.saldo -= cantidad;
                return true;
            }
        }
        return false;
    }

    /*
    //Comparativa con Strings
    @Override
    public int compareTo(CuentaBancaria o) {
        return this.numeroCuenta.compareTo(o.numeroCuenta);
    }
     */
    
    /*
    //Comparativa con números
    @Override
    public int compareTo(CuentaBancaria o) {
        if (this.saldo > o.saldo) {
            return 1;
        } else if (this.saldo < o.saldo) {
            return -1;
        } else {
            return 0;
        }
    }
    */
    
    //Comparativa fechas
    @Override
    public int compareTo(CuentaBancaria o) {
        if (this.fechaApertura.isAfter(o.fechaApertura)) {
            return 1;
        } else if (this.fechaApertura.isBefore(o.fechaApertura)) {
            return -1;
        } else {
            return 0;
        }
    }
}