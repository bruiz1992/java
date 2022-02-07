package Tema4.Colegio;

import java.util.Scanner;

public class Curso {

	String asignatura;
	Alumno lista[] = new Alumno[30];

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public Alumno[] getLista() {
		return lista;
	}

	public void setLista(Alumno[] lista) {
		this.lista = lista;
	}

	public void Listar() {
		try {
			for (int i = 0; i < lista.length; i++) {
				lista[i].getNombre();

				if (i > lista.length) {
					System.out.println("");

				} else {
					System.out.println((i + 1) + " " + lista[i].getNombre());
				}

			}
		} catch (java.lang.NullPointerException b) {

		}
	}

	public void ListarTodo() {
		String str = "";
		try {
			for (int i = 0; i < lista.length; i++) {
				lista[i].toString();

				if (i > lista.length) {
					//System.out.println("");

				} else {
						str = i+1 + " " + lista[i].toString1();							////////////////////////////////////////////////////
						System.out.println((i + 1) + " " + lista[i].toString1());
				}

			}
		} catch (java.lang.NullPointerException b) {

		}
	}

	public Alumno[] burbuja() {
		
		Curso nuevo2 = new Curso();

		Alumno elementoSiguiente1 = null;
		Alumno elementoActual1 = null;
		int j = 0;
		Alumno Aux = new Alumno(null, null, null, null, null);
		nuevo2.lista[0] = Aux;
		for (int x = 0; x < (lista.length - 1); x++) {
			// comrpobar la cantidad de veces que tiene que recorrer la lista
			// El segundo for es para ordenar el arreglo,
			// comparo los dos nombres
			try {
				for (int y = 0; y < lista.length; y++) {
					String elementoActual = lista[y].getNombre(),
							elementoSiguiente = lista[y + 1].getNombre();
					elementoSiguiente1 = lista[y + 1];
					elementoActual1 = lista[y];

					char A = elementoActual.charAt(j);
					char B = elementoSiguiente.charAt(j);
					if (A == B) {

						j++;
						y = y - 1;
					}
					if (A > B) {

						// Intercambiar
						Aux = lista[y];
						lista[y] = elementoSiguiente1;
						lista[y + 1] = elementoActual1;
						j = 0;
					}
				}
			} catch (java.lang.NullPointerException b) {

			}
		}
		return lista;

	}

	// public void borrar(int opcion1) {
	public Alumno[] borrar(int opcion1) {

		for (int x = (opcion1 - 1); x < (lista.length - 1); x++) {
			lista[x] = lista[x + 1];

		}
		return lista;

	}

	/*
	 * public Alumno AñadirAlumno(String Nombre, String apellidos, String DNI,
	 * String Direccion, Double nota) { Alumno B = new Alumno(null, null, null,
	 * null, null); B.setNombre(Nombre); B.setApellido(apellidos); B.setDNI(DNI);
	 * B.setDireccion(Direccion); B.setNota(nota);
	 * 
	 * return B; }
	 */

	public int estadisticas() {

		int Matricula = 0, suspendido = 0, aprobados = 0, bienes = 0, notables = 0, sobresalientes = 0,
				nopresentados = 0;
		Alumno[] listado = getLista();
		for (int x = 0; x < listado.length; x++) {
			try {
				String calificacion = lista[x].calificacion;

				if (listado[x].calificacion.equals("Aprobado")) {
					aprobados++;
				}
				if (listado[x].calificacion.equals("nopresentados")) {
					nopresentados++;
				}
				if (listado[x].calificacion.equals("suspendido")) {
					suspendido++;
				}
				if (listado[x].calificacion.equals("Notable")) {
					notables++;
				}
				if (listado[x].calificacion.equals("Sobresaliente")) {
					sobresalientes++;
				}
				if (listado[x].calificacion.equals("Matricula")) {
					Matricula++;
				}
				if (listado[x].calificacion.equals("nopresentados")) {
					nopresentados++;
				}
			} catch (java.lang.NullPointerException b) {

			}

		}
		int Total = (Matricula + suspendido + aprobados + bienes + notables + sobresalientes + nopresentados);
		int porcentage = (((Matricula + aprobados + bienes + notables + sobresalientes) / Total) * 100);

		return porcentage;

	}

}
