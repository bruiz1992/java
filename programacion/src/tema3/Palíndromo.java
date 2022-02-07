package tema3;

import java.util.Scanner;


public class Palíndromo {
	public static String Palin(String dato1)  {
		String palindromo = dato1;
		String resultado = null;
		int NCarac = palindromo.length();
		boolean salir = true;
		while (salir == true) {
			int principio = 0;
			int ultimo = NCarac - 1;
			while (salir == true) {

				while (ultimo != 0) {
					char caracter = palindromo.charAt(principio);
					char caracter2 = palindromo.charAt(ultimo);
					salir = false;
					if (caracter == caracter2) {

						principio++;
						ultimo--;
					} else {

						ultimo = 0;
					}

				}
				if (principio == (NCarac-1)) {
					resultado = "es un palindromo";
					System.out.println("es un palindromo");
				} else {
					resultado = "No es un palindromo";
					System.out.println("No es un palindromo");
				}
			}
		}

	
	return resultado;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor escriba un palindromo");
		String palindromo = entrada.nextLine();

		String AAb = Palin(palindromo); 

	}





}
