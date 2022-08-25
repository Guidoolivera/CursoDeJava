package EjBanco;

public class Cliente {


    private int nroCliente;
    private String nombre;
    private double saldo;

    public int getNroCliente() {
        return nroCliente;
    }

    public String getNombre() {
        return nombre;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(int saldo){
        this.saldo += saldo;
    }

    public Cliente (int nroCliente, String nombre, double saldo){
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.saldo = saldo;
    }



    public void extraer(int nroCliente, double monto){
        if (monto < this.saldo){

        }
    }
}
