/*
 * EJERCICIO DE ESTRUCTURA DE ITERACIÓN FOR
 * 
 * Realizar un programa que muestre los números del 1 al 100.
 * 
 */

package tema2;

import java.util.Scanner;

public class Numeros05 {

	public static void main(String[] args) {
		
		for (int contador = 1; contador <= 100; contador++) {
			System.out.print (contador + ", ");
			// ya no hace falta incrementar el contador en el bucle. Se hace arriba.
			//contador++;
		}
	}

}
