/*
 * EJEMPLO DE ESTRUCTURA DE SELECCIÓN IF
 * 
 * Realizar un programa que le pida a un jugador que introduzca una letra entre la A y la Z por teclado.
 * 
 * Si el jugador adivina la letra, el programa mostrará por pantalla el mensaje “Correcto!!!”
 * 
 */

package tema2;

import java.util.Scanner;

public class Adivinar02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		char ch, respuesta = 'k';
		System.out.println ("Estoy pensando una letra entre la A y la Z");
		System.out.println ("Estoy pensando en la letra… ");

		// Entrada.next() lee un String. Con el método charAt(0), leemos el primer caracter.
		ch = (entrada.next()).charAt(0);
		
		if (ch == respuesta) {
			System.out.println ("** CORRECTO **");
		} else {
			System.out.println ("** Fallaste **");
		}
	}

}
