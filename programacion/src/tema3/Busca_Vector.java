package tema3;

import java.util.Scanner;

public class Busca_Vector {

	public static int[] generar_Vector(int n) {
		int[] numeros = new int[n];
		int aleatorio = (int) ((Math.random() * 10));
		for (int x = 0; x < numeros.length; x++) {
			numeros[x] = (int) (Math.random() * 10);
			System.out.print(" " + numeros[x]);
		}
		return (numeros);
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Indique el tamaño del Vector con un numero entero positivo");
		int opcion = s.nextInt();

		int[] numeros = generar_Vector(opcion);

		System.out.println("Indique el numero que desea comprobar con un numero entero positivo");
		int num = s.nextInt();
		
		int i = 0;
		int contador = 1;
		boolean salir = true;
		boolean salir1 = true;
		while (salir == true) {
			if (numeros[i] != num) {
				if (contador == numeros.length) {
					System.out.println("El numero indicado no esta dentro del vector");
					i = numeros.length - 1;
					salir = false;
				}
				contador++;
			} else {
				System.out.println("la primera posicion en la que aparece es: " + i);
				salir = false;
				i = (numeros.length - 1);
				contador = 1;
				while (salir1 == true) {
					if (numeros[i] == num) {
						salir1 = false;
						System.out.println("la ultima posicion en la que aparece es: " + i);
					} else {
						i--;
						contador++;

					}

				}

			}
			i++;

		}

	}

}
