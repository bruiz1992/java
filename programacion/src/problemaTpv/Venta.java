package problemaTpv;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Venta {
  private List lineaVentas = new ArrayList();
  private Date fecha = new Date();
  private boolean esCompleta;
  private Pago pago;

  public Venta(){
  }

  public Dinero getDevolucion() {
    Dinero precio = pago.getCantidadEntregada();
    precio.minus(getTotal());
    return precio;
  }

  public void completar() {
    esCompleta = true;
  }

  public void crearLineaVenta(Producto p, int cant) {
    lineaVentas.add(new LineaVenta(p, cant));
  }

  public Dinero getTotal() {
    Dinero total = new Dinero();
    Iterator i = lineaVentas.iterator();
    while (i.hasNext()) {
      LineaVenta lv = (LineaVenta) i.next();
      total.add(lv.getSubtotal());
    }
    return total;
  }

  public void crearPago(Dinero cantEntregada) {
    pago = new Pago(cantEntregada);
  }
}