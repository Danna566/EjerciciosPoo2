/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TercerEjercicio;

/**
 *
 * @author macbookair
 */
public class Prueba {
   
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Juan Pérez", "12345678A");
        Persona persona2 = new Persona("Ana Gómez", "87654321B");

        CuentaCorriente cuentaCorriente = new CuentaCorriente(123456789, persona1, 200.0);
        CuentaAhorro cuentaAhorro = new CuentaAhorro(987654321, persona2, 100.0);

        cuentaCorriente.ingresar(1000);
        System.out.println(cuentaCorriente);
        cuentaCorriente.retirar(500);
        System.out.println(cuentaCorriente);
        
        cuentaAhorro.ingresar(500);
        System.out.println(cuentaAhorro);
        cuentaAhorro.retirar(300);
        System.out.println(cuentaAhorro);
        cuentaAhorro.retirar(200); 
        System.out.println(cuentaAhorro);
    }
}
    
