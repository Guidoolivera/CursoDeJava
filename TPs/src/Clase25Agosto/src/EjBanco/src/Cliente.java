public class Cliente {


    private int nroCliente;
    private String nombre;
    private double saldo;

    public Cliente (int nroCliente, String nombre, double saldo){
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente){
        this.nroCliente = nroCliente;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double monto){
        this.saldo += monto;
    }

    public void descontar(double monto){
        this.saldo -= monto;
    }
    public void aumentar(double saldo){
        this.saldo =+ saldo;
    }

    public String toString(){
        return "Nombre: " + this.nombre + "\nN° Cliente: " + this.nroCliente + "\nSaldo: " + saldo;
    }
}


