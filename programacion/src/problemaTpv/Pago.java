package problemaTpv;

public class Pago {

  private Dinero cantidadEntregada;

  public Pago(Dinero cantidadEntregada) {
    this.cantidadEntregada = cantidadEntregada;
  }

  public Dinero getCantidadEntregada() {
    return cantidadEntregada;
  }
}