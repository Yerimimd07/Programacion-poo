public class EjecutarLibro {

    public static void main(String[] args) {
        
        //En el main, instancia dos libros diferentes y muestra su informacion.
        Libro lib1 = new Libro( " El Principito","Antoine de Saint-Exupéry", 96);
        lib1.mostrarInfo();

        Libro lib2 = new Libro("Harry Potter"," Rowling ", 20);
        lib2.mostrarInfo();
    }
 
}
