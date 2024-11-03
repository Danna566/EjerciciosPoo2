/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuintoEjercicio;

/**
 *
 * @author macbookair
 */
public class Furgoneta extends Vehiculo {

    private double capacidadCarga;

    public Furgoneta(double precioCompra, String marca, double capacidadCarga) {
        super(precioCompra, marca);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double precioVenta() {
        double precioVentaInicial = precioCompra * 1.6;
        if (capacidadCarga > 10) {
            precioVentaInicial *= 1.2; 
        }
        return precioVentaInicial;
    }
}
    

