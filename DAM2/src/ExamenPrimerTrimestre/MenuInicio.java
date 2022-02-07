package ExamenPrimerTrimestre;

import java.util.Scanner;

public class MenuInicio {

	public static void main(String[] args) {

		String dNI, nombre, apellidos;
		Double salario;
		boolean genero;
		int iDDepartamento;
		Gestion BBDD = new Gestion();
		BBDD.AddArrays();
		boolean salir = false;
		Scanner entrada = new Scanner(System.in);
		int opcionMenu;
		
		while (salir == false) {

			
			
			try {
				try {
			System.out.println("OPCIONES DE MENU");
			System.out.println("1.Gestion Departamentos");
			System.out.println("2.Gestion Empleados");
			System.out.println("3.Salir y Guardar cambios");

			opcionMenu = entrada.nextInt();

			if (opcionMenu == 2) {
				System.out.println("Gestion Empleados");
				System.out.println("1.Insertar Empleado");
				System.out.println("2.Modificar salario Empleado");
				System.out.println("3.Borrar Empleado");
				System.out.println("4.Listar todos los empleados");
				System.out.println("5.Listar todos los empleados de un departamento");
				System.out.println("6.Consultar empleados por nif/dni");
				System.out
						.println("7.Consultar empleados que tengan un salario superior al introducido por el usuario.");
				System.out.println(
						"8.Consultar empleados que tengan un salario igual o inferior al introducido por el usuario.");
				System.out.println("9.Volver a menu principal");

				int opcionMenu2 = entrada.nextInt();

				if (opcionMenu2 == 1) {
					System.out.println("Insertar Empleado");
					System.out.println("Indique el numero de DNI:");
					dNI = entrada.nextLine();
					dNI = entrada.nextLine();

					System.out.println("Indique el nombre:");
					nombre = entrada.nextLine();

					System.out.println("Indique el apellido:");
					apellidos = entrada.nextLine();

					System.out.println("Indique el salario anual");
					salario = entrada.nextDouble();

					System.out.println("Indique si es hombre con un 1, si es mujer con un 0:");
					genero = entrada.hasNextBoolean();
					System.out.println(BBDD.ListarDepartamentos());
					System.out.println("Indique el id del departamento");
					iDDepartamento = entrada.nextInt();
					iDDepartamento = entrada.nextInt();

					System.out.println(BBDD.addEmpleado(dNI, nombre, apellidos, salario, genero, iDDepartamento));

				}
				if (opcionMenu2 == 2) {
					System.out.println("Modificar salario Empleado");
					System.out.println("Indique el numero de DNI que desea modificar");
					dNI = entrada.nextLine();
					dNI = entrada.nextLine();
					System.out.println("Indique el nuevo salario");
					salario = entrada.nextDouble();
					System.out.println(BBDD.ModCliente(dNI, salario));

				}
				if (opcionMenu2 == 3) {
					System.out.println("Borrar Empleado");
					System.out.println("Indique el numero de DNI que desea borrar");
					dNI = entrada.nextLine();
					dNI = entrada.nextLine();
					System.out.println(BBDD.BorrarCliente(dNI));

				}
				if (opcionMenu2 == 4) {
					System.out.println("Listar todos los empleados");
					System.out.println(BBDD.ListarEmpleados());

				}
				if (opcionMenu2 == 5) {
					System.out.println("Listar todos los empleados de un departamento");
					System.out.println(BBDD.ListarDepartamentos());
					System.out.println("Indique el id del departamento");
					iDDepartamento = entrada.nextInt();
					System.out.println(BBDD.ListarEmpleadosPD(iDDepartamento));

				}
				if (opcionMenu2 == 6) {
					System.out.println("Consultar empleados por nif/dni");
					System.out.println("Indique el numero de DNI:");
					String DNI = entrada.nextLine();
					DNI = entrada.nextLine();
					System.out.println(BBDD.ConsultaCliente(DNI));

				}
				if (opcionMenu2 == 7) {
					System.out.println("Consultar empleados que tengan un salario superior al introducido por el usuario.");
					System.out.println("Indique el salario anual");
					salario = entrada.nextDouble();
					System.out.println(BBDD.ListarEmpleadosSueldoMas(salario));
					
					
				}
				if (opcionMenu2 == 8) {
					System.out.println("Consultar empleados que tengan un salario igual o inferior al introducido por el usuario");
					System.out.println("Indique el salario anual");
					salario = entrada.nextDouble();
					System.out.println(BBDD.ListarEmpleadosSueldomenos(salario));
					
					
					
				}

			}

			else if (opcionMenu == 1) {
				System.out.println("Gestion Departamentos");
				System.out.println("1.Insertar Departamento");
				System.out.println("2.Modificar Departamento");
				System.out.println("3.Borrar Departamento");
				System.out.println("4.Listar todos los Departamentos");
				System.out.println("5.Consultar departamento por nombre");
				System.out.println("6.Consultar Departamentos por ID");
				System.out.println("7.Volver a menu principal");

				opcionMenu = entrada.nextInt();

				if (opcionMenu == 1) {
					System.out.println("Insertar Departamento");
					System.out.println("Indique el nombre del nuevo departamento");
					nombre = entrada.nextLine();
					nombre = entrada.nextLine();
					System.out.println(BBDD.addDepartamento(nombre));

				}
				if (opcionMenu == 2) {
					System.out.println("Modificar Departamento");
					System.out.println("Indique el numero de ID que desea Modificar");
					iDDepartamento = entrada.nextInt();
					BBDD.BorrarDP(iDDepartamento);
					System.out.println("Indique el nombre nuevo para el departamento");
					nombre = entrada.nextLine();
					System.out.println(BBDD.addDepartamento(nombre));

				}
				if (opcionMenu == 3) {
					System.out.println("Borrar Departamento");
					System.out.println("Indique el numero de ID que desea borrar");
					iDDepartamento = entrada.nextInt();
					System.out.println(BBDD.BorrarDP(iDDepartamento));

				}
				if (opcionMenu == 4) {
					System.out.println("Listar todos los Departamentos");
					System.out.println(BBDD.ListarDepartamentos());

				}
				if (opcionMenu == 5) {
					System.out.println("Consultar departamento por nombre");
					System.out.println("indique el nombre del departamento");
					nombre = entrada.nextLine();
					nombre = entrada.nextLine();
					System.out.println(BBDD.ConsultaDPNombre(nombre));

				}
				if (opcionMenu == 6) {
					System.out.println("Consultar Departamentos por ID");
					System.out.println("Consultar departamento por nombre");
					System.out.println("indique el ID del departamento");
					iDDepartamento = entrada.nextInt();
					System.out.println(BBDD.ConsultaDPID(iDDepartamento));

				}
			} else if (opcionMenu == 3) {
				System.out.println("Los datos han sido guardados correctamente");
				BBDD.pisarFichero();
				salir = true;

			} else {
				System.out.println(
						"El numero introducido no esta en el menu vuelva a intentarlo con una de las opciones disponibles");
			}

				} catch (java.lang.ArrayIndexOutOfBoundsException b) {
					System.out.println("el parametro indicado es incorrecto reviselo ");
				}				} catch (java.util.InputMismatchException a) {
					System.out.println("el parametro indicado es incorrecto reviselo ");
					entrada.next();
				}
			
		}
		entrada.close();

	}

}
