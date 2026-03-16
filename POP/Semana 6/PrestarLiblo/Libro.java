/*
*Objetivo: Implementar una clase Libro que represente un libro en una biblioteca con atributos como tıtulo, autor, ISBN, y numero de paginas. 
*Crear metodos para prestar el libro, devolverlo y verificar si est´a disponible.
*• Definir la clase Libro con atributos como titulo, autor, ISBN, numeroPaginas y disponible.
*• Implementar los metodos prestar(), devolver() y estaDisponible().
*• Crear varios objetos Libro y simular el proceso de pr´estamo y devoluci´on.
*/

public class Libro {
    // atributos
    private String titulo;
    private String autor;
    private String isbn;
    private int numeropaginas;
    private boolean disponible;

    // constructor
    public Libro(String titulo, String autor, String isbn, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeropaginas = numeroPaginas;
        this.disponible = true;
    }

    // metodo prestar
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro \"" + titulo + "\" ha sido prestado.");
        } else {
            System.out.println("El libro \"" + titulo + "\" no está disponible.");
        }
    }


    // Metodo para devolver
    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
        } else {
            System.out.println("El libro \"" + titulo + "\" ya estaba disponible.");
        }
    }

    // Metodo para verificar disponibilidad
    public boolean estaDisponible() {
        return disponible;
    }

    // Metodo para mostrar informacion
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Número de páginas: " + numeropaginas);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }

}
