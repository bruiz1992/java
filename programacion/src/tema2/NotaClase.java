package tema2;

import java.util.Scanner;



public class NotaClase {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.print("Por favor, introduce el numero de su nota ");
		int numero = (entrada.nextInt());
		
		if (numero <5) {
			System.out.print("Tu nota es un suspenso");
			}
		else if (numero == 5) {
			System.out.print("Tu nota es un aprobado");
		}
		else if (numero == 6) {
			System.out.print("Tu nota es un bien ");
		}
		else if (numero <= 8) {
			System.out.print("Tu nota es un notable");
		}
		else if (numero >= 9) {
			System.out.print("Tu nota es un sobresaliente");
		}

	}

}
