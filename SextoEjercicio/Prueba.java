/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SextoEjercicio;

/**
 *
 * @author macbookair
 */
public class Prueba {
    // Clase de prueba
public class PruebaProductos {
    public static void main(String[] args) {
        // Creación de productos frescos
        ProductoFresco[] productosFrescos = {
            new ProductoFresco("2023-12-31", "L123", "2023-01-01", "España"),
            new ProductoFresco("2023-11-30", "L456", "2023-01-15", "Italia")
        };

        // Creación de productos refrigerados
        ProductoRefrigerado[] productosRefrigerados = {
            new ProductoRefrigerado("2023-08-31", "L789", "12345", "2023-01-10", 4.0, "Francia"),
            new ProductoRefrigerado("2023-09-15", "L012", "12346", "2023-01-12", 5.0, "Alemania"),
            new ProductoRefrigerado("2023-10-05", "L345", "12347", "2023-01-15", 3.5, "Portugal")
        };

        // Creación de productos congelados
        ProductoCongelado[] productosCongelados = {
            new ProductoCongeladoPorAgua("2024-01-01", "L678", "2023-01-20", "Suecia", -18, 5.0),
            new ProductoCongeladoPorAgua("2024-02-15", "L901", "2023-01-22", "Noruega", -15, 6.0),
            new ProductoCongeladoPorAire("2024-03-10", "L234", "2023-01-25", "Finlandia", -20, 78.0, 21.0, 0.04, 0.02),
            new ProductoCongeladoPorAire("2024-04-20", "L567", "2023-01-28", "Dinamarca", -22, 78.5, 20.5, 0.03, 0.01),
            new ProductoCongeladoPorNitrogeno("2024-05-30", "L890", "2023-01-30", "Islandia", -30, "Método X", 120)
        };

        // Mostrar información de productos frescos
        System.out.println("Productos Frescos:");
        for (ProductoFresco producto : productosFrescos) {
            producto.mostrarInformacion();
            System.out.println();
        }

        // Mostrar información de productos refrigerados
        System.out.println("Productos Refrigerados:");
        for (ProductoRefrigerado producto : productosRefrigerados) {
            producto.mostrarInformacion();
            System.out.println();
        }

        // Mostrar información de productos congelados
        System.out.println("Productos Congelados:");
        for (ProductoCongelado producto : productosCongelados) {
            producto.mostrarInformacion();
            System.out.println();
        }
    }
}

    
}
