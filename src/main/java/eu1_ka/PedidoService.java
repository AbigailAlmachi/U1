package eu1_ka;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class PedidoService {
    
    public void realizar(Pedido pedido ){


        System.out.println("Pedido realizado paa el cliente: " + pedido.getCliente());
        System.out.println("Nombre: " + pedido.getNombre());
        System.out.println("Apellido "+ pedido.getApellido());
        System.out.println("Codigo:" + pedido.getCodigo());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Valor:" + pedido.getValor());
        System.out.println("Cliente:" + pedido.getCliente());

    

     }
}





