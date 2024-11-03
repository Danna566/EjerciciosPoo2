/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SextoEjercicio;

/**
 *
 * @author macbookair
 */
public class ProductoCongeladoPorAgua extends ProductoCongelado {
    
    private double salinidad;

    public ProductoCongeladoPorAgua(String fechaCaducidad, String numeroLote, String fechaEnvasado,
                                     String paisOrigen, double temperaturaMantenimiento, double salinidad) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.salinidad = salinidad;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Congelado por agua:");
        System.out.println("Salinidad: " + salinidad + " g/L");
    }
}
    

