import java.util.Scanner;

public class TallerUno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ====== PUNTO 1: CÍRCULO ======
        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("Longitud de la circunferencia: " + longitud);
        System.out.println("Área del círculo: " + area);

        // ====== PUNTO 2: SALARIO SEMANAL ======
        System.out.print("\nIngrese la tarifa por hora: ");
        double tarifaHora = sc.nextDouble();

        System.out.print("Ingrese las horas trabajadas por día: ");
        double horasDiarias = sc.nextDouble();

        double horasSemanales = horasDiarias * 5;
        double salarioSemanal = tarifaHora * horasSemanales;

        System.out.println("Salario semanal del trabajador: " + salarioSemanal);

        sc.close();
    }
}


