package tema3;

import java.util.Scanner;

public class ConversorBinarioDecimal_Benjamin_Ruiz {

	// pasar de binario a decimal
	static int DeBaD(int dato1) {
		long numero = dato1, digito, decimal;
		int exponente;
		exponente = 0;
		decimal = 0;
		while (numero != 0) {
			digito = numero % 10;
			decimal = decimal + digito * (int) Math.pow(2, exponente);
			exponente++;
			numero = numero / 10;
		
		}

		return (int) decimal;
	}

	static int DeDaB(int dato1) {
		int numero = dato1, digito, binario = 0;
		int contador = 0;
		int exponente = 0;

		while (dato1 != contador) {
			digito = numero % 2;
			binario = binario + digito * (int) Math.pow(10, exponente);
			exponente++;
			numero = numero / 2;
			contador++;
		}

		
		return binario;

	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		boolean salir = false;
		int opcion = 0;

		while (salir == false) {
			System.out.println("OPCIONES DE MENU");
			System.out.println("	1. pasar de binario a decimal");
			System.out.println("	2. pasar de decimal a binario ");
			System.out.println("	3. Salir. ");
			System.out.println("	Introduce tu opcion: ");
			opcion = entrada.nextInt();

			if (opcion == 3) {
				salir = true;
			} else if (opcion == 1) {
				System.out.println("Elegiste pasar de binario a decimal ");
				System.out.println("introduzca un numero binario solo con 0 y 1");
				int a = entrada.nextInt();
				int resultado = DeBaD(a);
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("Decimal: " + resultado + " ");
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			} else if (opcion == 2) {
				System.out.println("Elegiste pasar de decimal a binario");
				System.out.println("introduzca un numero decimal positivo");
				int a = entrada.nextInt();
				int resultado = DeDaB(a);
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("Decimal: " + resultado + " ");
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

			}
			System.out.println("hasta pronto");

		}
	}

}
