package tema2;

import java.util.Scanner;

public class PrimoCercano {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero para saber si es primo ");
		int numero = s.nextInt();
		s.close();

		int contador = 2;
		int contadorb = 2;
		int contadorc = 2;
		int a = numero % contador;
		int numerob = numero;
		int numeroc = numero;
		boolean salir = true;
		boolean salir1 = true;
		
		int c = numeroc % contadorc;
		int b = numerob % contadorb;
		while (salir == true) {
			if (a == 0) {
				System.out.print("el numero " + numero + " no es primo");
				while (salir1 == false) {
				if (b == 0) {
					
					numerob++;
				}
				
				else if (contadorb == b){
					System.out.print("el numero " + numero + " es primo mas cercano");
					
					salir = false;
					salir1 = false;
					
				}
				contadorb++;
				if (c == 0) {
					
					numeroc--;
				}
				
				else if (contadorc == c){
					System.out.print("el numero " + numero + " es primo");
					salir1 = false;
					salir = false;
					
				}
				contadorc++;
				
				
			}}
			
			else if (contador == numero) {
				System.out.print("el numero " + numero + " es primo");
				salir = false;
			}
			contador++;
		}
	}

}
