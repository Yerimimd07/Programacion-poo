public class Libro {

    // Atributos
    String autor;
    String titulo;
    int paginas;

    // Crea un constructor que reciba los 3 parametros para inicializar el objeto.

    public Libro(String autor, String titulo, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;

    }

    //Crea un m´etodo mostrarInfo() que imprima: ”Libro: [titulo], escrito por [autor]”.
    public void mostrarInfo(){
        System.out.println(" Libro: " + titulo + " Escrito po: " + autor);

    }

}
