package POP.Momento3;

import java.security.PrivateKey;

public class Ascensor {
    // Atributos ascensor
    private int id;
    private int pisoActual;
    private String direccion;
    private boolean enMovimiento;
    private int totalPisos;

    // Constante para el maximo de solicitudes
    private static final int MAX_SOLICITUDES = 10;

    /*  Arreglos
    //  Composición: el Ascensor posee estos arreglos
    */
    private Boton[] botones;
    private Piso[] pisos;
    private Puerta[] puertas;

    // Arreglo de solicitudes pendientes con contador manual
    private int[] solicitudes;
    private int cantSolicitudes; // cuántas solicitudes hay actualmente

    // Constructor
    public Ascensor(int id, int totalPisos) {
        this.id = id;
        this.totalPisos = totalPisos;
        this.pisoActual = 1;
        this.direccion = "DETENIDO";
        this.enMovimiento = false;
        this.cantSolicitudes = 0;
        this.solicitudes = new int[MAX_SOLICITUDES];

        // crear pisos
        pisos = new Piso[totalPisos];
        for (int i = 0; i < totalPisos; i++) {
            pisos[i] = new Piso(i + 1, "Piso " + (i + 1));
        }
        // Crear botones internos
        // Un BotonAscensor por cada piso + 3 BotonPuerta (abrir/cerrar/mantener)
        int totalBotones = totalPisos + 3;
        botones = new Boton[totalBotones];
        for (int i = 0; i < totalPisos; i++) {
            botones[i] = new BotonAscensor(i + 1, i + 1, id);
        }
        botones[totalPisos] = new BotonPuerta(100, "ABRIR");
        botones[totalPisos + 1] = new BotonPuerta(101, "CERRAR");
        botones[totalPisos + 2] = new BotonPuerta(102, "MANTENER");

        // Crear puertas
        // Una PuertaAscensor (cabina) + una PuertaPiso por cada piso
        puertas = new Puerta[totalPisos + 1];
        puertas[0] = new PuertaAscensor();
        for (int i = 0; i < totalPisos; i++) {
            puertas[i + 1] = new PuertaPiso(i + 1);
        }
    }

}
