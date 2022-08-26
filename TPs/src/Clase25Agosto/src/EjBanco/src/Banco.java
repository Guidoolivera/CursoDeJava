import java.util.Arrays;

public class Banco {
	// write your code here
    private Caja caja;
    private Cliente clientes[];

    public Banco(Cliente clientela[]){
        this.clientes = clientela;
    }
    public String toString(){
        return "Banco{\n" + "Clientes =\n" + Arrays.toString(clientes);
    }
}


