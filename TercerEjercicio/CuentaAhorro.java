/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TercerEjercicio;

/**
 *
 * @author macbookair
 */
public class CuentaAhorro extends Cuenta {
    
    private double saldoMinimo;

    
    public CuentaAhorro(long numeroCuenta, Persona cliente, double saldoMinimo) {
        super(numeroCuenta, cliente);
        this.saldoMinimo = saldoMinimo;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    @Override
    public void retirar(double x) {
        if (x > 0 && (getSaldo() - x) >= saldoMinimo) {
            ingresar(-x); 
        }
    }

    @Override
    public String toString() {
        return "Cuenta Ahorro [Número de cuenta: " + getNumeroCuenta() + ", Saldo: " + getSaldo() + ", Cliente: " + getCliente().getNombre() + "]";
    }
}
    

