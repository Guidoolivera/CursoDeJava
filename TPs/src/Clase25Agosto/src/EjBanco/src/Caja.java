public class Caja {


    public void depositar(Cliente cliente, double monto){
        if (monto > 0) {
            cliente.aumentar(monto);
            System.out.println("Deposito realizado\n" + "Saldo actual: " + cliente.getSaldo() + "\n");
        }
    }

    public void extraer(Cliente cliente, double monto){
      if(cliente.getSaldo() >= monto){
          cliente.descontar(monto);
          System.out.println("Extracción exitosa\n" + "Su saldo es de: " + cliente.getSaldo() + "\n");

      }
    }

}
