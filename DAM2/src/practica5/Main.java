package practica5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		boolean salir = false;
		Scanner entrada = new Scanner(System.in);
		int opcionMenu;
		BBDD BBDD = new BBDD();
		BBDD.AddArrays();
		String dNI; String nombre; String apellido; Double salario;
		while (salir == false) {

			System.out.println("OPCIONES DE MENU");
			System.out.println("1.Consulta");
			System.out.println("2.Insercion nuevo cliente");
			System.out.println("3.Modificar salario");
			System.out.println("4.Borrado");
			System.out.println("5.Listado General");
			System.out.println("6.Salir y Guardar cambios");
			opcionMenu = entrada.nextInt();

			if (opcionMenu == 1) {
				System.out.println("Consulta");
				System.out.println("Indique el numero de DNI:");
				String DNI = entrada.nextLine();
				DNI = entrada.nextLine();
				System.out.println(BBDD.ConsultaCliente(DNI));
			}
			if (opcionMenu == 2) {
				
				System.out.println("Insertar nuevo cliente");
				System.out.println("Indique el numero de DNI:");
				dNI = entrada.nextLine();
				dNI = entrada.nextLine();
				System.out.println("Indique el nombre:");
				nombre = entrada.nextLine();
				
				System.out.println("Indique el apellido:");
				apellido = entrada.nextLine();
				
				System.out.println("Indique el salario anual");
				salario = entrada.nextDouble();
				System.out.println(BBDD.CrearEmpleado(dNI, nombre, apellido, salario));
			}
			if (opcionMenu == 3) {
				System.out.println("Modificar salario");
				System.out.println("Indique el numero de DNI que desea modificar");
				dNI = entrada.nextLine();
				dNI = entrada.nextLine();
				System.out.println("Indique el nuevo salario");
				salario = entrada.nextDouble();
				System.out.println(BBDD.ModCliente(dNI, salario));

			}
			if (opcionMenu == 4) {
				System.out.println("Borrar empleado");
				System.out.println("Indique el numero de DNI que desea borrar");
				dNI = entrada.nextLine();
				dNI = entrada.nextLine();
				System.out.println(BBDD.BorrarCliente(dNI));
			}
			if (opcionMenu == 5) {
				System.out.println("Listado General clientes");
				System.out.println(BBDD.ListarEmpleados());
			}
			if (opcionMenu == 6) {
				System.out.println("Los datos han sido guardados correctamente");
				BBDD.pisarFichero();
				salir = true;
			}
			

		}
		entrada.close();
	}
}
