package tema2;
import java.util.Scanner;

public class EjercicioIfElse {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String linea;
		var s = new Scanner (System.in);
		
		// Recogida de informacion: PRIMER NUMERO
		System.out.print("Por favor, introduce un numero: ");
		linea = s.next();
		int primerNumero;
		primerNumero = Integer.parseInt( linea );
		Scanner b = new Scanner (System.in);
		// Recogida de informacion: SEGUNDO NUMERO
		System.out.print("introduce otro, por favor: ");
		linea = b.next();
		int segundoNumero;
		segundoNumero = Integer.parseInt( linea );



		// PROCESAMIENTO DE DATOS
		if (primerNumero > segundoNumero) {
			System.out.print("El numero " + primerNumero + " es mayor que" + segundoNumero);
		}
		else {
			System.out.print("El numero " + segundoNumero + " es mayor que " + primerNumero);
		}





	}
}
