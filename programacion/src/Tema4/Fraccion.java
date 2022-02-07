
package Tema4;

public class Fraccion {

	int numerador;
	int denominador;

	Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public int getnumerador() {
		return this.numerador;
	}

	public int getdenominador() {
		return this.denominador;
	}

	public void setnumerador(int numerador2) {
		this.numerador = numerador2;
	}

	public void setdenominador(int denominador2) {
		this.denominador = denominador2;
	}

	public String toString() {
		String imprime = getnumerador() + "/" + getdenominador();

		return imprime;

	}

	public Fraccion inversa() {
		Fraccion nombre = new Fraccion(getdenominador(), getnumerador());
		return nombre;

	}

	public Fraccion suma(Fraccion b) {

		Fraccion c = new Fraccion(numerador, denominador);

		c.numerador = (numerador * b.denominador) + (denominador * b.numerador);

		c.denominador = denominador * b.denominador;

		return c;
	}

	Fraccion restar(Fraccion b) {
		Fraccion c = new Fraccion(2, 2);
		c.numerador = (numerador * b.denominador - b.numerador * denominador);
		c.denominador = denominador * b.denominador;
		return c;
	}

	Fraccion multiplicarentero(int a) {
		Fraccion c = new Fraccion(1, 1);
		c.numerador = numerador * a;
		c.denominador = denominador * 1;
		return c;
	}

	Fraccion multiplicar(Fraccion b) {

		Fraccion c = new Fraccion(0, 0);
		c.numerador = numerador * b.numerador;
		c.denominador = denominador * b.denominador;
		return c;
	}

	public Fraccion dividir(Fraccion b) {
		return new Fraccion(numerador * b.denominador, denominador * b.numerador);
	}

	public Fraccion dividirentero(int b) {
		return new Fraccion(numerador * 1, denominador * b);
	}

	public boolean equals(Fraccion b, Fraccion a) {
		boolean salir = true;

		a = a.simplificar();
		b = b.simplificar();
		if (a.denominador == b.denominador && a.numerador == b.numerador) {
			salir = true;
		} else {
			salir = false;
		}
		return salir;

	}

	private int mcd() {

		int num = numerador, den = denominador;

		if (num == 0) {
			return 1;
		} else {

			if (num < 0) {
				num = num * -1;
			}

			if (den < 0) {
				den = den * -1;
			}

			if (den > num) {
				int aux = num;
				num = den;
				den = aux;
			}

			int mcd = 1;

			while (den != 0) {

				mcd = den;
				den = num % den;
				num = mcd;

			}

			return mcd;
		}
	}

	public Fraccion simplificar() {

		int mcd = mcd();

		numerador = numerador / mcd;
		denominador = denominador / mcd;

		if (numerador < 0 && denominador < 0) {

			numerador = numerador * -1;
			denominador = denominador * -1;

		} else if (numerador >= 0 && denominador < 0) {

			numerador = numerador * -1;
			denominador = denominador * -1;

		}
		Fraccion resultado = new Fraccion(numerador, denominador);
		return resultado;

	}
}
