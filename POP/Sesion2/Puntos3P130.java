public class Puntos3P130 {
    public static void main(String[] args) {
        double a = 2, b = 5, c = 3, d = 6, x = 1, y = 7, z = 3, res34, res35, res36;
        /*
         * 3.4 Evaluar la siguiente expresión para A = 2 y B = 5:
         * 3 * A - 4 * B / A ^ 2
         */
        res34 = 3 * a - 4 * b / Math.pow(a, 2);
        System.out.println("El resultado del punto 3.4 es: " + res34);

        /*
         * Evaluar la siguiente expresion
         * 4 / 2 * 3 / 6 + 6 / 2 / 1 / 5 ^ 2 / 4 * 2
         */
        res35 = 4 / 2 * 3 / 6 + 6 / 2 / 1 / Math.pow(5, 2) / 4 * 2;
        System.out.println("El resultado del punto 3.5 es: " + res35);

    }
}
