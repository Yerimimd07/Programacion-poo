public class Sensor {
    // Crea una clase Sensor con un atributo temperatura (double) y ubicacion
    // (String).

    // Atributos
    double temperatura;
    String ubicacion;

    public Sensor(String ubicacion) {
        this.ubicacion = ubicacion;
        this.temperatura = 25.0;
    }

    // Crea un metodo ajustar(double nuevaTemp).
    public void ajustar(double nuevaTemp) {
        temperatura = nuevaTemp;
    }

    /*
     * Crea un metodo verificarAlerta() que imprima ”¡ALERTA en [ubicacion]!”si la
     * temperatura supera los 45,0.
     */
    public void verificarAlerta() {
        if (temperatura > 45.0) {
            System.out.println("¡ALERTA en " + ubicacion + "!");
        } else {
            System.out.println("Temperatura normal en " + ubicacion);
        }

    }

}
