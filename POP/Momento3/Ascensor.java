package POP.Momento3;

import java.security.PrivateKey;

public class Ascensor {
    //Atributos ascensor
    private int id;
    private int pisoActual;
    private String direccion;
    private boolean enMovimiento;
    private int totalPisos;
    
    //Constante para el maximo de solicitudes
    private static final int MAX_SOLICITUDES=10;

    //Arreglos
    // Composición: el Ascensor posee estos arreglos
    private Boton[]  botones;
    private Piso[]   pisos;
    private Puerta[] puertas;

    // Arreglo de solicitudes pendientes con contador manual
    private int[] solicitudes;
    private int   cantSolicitudes; // cuántas solicitudes hay actualmente




}
