/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macbookair
 */
public class Triangulo extends Forma implements IFormas {
   
    private double base;
    private double altura;

    public Triangulo(String nombre, double posicionX, double posicionY, String color, double base, double altura) {
        super(nombre, posicionX, posicionY, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        double lado = Math.sqrt((base / 2) * (base / 2) + altura * altura); 
        return base + 2 * lado;
    }
}

    

