package tema3;

import java.lang.StringIndexOutOfBoundsException;
import java.util.Scanner;

public class ExcepcionesCadenas_Ruiz_Benjamin {

	public static void main(String[] args) {

		boolean salir = true;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor escriba una cadena de carateres");
		String cadena = entrada.nextLine();
		int Ncarac = cadena.length();
		while (salir == true) {
			try {
				System.out.println("Por favor indique un numero entero para saber que caracter es en la cadena anterior");
				int numero = entrada.nextInt();
				char caracter = cadena.charAt(numero);
				System.out.println(caracter);

			} catch (StringIndexOutOfBoundsException ex) {
				System.out.println("No seas tontico y por un numero mas pequeño");
			}
		}

	}

}
