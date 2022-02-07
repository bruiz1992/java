package tema3;

import java.util.Scanner;

public class ConversorConFunciones {
	static double hazEurosALibras(double dato1) {
		double cambio = dato1 * 0.91;
		System.out.println("El importe de " + dato1 + " euros, es un total de " + cambio + " de libras");
		return cambio;
	}

	static double hazLibrasAEuros(double dato1) {
		double cambio = dato1 * 1.11;
		System.out.println("El importe de " + dato1 + " libras, es un total de " + cambio + " de euros");
		return cambio;
	}

	static double hazEurosADolares(double dato1) {
		double cambio = dato1 * 0.91;
		System.out.println("El importe de " + dato1 + " euros, es un total de " + cambio + " de dolares");
		return cambio;
	}

	static double hazLibrasADolares(double dato1) {
		double cambio = dato1 * 1.35;
		System.out.println("El importe de " + dato1 + " libras, es un total de " + cambio + " de dolares");
		return cambio;
	}

	static double hazDolaresAEuros(double dato1) {
		double cambio = dato1 * 0.85;
		System.out.println("El importe de " + dato1 + " dolares, es un total de " + cambio + " de euros");
		return cambio;
	}

	static double hazDolaresALibras(double dato1) {
		double cambio = dato1 * 0.74;
		System.out.println("El importe de " + dato1 + " dolares, es un total de " + cambio + " de libras");
		return cambio;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		boolean salir = false;
		int opcion = 0;

		while (salir == false) {
			System.out.println("OPCIONES DE MENU");
			System.out.println("	1. pasar de euros a libras");
			System.out.println("	2. pasar de euros a dolares ");
			System.out.println("	3. pasar de libras a dolares ");
			System.out.println("	4. pasar de libras a euros");
			System.out.println("	5. pasar de dolares a libras ");
			System.out.println("	6. pasar de dolares a euros");
			System.out.println("	7. salir");
			System.out.println("	Introduce tu opcion: ");
			opcion = entrada.nextInt();

			if (opcion == 7) {
				salir = true;
			} else if (opcion == 1) {
				System.out.println("pasar de euros a libras ");
				System.out.println("introduzca el importe");
				double a = entrada.nextDouble();
				double conversor = hazEurosALibras(a);
			} else if (opcion == 2) {
				System.out.println("Elegiste pasar de euros a dolares ");
				System.out.println("introduzca el importe");
				double a = entrada.nextDouble();
				double conversor = hazEurosADolares(a);
			} else if (opcion == 3) {
				System.out.println("Elegiste pasar de libras a dolares");
				System.out.println("introduzca el importe");
				double a = entrada.nextDouble();
				double conversor = hazLibrasADolares(a);
			} else if (opcion == 4) {
				System.out.println("Elegiste pasar de libras a euros");
				System.out.println("introduzca el importe");
				double a = entrada.nextDouble();
				double conversor = hazLibrasAEuros(a);
			} else if (opcion == 5) {
				System.out.println("Elegiste pasar de dolares a libras");
				System.out.println("introduzca el importe");
				double a = entrada.nextDouble();
				double conversor = hazDolaresALibras(a);
			} else if (opcion == 6) {
				System.out.println("Elegiste pasar de dolares a euros");
				System.out.println("introduzca el importe");
				double a = entrada.nextDouble();
				double conversor = hazDolaresAEuros(a);

			}

		}
		entrada.close();

	}
}
