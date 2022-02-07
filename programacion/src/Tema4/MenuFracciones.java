package Tema4;

import java.util.Scanner;

public class MenuFracciones {
	public static Fraccion NuevaFraccion() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("indique el numero de la Fraccion");
		String fraccion2 = entrada.nextLine();
		String denominador2, numerador2;
		int centro = (fraccion2.indexOf('/'));
		numerador2 = fraccion2.substring(0, centro);
		denominador2 = fraccion2.substring((centro + 1), fraccion2.length());
		int denominador = Integer.parseInt(denominador2);
		int numerador = Integer.parseInt(numerador2);
		Fraccion fraccion = new Fraccion(numerador, denominador);
		return fraccion;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean salir = false;
		int opcion = 0;

		while (salir == false) {
			System.out.println("OPCIONES DE MENUS");
			System.out.println("	1.Leer fraccion ");
			System.out.println("	2. Invertir fraccion ");
			System.out.println("	3. multiplica fraccion ");
			System.out.println("	4. divide fraccion");
			System.out.println("	5. simplifica fraccion");
			System.out.println("	6. Equivalente");
			System.out.println("	7. suma de fracciones");
			System.out.println("	8. resta de fracciones");
			System.out.println("	9. divide fraccion por entero");
			System.out.println("	10 multiplica fraccion por entero");
			System.out.println("	11. Salir. ");
			System.out.println("	Introduce tu opcion: ");
			opcion = entrada.nextInt();

			if (opcion == 9) {
				salir = true;
			} else if (opcion == 1) {
				System.out.println("Elegiste ** Leer fraccion ** ");
				Fraccion fraccion = NuevaFraccion();
				System.out.println(fraccion.toString());
			} else if (opcion == 2) {
				System.out.println("Elegiste ** Invertir fraccion ** ");
				Fraccion fraccion = NuevaFraccion();
				System.out.println(fraccion.inversa());
			} else if (opcion == 3) {
				System.out.println("Elegiste ** multiplica fraccion ** ");
				Fraccion fraccion = NuevaFraccion();
				Fraccion fraccion2 = NuevaFraccion();
				System.out.println(fraccion.multiplicar(fraccion2));
			} else if (opcion == 4) {
				System.out.println("Elegiste ** divide fraccion ** ");
				Fraccion fraccion = NuevaFraccion();
				Fraccion fraccion2 = NuevaFraccion();
				System.out.println(fraccion.dividir(fraccion));
			} else if (opcion == 5) {
				System.out.println("Elegiste ** simplifica fraccion ** ");
				Fraccion fraccion = NuevaFraccion();
				System.out.println(fraccion.simplificar());
			} else if (opcion == 6) {
				System.out.println("Elegiste ** Equivalente ** ");
				Fraccion fraccion = NuevaFraccion();
				Fraccion fraccion2 = NuevaFraccion();
				Boolean bb = fraccion.equals(fraccion2, fraccion);
				if (bb == true) {
					System.out.println("Las Fracciones son equivalentes");
				}else {
					System.out.println("Las Fracciones no son equivalentes");
				}
			} else if (opcion == 7) {
				System.out.println("Elegiste ** multiplicacion fraccion por entero  ** ");
				Fraccion fraccion = NuevaFraccion();
				System.out.println("Indique el numero entero");
				int op = entrada.nextInt();
				System.out.println(fraccion.multiplicarentero(op));
			} else if (opcion == 8) {
				System.out.println("Elegiste ** divide fraccion por entero** ");
				Fraccion fraccion = NuevaFraccion();
				System.out.println("Indique el numero entero");
				int op = entrada.nextInt();
				System.out.println(fraccion.dividirentero(op));
			} else if (opcion == 9) {
				System.out.println("Elegiste ** suma de fracciones ** ");
				Fraccion fraccion = NuevaFraccion();
				Fraccion fraccion2 = NuevaFraccion();
				System.out.println(fraccion.suma(fraccion2));
			} else if (opcion == 10) {
				System.out.println("Elegiste ** resta de fracciones ** ");
				Fraccion fraccion = NuevaFraccion();
				Fraccion fraccion2 = NuevaFraccion();
				System.out.println(fraccion.restar(fraccion2));
			} else if (opcion == 11) {
				System.out.println("Elegiste ** Salir ** ");
			}

			System.out.println();

		}

	}

}
