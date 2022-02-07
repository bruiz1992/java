package tema2;

import java.util.Scanner;

public class MAXMINyMEDIA {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int sumatorio = 0;
		int min = 100;
		int max = 0;
		int media = 0;
		System.out.print("Introduce un numero ");
		int a = s.nextInt();
		int contador = 0;
		while (a != 0) {
			System.out.print("Introduce un numero ");
			a = s.nextInt();

			if (a == 0) {

				System.out.print("De los numeros introducidos el mayor es " + max + " el menor es " + min
						+ " la media es " + media);
				System.out.println();
				
			}
			if (a <= min) {
				min = a;
			}
			if (a >= max) {
				max = a;

			}
			contador++;
			sumatorio = sumatorio + a;
			media = sumatorio / contador;

		}
		s.close();
	}

}
