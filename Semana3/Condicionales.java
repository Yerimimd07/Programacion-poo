package Semana3;
import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        if (a <= b) {
            System.out.println("Orden Cresiente: ");
         } else {
                System.out.println("Orden Decreciente: ");
        }
        sc.close();
    }
    
}
