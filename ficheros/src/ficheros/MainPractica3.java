package ficheros;
import java.io.InputStream;
import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class MainPractica3 {

	public static void main(String[] args) {

		
		InputStream stream = System.in;
		String user = "root";
		String passwd = "Dam2021";
		String BD = "initiald";
		float precios = 1200; 
		boolean salir = false;
		Scanner entrada = new Scanner(stream);
		
		System.out.println("Indique el nombre de la base de datos");
		BD = entrada.nextLine();
		System.out.println("Indique su nombre de usuario");
		user = entrada.nextLine();
		System.out.println("indique la contraseña");
		passwd = entrada.nextLine();
		String dNI, nombre, apellidos;

		Gestion gestion = new Gestion(BD, passwd, user);
		
		while (salir == false) {

			System.out.println("OPCIONES DE MENU");
			System.out.println("1.Gestion Clientes");
			System.out.println("2.Vehiculos");
			System.out.println("3.Ventas");
			System.out.println("4.Salir");

			int opcionMenu = entrada.nextInt();

			if (opcionMenu == 1) {
				System.out.println("Gestion Clientes");
				System.out.println("1.Insertar Cliente");
				System.out.println("2.Listar clientes");
				System.out.println("3.Consultar un cliente por nif");

				int opcionMenu2 = entrada.nextInt();

				if (opcionMenu2 == 1) {
					System.out.println("Insertar Cliente");
					System.out.println("Insertar DNi");
					dNI = entrada.nextLine();
					dNI = entrada.nextLine();
					System.out.println("Insertar nombre");
					nombre = entrada.nextLine();
					System.out.println("Insertar apellidos");
					apellidos = entrada.nextLine();
					System.out.println(gestion.addCliente(dNI, nombre, apellidos));
				}

				if (opcionMenu2 == 2) {
					System.out.println("2.Listar clientes");
					System.out.println(gestion.listar(0));

				}
				if (opcionMenu2 == 3) {
					System.out.println("4.Consultar un cliente por nif");
					System.out.println("Insertar DNi que desee consultar");
					dNI = entrada.nextLine();
					dNI = entrada.nextLine();
					System.out.println(gestion.listarDni(dNI));

				}
			}
			if (opcionMenu == 2) {
				System.out.println();
				System.out.println("Gestion Vehiculos");
				System.out.println("1.Insertar vehículo");
				System.out.println("2.Modificar vehículo");
				System.out.println("3.Listar vehículos");
				System.out.println("4.Consultar un vehiculo por matricula");
				System.out.println("5.Ver todos los vehículos de una marca.");

				int opcionMenu2 = entrada.nextInt();

				if (opcionMenu2 == 1) {
					System.out.println("1.Insertar vehículo");
					System.out.println("Insertar matricula");
					String matricula = entrada.nextLine();
					matricula = entrada.nextLine();
					System.out.println("Insertar marca");
					String marca = entrada.nextLine();
					System.out.println("Insertar color");
					String color = entrada.nextLine();
					System.out.println("Insertar precio");
					float precio = entrada.nextFloat();
					System.out.println(gestion.addVehiculo(matricula, marca, color, precio));
				}
				if (opcionMenu2 == 2) {
					System.out.println("2.Modificar vehículo");
					System.out.println("indique la matricula");
					String matricula = entrada.nextLine();
					matricula = entrada.nextLine();
					System.out.println("indique el precio del vehiculo");
					float precio = entrada.nextFloat();
					System.out.println(gestion.modCoche(matricula, precio));

				}
				if (opcionMenu2 == 3) {
					System.out.println("3.Listar vehículos");
					System.out.println(gestion.listar(3));

				}
				if (opcionMenu2 == 4) {
					System.out.println("4.Consultar un vehiculo por matricula");
					System.out.println("inidque la matricula");
					String matricula = entrada.nextLine();
					matricula = entrada.nextLine();
					System.out.println(gestion.listarcoche(1, matricula));
				}
				if (opcionMenu2 == 5) {
					System.out.println("5.Ver todos los vehículos de una marca.");
					System.out.println("inidque la marca");
					String marca = entrada.nextLine();
					marca = entrada.nextLine();
					System.out.println(gestion.listarcoche(0, marca));

				}

			} else if (opcionMenu == 3) {
				System.out.println("Ventas");
				System.out.println("1.Insertar venta");
				System.out.println("2.listar ventas");
				System.out.println("3.Listar ventas por dia concreto");

				int opcionMenu2 = entrada.nextInt();
				if (opcionMenu2 == 1) {
					System.out.println("1.Insertar venta");
					System.out.println("indique el dni del cliente");
					System.out.println(gestion.listar(0));
					String dni = entrada.nextLine();
					dni = entrada.nextLine();
					System.out.println("indique la matricula del vehiculo");
					System.out.println(gestion.listar(3));
					String matricula = entrada.nextLine();
					System.out.println("indique si tiene el codigo de decuento");
					System.out.println(gestion.listar(1));
					int descuento = entrada.nextInt();
					System.out.println(gestion.addVenta(matricula, dni, descuento));
					
				}
				if (opcionMenu2 == 2) {
					System.out.println("2.listar ventas");
					System.out.println(gestion.listar(2));
				}
				if (opcionMenu2 == 3) {
					System.out.println("3.Listar ventas por dia concreto");
					System.out.print("Introduzca la fecha  en formato (yyyy-MM-dd): ");
					String fecha = entrada.next();
					System.out.println(gestion.listarVentas(fecha));
					
				}

			} else {
				System.out.println(
						"El numero introducido no esta en el menu vuelva a intentarlo con una de las opciones disponibles");
			}

		}
	}
}
