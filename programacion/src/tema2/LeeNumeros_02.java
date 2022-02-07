package tema2;
import java.util.Scanner;
public class LeeNumeros_02 {

	public static void main(String[] args) {

		String linea;
		Scanner entrada = new Scanner (System.in);
		
		// Recogida de informacion: PRIMER NUMERO
		System.out.print("Por favor, introduce un numero: ");
		linea = entrada.next();
		int primerNumero;
		primerNumero = Integer.parseInt( linea );

		// Recogida de informacion: SEGUNDO NUMERO
		System.out.print("introduce otro, por favor: ");
		linea = entrada.next();
		int segundoNumero;
		segundoNumero = Integer.parseInt( linea );



		// PROCESAMIENTO DE DATOS
		int total;
		total = (2 * primerNumero) + segundoNumero;



		// PRESENTACIÓN DE INFORMACIÓN POR PANTALLA

		System.out.print("El primer numero introducido es " + primerNumero);
		System.out.println(" y el segundo es " + segundoNumero);
		System.out.print("El doble del primer numero mas el segundo es ");
		System.out.print(total);
	}
}