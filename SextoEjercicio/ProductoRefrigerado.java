/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SextoEjercicio;

/**
 *
 * @author macbookair
 */
public class ProductoRefrigerado extends Producto {
 
    private String codigoSupervision;
    private String fechaEnvasado;
    private double temperaturaMantenimiento;
    private String paisOrigen;

    public ProductoRefrigerado(String fechaCaducidad, String numeroLote, String codigoSupervision,
                               String fechaEnvasado, double temperaturaMantenimiento, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.codigoSupervision = codigoSupervision;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto Refrigerado:");
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
        System.out.println("Número de lote: " + numeroLote);
        System.out.println("Código de supervisión: " + codigoSupervision);
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("Temperatura de mantenimiento: " + temperaturaMantenimiento + " °C");
        System.out.println("País de origen: " + paisOrigen);
    }
}
    

