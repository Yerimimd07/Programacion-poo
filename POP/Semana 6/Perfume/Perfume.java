/*Objetivo: Implementar una clase Perfume que represente un perfume con
*atributos como nombre, marca, capacidad (en mililitros), y precio. 
*Crear metodos para aplicar el perfume (reducir la cantidad disponible), 
*consultar la cantidad restante y ajustar el precio.
*• Definir la clase Perfume con atributos como nombre, marca, capacidad, y precio.
*• Implementar los metodos aplicarPerfume(double cantidad), consultarCantidadRestante()
*y ajustarPrecio(double nuevoPrecio).
*• Crear objetos Perfume y simular el uso del perfume y ajustes en el precio.
*/

public class Perfume {
    // atributis
    private String nombre;
    private String marca;
    private double capacidad;
    private double precio;

    public Perfume(String nombre, String marca, double capacidad, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public void aplicarPerfume(double cantidad) {
        if (cantidad <= capacidad) {
            capacidad -= cantidad;
            System.out.println("Se aplicaron " + cantidad + " ml de perfume.");
        } else {
            System.out.println("No hay suficiente perfume.");
        }
    }

    public void consultarCantidadRestante() {
        System.out.println("Cantidad restante: " + capacidad + " ml");
    }

     public void ajustarPrecio(double nuevoPrecio) {
        precio = nuevoPrecio;
        System.out.println("El nuevo precio es: $" + precio);
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Capacidad: " + capacidad + " ml");
        System.out.println("Precio: $" + precio);
    }

}
