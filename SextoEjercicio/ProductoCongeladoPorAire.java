/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SextoEjercicio;

/**
 *
 * @author macbookair
 */
public class ProductoCongeladoPorAire extends ProductoCongelado {
    
    private double porcentajeNitrogeno;
    private double porcentajeOxigeno;
    private double porcentajeDioxidoCarbono;
    private double porcentajeVaporAgua;

    public ProductoCongeladoPorAire(String fechaCaducidad, String numeroLote, String fechaEnvasado,
                                     String paisOrigen, double temperaturaMantenimiento,
                                     double porcentajeNitrogeno, double porcentajeOxigeno,
                                     double porcentajeDioxidoCarbono, double porcentajeVaporAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Congelado por aire:");
        System.out.println("Porcentaje de nitrógeno: " + porcentajeNitrogeno + "%");
        System.out.println("Porcentaje de oxígeno: " + porcentajeOxigeno + "%");
        System.out.println("Porcentaje de dióxido de carbono: " + porcentajeDioxidoCarbono + "%");
        System.out.println("Porcentaje de vapor de agua: " + porcentajeVaporAgua + "%");
    }
}
    

