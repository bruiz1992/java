package tema2;

import java.util.Scanner;

public class CuentaAtras {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("introduce un numero para hacer la cuenta atras: ");

		int numerob = s.nextInt();
		int cantidad = numerob;
		int contador = 0;
		boolean salir = false;
		while (salir == false) {
			if (contador != cantidad) {
				System.out.print(" " + numerob + " ");
				contador = contador + 1;
				numerob = numerob - 1;

			} else {
				salir = true;

			}

		}

	}
}
