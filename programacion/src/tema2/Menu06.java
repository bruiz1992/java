/*
 * EJERCICIO DE ESTRUCTURA DE ITERACIÓN WHILE(true)
 * 
 * Se muestra de manera indefinida el menú de un cajero automático
 * 
 */

package tema2;

import java.util.Scanner;

public class Menu06 {

	public static void main(String[] args) {

		 Scanner entrada = new Scanner (System.in);
		
		 boolean salir = false;
		 int opcion = 0;		
			
		while (salir == false) {
			System.out.println("OPCIONES DE MENÚ");
			System.out.println("	1. Retirar efectivo. ");
			System.out.println("	2. Ingresar efectivo. ");
			System.out.println("	3. Hacer transferencia. ");
			System.out.println("	4. Salir. ");
			System.out.println("	Introduce tu opción: ");
			opcion = entrada.nextInt();
			
			if (opcion == 4){
				salir = true;
			} else if (opcion == 1){
				System.out.println("Elegiste ** RETIRAR EFECTIVO ** ");
			} else if (opcion == 2){
				System.out.println("Elegiste ** INGRESAR EFECTIVO ** ");
			} else if (opcion == 3){
				System.out.println("Elegiste ** HACER UNA TRANSFERENCIA ** ");
			}
			System.out.println();
			
		}
	}

}
