/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NovenoEjercicio;

/**
 *
 * @author macbookair
 */
public class Principal {
  
    public static void main(String[] args) {
        Piso piso = new Piso("Calle Falsa 123", 80, 2, 5);
        Adosado adosado = new Adosado("Calle Verdosa 456", 120, 2);
        Chalet chalet = new Chalet("Calle Lujosa 789", 150, 10, true);

        System.out.println("Piso: " + piso.getCalle() + ", Superficie: " + piso.getSuperficieEnMetros() + "m2, Precio: " + piso.getPrecio());
        System.out.println("Adosado: " + adosado.getCalle() + ", Superficie: " + adosado.getSuperficieEnMetros() + "m2, Precio: " + adosado.getPrecio());
        System.out.println("Chalet: " + chalet.getCalle() + ", Superficie: " + chalet.getSuperficieEnMetros() + "m2, Precio: " + chalet.getPrecio() + ", Con piscina: " + chalet.isConPiscina());
    }
}

    

