/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NovenoEjercicio;

/**
 *
 * @author macbookair
 */
public class Adosado extends Vivienda {
    
    private int numPlantas;

    public Adosado(String calle, int superficieEnMetros, int numPlantas) {
        super(calle, superficieEnMetros);
        this.numPlantas = numPlantas;
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio(); 
    }

    public int getNumPlantas() {
        return numPlantas;
    }
}
    

