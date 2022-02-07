package practica2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {

		boolean salir = false;
		Scanner entrada = new Scanner(System.in);
		int opcionMenu;
		ejercicio1 ej1 = new ejercicio1();
		ejercicio2 ej2 = new ejercicio2();
		ejercicio3 ej3 = new ejercicio3();
		ejercicio4 ej4 = new ejercicio4();

		while (salir == false) {

			System.out.println("OPCIONES DE MENU");
			System.out.println("ejercicio 1");
			System.out.println("ejercicio 2");
			System.out.println("ejercicio 3");
			System.out.println("ejercicio 4");
			System.out.println("Salir 5");
			ArrayList<String> personas = new ArrayList<String>();

			String DNI, nombre, apellidos, telefono, fecha;
			opcionMenu = entrada.nextInt();
			if (opcionMenu == 1) {

				System.out.println("Indique por favor el dni del cliente");
				DNI = entrada.nextLine();
				DNI = entrada.nextLine();
				System.out.println("indique el nombre");
				nombre = entrada.nextLine();
				System.out.println("indique el apellidos");
				apellidos = entrada.nextLine();
				System.out.println("indique el telefono");
				telefono = entrada.nextLine();
				System.out.println("indique el fecha de nacimiento");
				fecha = entrada.nextLine();
				ej1.eje1(DNI, nombre, apellidos, fecha, telefono);
				persona P = new persona(DNI, nombre, apellidos, fecha, telefono);
				personas.add(DNI);
				personas.add(nombre);
				personas.add(telefono);
				personas.add(fecha);

			}
			if (opcionMenu == 2) {
				ej2.ej2();

			}
			if (opcionMenu == 3) {
				ej3.ej3();
			}

			if (opcionMenu == 4) {

				int opcion1;

				System.out.println("OPCIONES DE MENU");
				System.out.println("1 crear nuevo usuario");
				System.out.println("2.indicar nombre de usuarios");
				System.out.println("3.indica la cantidad de usuarios");
				System.out.println("4.Mostrar solo un usuario concreto en base a su DNI");
				System.out.println("Salir 5");
				int opcionMenu2 = entrada.nextInt();
				if (opcionMenu2 == 1) {
					System.out.println("Indique por favor el dni del cliente");
					DNI = entrada.nextLine();
					DNI = entrada.nextLine();
					System.out.println("indique el nombre");
					nombre = entrada.nextLine();
					System.out.println("indique el apellidos");
					apellidos = entrada.nextLine();
					System.out.println("indique el telefono");
					telefono = entrada.nextLine();
					System.out.println("indique el fecha de nacimiento");
					fecha = entrada.nextLine();
					ej1.eje1(DNI, nombre, apellidos, fecha, telefono);
					personas.add(DNI);
					personas.add(nombre);
					personas.add(telefono);
					personas.add(fecha);
					ej4.escribir(personas);
				}
				if (opcionMenu2 == 2) {
					System.out.println("indicar nombre de usuarios");
					ej4.leerNombres();
				}
				if (opcionMenu2 == 3) {
					System.out.println("3.indica la cantidad de usuarios");
					opcion1 = entrada.nextInt();
					ej4.cantidad(opcion1);
				}
				if (opcionMenu2 == 4) {
					System.out.println("Mostrar solo un usuario concreto en base a su DNI");
					DNI = entrada.nextLine();
					DNI = entrada.nextLine();
					ej4.leerDNI(DNI);
				}

			}
			if (opcionMenu == 5) {
				// ej5.ej5();

			}

		}
		entrada.close();
	}
}
