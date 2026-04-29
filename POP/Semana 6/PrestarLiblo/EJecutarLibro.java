public class EJecutarLibro {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", "978-84-204-7183-9", 496);
        Libro libro2 = new Libro("Don Quijote", "Miguel de Cervantes", "978-84-204-1214-6", 1344);

        libro1.mostrarInformacion();
        libro1.prestar();
        System.out.println("Disponible: " + (libro1.estaDisponible() ? "Sí" : "No"));

        System.out.println();

        libro2.mostrarInformacion();
        libro2.prestar();
        libro2.devolver();
        System.out.println("Disponible: " + (libro2.estaDisponible() ? "Sí" : "No"));
    }
}
