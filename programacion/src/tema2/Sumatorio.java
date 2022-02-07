package tema2;
import java.util.Scanner;
public class Sumatorio {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero entero: ");
		int Numero = s.nextInt();
		int Sumatorio = 0;
		int Contador = Numero;
				
		while (Contador != 0) {
				   
		  Sumatorio = Sumatorio + Contador;
		  Contador--;
		  
		}
				
		System.out.println("El sumatorio de " + Numero + " es " + Sumatorio);
	}
}
