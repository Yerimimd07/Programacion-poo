public class EjecutarPerfume {
    public static void main(String[] args) {
        
        Perfume perfume1 = new Perfume("Sauvage", "Dior", 100, 450000);
        Perfume perfume2 = new Perfume("Acqua di Gio", "Giorgio Armani", 75, 380000);

        perfume1.mostrarInformacion();
        perfume1.aplicarPerfume(20);
        perfume1.consultarCantidadRestante();
        perfume1.ajustarPrecio(420000);

        System.out.println();

        perfume2.mostrarInformacion();
        perfume2.aplicarPerfume(15);
        perfume2.consultarCantidadRestante();
        perfume2.ajustarPrecio(350000);
    }
    
}
