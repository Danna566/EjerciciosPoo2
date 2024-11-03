/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecimoEjercicio;

/**
 *
 * @author macbookair
 */
public class Main {
   
    public static void main(String[] args) {
        AlfombrasRedondas alfombrasRedondas = new AlfombrasRedondas("Rojo", 20, 3);
        AlfombrasCuadradas alfombrasCuadradas = new AlfombrasCuadradas("Azul", 15, 4);

        System.out.println("Alfombra Redonda:");
        System.out.println("Color: " + alfombrasRedondas.getColor());
        System.out.println("Superficie: " + alfombrasRedondas.calcularSuperficie());
        System.out.println("Precio: " + alfombrasRedondas.calcularPrecio());

        System.out.println("\nAlfombra Cuadrada:");
        System.out.println("Color: " + alfombrasCuadradas.getColor());
        System.out.println("Superficie: " + alfombrasCuadradas.calcularSuperficie());
        System.out.println("Precio: " + alfombrasCuadradas.calcularPrecio());
    }
}

