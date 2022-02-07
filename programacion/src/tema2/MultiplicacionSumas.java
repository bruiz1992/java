package tema2;

import java.util.Scanner;

public class MultiplicacionSumas {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("INTRODUCE LOS NUMEROS QUE DESEAS MULTIPLICAR ");
		System.out.println("Primer número: ");
		int n1 = entrada.nextInt();
		System.out.println("Segundo número: ");
		int n2 = entrada.nextInt();
		
		int contador = 1;
		int multiplicacion = 0;
		
		// Si n2 vale 0 no se ejecutará el bucle while.
		while (contador <= n2){
			multiplicacion = multiplicacion + n1;
			contador++;
		}
		
		// OTRA POSIBILIDAD ES:
		/*
		int contador = 0;
		int multiplicacion = 0;
		
		while (contador < n2){
			multiplicacion = multiplicacion + n1;
			contador++;
		}
		*/
		
		System.out.println("\n El resultado de multiplicar " + n1 + " x " + n2 + " es: " + multiplicacion);
		
		entrada.close();

	}

}
