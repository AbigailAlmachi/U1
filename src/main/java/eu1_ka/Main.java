package eu1_ka;


import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication{
 
    @Inject
    private PedidoService pedidoService;

    @Inject 
    private CompraService compraService;
 
    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }
 
    @Override
    public int run(String... args) {        
        System.out.println("Iniciando Aplicacion quarkus");
 
        System.out.println("Realizando Compra....");
        Compra compra = new Compra("Abigail", "Laptop", "P001", 1000.0, Cliente.VIP);
        System.out.println(compra);
    
        Compra compra1 = new Compra("Juan", "Mouse", "P002", 100.0, Cliente.NORMAL);

        Compra compra2 = new Compra("Luis", "Teclado", "P003", 200.0, Cliente.VIP);

        System.out.println("1722_ka");
        return 0;
    }
 
}
