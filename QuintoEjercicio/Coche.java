/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuintoEjercicio;

/**
 *
 * @author macbookair
 */
public class Coche extends Vehiculo {
    private int puertas;

    public Coche(double precioCompra, String marca, int puertas) {
        super(precioCompra, marca);
        this.puertas = puertas;
    }

    @Override
    public double precioVenta() {
        return precioCompra * 1.6; // 60% de incremento
    }
}
    

