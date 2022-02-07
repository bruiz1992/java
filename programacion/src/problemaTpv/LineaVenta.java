package problemaTpv;

public class LineaVenta {
  private int cantidad;
  private Producto producto;

  public LineaVenta(Producto producto, int cantidad) {
    this.producto = producto;
    this.cantidad = cantidad;
  }

  public Dinero getSubtotal() {
    Dinero precio = producto.getPrecio();
    precio.multiply(cantidad);
    return precio;
  }
}