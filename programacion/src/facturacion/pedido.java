package facturacion;

import java.util.ArrayList;



public class pedido {

	private ArrayList<producto> ProductosActuales = new ArrayList<producto>();
	private int cantidad;
	private double total;
	public pedido() {
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double d) {
		this.total = d;
	}
	public ArrayList<producto> getProductosActuales() {
		return ProductosActuales;
	}
	public void setProductosActuales(ArrayList<producto> productosActuales) {
		ProductosActuales = productosActuales;
	}

	
	public void añadirProductoPedido(producto AUX, int cantidad) {
		ProductosActuales.add(AUX);
		setCantidad(cantidad);
	}
	public double calcularLinea() {
		double salida = 0;
		
		for(int i = 0; i < ProductosActuales.size();i++) {
			salida = salida + (getCantidad() * ProductosActuales.get(i).getPrecio());  
		}
 
		return salida;
	}

	

	public String toString() {
		setTotal(calcularLinea());
		return "nombre producto=" + ProductosActuales.get(0).getNombre() +"\t"+ ", cantidad=" + cantidad + "," +"\t"+ 
		"Precio: " + ProductosActuales.get(0).getPrecio() +"\t"+   "total: " + total + "\n";
	}
	
	
	
	
}
