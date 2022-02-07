package facturacion;

import java.util.ArrayList;

public class facturacion {

	private ArrayList<factura> ListadoFacturas = new ArrayList<factura>();
	private ArrayList<producto> ListadoProductos = new ArrayList<producto>();
	private ArrayList<cliente> Listaclientes = new ArrayList<cliente>();
	private almacen Almacen = new almacen();

	facturacion() {

	}

	public ArrayList<factura> getListadoFacturas() {
		return ListadoFacturas;
	}

	public void setListadoFacturas(ArrayList<factura> listadoFacturas) {
		ListadoFacturas = listadoFacturas;
	}

	public ArrayList<producto> getListadoProductos() {
		return ListadoProductos;
	}

	public void setListadoProductos(ArrayList<producto> listadoProductos) {
		ListadoProductos = listadoProductos;
	}

	public ArrayList<cliente> getListaclientes() {
		return Listaclientes;
	}

	public void setListaclientes(ArrayList<cliente> listaclientes) {
		Listaclientes = listaclientes;
	}

	public almacen getAlmacen() {
		return Almacen;
	}

	public void setAlmacen(almacen almacen) {
		Almacen = almacen;
	}

	public boolean existeCliente(String comprobar) {
		boolean salir = false;
		boolean aux = false;
		boolean existe = false;
		for (int i = 0; i < Listaclientes.size(); i++) {
			aux = Listaclientes.get(i).equals(comprobar);
			if (aux == true) {
				i = Listaclientes.size();
				existe = true;
			}
		}
		if (existe == true) {
			salir = true;
		}
		return salir;

	}

	public boolean existeProducto(producto comprobar) {
		boolean salir = false;
		boolean aux = false;
		for (int i = 0; i < ListadoProductos.size(); i++) {
			aux = ListadoProductos.get(i).equals(comprobar);
			if (aux == true) {
				i = ListadoProductos.size();
			}
		}
		boolean existe = aux;
		if (existe == true) {
			salir = true;
		}
		return salir;

	}

	public String añadirCliente(String dNI, String nombre, String apellidos, int telefono) {
		String salir = null;
		cliente AUX = new cliente(dNI, nombre, apellidos, telefono);
		boolean comprobar = existeCliente(dNI);
		if (comprobar == true) {
			salir = "El cliente indicado ya forma parte de nuestra Base de clientes por lo que no es necesario añadirlo";
		} else {
			salir = "El " + AUX.toString() + "se ha añadido la base de clientes";
			Listaclientes.add(AUX);
		}

		return salir;
	}

	public String añadirProducto(String nombre, double precio) {
		String salir = null;
		producto AUX = new producto(nombre, precio);
		boolean comprobar = existeProducto(AUX);
		if (comprobar == true) {
			salir = "El producto indicado ya forma parte de nuestra Base de productos por lo que no es necesario añadirlo";
		} else {
			salir = "El " + AUX.toString() + "se ha añadido la base de productos";
			ListadoProductos.add(AUX);
			Almacen.añadirAlmacen(AUX);
		}

		return salir;
	}

	public String addStockProductos(String nombre, int suma) {
		String salir = null;
		boolean aux = false;
		boolean existe = false;
		int posicion = 0;
		producto AUX = new producto(nombre, 0);
		for (int i = 0; i < ListadoProductos.size(); i++) {
			aux = ListadoProductos.get(i).equals(AUX);
			if (aux == true) {
				existe = true;
				posicion = i;
			}
		}
		if (existe == true) {
			Almacen.addproductoAStock(posicion, suma);
			salir = "se han añadido " + suma;
		} else {
			salir = "El producto indicado no existe";
		}
		return salir;
	}

	public String imprimirProductos() {
		String salida2 = Almacen.imprimirStock();

		return salida2;
	}

	public boolean suficienteStock(String producto) {
		boolean salir = false;
		boolean aux = false;
		boolean existe = false;
		int posicion = 0;
		producto AUX = new producto(producto, 0);
		for (int i = 0; i < ListadoProductos.size(); i++) {
			aux = ListadoProductos.get(i).equals(AUX);
			if (aux == true) {
				existe = true;
				posicion = i;
			}

		}
		return salir;
	}

	public int posicion(String producto) {

		boolean aux = false;

		int posicion = 0;
		producto AUX = new producto(producto, 0);
		for (int i = 0; i < ListadoProductos.size(); i++) {
			aux = ListadoProductos.get(i).equals(AUX);
			if (aux == true) {
				posicion = i;
			}

		}
		return posicion;

	}

	public int posicionCliente(String producto) {
		boolean aux = false;
		int posicion = 0;
		producto AUX = new producto(producto, 0);
		for (int i = 0; i < ListadoProductos.size(); i++) {
			aux = ListadoProductos.get(i).equals(AUX);
			if (aux == true) {

				posicion = i;
			}

		}
		return posicion;

	}

	public String generarNuevopedido(String DNI, String producto, int cantidad) {
		String Salir = " ";
		// producto AUX = new producto(producto, 0);
		// boolean revicionP = existeProducto(AUX);
		boolean revisionC = existeCliente(DNI);
		int puesto = posicionCliente(DNI);
		int puestoProducto = posicion(producto);
		if (revisionC == true) {
			if (revisionC == true) {
				if (Almacen.suficienteStock(producto, cantidad) == true) {
					Salir = Listaclientes.get(puesto).nuevoPedido(ListadoProductos.get(puestoProducto), cantidad);
					Almacen.restarStock(puesto, cantidad);
				} else {
					Salir = "Stock insuficiente";
				}

			} else {
				Salir = "El Producto indicado no existe";
			}

		} else {
			Salir = "El DNI indicado no correspode a ningun cliente";
		}

		return Salir;
	}

	public boolean facturaEstado(int puesto) {
		boolean salir = true;
		if (Listaclientes.get(puesto).revisarEstadoFac() == false) {
			return false;
		}

		return salir;
	}

	public String añadirfacturacliente(String DNI) {
		String salir = " ";
		boolean revisionC = existeCliente(DNI);
		int puesto = posicionCliente(DNI);

		if (revisionC == true) {
			factura AUX = new factura(Listaclientes.get(puesto));
			Listaclientes.get(puesto).añadirfactura(AUX);
			salir = "La factura se ha generado con numero: " + AUX.getNfac();
			AUX.añadirpedidofac(Listaclientes.get(puesto).getListapedidos());
			ListadoFacturas.add(AUX);
			
		} else {
			salir = "Cliente indicado erroneo revise los datos";
		}

		return salir;
	}

	public void borrarPedidos(String DNI) {
		int puesto = posicionCliente(DNI);
		Listaclientes.get(puesto).borrarPedidos();
	}

	public boolean existefac(String comprobar) {
		boolean salir = false;
		boolean aux = false;
		for (int i = 0; i < ListadoFacturas.size(); i++) {
			aux = ListadoFacturas.get(i).getNfac().equals(comprobar);
			if (aux == true) {
				i = ListadoProductos.size();
			}
		}
		boolean existe = aux;
		if (existe == true) {
			salir = true;
		}
		return salir;

	}

	public int posicionfac(String comprobar) {
		boolean salir = false;
		boolean aux = false;
		boolean existe = false;
		int posicion = 0;
		for (int i = 0; i < ListadoFacturas.size(); i++) {
			aux = ListadoFacturas.get(i).getNfac().equals(comprobar);
			if (aux == true) {
				existe = true;
				posicion = i;
			}

		}
		return posicion;

	}

	public String imprimirfactura(String factura) {
		String salir = " ";
		boolean revisionfac = existeCliente(factura);
		int puesto = posicionfac(factura);
		if (revisionfac == true) {
			salir = ListadoFacturas.get(puesto).dibujarfactura();
		} else {
			salir = "factura no encontrada";
		}

		return salir;
	}

	public String imprimirFacCliente(String DNI) {
		String salir = " ";
		boolean revisionC = existeCliente(DNI);
		int puesto = posicionCliente(DNI);

		if (revisionC == true) {
			salir = Listaclientes.get(puesto).imprimirFacCliente();

		} else {
			salir = "Cliente indicado erroneo revise los datos";
		}

		return salir;
	}

}
