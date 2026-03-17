public class EjecutarReservaHotel {

    public static void main(String[] args) {

        ReservaHotel r1 = new ReservaHotel("Carlos Perez", "10/06/2026", "15/06/2026", 101);
        ReservaHotel r2 = new ReservaHotel("Maria Lopez", "12/06/2026", "14/06/2026", 205);

        r1.nuevaReserva();
        r1.consultarReserva();

        System.out.println();

        r2.nuevaReserva();
        r2.consultarReserva();

        System.out.println();

        r1.cancelarReserva();
        r1.consultarReserva();
    }
}