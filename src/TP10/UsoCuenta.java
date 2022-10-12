package TP10;

public class UsoCuenta {
    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente(10000, "Guido Olivera");
        CuentaCorriente cuenta2 = new CuentaCorriente(3000, "Juan Perez");

        cuenta1.getDatosDeLaCuenta();
        cuenta2.getDatosDeLaCuenta();

        cuenta1.transferir(2500, cuenta2);

        cuenta1.getDatosDeLaCuenta();
        cuenta2.getDatosDeLaCuenta();
    }
}
