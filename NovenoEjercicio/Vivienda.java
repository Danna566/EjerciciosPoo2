/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NovenoEjercicio;

/**
 *
 * @author macbookair
 */
public class Vivienda {
 
    protected String calle;
    protected double precio;
    protected int superficieEnMetros;

    public Vivienda(String calle, int superficieEnMetros) {
        this.calle = calle;
        this.superficieEnMetros = superficieEnMetros;
        this.precio = calcularPrecio();
    }

    public double calcularPrecio() {
        return superficieEnMetros * 1000; 
    }

    public String getCalle() {
        return calle;
    }

    public double getPrecio() {
        return precio;
    }

    public int getSuperficieEnMetros() {
        return superficieEnMetros;
    }
}
    

