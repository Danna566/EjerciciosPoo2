/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuartoEjercicio;

/**
 *
 * @author macbookair
 */
public class Prueba {
    
    public static void main(String[] args) {
        // Creación de un coche
        Coche coche1 = new Coche("Toyota", "Rojo", 20000, 1.2, 2018);
        coche1.setDniTitular("12345678A");
        
        // Creación de un coche matriculado
        CocheMatriculado cocheMatriculado = new CocheMatriculado("Ford", "Azul", 25000, 1.5, 2015,
            "ABC1234", "87654321B", 2015, 6);

        // Probar métodos
        System.out.println("Coche 1: Marca: " + coche1.getMarca() + ", DNI Titular: " + coche1.getDniTitular());
        coche1.comprarCoche(cocheMatriculado);
        System.out.println("DNI Titular del Coche 1 después de la compra: " + coche1.getDniTitular());

        System.out.println("Coche Matriculado: Marca: " + cocheMatriculado.getMarca() +
                ", Impuesto de Matriculación: " + cocheMatriculado.getImpuestoMatriculacion());

        // Incrementar kilómetros
        coche1.incrementarKm(100);
        System.out.println("Kilómetros del Coche 1: " + coche1.getKm());
    }
}

    

