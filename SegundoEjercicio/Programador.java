/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundoEjercicio;

/**
 *
 * @author macbookair
 */
public class Programador extends Empleados{

    private int lineasdecodigoporhora;
   private String lenguajedominante;
public Programador(String nombre, int dni, int edad, boolean casado, double salario, int lineasdecodigoporhora,
        String lenguajedominante) {
    super(nombre, dni, edad, casado, salario);
    this.lineasdecodigoporhora = lineasdecodigoporhora;
    this.lenguajedominante = lenguajedominante;
}
public Programador() {
}

public double calculaSalario(){
    return (10*lineasdecodigoporhora);
}
public int getLineasdecodigoporhora() {
    return lineasdecodigoporhora;
}
public void setLineasdecodigoporhora(int lineasdecodigoporhora) {
    this.lineasdecodigoporhora = lineasdecodigoporhora;
}
public String getLenguajedominante() {
    return lenguajedominante;
}
public void setLenguajedominante(String lenguajedominante) {
    this.lenguajedominante = lenguajedominante;
}


}
    

