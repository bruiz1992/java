package tema2;
import java.util.Scanner;
public class primo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un numero para saber si es primo ");
		int numero = s.nextInt();
		s.close();
		
		int contador = 2 ;
		int a = numero % contador; 
		boolean salir = true;
		while (salir == true) {
			if (a == 0) {
				System.out.print("el numero "+ numero +" no es primo");
				salir = false;
			}
			
			else if (contador == numero){
				System.out.print("el numero " + numero + " es primo");
				salir = false;
			}
			contador++;
	}
	}

}
