package tema2;
import java.util.Scanner;
public class ParOImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		
		System.out.print("Por favor, introduce un numero entero: ");
		int numero = (entrada.nextInt());
		 
		int a = numero % 2;
		if (a == 0) {
			System.out.print("El numero " + numero + " es par");
			}
		else {
			System.out.print("El numero " + numero + " es impar");
		}

	
	
	
	}

}
