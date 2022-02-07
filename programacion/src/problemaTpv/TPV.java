package problemaTpv;

public class TPV {
  private CatalogoProductos catalogo;
  private Venta venta;

  public TPV(CatalogoProductos cp) {
    catalogo = cp;
  }

  public void crearNuevaVenta() {
    venta = new Venta();
  }

  public void finalizarVenta() {
    venta.completar();
  }

  public void introducirItem(int id, int cant) {
    Producto p = catalogo.getProducto(id);
    venta.crearLineaVenta(p, cant);
  }

  public void realizarPago(Dinero cantidad) {
    venta.crearPago(cantidad);
  }
}