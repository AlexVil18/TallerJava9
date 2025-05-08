import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private String nombreCliente;
    private double total;
    private List<String> productos = new ArrayList<>();

    public Pedido() {
        this.total = 0.0;
    }

    public Pedido(int numeroPedido, String nombreCliente, double total) {
        this.numeroPedido = numeroPedido;
        this.nombreCliente = nombreCliente;
        this.total = total;
    }

    public void agregarProducto(String producto, double precio) {
        if (precio > 0) {
            productos.add(producto);
            total += precio;
            System.out.println("Producto agregado: " + producto + " - Precio: $" + precio);
        } else {
            System.out.println("Error: El precio del producto debe ser positivo");
        }
    }

    public void calcularDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            double descuento = (total * porcentaje) / 100;
            total -= descuento;
            System.out.println("Descuento del " + porcentaje + "% aplicado. Descuento: $" + descuento);
        } else {
            System.out.println("Error: El porcentaje de descuento debe estar entre 0 y 100");
        }
    }

    public void mostrarPedido() {
        System.out.println("Número de pedido: " + numeroPedido);
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Productos:");
        for (String producto : productos) {
            System.out.println("- " + producto);
        }
        System.out.println("Total: $" + String.format("%.2f", total));
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getTotal() {
        return total;
    }

    public List<String> getProductos() {
        return productos;
    }
}
