package MaquinaVending;

public class Moneda {

	private int valor;

	public Moneda(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	//comprueba si el valor que ha entrado en sistema es de 1 o de 2 y lo transforma en un valor de moneda valido
	public int transformarMoneda(int entra) {
		
		if (entra == 1) {
			entra = 100;
		} else if (entra == 2) {
			entra = 200;
		}
		
		return entra;
	}
	//tras transformar las monedas de 1 y 2 comprueba si existe la moneda indicada
	public boolean existeMoneda(int valor) {
		Boolean salir = false;
		valor = transformarMoneda(valor);

		if (valor == 200) {
			salir = true;
		} else if (valor == 100) {
			salir = true;
		} else if (valor == 50) {
			salir = true;
		} else if (valor == 20) {
			salir = true;
		} else if (valor == 10) {
			salir = true;
		}

		return salir;

	}
	//un booleano que indica si la suma del valor introducido es suficiente para pagar el producto elegido
	public boolean valorSuficiente(int valor, int valorproducto) {
		boolean salir = false;
		if (valor >= valorproducto) {
			salir = true;
		}

		return salir;

	}

}
