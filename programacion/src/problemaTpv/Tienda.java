package problemaTpv;

public class Tienda {
  private CatalogoProductos catalogoProductos;
  private TPV tpv;

  public Tienda(CatalogoProductos catalogoProductos, TPV tpv){
    this.catalogoProductos = catalogoProductos;
    this.tpv = tpv;
  }

  public TPV getTPV() {
    return tpv;
  }


  public CatalogoProductos getCatalogoProductos() {
    return catalogoProductos;
  }
}