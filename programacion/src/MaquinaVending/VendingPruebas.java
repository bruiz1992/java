package MaquinaVending;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingPruebas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean salir = false;
		boolean salir2 = false;
		int opcionProducto = 0, opcionMoneda = 0, opcionMenu;

		MaquinaPrincipal Prueba = new MaquinaPrincipal();
		Producto A = new Producto(1, "Cocacola", 100, 50);
		Producto B = new Producto(2, "Nestea", 130, 50);
		Producto C = new Producto(3, "redbull", 200, 50);
		Producto D = new Producto(4, "Fanta", 80, 50);

		Prueba.añadirProducto(A);
		Prueba.añadirProducto(B);
		Prueba.añadirProducto(C);
		Prueba.añadirProducto(D);

		while (salir == false) {
			salir2 = false;

			System.out.println("Maquina expendedora");
			System.out.println(Prueba.imprimirProductos());
			System.out.println("selecione el producto");
			opcionProducto = entrada.nextInt();
			if (opcionProducto == 777) {
				while (salir2 == false) {
					System.out.println("OPCIONES DE MENUS Mantenimiento");
					System.out.println("0.salir");
					System.out.println("1.Introducir productos");
					System.out.println("2.Introducir cambios");
					System.out.println("3.recaudacion");

					opcionMenu = entrada.nextInt();
					if (opcionMenu == 0) {
						System.out.println("salimos del Menu mantenimiento");
						salir2 = true;
					}
					if (opcionMenu == 1) {
						int codigo, cantidad;
						System.out.println("indique el codigo del Producto a rellenar");
						codigo = entrada.nextInt() - 1;
						System.out.println("indique la cantidad del Producto a rellenar");
						cantidad = entrada.nextInt();
						Prueba.reponerProducto(codigo, cantidad);
						System.out.println(Prueba.imprimirProductos());

					}
					if (opcionMenu == 2) {
						int Moneda, cantidad;
						System.out.println("indique la moneda a rellenar");
						Moneda = entrada.nextInt();
						System.out.println("indique la cantidad de monedas a rellenar");
						cantidad = entrada.nextInt();
						Prueba.añadirMonedas(Moneda, cantidad);
						System.out.println(Prueba.mostrarMonedas());

					}
					if (opcionMenu == 3) {
						System.out.println("La cantidad actual de Monedas es: ");
						System.out.println(Prueba.mostrarMonedas());
					}

				}

			}

			while (salir2 == false) {
				if (Prueba.existeProducto(opcionProducto) == false) {
					System.out.println("El codigo utilizado no existe");
					salir2 = true;
				} else if (Prueba.suficienteStock(opcionProducto - 1) == false) {
					System.out.println("No hay stock seleccione otro producto");
					salir2 = true;
				} else {
					System.out.println("inserte una moneda ");
					opcionMoneda = entrada.nextInt();

					int compra = Prueba.ComprarProducto((opcionProducto - 1), opcionMoneda);
					if (compra == 1) {
						System.out.println(
								"La moneda introducida es erronea la maquina solo admite monedas de 10 cent, 20 cent, 50 cent, 1 euro y 2 euros ");
						break;
					} else if (compra == 0) {

					} else if (compra == 3) {
						System.out.println(
								"La maquina actualmente no dispone de cambio, solo admite importe exacto para ese producto recoja las monedas introducidas"
										+ "\n");
						Prueba.borrardeposito();
						break;
					} else if (compra == 2) {
						System.out.println("Aqui tiene su " + Prueba.nombreProducto(opcionProducto - 1));
						salir2 = true;
						System.out.println(Prueba.cambios(opcionProducto));
						Prueba.añadirDepositoAMonederoMaquina();
					}

				}

			}
		}
	}
}
