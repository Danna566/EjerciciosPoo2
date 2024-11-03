/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NovenoEjercicio;

/**
 *
 * @author macbookair
 */
public class Piso extends Vivienda {
  
    private int planta;
    private int puerta;

    public Piso(String calle, int superficieEnMetros, int planta, int puerta) {
        super(calle, superficieEnMetros);
        this.planta = planta;
        this.puerta = puerta;
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio(); 
    }

    public int getPlanta() {
        return planta;
    }

    public int getPuerta() {
        return puerta;
    }
}
    

