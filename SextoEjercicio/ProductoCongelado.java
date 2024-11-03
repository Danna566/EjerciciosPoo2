/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SextoEjercicio;

/**
 *
 * @author macbookair
 */
public class ProductoCongelado extends Producto {
    
    private String fechaEnvasado;
    private String paisOrigen;
    private double temperaturaMantenimiento;

    public ProductoCongelado(String fechaCaducidad, String numeroLote, String fechaEnvasado,
                             String paisOrigen, double temperaturaMantenimiento) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto Congelado:");
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
        System.out.println("Número de lote: " + numeroLote);
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("País de origen: " + paisOrigen);
        System.out.println("Temperatura de mantenimiento: " + temperaturaMantenimiento + " °C");
    }
}
    

