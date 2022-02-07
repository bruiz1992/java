package MaquinaVending;

import java.util.ArrayList;

public class Deposito {

	ArrayList<Moneda> monedasdepositadas = new ArrayList<Moneda>();

	public void setMonedasdepositadas(ArrayList<Moneda> monedasdepositadas) {
		this.monedasdepositadas = monedasdepositadas;
	}

	public ArrayList<Moneda> getMonedasdepositadas() {
		return monedasdepositadas;
	}

	// Metodo que primero comprueba si el valor establecido es el de una moneda, La
	// mete en arraylist

	public int revisarMoneda(int valor, int valorproducto) {
		int salir = 0;
		Moneda comprobar = new Moneda(valor);

		if (comprobar.existeMoneda(valor) == true) {
			salir = 1;
			monedasdepositadas.add(comprobar);

			if (comprobar.valorSuficiente(valor, valorproducto)) {
				salir = 2;
			}
		}

		return salir;
	}
	//recorre el arraylist sumando cada valor y dar el total acumulado
	public int sumarDeposito() {
		int salida2 = 0;

		for (int i = 0; i < monedasdepositadas.size(); i++) {

			int salida = monedasdepositadas.get(i).getValor();
			salida2 = salida2 + salida;
		}

		return salida2;
	}
	//añade objeto moneda al deposito
	public void añadirMonedaDeposito(Moneda entra) {
		monedasdepositadas.add(entra);
	}
	//indica que moneda hay en una posicion concreta 
	public Moneda MonedaDeposito(int i) {
		Moneda salida = monedasdepositadas.get(i);
		return salida;

	}
	
	//borra todos los objetos de un arraylist
	public void vaciarDeposito() {
		monedasdepositadas.clear();
	}

}
