package tema2;

import java.util.Scanner;

public class DimeTuNombre_01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);

		String nombre;

		System.out.print("Por favor, dime como te llamas: ");
		nombre = entrada.next();

		System.out.println("Hola " + nombre + ", encantado de conocerte!");
}
}