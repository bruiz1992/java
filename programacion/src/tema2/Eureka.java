package tema2;

import java.util.Scanner;

public class Eureka {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean salir = true;
		String contraseņa;
		int contador = 0;
		while (salir == true) {
			System.out.print("Introduce la contraseņa ");
			String n = teclado.nextLine();
			teclado.close();
			contraseņa = "eureka";
			contador++;
			if (contador == 3) {
				salir = false;
				System.out.print("La ontraseņa a sido introducida 3 veces de manera erronea usuarios bloqueado");
			}
			else if (n.equals(contraseņa)) {
				salir = false;
				System.out.print("contraseņa correcta acceso permitido");
			}
		}

	}

}
