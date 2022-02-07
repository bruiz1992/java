package MaquinaVending;

import java.util.*;

import Tema5.Tenis.Jugador;

public class MaquinaPrincipal {

	ArrayList<Producto> ProductosActuales = new ArrayList<Producto>();
	private Monedero monederoMaquina = new Monedero();
	private Deposito deposito = new Deposito();

	public MaquinaPrincipal() {

	}

	public ArrayList<Producto> getProductosActuales() {
		return ProductosActuales;
	}

	public void setProductosActuales(ArrayList<Producto> productosActuales) {
		ProductosActuales = productosActuales;
	}

	public Deposito getDeposito() {
		return deposito;
	}

	public void setDeposito(Deposito deposito) {
		this.deposito = deposito;
	}

	public Monedero getMonederoMaquina() {
		return monederoMaquina;
	}

	public void setMonederoMaquina(Monedero monederoMaquina) {
		this.monederoMaquina = monederoMaquina;
	}

	public void añadirProducto(Producto entra) {
		ProductosActuales.add(entra);

	}
	
	public int sumarImportes() {

		int Total = 0;
		for (int i = 0; i < ProductosActuales.size(); i++) {

			int importe = ProductosActuales.get(i).getPrecio();
			Total = importe + Total;
		}
		return Total;

	}

	public String imprimirProductos() {
		String salida2 = "";

		for (int i = 0; i < ProductosActuales.size(); i++) {

			String salida = ProductosActuales.get(i).toString();
			salida2 = salida2 + salida;
		}

		return salida2;
	}

	public String nombreProducto(int codigo) {

		String salida = ProductosActuales.get(codigo).getNombre();
		return salida;
	}
	//permite revisar
   public boolean MonedaRevisada(int valor) {
	  boolean salir = false;
	   Moneda aux = new Moneda(valor);
	   if (aux.existeMoneda(valor) == true) {
		   salir = true;
	   }
	   
	   
	   return salir;
	   
   }
	// este metodo inidca si existe un producto con el codigo indicado
	public boolean existeProducto(int codigo) {
		Producto AUX = new Producto(codigo, " ", 10, 50);
		boolean salir = false;
		boolean existe = ProductosActuales.contains(AUX);
		if (existe == true) {
			salir = true;
		}
		return salir;

	}
	// este metodo inidca si la maquina dispone de stock del producto con el codigo
	// indicado

	// este metodo nos permite restar un producto llamando al metodo restarProducto;
	public void restarProductoDeMaquina(int codigo) {
		ProductosActuales.get(codigo).restarProducto();
	}

	// salida = 0 significa que aunque exista el producto falta importe por
	// introducir
	// salida = 1 significa que la moneda no existe
	// salida = 2 operacion realizada correctamente
	//salida = 3 significa que no es posible dar cmbio por lo que se devuelven todas las monedas.
	public int ComprarProducto(int codigo, int valor) {
		int salida = 100;
		int valorproducto = ProductosActuales.get(codigo).getPrecio();
		Moneda comprobar = new Moneda(valor);
		comprobar.setValor(comprobar.transformarMoneda(valor));
		if (comprobar.existeMoneda(valor) == false) {
			salida = 1;
		} else if (comprobar.existeMoneda(valor) == true) {
			deposito.añadirMonedaDeposito(comprobar);
			boolean comprobarCambio = monederoMaquina.haycambio( (deposito.sumarDeposito()- valorproducto) );
			if (deposito.sumarDeposito() < valorproducto) {
				salida = 0;}
			
			else if (comprobarCambio == false) {
				salida = 3;
			}
			else if (deposito.sumarDeposito() >= valorproducto ) {
				ProductosActuales.get(codigo).restarProducto();
				salida = 2;
			}
		}

		return salida;
	}

//devuelve un string del array de monedas
	public String mostrarMonedas() {
		String salida2 = "";
		
		for (int i = 0; i < 5; i++) {

			String salida = monederoMaquina.MostrarLinea(i);
			salida2 = salida2 + salida;
		}

		return salida2;

	}

//añade monedas dentro del array
	public void añadirMonedas(int valor, int cantidad) {
		if (valor == 1) {
			valor = 100;
		}
		if (valor == 2) {
			valor = 200;
		} else {

			Moneda aux = new Moneda(valor);
			for (int i = cantidad; i != 0; i--) {
				monederoMaquina.añadirMoneda(aux);
			}
		}

	}

//añade tantos productos como se indique en la cantidad
	public void reponerProducto(int codigo, int cantidad) {
		for (int i = cantidad; i != 0; i--) {
			ProductosActuales.get(codigo).sumarProducto();
		}
	}
	
	public boolean suficienteStock(int codigo) {
		boolean salir = false;
		if (ProductosActuales.get(codigo).haystock() == true) {
			salir = true;
		} else {
			return salir;
		}
		return salir;

	}

	public void añadirDepositoAMonederoMaquina() {
		for (int i = 0; i < deposito.getMonedasdepositadas().size(); i++) {
			Moneda aux = deposito.MonedaDeposito(i);
			;
			monederoMaquina.añadirMoneda(aux);

		}

		deposito.vaciarDeposito();

	}
	//
	public String cambios(int codigo) {
		int valorproducto = ProductosActuales.get(codigo - 1).getPrecio();
		int Totaldeposito = deposito.sumarDeposito();
		boolean comprobarcambio = monederoMaquina.haycambio(Totaldeposito - valorproducto);
		String salir = "";
		if (comprobarcambio == false) {
			salir = salir + "sentimos no poder proporcionarle todo cambio" + "\n";

		} else {
			salir = salir + monederoMaquina.CalcularCambio(valorproducto, Totaldeposito);
		}
		return salir;

	}
	public void borrardeposito() {
		deposito.vaciarDeposito();
	}
	
	

}
