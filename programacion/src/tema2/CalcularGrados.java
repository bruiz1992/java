/*
 * EJEMPLO DE ESTRUCTURA SECUENCIAL
 * 
 * Plantear un algoritmo en el que se proporcione la temperatura en grados celsius. 
 * Dicho algortimo deberá pasar esa temperatura a grados Fahrenheit y grados Kelvin y mostrarla por pantalla.
 */

package tema2;

import java.util.Scanner;

public class CalcularGrados {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double celsius, fahrenheit, kelvin;

		System.out.println("Progrma para transformar de grdos CELSIUS a FAHREINHEIT y KELVIN");
		System.out.println("Introduce la tª en ºC: ");

		celsius = entrada.nextDouble();

		// Trasformamos de ºC a Fahreinheit
		fahrenheit = ((celsius * 9) / 5) + 32;

		 // Trasformamos de ºC a Kelvin
		kelvin = celsius + 273;

		System.out.println (celsius + " ºC equivalen a  " + fahrenheit + " fahrenheit.");
		System.out.println (celsius + " ºC equivalen a  " + kelvin + " kelvin.");

	}

}