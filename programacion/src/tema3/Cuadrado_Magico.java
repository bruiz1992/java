package tema3;

import java.util.Scanner;

public class Cuadrado_Magico {

	static void visualizar(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Pulse enter para visulizar la matriz");
		s.nextLine();
		int matriz[][] = new int[3][3];
		matriz[0][0] = 4;
		matriz[0][1] = 9;
		matriz[0][2] = 2;
		matriz[1][0] = 3;
		matriz[1][1] = 5;
		matriz[1][2] = 7;
		matriz[2][0] = 8;
		matriz[2][1] = 1;
		matriz[2][2] = 6;
		visualizar(matriz);
		System.out.println("Pulse enter para saber si es un cuadrado magico");
		s.nextLine();
		int columna1 = matriz[0][0] + matriz[0][1] + matriz[0][2];
		int columna2 = matriz[1][0] + matriz[1][1] + matriz[1][2];
		int columna3 = matriz[2][0] + matriz[2][1] + matriz[2][2];
		int fila1 = matriz[0][0] + matriz[1][0] + matriz[2][0];
		int fila2 = matriz[1][0] + matriz[1][1] + matriz[1][2];
		int fila3 = matriz[2][0] + matriz[2][1] + matriz[2][2];
		int diagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
		int diagonal2 = matriz[2][0] + matriz[1][1] + matriz[0][2];
		if (columna1 == columna2 && columna1 == columna3) {
			System.out.println();
			if (fila1 == fila2 && fila1 == fila3 && columna1 == fila1) {
				System.out.println();
				if (diagonal1 == diagonal1 && diagonal1 == fila1) {
					System.out.println("Los numeros introducidos crean un cuadrado magico con resultado: " + fila1);
				}else {
					System.out.println("lo siento, los numero introducidos no crean un cuadrado magico. :( :(");
				}
			} else {
				System.out.println("lo siento, los numero introducidos no crean un cuadrado magico. :( :(");
			}

		} else {
			System.out.println("lo siento, los numero introducidos no crean un cuadrado magico. :( :(");
		}

	}

}
