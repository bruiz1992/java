package tema2;

import java.util.Scanner;

public class Multiplicacion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduce dos numeros enteros: ");
		int numeroa = s.nextInt();
		int numerob = s.nextInt();
		
		int cantidad = numerob;
		int contador = 1;
		boolean salir = false;
		while (salir == false) {
			if (contador != numeroa) {
				numerob = numerob + cantidad;
				contador = contador + 1;
			} else {
				salir = true;

			}

		}
		System.out.print("El resultado es " + numerob);
		
	}
}
