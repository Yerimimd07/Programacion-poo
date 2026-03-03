import java.util.Scanner;
//
public class Concicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // leer dos numeros y deducir si estan en orden cresinete, a <= b
        int a = 0, b = 0;
        System.out.print("Digite a: "); // solicitamos por teclado el valor de a
        a = sc.nextInt(); // campuramos el valor de a
        System.out.println();
        System.out.print("Digite b: "); // solicitamos por teclado el valor de b
        b = sc.nextInt(); // campuramos el valor de b

        if (a <= b) {
            System.out.println("Orden crecinete");
        } else {
            System.out.println("Orden decresinete");
        }

        sc.close();
    }
}
