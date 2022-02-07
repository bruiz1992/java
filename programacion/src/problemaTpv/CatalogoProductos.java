package problemaTpv;

import java.util.ArrayList;
import java.util.List;

public class CatalogoProductos {
  private List<Producto> productos = new ArrayList();

  public CatalogoProductos() {
    int id1 = 100;
    int id2 = 200;
    Dinero precio1 = new Dinero(3);
    Dinero precio2 = new Dinero(5);

    Producto producto1;
    producto1 = new Producto(id1, precio1, "producto 1");
    productos.add(id1, producto1);

    Producto producto2;
    producto2 = new Producto(id2, precio2, "producto 2");
    productos.add(id2, producto2);
  }


  public Producto getProducto(int id) {
    return (Producto) productos.get(id);
  }
}