public class CuentaBancaria {
    private String numeroCuenta;
    private String nombreTitular;
    private double saldo;
    private String tipoCuenta;


    public CuentaBancaria() {
        this.saldo = 0.0;
    }


    public CuentaBancaria(String numeroCuenta, String nombreTitular, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = (saldo >= 0) ? saldo : 0.0;
        this.tipoCuenta = tipoCuenta;
    }


    public boolean depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto a depositar debe ser positivo");
            return false;
        }
        this.saldo += monto;
        System.out.println("Has depositado $" + monto + " en tu cuenta. Tu nuevo saldo es: $" + this.saldo);
        return true;
    }

    public boolean retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto a retirar debe ser positivo");
            return false;
        }
        if (monto > this.saldo) {
            System.out.println("Error: Saldo insuficiente. Tu saldo actual es: $" + this.saldo);
            return false;
        }
        this.saldo -= monto;
        System.out.println("Has retirado $" + monto + " de tu cuenta. Tu saldo restante es: $" + this.saldo);
        return true;
    }


    public void mostrarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + nombreTitular);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("------------------------");
    }


    public String getNumeroCuenta() { return numeroCuenta; }
    public void setNumeroCuenta(String numeroCuenta) { this.numeroCuenta = numeroCuenta; }

    public String getNombreTitular() { return nombreTitular; }
    public void setNombreTitular(String nombreTitular) { this.nombreTitular = nombreTitular; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = (saldo >= 0) ? saldo : 0.0; }

    public String getTipoCuenta() { return tipoCuenta; }
    public void setTipoCuenta(String tipoCuenta) { this.tipoCuenta = tipoCuenta; }
}
