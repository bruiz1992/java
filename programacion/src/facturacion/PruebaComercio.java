package facturacion;

import java.util.Scanner;

public class PruebaComercio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		boolean salir = false;
		boolean salir2 = false;
		int opcionMenu;
		facturacion Prueba = new facturacion();
		Prueba.añadirCliente("123456", "hola", "apellidos", 8885522);
		Prueba.añadirProducto("koko", 5);
		Prueba.addStockProductos("koko", 20);
		
		while (salir == false) {

			System.out.println("FACTURACION");

			System.out.println("Selecione la opcion deseada:");

			System.out.println("OPCIONES DE MENUS");
			System.out.println("0.salir");
			System.out.println("1.	Registrar un cliente");
			System.out.println("2.	Incorporación de nuevos productos al almacén");
			System.out.println("3.	Reposición de existencias de productos");
			System.out.println("4.	Generación de pedido con control de existencias");
			System.out.println("5.	Generación de una factura");
			System.out.println("6.	Visualizar por pantalla una factura");
			System.out.println("7.	Visualizar las facturas de un cliente (pagadas y pendientes de pago)");
			System.out.println("8.	Guardar una factura en un archivo");

			opcionMenu = entrada.nextInt();
			if (opcionMenu == 0) {
				System.out.println("Muchas gracias, pasa buen dia");
				salir = true;
			}
			if (opcionMenu == 1) {
				String DNI, nombre, apellidos;
				int telefono;
				System.out.println("Indique por favor el dni del cliente");
				DNI = entrada.nextLine();
				DNI = entrada.nextLine();
				System.out.println("indique el nombre");
				nombre = entrada.nextLine();
				System.out.println("indique el apellidos");
				apellidos = entrada.nextLine();
				System.out.println("indique el telefono");
				telefono = entrada.nextInt();
				System.out.println(Prueba.añadirCliente(DNI, nombre, apellidos, telefono));
			}
			if (opcionMenu == 2) {

				System.out.println("indique el nombre del producto");
				String nombre;
				double precio;
				nombre = entrada.nextLine();
				nombre = entrada.nextLine();
				System.out.println("indique el precio del producto");
				precio = entrada.nextInt();
				System.out.println(Prueba.añadirProducto(nombre, precio));

			}
			if (opcionMenu == 3) {
				System.out.println("Reposición de existencias de productos");
				System.out.println("indique el nombre del producto a reponer");
				String nombre;
				int suma;
				nombre = entrada.nextLine();
				nombre = entrada.nextLine();
				System.out.println("indique la cantidad a reponer");
				suma = entrada.nextInt();
				System.out.println(Prueba.addStockProductos(nombre, suma));
			}
			if (opcionMenu == 4) {
				System.out.println("Generación de pedido con control de existencias");
				System.out.println("indique el DNI del cliente que ha realizado el pedido");
				String DNI;
				DNI = entrada.nextLine();
				DNI = entrada.nextLine();
				System.out.println(Prueba.imprimirProductos());
				System.out.println("indique nombre del producto");
				String nombre;
				int cantidad;
				nombre = entrada.nextLine();
				System.out.println("indique la cantidad que se ha comprado");
				cantidad = entrada.nextInt();
				System.out.println(Prueba.generarNuevopedido(DNI, nombre, cantidad));

			}
			if (opcionMenu == 5) {
				System.out.println("Generación de una factura");
				System.out.println("indique el DNI del cliente, recuerde que al generar una factura "
						+ "se asociaran todos los pedidos que tiene el cliente en este momento");
				String DNI;
				DNI = entrada.nextLine();
				DNI = entrada.nextLine();
				System.out.println(Prueba.añadirfacturacliente(DNI));
				Prueba.borrarPedidos(DNI);
			}
			if (opcionMenu == 6) {
				System.out.println("Visualizar por pantalla una factura");
				System.out.println("indique el id de la factura");
				String id;
				id = entrada.nextLine();
				id = entrada.nextLine();
				System.out.println(Prueba.imprimirfactura(id));
			}
			if (opcionMenu == 7) {
				System.out.println("Visualizar las facturas de un cliente (pagadas y pendientes de pago)");
				System.out.println("indique el DNI del cliente");
				String DNI;
				DNI = entrada.nextLine();
				DNI = entrada.nextLine();
				System.out.println(Prueba.imprimirFacCliente(DNI));
			}
			if (opcionMenu == 8) {
				System.out.println("Guardar una factura en un archivo");
				System.out.println("Opccion actualmente no disponible lo sentimos;");

			}

		}

	}

}
