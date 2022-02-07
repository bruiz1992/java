package practica2AD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		String user = "root";
		String passwd = "Dam2021";
		String dni = "12345678";
		float sal = 2000;
		boolean salir = false;
		Scanner entrada = new Scanner(System.in);

		//Gestion gestion = new Gestion(passwd,user);
		System.out.println("Indique su nombre de usuario");
		user = entrada.nextLine();
		System.out.println("indique la contraseña"); 
		passwd = entrada.nextLine();
		// System.out.print(gestion.ConsultarEmpleadossal(0,sal,passwd,user));
		String dNI, nombre, apellidos;
		float salario;
		int iDDepartamento;
		
		Gestion gestion = new Gestion(passwd,user);
		while (salir == false) {
			try {
				try {
					System.out.println("OPCIONES DE MENU");
					System.out.println("1.Gestion Departamentos");
					System.out.println("2.Gestion Empleados");
					System.out.println("3.Salir");

					int opcionMenu = entrada.nextInt();

					if (opcionMenu == 2) {
						System.out.println("Gestion Empleados");
						System.out.println("1.Insertar Empleado");
						System.out.println("2.Modificar salario Empleado");
						System.out.println("3.Borrar Empleado");
						System.out.println("4.Listar todos los empleados");
						System.out.println("5.Listar todos los empleados de un departamento");
						System.out.println("6.Consultar empleados por nif/dni");
						System.out.println(
								"7.Consultar empleados que tengan un salario superior al introducido por el usuario.");
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

							System.out.println("Indique el salario Mensual");
							salario = entrada.nextFloat();

							System.out.println();
							System.out.println("Indique el id del departamento");
							iDDepartamento = entrada.nextInt();

							System.out.println(gestion.addEmpleado(dNI, nombre, apellidos, salario, iDDepartamento));

						}
						if (opcionMenu2 == 2) {
							System.out.println("Modificar salario Empleado");
							System.out.println(gestion.ConsultarEmpleados(1, "1", 0));
							System.out.println("Indique el numero de DNI que desea modificar");
							dNI = entrada.nextLine();
							dNI = entrada.nextLine();
							System.out.println("Indique el nuevo salario");
							salario = entrada.nextFloat();
							System.out.println(gestion.ModEmpleado(dNI, salario));

						}
						if (opcionMenu2 == 3) {
							System.out.println("Borrar Empleado");
							System.out.println("Indique el numero de DNI que desea borrar");
							System.out.println(gestion.ConsultarEmpleados(1, "1", 0));
							dNI = entrada.nextLine();
							dNI = entrada.nextLine();
							System.out.println(gestion.BorrarEmpleado(dNI));

						}
						if (opcionMenu2 == 4) {
							System.out.println("Listar todos los empleados");
							System.out.println(gestion.ConsultarEmpleados(1, "1", 0));

						}
						if (opcionMenu2 == 5) {
							System.out.println("Listar todos los empleados de un departamento");
							System.out.println("Indique el id del departamento");
							iDDepartamento = entrada.nextInt();
							System.out.println(gestion.ConsultarEmpleados(2, "1", iDDepartamento));

						}
						if (opcionMenu2 == 6) {
							System.out.println("Consultar empleados por nif/dni");
							System.out.println("Indique el numero de DNI:");
							String DNI = entrada.nextLine();
							DNI = entrada.nextLine();
							System.out.println(gestion.ConsultarEmpleados(0, DNI, 0));

						}
						if (opcionMenu2 == 7) {
							System.out.println(
									"Consultar empleados que tengan un salario superior al introducido por el usuario.");
							System.out.println("Indique el salario Mensual");
							sal = entrada.nextFloat();
							System.out.print(gestion.ConsultarEmpleadossal(2, sal));

						}
						if (opcionMenu2 == 8) {
							System.out.println(
									"Consultar empleados que tengan un salario igual o inferior al introducido por el usuario");
							System.out.println("Indique el salario Mensual");
							sal = entrada.nextFloat();
							System.out.print(gestion.ConsultarEmpleadossal(1, sal));

						}

					}

					else if (opcionMenu == 1) {
						System.out.println();
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
							System.out.println(gestion.addDepartamento(nombre));

						}
						if (opcionMenu == 2) {
							System.out.println("Modificar Departamento");
							System.out.println("Indique el numero de ID que desea Modificar");
							iDDepartamento = entrada.nextInt();

							System.out.println("Indique el nombre nuevo para el departamento");
							nombre = entrada.nextLine();
							nombre = entrada.nextLine();
							System.out.println(gestion.ModDepartamento(iDDepartamento, nombre));

						}
						if (opcionMenu == 3) {
							System.out.println("Borrar Departamento");
							System.out.println("Indique el numero de ID que desea borrar");
							iDDepartamento = entrada.nextInt();
							System.out.println(gestion.BorrarDepartamento(iDDepartamento));

						}
						if (opcionMenu == 4) {
							System.out.println("Listar todos los Departamentos");
							System.out.println(gestion.ListarDep(0,"0",0));

						}
						if (opcionMenu == 5) {
							System.out.println("Consultar departamento por nombre");
							System.out.println("indique el nombre del departamento");
							nombre = entrada.nextLine();
							nombre = entrada.nextLine();
							System.out.println(gestion.ListarDep(1,nombre,0));

						}
						if (opcionMenu == 6) {
							System.out.println("Consultar Departamentos por ID");
							System.out.println("indique el ID del departamento");
							iDDepartamento = entrada.nextInt();
							System.out.println(gestion.ListarDep(2,"0",iDDepartamento));

						}
					} else if (opcionMenu == 3) {
						System.out.println("Los datos han sido guardados correctamente");
						salir = true;

					} else {
						System.out.println(
								"El numero introducido no esta en el menu vuelva a intentarlo con una de las opciones disponibles");
					}

				} catch (java.lang.ArrayIndexOutOfBoundsException b) {
					System.out.println("el parametro indicado es incorrecto reviselo ");
				}
			} catch (java.util.InputMismatchException a) {
				System.out.println("el parametro indicado es incorrecto reviselo ");
				entrada.next();
			}

		}
		entrada.close();

	}

}
