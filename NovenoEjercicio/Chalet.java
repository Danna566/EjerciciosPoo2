/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NovenoEjercicio;

/**
 *
 * @author macbookair
 */
public class Chalet extends Vivienda {
    
    private int numParcela;
    private boolean conPiscina;

    public Chalet(String calle, int superficieEnMetros, int numParcela, boolean conPiscina) {
        super(calle, superficieEnMetros);
        this.numParcela = numParcela;
        this.conPiscina = conPiscina;
    }

    @Override
    public double calcularPrecio() {
        return superficieEnMetros * 1300;
    }

    public int getNumParcela() {
        return numParcela;
    }

    public boolean isConPiscina() {
        return conPiscina;
    }
}
    

