package facturacion;

import java.util.ArrayList;

public class cliente {

	private String DNI;
	private String nombre;
	private String apellidos;
	private int telefono;
	private double descuento = 10;
	private ArrayList<factura> ListadoFacturas = new ArrayList<factura>();
	private ArrayList<pedido> Listapedidos = new ArrayList<pedido>();

	public ArrayList<factura> getListadoFacturas() {
		return ListadoFacturas;
	}

	public void setListadoFacturas(ArrayList<factura> listadoFacturas) {
		ListadoFacturas = listadoFacturas;
	}

	public ArrayList<pedido> getListapedidos() {
		return Listapedidos;
	}

	public void setListapedidos(ArrayList<pedido> listapedidos) {
		Listapedidos = listapedidos;
	}

	public cliente(String dNI, String nombre, String apellidos, int telefono) {
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public boolean equals(String dni) {
		if (DNI == null) {
			if (dni != null)
				return false;
		} else if (!DNI.equals(dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "cliente  con DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono;
	}

	public String nuevoPedido(producto producto, int cantidad) {
		pedido nuevo = new pedido();
		Listapedidos.add(nuevo);
		Listapedidos.get(Listapedidos.size() - 1).añadirProductoPedido(producto, cantidad);
		String salir = "Se ha realizado correctamente el pedido";
		return salir;
	}

	public void añadirfactura(factura entra) {
		ListadoFacturas.add(entra);
	}

	public String imprimirFacCliente() {
		String salida = " ";

		for (int i = 0; i < ListadoFacturas.size(); i++) {
			salida = salida + (ListadoFacturas.get(i).dibujarfactura() + "/n");
		}

		return salida;
	}

	public boolean revisarEstadoFac() {
		boolean salida = false;
		if (ListadoFacturas.get(0) != null) {

			for (int i = 0; i < ListadoFacturas.size(); i++) {

				if (ListadoFacturas.get(i).isEstado().equals("Pendiente")) {
					return true;
				}
			}
		}

		return salida;
	}
	public void borrarPedidos() {
		Listapedidos.clear();
	}


}
