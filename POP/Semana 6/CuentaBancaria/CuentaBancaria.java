
 /* 2. Ejercicio Practico 1: Modelado de una Clase Simple (45 minutos)
 *
 * Objetivo: Crear una clase CuentaBancaria que represente una cuenta de banco
 * con atributos como numero de cuenta, saldo y titular.
 *
 * Implementar metodos para depositar, retirar dinero y consultar el saldo.
 * • Definir la clase CuentaBancaria con los atributos mencionados.
 * • Implementar los metodos depositar(double cantidad), retirar(double
 * cantidad) y consultarSaldo().
 * • Crear instancias de la clase CuentaBancaria y realizar operaciones de
 * deposito, retiro y consulta de saldo.
 * Resultado Esperado: Los estudiantes deben ser capaces de crear instancias de
 * la clase y manipular sus atributos mediante m´etodos espec´ıficos, reflejando
 * operaciones bancarias comunes.
 */
public class CuentaBancaria {
    // atributos
    private String numeroCuenta;
    private String titular;
    private double saldo;

    // metodos para depositar, retirar dinero y consultar el saldo.

    // Constructor

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Metodo para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
            System.out.println("Deposito realizado: " + cantidad);
        } else {
            System.out.println("La cantidad debe ser mayor a 0");
        }
    }

    // Metodo para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo = saldo - cantidad;
            System.out.println("Retiro realizado: " + cantidad);
        } else {
            System.out.println("Fondos insuficientes o cantidad invalida");
        }
    }

    // Metodo para consultar saldo
    public double consultarSaldo() {
        return saldo;
    }

    // Metodo para mostrar informacion de la cuenta
    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: " + saldo);
    }

}

