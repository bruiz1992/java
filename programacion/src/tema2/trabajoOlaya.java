package tema2;

import java.util.Scanner;

public class trabajoOlaya {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		int numero2;
		System.out.print("Por favor, introduce dos numeros enteros: ");
		numero = (entrada.nextInt());
		numero2 = (entrada.nextInt());
		while (numero < numero2) {
			System.out.print("Por favor, introduce dos numeros enteros: ");
			numero = (entrada.nextInt());
			numero2 = (entrada.nextInt());
		}
		System.out.print("El segundo numero es mayor");
	}
}
