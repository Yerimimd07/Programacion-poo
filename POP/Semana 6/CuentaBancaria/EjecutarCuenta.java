public class EjecutarCuenta {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("022325", "Yerimi Mirnada", 1000);

        cuenta1.mostrarInformacion();
        cuenta1.depositar(100);
        cuenta1.retirar(150);

        System.out.println("Saldo disponible: " + cuenta1.consultarSaldo());

        System.out.println();

        CuentaBancaria cuenta2 = new CuentaBancaria("022326", "Carlos Mirnada", 2500);

        cuenta2.mostrarInformacion();
        cuenta2.depositar(4000);
        cuenta2.retirar(1500);

        System.out.println("Saldo disponible: " + cuenta2.consultarSaldo());
    }
}
