package Ejercicio11_cuentaAhorros;

public class Main {
    public static void main(String[] args) {
        CuentaAhorros cuenta = new CuentaAhorros("CA-0001", 10000.0, 24.0);
        System.out.println("Cuenta " + cuenta.getNumeroCuenta() + " - Tasa anual: " + cuenta.getTasaInteresAnual() + "%");
        System.out.println("Saldo inicial: $" + cuenta.getSaldo());

        cuenta.depositar(5000.0);
        System.out.println("Saldo tras depositar $5000.0: $" + cuenta.getSaldo());

        cuenta.aplicarInteresMensual();
        System.out.println("Saldo tras aplicar el interés mensual: $" + cuenta.getSaldo());

        if (!cuenta.retirar(50000.0)) {
            System.out.println("No se pudo retirar $50000.0: fondos insuficientes.");
        }
    }
}
