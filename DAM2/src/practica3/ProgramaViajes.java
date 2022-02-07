package practica3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaViajes {

	public static void main(String[] args) {

		boolean salir = false;
		Scanner entrada = new Scanner(System.in);
		int opcionMenu;
		Ficheros BBDD = new Ficheros();
		BBDD.AddArrays();
		while (salir == false) {

			System.out.println("OPCIONES DE MENU");
			System.out.println("1.Gestionar Vuelos");
			System.out.println("2.Gestionar Hoteles");
			System.out.println("3.Gestionar paquetes");
			System.out.println("4.Salir y guargar modificaciones");

			opcionMenu = entrada.nextInt();

			if (opcionMenu == 1) {

				System.out.println("Gestionar Vuelos");
				System.out.println("1 Añadir vuelos");
				System.out.println("2.listar vuelos");
				System.out.println("3.modificar vuelos");
				System.out.println("4.borrar vuelo");

				int opcion1 = entrada.nextInt();
				if (opcion1 == 1) {
					String empresa, destino, ida, vuelta;
					try {
						Float precio;
						System.out.println("Añadir vuelo");
						System.out.println("indique el nombre de la empresa");
						empresa = entrada.nextLine();
						empresa = entrada.nextLine();
						System.out.println("indique la fecha de ida en formato dd/mm/yyyy");
						ida = entrada.nextLine();
						DateFormat id = new SimpleDateFormat("dd/MM/yyyy");
						Date fecha1 = id.parse(ida);
						System.out.println("indique la fecha de vuelta dd/mm/yyyy");
						vuelta = entrada.nextLine();
						Date fecha2 = id.parse(vuelta);
						System.out.println("indique el precio");
						precio = entrada.nextFloat();
						System.out.println("indique la ciudad de destino");
						destino = entrada.nextLine();
						destino = entrada.nextLine();
						System.out.println(BBDD.CrearVuelo(empresa, fecha1, fecha2, precio, destino));
					} catch (ParseException e) {
						e.printStackTrace();
						System.out.println("Formato de fecha erroneo compruebelo");
					}
				}
				if (opcion1 == 2) {
					System.out.println("listar vuelos");
					System.out.println(BBDD.ListarVuelos());

				}
				if (opcion1 == 3) {
					System.out.println("modificar vuelos");
					System.out.println("Indique el ID del vuelo que desea modificar");
					int id = entrada.nextInt();
					System.out.println("Que dato quiere modificar del vuelo con ID: " + id);
					System.out.println("1 Modificar Fechas");
					System.out.println("2.Modificar precio ");
					System.out.println("3.modificar destino");
					System.out.println("pulse cualquier otro numero entero para no realizar modificaciones");
					int opcion = entrada.nextInt();
					if (opcion == 1) {
						System.out.println("Modificar Fechas");
						System.out.println("indique la fecha de ida en formato dd/mm/yyyy");
						String ida = entrada.nextLine();
						DateFormat idd = new SimpleDateFormat("dd/MM/yyyy");
						try {
							Date fecha1 = idd.parse(ida);
							System.out.println("indique la fecha de vuelta dd/mm/yyyy");
							String vuelta = entrada.nextLine();
							Date fecha2 = idd.parse(vuelta);
							System.out.println(BBDD.ModDate(id, fecha1, fecha2));

						} catch (ParseException e) {
							e.printStackTrace();
							System.out.println("Formato de fecha erroneo compruebelo");
						}
					}
					if (opcion == 2) {
						System.out.println("indique el precio");
						float precio = entrada.nextFloat();
						System.out.println(BBDD.ModPrecio(id, precio));
					}
					if (opcion == 3) {
						System.out.println("indique la ciudad de destino");
						String destino = entrada.nextLine();
						destino = entrada.nextLine();
						System.out.println(BBDD.ModDestino(id, destino));
					}

				}
				if (opcion1 == 4) {
					System.out.println("borrar vuelo");
					System.out.println("Indique el ID del vuelo que desea Borrar");
					int id = entrada.nextInt();
					System.out.println(BBDD.BorrarVuelo(id));

				}
			}
			if (opcionMenu == 2) {

				System.out.println("Gestionar Hoteles");
				System.out.println("1 Añadir Hotel");
				System.out.println("2.listar Hoteles");
				System.out.println("3.modificar Hotel");
				System.out.println("4.borrar Hotel");

				int opcion1 = entrada.nextInt();
				if (opcion1 == 1) {
					System.out.println("Añadir Hotel");
					String nombre;
					String ciudad;
					String llegada;
					int numNoches;
					float precioNoche;
					System.out.println("indique el nombre de la empresa");
					nombre = entrada.nextLine();
					nombre = entrada.nextLine();
					System.out.println("indique el nombre de la Ciudad");
					ciudad = entrada.nextLine();
					try {
						System.out.println("indique la fecha de ida en formato dd/mm/yyyy");
						llegada = entrada.nextLine();
						DateFormat idd = new SimpleDateFormat("dd/MM/yyyy");
						Date fechaLlegada = idd.parse(llegada);
						System.out.println("indique el nº de noches");
						numNoches = entrada.nextInt();
						System.out.println("indique el precio de una noche");
						precioNoche = entrada.nextFloat();
						System.out.println(BBDD.CrearHotel(nombre, ciudad, fechaLlegada, numNoches, precioNoche));
					} catch (ParseException e) {
						e.printStackTrace();
						System.out.println("Formato de fecha erroneo compruebelo");
					}
				}
				if (opcion1 == 2) {
					System.out.println("listar Hoteles");
					System.out.println(BBDD.ListarHotel());

				}
				if (opcion1 == 3) {
					System.out.println("modificar Hotel");
					System.out.println("Indique el ID del Hotel que desea modificar");
					int id = entrada.nextInt();
					System.out.println("Que dato quiere modificar del vuelo con ID: " + id);
					System.out.println("1 Modificar Fecha");
					System.out.println("2.Modificar precio noche ");
					System.out.println("3.modificar nº de noches");
					System.out.println("pulse cualquier otro numero entero para no realizar modificaciones");
					int opcion = entrada.nextInt();
					if (opcion == 1) {
						System.out.println("Modificar Fechas");
						System.out.println("indique la fecha de entrada en formato dd/mm/yyyy");
						String ida = entrada.nextLine();
						DateFormat idd = new SimpleDateFormat("dd/MM/yyyy");
						try {
							Date fecha1 = idd.parse(ida);
							System.out.println("indique la fecha de vuelta dd/mm/yyyy");

							System.out.println(BBDD.ModDate(id, fecha1));

						} catch (ParseException e) {
							e.printStackTrace();
							System.out.println("Formato de fecha erroneo compruebelo");
						}
					}
					if (opcion == 2) {
						System.out.println("indique el precio noche");
						float precio = entrada.nextFloat();
						System.out.println(BBDD.ModPrecioH(id, precio));
					}
					if (opcion == 3) {
						System.out.println("indique nº de noches");
						int noches = entrada.nextInt();
						System.out.println(BBDD.ModNnoches(id, noches));
					}

				}
				if (opcion1 == 4) {
					System.out.println("borrar Hotel");
					System.out.println("Indique el ID del vuelo que desea Hotel");
					int id = entrada.nextInt();
					System.out.println(BBDD.BorrarVuelo(id));

				}
			}
			if (opcionMenu == 3) {

				System.out.println("Gestionar paquetes");
				System.out.println("1 Añadir paquetes");
				System.out.println("2.listar paquetes");
				System.out.println("3.modificar paquetes");
				System.out.println("4.borrar paquetes");

				int opcion1 = entrada.nextInt();
				if (opcion1 == 1) {
					String nombre;
					int idVuelo, idHotel;
					System.out.println("Añadir paquetes");
					System.out.println("indique el nombre del nuevo paquete");
					nombre = entrada.nextLine();
					nombre = entrada.nextLine();
					System.out.println("indique el ID del vuelo que desea añadir");
					idVuelo = entrada.nextInt();
					System.out.println("indique el ID del Hotel que desea añadir");
					idHotel = entrada.nextInt();
					System.out.println(BBDD.CrearPaquete(nombre, idVuelo, idHotel));

				}
				if (opcion1 == 2) {
					System.out.println("listar paquetes");
					System.out.println(BBDD.ListarPaquetes());

				}
				if (opcion1 == 3) {
					System.out.println("modificar paquetes");
					System.out.println("indique el ID del paquete");
					int id = entrada.nextInt();
					System.out.println("Que dato quiere modificar del paquete con ID: " + id);
					System.out.println("1 Modificar Vuelo");
					System.out.println("2.Modificar Hotel ");
					int opcion = entrada.nextInt();
					if (opcion == 1) {
						System.out.println("indique el precio noche");
						float precio = entrada.nextFloat();
						System.out.println(BBDD.ModPrecioH(id, precio));
					}
					if (opcion == 2) {
						System.out.println("indique nº de noches");
						int noches = entrada.nextInt();
						System.out.println(BBDD.ModNnoches(id, noches));
					}
				}
				if (opcion1 == 4) {
					System.out.println("borrar paquetes");
					System.out.println(
							"Indique el ID del Paquete que desea Borrar(Recuerde el vuelo y el hotel dejaran de estar asociados)");
					opcion1 = entrada.nextInt();
					System.out.println(BBDD.BorrarPaquete(opcion1));

				}
				if (opcionMenu == 4) {
					BBDD.pisarFichero();
				}
			}

		}
		entrada.close();
	}

}
