/*
*Objetivo: Desarrollar una clase ReservaHotel que permita gestionar las reservas
*en un hotel. 
*La clase debe incluir atributos como el nombre del cliente, fecha
*de entrada, fecha de salida, y numero de habitacion. 
*Implementar metodos para crear una nueva reserva, cancelar una reserva y consultar 
*la informacion de la reserva.
*
* • Crear la clase ReservaHotel con los atributos correspondientes.
* • Implementar los metodos nuevaReserva(), cancelarReserva() y consultarReserva().
* • Crear varios objetos ReservaHotel y simular el proceso de gestion de reservas en un hotel.
*/
public class ReservaHotel {
    // atributos
    private String nombreCliente;
    private String fechaEntrada;
    private String fechaSalida;
    private int numeroHabitacion;
    private boolean reservada;

    public ReservaHotel(String nombreCliente, String fechaEntrada, String fechaSalida, int numeroHabitacion) {

        this.nombreCliente = nombreCliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaEntrada;
        this.numeroHabitacion = numeroHabitacion;
        this.reservada = true;
    }

    // METODOS

    public void nuevaReserva() {
        if (reservada) {
            reservada = false;
            System.out.println("Reserva creada para " + nombreCliente);
        } else {
            System.out.println("La habitacion no esta reservada");
        }
    }

    public void cancelarReserva() {
        if (!reservada) {
            reservada = true;
            System.out.println("Reserva cancelada para " + nombreCliente);
        } else {
            System.out.println("No hay reserva para cancelar");
        }
    }

    public void consultarReserva() {

        System.out.println("HOTEL POO UCC");
        System.out.println("Nombre del Cliente: " + nombreCliente);
        System.out.println("Habitación: " + numeroHabitacion);
        System.out.println("Fecha entrada: " + fechaEntrada);
        System.out.println("Fecha salida: " + fechaSalida);
        System.out.println("Habitación reservada: " + (reservada ? "Sí" : "No"));

    }
}
