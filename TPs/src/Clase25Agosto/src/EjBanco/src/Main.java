public class Main {

    public static void main(String[] args) {
	// write your code here
        Cliente clientes[] ={
                new Cliente(001,"Guido Olivera", 2500),
                new Cliente(002, "Juan Perez", 35990),
                new Cliente(003, "Lucas Fernandez", 1200)}
                ;
        Banco bancoDelChaco = new Banco(clientes);
        Caja caja = new Caja();

        for (Cliente cliente:clientes){
            System.out.println(cliente);
            caja.extraer(cliente, 250);
        }
        System.out.println(bancoDelChaco.toString());

         }
}
