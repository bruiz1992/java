package tema2;

/*
 * Utilizando la clase Scanner en lugar de la System.
 */


import java.util.Scanner;

public class LeerDatosConScanner_A_03 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Introduce tu nombre: ");
		String nombre = s.nextLine();

		System.out.print("Introduce tu edad: ");
		int edad = Integer.parseInt(s.nextLine());
		// int edad = s.nextInt();
		System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);

	}
}