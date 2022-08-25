package EjBanco;

public class Caja {


    public void depositar(Cliente cliente, double monto){
        cliente.setSaldo(cliente.getSaldo() + monto);
    }

    public void retirar (Cliente cliente, double monto){
        cliente.setSaldo(cliente.getSaldo() - monto);
        System.out.println("Saldo actual: " +  cliente.getSaldo());
    }
}
