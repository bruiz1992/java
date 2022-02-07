package Examen_tercertrimestre_RuizFernanderBenjamin;

import java.util.Scanner;

public class PruebaComisionesVentas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Tienda mediaMarkt = new Tienda();

		// INICIALIZAMOS LA TIENDA CON UNOS TRABAJADORES

		// Dni, nombre, comision
		Vendedor v1 = new Vendedor(20, "Carlos", 10);
		Vendedor v2 = new Vendedor(21, "Maria", 12);
		Vendedor v3 = new Vendedor(23, "Beatriz", 8);
		Vendedor v4 = new Vendedor(25, "Diego", 10);
		Vendedor v5 = new Vendedor(22, "Sara", 19);
		Vendedor v6 = new Vendedor(24, "Raul", 3);

		mediaMarkt.nuevoVendedor(v1);
		mediaMarkt.nuevoVendedor(v2);
		mediaMarkt.nuevoVendedor(v3);
		mediaMarkt.nuevoVendedor(v2); // Intentamos repetir un dni

		mediaMarkt.nuevoVendedor(v4);
		mediaMarkt.nuevoVendedor(v5);
		mediaMarkt.nuevoVendedor(v6);
		System.out.println(mediaMarkt.imprimirVendedores());
		boolean finalizar = false;
		while (!finalizar) {
			System.out.println("\t    Menu");
			System.out.println("\t ------------ \n");

			System.out.println("\t 1. Nuevo vendedor");
			System.out.println("\t 2. Nueva venta");
			System.out.println("\t 3. Datos vendedor");
			System.out.println("\t 4. Ranking de ventas (dni)");
			System.out.println("\t 5. Ranking total \n");

			System.out.println("Introduce opcion: ");
			int opcion = entrada.nextInt();
			entrada.nextLine();

			if (opcion == 1) {
				System.out.println("Annade NUEVO VENDEDOR");
				System.out.println("--------------------- \n");

				System.out.println("Introduce su DNI: ");
				int dni = entrada.nextInt();
				System.out.println("Introduce su nombre: ");
				entrada.nextLine(); // Para evitar problema de que no lee la linea.
				String nombre = entrada.nextLine();

				int codigo = mediaMarkt.nuevoVendedor(dni, nombre); // METODO A IMPLEMENTAR

				if (codigo == -1) {
					System.err.println("YA EXISTE UN VENDEDOR CON ESE DNI");
				} else {
					System.out.println("** El vendedor ha sido annadido a la tienda **");
				}

			} else if (opcion == 2) {
				System.out.println("Nueva VENTA");
				System.out.println("----------- \n");

				System.out.println("Indique el DNI del empleado que hace la venta: ");
				int dni = entrada.nextInt();
				System.out.println("Importe en euros de la venta: ");
				int importe = entrada.nextInt();

				int codigo = mediaMarkt.nuevaVenta(dni, importe); // METODO A IMPLEMENTAR

				if (codigo == -1) {
					System.err.println("EL DNI NO SE CORRESPONDE CON NINGUNO DE LOS VENDEDORES");
				} else {
					System.out.println("** Venta realizada **");
				}

			} /*else if (opcion == 3) {
				System.out.println("DATOS del vendedor");
				System.out.println("------------------ \n");

				System.out.println("Introduce su dni: ");
				int dni = entrada.nextInt();

				System.out.println(mediaMarkt.datosVendedor(dni)); // METODO A IMPLEMENTAR

			} else if (opcion == 4) {
				System.out.println("RANKING de ventas (dni)");
				System.out.println("----------------------- \n");

				System.out.println("Introduce el dni del vendedor: ");
				int dni = entrada.nextInt();

				int posicion = mediaMarkt.rankingVendedor(dni); // METODO A IMPLEMENTAR

				if (posicion == -1) {
					System.err.println("EL DNI NO SE CORRESPONDE CON NINGUNO DE LOS VENDEDORES");
				} else {
					System.out.println(
							"** La posicion que ocupa el vendedor con respecto a los demas: " + posicion + "� **");
				}

			} else if (opcion == 5) {
				System.out.println("RANKING total");
				System.out.println("------------- \n");

				System.out.println(mediaMarkt.rankingVendedor()); // MEJORA DEL PROGRAMA

			} else {
				System.out.println("Opcion no contemplada en el menu. ");
			}

		} // end while*/
		entrada.close();

	}

	}}
