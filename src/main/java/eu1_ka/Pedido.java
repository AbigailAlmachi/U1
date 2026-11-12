package eu1_ka;

public class Pedido {
    String nombre;
    String apellido;
    String codigo;
    String producto;
    double valor;
    Cliente cliente;


    public Pedido(String nombre, String apellido, String codigo, String producto, double valor, Cliente cliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.producto = producto;
        this.valor = valor;
        this.cliente = cliente;
    }


    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public String getCodigo() {
        return codigo;
    }


    public String getProducto() {
        return producto;
    }


    public double getValor() {
        return valor;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public void setProducto(String producto) {
        this.producto = producto;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
}
