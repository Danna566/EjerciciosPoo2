/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TercerEjercicio;

/**
 *
 * @author macbookair
 */
abstract class Cuenta {
    
    private long numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta(long numeroCuenta, Persona cliente) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = 0.0; 
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getCliente() {
        return cliente;
    }
    
    public void ingresar(double x) {
        if (x > 0) {
            saldo += x;
        }
    }

    public abstract void retirar(double x);
}
    

