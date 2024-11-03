/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeptimoEjercicio;

/**
 *
 * @author macbookair
 */
public class Empleados {
   
    private String nombre;
    private String telefono;
    private static int numeroEmpleados = 0; // Atributo estático para contar empleados

    // Constructor
    public Empleados(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        numeroEmpleados++; // Incrementa el contador al crear un nuevo empleado
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método para obtener el número de empleados
    public static int getNumeroEmpleados() {
        return numeroEmpleados;
    }
}
  

