public class Usuario {

    // atributos
    // Crea una clase Usuario con username y seguidores (int).
    String username;
    int seguidores;

    // El constructor debe recibir el username e inicializar seguidores en 0.
    public Usuario(String username) {
        this.username = username;
        this.seguidores = 0; // inicia en 0
    }

    // Crea un m´etodo nuevoSeguidor() que incremente el contador en 1 cada vez que
    // se llame.
    public void nuevoSeguidor() {
        seguidores++;
    }

    public void mostrarInfo() {
        System.out.println("Usuario " + username + " Seguidores " + seguidores);
    }

}
