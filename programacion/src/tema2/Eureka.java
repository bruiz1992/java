package tema2;

import java.util.Scanner;

public class Eureka {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean salir = true;
		String contrase�a;
		int contador = 0;
		while (salir == true) {
			System.out.print("Introduce la contrase�a ");
			String n = teclado.nextLine();
			teclado.close();
			contrase�a = "eureka";
			contador++;
			if (contador == 3) {
				salir = false;
				System.out.print("La ontrase�a a sido introducida 3 veces de manera erronea usuarios bloqueado");
			}
			else if (n.equals(contrase�a)) {
				salir = false;
				System.out.print("contrase�a correcta acceso permitido");
			}
		}

	}

}
