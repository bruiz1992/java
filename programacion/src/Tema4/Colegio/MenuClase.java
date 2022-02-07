package Tema4.Colegio;

import java.util.Arrays;
import java.util.Scanner;

import Tema4.Fraccion;

public class MenuClase {

	public static void main(String[] args) {
		int contador = 4;
		Alumno A1 = new Alumno("Miguel", "garcia", "2121212M", "calle A n 1", 6.0);
		Alumno A2 = new Alumno("Aaron", "martin", "6598745J", "calle A n 1", 8.0);
		Alumno A3 = new Alumno("Ivan", "perez", "12345678G", "calle A n 1", 9.0);
		Alumno A4 = new Alumno("Alejandro", "ruiz", "98765421k", "calle A n 1", 4.0);

		Scanner entrada = new Scanner(System.in);
		boolean salir = false;
		int opcion = 0;
		Curso curso = new Curso();
		Curso calificaciones = new Curso();
		curso.lista[00] = A1;
		curso.lista[01] = A2;
		curso.lista[02] = A3;
		curso.lista[03] = A4;
		curso.lista = curso.burbuja();
		curso.Listar();

		// nuevo.ListarTodo(nuevo.lista);

		while (salir == false) {
			try {
				try {
					System.out.println("OPCIONES DE MENUS");
					System.out.println("	1. añadir nuevo alumno");
					System.out.println("	2. Borrar alumno ya existente");
					System.out.println("	3. modificar datos de alumnos");
					System.out.println("	4. cambiar nota");
					System.out.println("	5. estadisticas");
					System.out.println("	6. pasar lista");
					System.out.println("	7. Salir");
					System.out.println("	Introduce tu opcion: ");

					opcion = entrada.nextInt();

					if (opcion == 7) { // Opcion para finalizar el programa salir = true;
						System.out.println("Hasta pronto");
						
					} else if (opcion == 1) {
						System.out.println("Elegiste ** Añadir nuevo alumno ** ");
						String Nombre, apellidos, DNI, Direccion;
						Double nota;
						System.out.println("Ingrese nombre del nuevo alumno");
						Nombre = entrada.nextLine();
						Nombre = entrada.nextLine();
						System.out.println("Ingrese apellido del nuevo alumno");
						apellidos = entrada.nextLine();
						System.out.println("Ingrese DNI del nuevo alumno");
						DNI = entrada.nextLine();
						System.out.println("Ingrese Direccion del nuevo alumno");
						Direccion = entrada.nextLine();
						System.out.println("Ingrese Nota del nuevo alumno");
						nota = entrada.nextDouble();
						
						Alumno añadir = new Alumno(Nombre, apellidos, DNI, Direccion, nota);
						
						curso.lista[contador] = añadir;
						contador++;
						curso.lista = curso.burbuja();
						curso.Listar();
						System.out.println();
					} else if (opcion == 2) {
						System.out.println("Elegiste ** Borrar alumno ya existente ** ");
						System.out.println("indicque el numero de la lista del alumno que desea eliminar ** ");
						int opcion1 = entrada.nextInt();
						curso.lista = curso.borrar(opcion1);
						curso.lista = curso.burbuja();
						curso.Listar();
						contador--;
						System.out.println();
					} else if (opcion == 3) {
						System.out.println("Elegiste ** modificar datos de alumnos ** ");
						System.out.println("Indique el alumno con su numero de lista");
						int opcion1 = entrada.nextInt();
						System.out.println("Indique la nueva direccion completa:");
						String Direccion;
						Direccion = entrada.nextLine();
						Direccion = entrada.nextLine();
						curso.lista[opcion1].setDireccion(Direccion);
						System.out.println("Direcion modificada a " + curso.lista[opcion1].toString());
						curso.lista = curso.burbuja();
						curso.ListarTodo();
						System.out.println();
					} else if (opcion == 4) {
						System.out.println("Elegiste ** cambiar nota ** ");
						System.out.println("Indique al alumno con su numero de lista");
						int opcion1 = entrada.nextInt();
						System.out.println("Indique la nueva nota");
						double nota;
						nota = entrada.nextDouble();
						curso.lista[opcion1].setNota(nota);
						System.out.println("Nota modificada a " + curso.lista[opcion1].toString());
						curso.lista = curso.burbuja();
						curso.ListarTodo();
						System.out.println();

					} else if (opcion == 5) {
						System.out.println("Elegiste ** estadisticas ** ");
						System.out.println("El procentaje total de aprobados es " + curso.estadisticas() + "%");
					} else if (opcion == 6) {
						System.out.println("Elegiste ** pasar lista ** ");
						curso.ListarTodo();
						System.out.println();
					}

				} catch (java.util.InputMismatchException a) {
					System.out.println("el parametro indicado es incorrecto reviselo ");
					entrada.next();

				}
			} catch (java.lang.ArrayIndexOutOfBoundsException b) {
				System.out.println("el parametro indicado es incorrecto reviselo ");
				entrada.next();
			}

		}

	}

}
