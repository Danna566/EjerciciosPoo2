/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeptimoEjercicio;

import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class PruebaEmpleados {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleados[] empleados = new Empleados[4]; // Crear un array de 4 empleados

        // Leer datos de los empleados
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Ingrese los datos del empleado " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();

            // Crear un nuevo empleado y almacenarlo en el array
            empleados[i] = new Empleados(nombre, telefono);
        }

        // Mostrar los datos de cada empleado
        System.out.println("\nDatos de los empleados:");
        for (Empleados empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre() + ", Teléfono: " + empleado.getTelefono());
        }

        // Mostrar el número de empleados instanciados
        System.out.println("Número total de empleados instanciados: " + Empleados.getNumeroEmpleados());

        scanner.close();
    }
}

