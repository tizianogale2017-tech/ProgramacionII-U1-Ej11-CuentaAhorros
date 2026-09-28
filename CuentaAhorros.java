package Ejercicio11_cuentaAhorros;

public class CuentaAhorros {
    private String numeroCuenta;
    private double saldo;
    private double tasaInteresAnual;

    public CuentaAhorros(String numeroCuenta, double saldo, double tasaInteresAnual) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo.");
        }
        if (tasaInteresAnual < 0) {
            throw new IllegalArgumentException("La tasa de interés no puede ser negativa.");
        }
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tasaInteresAnual = tasaInteresAnual;
    }

    public void aplicarInteresMensual() {
        saldo += saldo * (tasaInteresAnual / 12) / 100;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser mayor a cero.");
        }
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser mayor a cero.");
        }
        if (monto > saldo) {
            return false;
        }
        saldo -= monto;
        return true;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }
}
