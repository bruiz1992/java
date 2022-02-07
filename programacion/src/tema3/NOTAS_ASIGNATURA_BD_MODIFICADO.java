package tema3;

import java.util.Scanner;

public class NOTAS_ASIGNATURA_BD_MODIFICADO {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("introduzca el numero de alumnos");
		int opcion = s.nextInt();
		int x;
		float[] numeros = new float[opcion];
		float aleatorio = (float) (Math.random() * 10);
		for (x = 0; x < numeros.length; x++) {

			numeros[x] = (float) (Math.random() * 10);
			System.out.println(numeros[x]);
		}
		int i = 0;
		int n = 1;
		int suspensos = 0, aprobados = 0, bienes = 0, notables = 0, sobresalientes = 0;
		float sumatorio = 0;
		while (i < x) {
			sumatorio = sumatorio + numeros[i];
			if (numeros[i] < 5) {
				suspensos++;
			} else if (numeros[i] > 5 && numeros[i] < 6) {
				aprobados++;
			} else if (numeros[i] > 6 && numeros[i] < 7) {
				bienes++;
			} else if (numeros[i] > 7 && numeros[i] < 9) {
				notables++;
			} else if (numeros[i] > 9) {
				sobresalientes++;
			}
			i++;

		}
		System.out.print("en clase hay un total de " + suspensos + " suspensos, " + aprobados + " aprobados, " + bienes
				+ " bienes," + notables + " notables, " + sobresalientes + " sobresalientes.");
		float media = sumatorio / opcion;
		System.out.print("la nota media de la clase es: " + media);

	}
}
