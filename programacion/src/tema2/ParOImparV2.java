package tema2;

import java.util.Scanner;

public class ParOImparV2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		boolean salir = false;
		System.out.print("Por favor, introduce un numero entero: ");
		int numero = (entrada.nextInt());

		while (salir == false) {
			if (numero == 0) {
				System.out.print("Por favor, introduce un numero entero que no sea 0: ");
				numero = (entrada.nextInt());
			} else {
				salir = true;
			}

		}

		int a = numero % 2;
		if (a == 0) {
			System.out.print("El numero " + numero + " es par");
		} else {
			System.out.print("El numero " + numero + " es impar");
		}

	}

}
