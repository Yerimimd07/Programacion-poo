public class EjecutarLibro {

    public static void main(String[] args) {
        
        //En el main, instancia dos libros diferentes y muestra su informacion.
        Libro lib1 = new Libro("Antoine de Saint-Exupéry" , " El Principito", 96);
        lib1.mostrarInfo();

        Libro lib2 = new Libro(" Rowling ", "Harry Potter", 20);
        lib2.mostrarInfo();
    }
 
}
