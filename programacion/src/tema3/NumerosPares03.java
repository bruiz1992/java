/*
 * Programa que introduce en un array de tamaño 5, los cinco primeros números pares.
 * A continuación, se recorre el array y se muestran sus valores
 * 
 */

package tema3;

public class NumerosPares03 {
	
	public static void main(String[] args){

		int numerosPares[] = {2, 4, 6, 8, 10};

		int i;
		for (i = 0; i < 5; i++){
			System.out.println("Número " + numerosPares[i]);
		}
		System.out.println("\n");

		// EN EL CASO DE QUE NO SUPIERAMOS EL TAMAÑO DE NUESTRO ARRAY PODRÍAMOS HACER LOS SIGUIENTE
		for (i = 0; i < numerosPares.length; i++){
			System.out.println("Número " + numerosPares[i]);
		}

	}
}