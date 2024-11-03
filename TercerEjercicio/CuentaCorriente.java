/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TercerEjercicio;

/**
 *
 * @author macbookair
 */
public class CuentaCorriente extends Cuenta {
    
    private double maximoRetirable;

    // Constructor completo
    public CuentaCorriente(long numeroCuenta, Persona cliente, double maximoRetirable) {
        super(numeroCuenta, cliente);
        this.maximoRetirable = maximoRetirable;
    }

    // Métodos de acceso
    public double getMaximoRetirable() {
        return maximoRetirable;
    }

    // Método para retirar dinero
    @Override
    public void retirar(double x) {
        if (x > 0 && x <= maximoRetirable && x <= getSaldo()) {
            double nuevoSaldo = getSaldo() - x;
            // Se accede al saldo usando métodos de la clase padre, por lo que se debe modificar el saldo
            // Aquí se puede usar la reflexión o agregar un método para modificar el saldo, por simplicidad
            ingresar(-x); // Restar la cantidad de la cuenta
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "Cuenta Corriente [Número de cuenta: " + getNumeroCuenta() + ", Saldo: " + getSaldo() + ", Cliente: " + getCliente().getNombre() + "]";
    }
}

