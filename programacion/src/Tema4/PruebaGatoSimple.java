/**
* PruebaGatoSimple.java
* Programa que prueba la clase GatoSimple
*/

package Tema4;

public class PruebaGatoSimple {

	public static void main(String[] args) {

			// Creamos un PRIMER gato
			System.out.println("\n\nCreamos un PRIMER gato - Garfield ");
			GatoSimple garfield = new GatoSimple();

			System.out.println("\t CARLOS DICE: hola gatito");
			garfield.maulla();

			System.out.println("\t CARLOS DICE: toma tarta");
			garfield.come("tarta selva negra");

			System.out.println("\t CARLOS DICE: toma pescado, a ver si esto te gusta");
			garfield.come("pescado");


			// Creamos un SEGUNDO gato
			System.out.println("\n\nCreamos un SEGUNDO gato - Tom");
			GatoSimple tom = new GatoSimple("macho");

			System.out.println("\t CARLOS DICE: Tom, toma sopita de verduras");
			tom.come("sopa de verduras");


			// Creamos un TERCER gato
			System.out.println("\n\nCreamos un TERCER gato - Lisa");
			GatoSimple lisa = new GatoSimple("hembra");

			System.out.println("\n\t CARLOS DICE: Gatitos, a ver como maullais");
			garfield.maulla();
			tom.maulla();
			lisa.maulla();

			System.out.println("\n \t CARLOS DICE: Gatitos, a ver como luchais");
			garfield.peleaCon(lisa);
			lisa.peleaCon(tom);
			tom.peleaCon(garfield);
	}
}