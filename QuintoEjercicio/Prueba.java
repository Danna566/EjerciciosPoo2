/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuintoEjercicio;

/**
 *
 * @author macbookair
 */
public class Prueba {
    
    public static void main(String[] args) {
        // Array de 3 camiones
        Camion[] camiones = new Camion[3];
        camiones[0] = new Camion(20000, "Mercedes", 15, 4);
        camiones[1] = new Camion(30000, "Volvo", 20, 6);
        camiones[2] = new Camion(25000, "MAN", 18, 5);

        // Mostrar el precio de venta de todos los camiones
        for (Camion camion : camiones) {
            System.out.println("Camión " + camion.marca + " precio de venta: " + camion.precioVenta());
        }

        // Array de 2 furgonetas
        Furgoneta[] furgonetas = new Furgoneta[2];
        furgonetas[0] = new Furgoneta(15000, "Renault", 12);
        furgonetas[1] = new Furgoneta(18000, "Ford", 8);

        // Mostrar el precio de venta de todas las furgonetas
        for (Furgoneta furgoneta : furgonetas) {
            System.out.println("Furgoneta " + furgoneta.marca + " precio de venta: " + furgoneta.precioVenta());
        }
    }
}

