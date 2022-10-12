package TP10;

public class CuentaCorriente {
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    public CuentaCorriente(double saldo, String nombreTitular) {
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
        double numero = 10000000000000000000000.0 + (Math.random()*999999999999999999999999.0);
        this.numeroCuenta = (long) numero;
    }

    public void ingresar(double dinero){
        this.saldo += dinero;
    }

    public void reintegrar(double gastos, int porcentajeDeReintegro){
        this.saldo += (getSaldo() + gastos * (porcentajeDeReintegro / 100));
    }

    public double getSaldo() {
        return saldo;
    }

    public void getDatosDeLaCuenta(){
        System.out.println("Nombre del titular: " + this.nombreTitular);
        System.out.println("CBU: " + this.numeroCuenta);
        System.out.println("Saldo: " + this.saldo + '\n');
    }

    public void transferir(double monto, CuentaCorriente cuentaDestino){
        if (getSaldo() - monto < 0){
            System.out.println("Saldo insuficiente.");
        }
        else {
            this.saldo = (getSaldo() - monto);
            cuentaDestino.ingresar(monto);
        }
    }

}
