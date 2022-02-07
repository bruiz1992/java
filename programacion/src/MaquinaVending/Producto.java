package MaquinaVending;

public class Producto {
	private int idproducto;
	private String nombre;
	private int precio;
	private int stock;

	public Producto(int idproducto, String nombre, int precio, int stock) {
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;

	}

	public Producto(String nombre, int precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;

	}

	public Producto(int idproducto) {
		this.idproducto = idproducto;
	}

	public Producto(int codigo, Object nombre2, Object object, Object object2) {

	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean equals(Object obj) {
		Producto other = (Producto) obj;
		if (idproducto == other.idproducto)
			return true;
		else {
			return false;
		}
	}

	public String toString() {
		return idproducto + " " + nombre + " " + "\t" + precio + " " + "\t" + stock + "\t" + " Unidades" + "\n";
	}

	// resta uno del stock total del producto;
	public void restarProducto() {
		stock--;
	}

	public void sumarProducto() {
		stock++;
	}

	// este metodo inidca si la maquina dispone de stock del producto
	public boolean haystock() {

		if (stock <= 0)
			return false;
		else {
			return true;
		}
	}

}
