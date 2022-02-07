package tema2;

import java.util.Scanner;

public class Eureka {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean salir = true;
		String contraseña;
		int contador = 0;
		while (salir == true) {
			System.out.print("Introduce la contraseña ");
			String n = teclado.nextLine();
			teclado.close();
			contraseña = "eureka";
			contador++;
			if (contador == 3) {
				salir = false;
				System.out.print("La ontraseña a sido introducida 3 veces de manera erronea usuarios bloqueado");
			}
			else if (n.equals(contraseña)) {
				salir = false;
				System.out.print("contraseña correcta acceso permitido");
			}
		}

	}

}
