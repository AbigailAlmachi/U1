package eu1_ka;

public class Compra {

    private String Cliente;
    private String codigo;
    private String Producto;
    private double Total;
    private Cliente cliente;

 
    public Compra(String cliente, String codigo, String producto, double total, eu1_ka.Cliente cliente2) {
        Cliente = cliente;
        this.codigo = codigo;
        Producto = producto;
        Total = total;
        cliente = cliente;
    }

    public String getCliente() {
        return Cliente;
    }


    public String getCodigo() {
        return codigo;
    }


    public String getProducto() {
        return Producto;
    }


    public double getTotal() {
        return Total;
    }


    public void setCliente(String cliente) {
        Cliente = cliente;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public void setProducto(String producto) {
        Producto = producto;
    }


    public void setTotal(double total) {
        Total = total;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
