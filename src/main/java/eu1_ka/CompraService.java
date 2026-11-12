package eu1_ka;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.ApplicationPath;

@ApplicationScoped 
public class CompraService {


     public void realizar(Compra compra ){

        System.out.println("Pedido realizado paa el cliente: " + compra.getCliente());
        System.out.println("Codigo." + compra.getCodigo());
        System.out.println("Producto: " + compra.getProducto());
        System.out.println("Total : " + compra.getTotal());
        System.out.println("Cliente: " + compra.getCliente());


     }


}

