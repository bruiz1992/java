package tema2;

import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a = 0, b = 0, c = 0, D = 0;
		int diferencia, contador = 0, suma = 0;
		boolean salir = true;
		System.out.print("Por favor, introduce dos numeros enteros: ");
		a = (entrada.nextInt());
		b = (entrada.nextInt());
		diferencia = b - a;
		while (salir == true) {
			if (a <= b) {

				while (diferencia != contador) {
					
				salir = false;
				c = a % 2;
				if (c == 0) {

				} else {
					System.out.println(" " + a + " + ");

					suma = suma + a;
					
				}
				a++;
				contador++;
				salir = false;

			}}

		}

		System.out.print("=" + suma + "  ");
	}

}
