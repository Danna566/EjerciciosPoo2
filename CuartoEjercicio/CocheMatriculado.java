/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuartoEjercicio;

/**
 *
 * @author macbookair
 */
public class CocheMatriculado extends Coche {
  
    private int anioMatriculacion;
    private int mesMatriculacion;
    private double impuestoMatriculacion;

    // Constructor
    public CocheMatriculado(String marca, String color, double precio, double factorContaminacion, int anio,
                            String matricula, String dniTitular, int anioMatriculacion, int mesMatriculacion) {
        super(marca, color, precio, factorContaminacion, anio);
        setMatricula(matricula);
        setDniTitular(dniTitular);
        this.anioMatriculacion = anioMatriculacion;
        this.mesMatriculacion = mesMatriculacion;
        calculaImpuestoMatriculacion();
    }

    // Método para calcular el impuesto de matriculación
    public void calculaImpuestoMatriculacion() {
        impuestoMatriculacion = getPrecio() / 20;
        if ((2023 - getAnio()) > 10) { // Suponiendo que el año actual es 2023
            impuestoMatriculacion += 100; // Recargo de 100 euros si tiene más de 10 años
        }
    }

    // Métodos de acceso
    public double getImpuestoMatriculacion() {
        return impuestoMatriculacion;
    }

    public void setImpuestoMatriculacion() {
        calculaImpuestoMatriculacion();
    }
}
    

