public class EjecutarSensor {

    public static void main(String[] args) {
        
        Sensor s1 = new Sensor("Laboratorio");

        s1.verificarAlerta(); // temperatura inicial 25
        s1.ajustar(50); // cambiamos temperatura
        s1.verificarAlerta(); // ahora debe mostrar alerta

        Sensor s2 = new Sensor("Cuarto Tecnico");

        s2.verificarAlerta();
        s2.ajustar(19);
    }

}