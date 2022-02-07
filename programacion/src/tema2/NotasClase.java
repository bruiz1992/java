package tema2;

import java.util.Scanner;

public class NotasClase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean salir = true;
		String nombre;
		double practica = 0D, problemas = 0D, teoria = 0D;

		
		Double media = 0D;
		while (salir == true) {
			System.out.print("Por favor, dime como te llamas: ");
			nombre = s.next();

			System.out.print("Por favor, indique la nota de la parte practica:  ");
			practica = s.nextDouble();
			System.out.println("");
			if (0 > practica || practica > 10) {
				System.out.print("la nota introduciada tiene un numero erroneo debe estar entre 0 y 10");
			}
			System.out.print("Por favor, indique la nota de la parte sobre problemas:  ");
			problemas = s.nextDouble();
			System.out.println("");
			if (0 >= problemas || problemas > 10) {
				System.out.print("la nota introduciada tiene un numero erroneo debe estar entre 0 y 10");
			}
			System.out.print("Por favor, indique la nota de la parte de teoria:  ");
			teoria = s.nextDouble();
			System.out.println("");
			if (0 >= teoria || teoria > 10) {
				System.out.print("la nota introduciada tiene un numero erroneo debe estar entre 0 y 10");
			}
			media = (practica * 0.10) + (problemas * 0.4) + (teoria * 0.5);
			if (0 <= media || media < 10) {
				
				salir = false;
			}
			System.out.print("la nota de " + nombre + " es " + media);
		}
	}
}
