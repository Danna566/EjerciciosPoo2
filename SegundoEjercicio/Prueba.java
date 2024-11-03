/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundoEjercicio;

/**
 *
 * @author macbookair
 */
public class Prueba {
   
  public static void main(String[] args) {
    try {
        Empleados empleado1 = new Empleados("Jose Mendez", 122244, 23, false, 300000);
        System.out.println(empleado1.toString());
        System.out.println("Clasificación: " + empleado1.clasifica());

        empleado1.subirSalario(10);
        System.out.println("Salario tras aumento: " + empleado1.getSalario());

    
        Programador programador1 = new Programador("Fabio", 129931, 28, true, 28900, 40, "java");
        System.out.println("\n" + programador1.toString());
        System.out.println("Clasificación: " + programador1.clasifica());
        System.out.println("Salario calculado: " + programador1.calculaSalario());

    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
}
    

