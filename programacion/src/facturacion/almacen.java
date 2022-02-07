package facturacion;

import java.util.ArrayList;

public class almacen {
	private ArrayList<producto> ListadoProductos = new ArrayList<producto>();
	protected ArrayList<Integer> Cantidad = new ArrayList<Integer>();

	public almacen() {

	}

	public void addproductoAStock(int posicion, int cantidad) {
		Cantidad.add(posicion, cantidad);

	}
	
	public void restarStock(int posicion, int cantidad) {
		int total = Cantidad.get(posicion) - cantidad;
		Cantidad.add(posicion, total);

	}

	public void añadirAlmacen(producto AUX) {
		ListadoProductos.add(AUX);

	}

	public String imprimirStock() {
		String salida2 = "";

		for (int i = 0; i < Cantidad.size(); i++) {

			String salida = ListadoProductos.get(i).toString() + " " + Cantidad.get(i).toString() + "/n";
			salida2 = salida2 + salida;
		}

		return salida2;
	}

	public boolean suficienteStock(String producto, int cantidad) {
		boolean salir = false;
		boolean aux = false;
		int posicion = 0;
		producto AUX = new producto(producto, 0);
		for (int i = 0; i < ListadoProductos.size(); i++) {
			aux = ListadoProductos.get(i).equals(AUX);
			if (aux == true) {
				posicion = i;
			}

			if (Cantidad.get(i) >= cantidad) {
				salir = true;
			}
		}

		return salir;
	}

}
