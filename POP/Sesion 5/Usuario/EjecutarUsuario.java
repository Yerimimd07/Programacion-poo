public class EjecutarUsuario {
    public static void main(String[] args) {
        // En el main, crea al usuario ”JavaCoderτ simula que gana 3 seguidores
        Usuario user1 = new Usuario("JavaCodert");

       for(int i = 1; i <= 3; i++){
            user1.nuevoSeguidor();

        user1.mostrarInfo();
       }

       Usuario user2 = new Usuario("Estudiante");

         user2.nuevoSeguidor();
         user2.nuevoSeguidor();
         user2.mostrarInfo();

        
    }

}
