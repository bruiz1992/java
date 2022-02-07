package problemaTpv;

public class Producto {
  private int id;
  private Dinero precio;
  private String descripcion;

  public Producto(){}

  public Producto(int id, Dinero precio, String desc) {
    this.id = id;
    this.precio = precio;
    this.descripcion = desc;
  }

  public int getId() {
    return id;
  }

  public Dinero getPrecio() {
    return precio;
  }

  public String getDescripcion() {
    return descripcion;
  }
}