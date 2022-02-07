package MaquinaVending;

import java.util.ArrayList;
import java.util.Arrays;

import Tema4.Colegio.Alumno;

public class Monedero {
	private Moneda valorMoneda[] = new Moneda[5];
	private int cantidaMoneda[] = new int[5];
	//contructor predefinido con las monedas sus posiciones y la cantidad de cada uno.
	public Monedero() {

		int E2 = 4;
		int E1 = 3;
		int C50 = 2;
		int C20 = 1;
		int C10 = 0;

		this.cantidaMoneda[C10] = 40;
		this.cantidaMoneda[C20] = 40;
		this.cantidaMoneda[C50] = 40;
		this.cantidaMoneda[E1] = 40;
		this.cantidaMoneda[E2] = 40;

		this.valorMoneda[C10] = new Moneda(10);
		this.valorMoneda[C20] = new Moneda(20);
		this.valorMoneda[C50] = new Moneda(50);
		this.valorMoneda[E1] = new Moneda(100);
		this.valorMoneda[E2] = new Moneda(200);

	}
	
	public Moneda[] getValorMoneda() {
		return valorMoneda;
	}

	public void setValorMoneda(Moneda[] valorMoneda) {
		this.valorMoneda = valorMoneda;
	}

	public int[] getCantidaMoneda() {
		return cantidaMoneda;
	}

	public void setCantidaMoneda(int[] cantidaMoneda) {
		this.cantidaMoneda = cantidaMoneda;
	}

		//comprueba si la moneda existe
		//si la moneda es de 1 o 2 la convierte con transforma moneda
		//despues revisando los valores las suma al atributo cantidad de moneda
	public void añadirMoneda(Moneda entra) {

		if (entra.existeMoneda(entra.getValor()) == true) {
			entra.setValor(entra.transformarMoneda(entra.getValor()));
			if (entra.getValor() == valorMoneda[0].getValor()) {
				cantidaMoneda[0]++;

			} else if (entra.getValor() == valorMoneda[1].getValor()) {
				cantidaMoneda[1]++;

			} else if (entra.getValor() == valorMoneda[2].getValor()) {
				cantidaMoneda[2]++;

			} else if (entra.getValor() == valorMoneda[3].getValor()) {
				cantidaMoneda[3]++;

			} else if (entra.getValor() == valorMoneda[4].getValor()) {
				cantidaMoneda[4]++;

			}
		}

	}
	//entra un entero con el total de la diferencia s comprueba que no es posible 
	//va moneda por moneda comprobando si es posible crear el importe de la diferencia
	//compara con la variable total sumando monedas de menos a mas hasta llegar a la diferencia si no llega 
	//devuelve un false
	public boolean haycambio(int diferencia) {
		boolean salir = true;
		int total = 0;
		while (diferencia != total) {
			if (cantidaMoneda[0] > 0 && valorMoneda[0].getValor() <= (diferencia - total)) {
				total = total + valorMoneda[0].getValor();
			} else if (cantidaMoneda[1] > 0 && valorMoneda[1].getValor() <= (diferencia - total)) {
				total = total + valorMoneda[1].getValor();
			} else if (cantidaMoneda[2] > 0 && valorMoneda[2].getValor() <= (diferencia - total)) {
				total = total + valorMoneda[2].getValor();
			} else if (cantidaMoneda[3] > 0 && valorMoneda[3].getValor() <= (diferencia - total)) {
				total = total + valorMoneda[3].getValor();
			}else if (diferencia != total) {
				salir = false;
				diferencia = total;
				
			}

		}
		return salir;
	}
	//simplemente comprueba si la diferencia es mayor que la moneda
	//si es mayor lo resta y vuelve a empezar hasta que el importe llegue a cero
	//cada vez que suma una moneda lo añade a un array que tras pasar por maquinaprincipal se puede imprimir
	public String CalcularCambio(int valorproducto, int Totaldeposito) {
		int diferencia = Totaldeposito - valorproducto;
		String salida = "";
		String salida2 = "";

		while (diferencia != 0) {

			if (diferencia >= valorMoneda[4].getValor() && cantidaMoneda[4] > 0) {
				cantidaMoneda[4]--;
				salida = "se devuelve una Moneda de 2€" + "\n";
				diferencia = diferencia - valorMoneda[4].getValor();

			} else if (diferencia >= valorMoneda[3].getValor() && cantidaMoneda[3] > 0) {
				cantidaMoneda[3]--;
				salida = "se devuelve una Moneda de 1€" + "\n";
				diferencia = diferencia - valorMoneda[3].getValor();

			} else if (diferencia >= valorMoneda[2].getValor() && cantidaMoneda[2] > 0) {
				cantidaMoneda[2]--;
				salida = "se devuelve una Moneda de 50cent" + "\n";
				diferencia = diferencia - valorMoneda[2].getValor();

			} else if (diferencia >= valorMoneda[1].getValor() && cantidaMoneda[1] > 0) {
				cantidaMoneda[1]--;
				salida = "se devuelve una Moneda de 20cent" + "\n";
				diferencia = diferencia - valorMoneda[1].getValor();

			} else if (diferencia >= valorMoneda[0].getValor() && cantidaMoneda[0] > 0) {
				cantidaMoneda[0]--;
				salida = "se devuelve una Moneda de 10cent" + "\n";
				diferencia = diferencia - valorMoneda[0].getValor();

			}
			salida2 = salida2 + salida;
		}

		return salida2;
	}
	//muestra linea que se solicite convertida en un string
	public String MostrarLinea(int i) {
		String salir;
		salir = "valorMoneda= " + valorMoneda[i].getValor() + " Cent" + ", cantidaMoneda= " + cantidaMoneda[i] + "\n";
		return salir;
	}

}
