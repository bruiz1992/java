package practica1AD;

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

		Gestion gestion = new Gestion();

		// System.out.print(gestion.ConsultarEmpleados(1,dni,passwd,user));
		// System.out.print(gestion.ConsultarEmpleadossal(0,sal,passwd,user));
		try {
			try {

				System.out.println("introduzca el nombre de usuario");
				user = entrada.nextLine();
				System.out.println("introduzca la contraseña");
				passwd = entrada.nextLine();

				int opcionMenu;
				while (salir == false) {

					System.out.println("OPCIONES DE MENU");
					System.out.println("1.Consultar todos los empleados");
					System.out.println("2.Consultar por DNI");
					System.out.println("3.Consultar empleados que tengan un salario superior al introducido por\r\n"
							+ "el usuario.");
					System.out.println("4.Consultar empleados que tengan un salario igual o inferior al\r\n"
							+ "introducido por el usuario.");
					System.out.println("5.Salir.");

					opcionMenu = entrada.nextInt();

					if (opcionMenu == 1) {
						System.out.println("1.Consultar todos los empleados");
						System.out.print(gestion.ConsultarEmpleados(1, dni, passwd, user));

					}
					if (opcionMenu == 2) {
						System.out.println("2.Consultar por DNI");
						System.out.println("Indique el numero de DNI:");
						String DNI = entrada.nextLine();
						DNI = entrada.nextLine();
						System.out.print(gestion.ConsultarEmpleados(0, DNI, passwd, user));

					}
					if (opcionMenu == 3) {
						System.out.println("3.Consultar empleados que tengan un salario superior al introducido por\r\n"
								+ "el usuario.");
						System.out.println("Indique el nuevo salario");
						sal = entrada.nextFloat();
						System.out.print(gestion.ConsultarEmpleadossal(0, sal, passwd, user));

					}
					if (opcionMenu == 4) {
						System.out.println("4.Consultar empleados que tengan un salario igual o inferior al\r\n"
								+ "introducido por el usuario.");
						System.out.println("Indique el nuevo salario");
						sal = entrada.nextFloat();
						System.out.print(gestion.ConsultarEmpleadossal(1, sal, passwd, user));

					}
					if (opcionMenu == 5) {
						System.out.println("Adios");
						salir = true;

					}
				}

			} catch (java.lang.ArrayIndexOutOfBoundsException b) {
				System.out.println("el parametro indicado es incorrecto reviselo ");
			}
		} catch (java.util.InputMismatchException a) {
			System.out.println("el parametro indicado es incorrecto reviselo ");
			entrada.next();
		}

		entrada.close();
	}

}
