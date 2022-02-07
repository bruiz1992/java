package CandyShop;

import java.util.Scanner;

public class Candyshop {

	private static void visualizar(String[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static void visualizarenteros(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static int[][] sumarstock(int[][] matriz, int cantidad) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = matriz[i][j] + cantidad;
			}

		}
		visualizarenteros(matriz);
		return matriz;

	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean salir = false;
		int opcion = 0;
		double sumatorio = 0;

		String matriz[][] = new String[4][4];// matriz productos
		matriz[0][0] = "(00)KitKat (1.1€)";
		matriz[0][1] = "(01)Chicles de fresa (0.8€)";
		matriz[0][2] = "(02)Lacasitos (1.5€)";
		matriz[0][3] = "(03)Palotes (0.9€)";
		matriz[1][0] = "(10)Oreo (1.8€)";
		matriz[1][1] = "        (11)Bolsa Haribo (1€)";
		matriz[1][2] = "        (12)Chetoos (1.2€)";
		matriz[1][3] = "(13)Twix (1€)";
		matriz[2][0] = "(20)M&M'S  (1.8€)";
		matriz[2][1] = "(21)Kinder Bueno (1.3€) ";
		matriz[2][2] = "(22)Papa Delta (1.2€)";
		matriz[2][3] = "(23)Chicles de menta (0.8€)";
		matriz[3][0] = "(30)Lacasitos (1.5€)";
		matriz[3][1] = "(31)Crunch (1.1€)";
		matriz[3][2] = "        (32)Milkybar (1.1€)";
		matriz[3][3] = "(33)KitKat (1.1€)";

		double matrizprecios[][] = new double[4][4];// matriz precios
		matrizprecios[0][0] = 1.1;
		matrizprecios[0][1] = 0.8;
		matrizprecios[0][2] = 1.5;
		matrizprecios[0][3] = 0.9;
		matrizprecios[1][0] = 1.8;
		matrizprecios[1][1] = 1;
		matrizprecios[1][2] = 1.2;
		matrizprecios[1][3] = 1;
		matrizprecios[2][0] = 1.8;
		matrizprecios[2][1] = 1.3;
		matrizprecios[2][2] = 1.2;
		matrizprecios[2][3] = 0.8;
		matrizprecios[3][0] = 1.5;
		matrizprecios[3][1] = 1.1;
		matrizprecios[3][2] = 1.1;
		matrizprecios[3][3] = 1.1;

		int[][] matrizstock = new int[4][4];// matriz stock
		matrizstock[0][0] = 5;
		matrizstock[0][1] = 5;
		matrizstock[0][2] = 5;
		matrizstock[0][3] = 5;
		matrizstock[1][0] = 5;
		matrizstock[1][1] = 5;
		matrizstock[1][2] = 5;
		matrizstock[1][3] = 5;
		matrizstock[2][0] = 5;
		matrizstock[2][1] = 5;
		matrizstock[2][2] = 5;
		matrizstock[2][3] = 5;
		matrizstock[3][0] = 5;
		matrizstock[3][1] = 5;
		matrizstock[3][2] = 5;
		matrizstock[3][3] = 5;

		while (salir == false) {
			// menu
			try {
				try {
					System.out.println("OPCIONES DE MENUSš");
					System.out.println("1.Pedir golosina:");
					System.out.println("2.Mostrar golosinas:");
					System.out.println("3.Rellenar golosinas:");
					System.out.println("4.Apagar maquina:");
					System.out.println("Introduce tu opcion: ");
					opcion = entrada.nextInt();

					if (opcion == 4) {// salir del menu
						salir = true;
						System.out.println("El importe total de las ventas es " + sumatorio);

					} else if (opcion == 1) {
						System.out.println("Elegiste ** Pedir golosina ** ");
						System.out.println("indique el numero de producto");
						int producto = entrada.nextInt();

						int fila = producto / 10;
						int columna = producto - (fila * 10);
						if (matrizstock[fila][columna] == 0) {
							System.out.println("Lo sentimos, no quedan unidades del producto elegido");
						} else {
							System.out.println("has elegido " + matriz[fila][columna]);

							matrizstock[fila][columna] = matrizstock[fila][columna] - 1;
							// visualizarenteros(matrizstock);
							sumatorio = matrizprecios[fila][columna] + sumatorio;
						}

					} else if (opcion == 2) {
						System.out.println("Elegiste ** Mostrar golosinas ** ");
						visualizar(matriz);

					} else if (opcion == 3) {
						System.out.println("Elegiste ** Rellenar golosinas: ** ");
						boolean salir2 = true;
						String contraseña;
						int contador = 0;
						while (salir2 == true) {
							System.out.print("Introduce la contraseña ");
							String passwd = entrada.nextLine();

							contraseña = "dam2021";
							contador++;
							if (contador == 3) {
								salir2 = false;
								System.out.print(
										"La contraseña a sido introducida 3 veces de manera erronea usuarios bloqueado");
							} else if (passwd.equals(contraseña)) {
								salir2 = false;
								System.out.print("contraseña correcta acceso permitido");
								System.out.print("indique la cantidad que desea rellenar ");
								int cantidad = entrada.nextInt();
								sumarstock(matrizstock, cantidad);
								contador = 0;
							}
						}

					}

			} catch (java.lang.ArrayIndexOutOfBoundsException b) {
				System.out.println("el parametro indicado es incorrecto reviselo ");
			}				} catch (java.util.InputMismatchException a) {
				System.out.println("el parametro indicado es incorrecto reviselo ");
				entrada.next();
			}

		}

	}

}
