/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SextoEjercicio;

/**
 *
 * @author macbookair
 */
public class ProductoFresco extends Producto{
    
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto Fresco:");
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
        System.out.println("Número de lote: " + numeroLote);
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("País de origen: " + paisOrigen);
    }
}
    

