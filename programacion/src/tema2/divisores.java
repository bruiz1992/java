package tema2;
import java.util.Scanner;
public class divisores {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero entero: ");
		int Numero = s.nextInt();
		int Contador = 1;
		s.close();
		System.out.print("los divisores de " + Numero + " son: 1 ");		
		while (Contador != Numero) {
				   
		 
		  Contador++;
		  
		  int a = Numero % Contador;
			if (a == 0) {
				System.out.print(" " + Contador + " ");
			} else {
				
			}
		  
		 
		}
	}

}
