
import java.util.Scanner;

public class Punto43 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
         * Los empleados de una fábrica trabajan en dos turnos: diurno y nocturno.
         * Se desea calcular el jornal diario de acuerdo con los siguientes puntos:
         * 1. La tarifa de las horas diurnas es de 5 euros.
         * 2. La tarifa de las horas nocturnas es de 8 euros
         * 3. En caso de ser domingo, la tarifa se incrementará en 2 euros el turno
         * diurno y
         * 3 euros el turno nocturno
         */

        int HoraT;
        double jornada = 0;
        String Diasemana, Turno;

        System.out.println("Ingrese el numero de horas trabajadas: ");
        HoraT = sc.nextInt();
        System.out.println("Ingrese el dia de la semana: ");
        Diasemana = sc.next();
        System.out.println("Ingrese el turno (diurno o nocturno): ");
        Turno = sc.next();

        // condicional
        if (!Diasemana.equalsIgnoreCase("domingo")
                && Turno.equalsIgnoreCase("diurno")) {

            jornada = 5 * HoraT;

        } else if (Diasemana.equalsIgnoreCase("domingo")
                && Turno.equalsIgnoreCase("diurno")) {

            jornada = (5 + 2) * HoraT;

        }

        System.out.println("La tarifa de pago es: " + jornada + " euros");

        sc.close();
    }

}
