package tema3;

import java.util.Scanner;

public class Multiplicar_matrices {

	static void visualizar(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static int[][] generar_matriz(int n, int m) {
		int[][] matriz = new int[n][m];
		int aleatorio = (int) ((Math.random() * 10));
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				matriz[x][y] = (int) (Math.random() * 10);
				
			}

		}

		return (matriz);
	}
	   public static int[][] multiplicacionMatrices ( int[][] a, int[][] b) {
		      int[][] c = new int[a.length][b[0].length];
		      
		      for (int i= 0; i<c.length; i++){//numero de columna;
		          for (int j=0; j<c[0].length; j++){//numero de fila;
		              for (int k=0; k<b.length; k++){//suma y multiplicacion;
		                  c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
		                  
		                  }}}
		      
		      return c;
		   }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean salir = true;
		int[][] matriz = null;
		int[][] matriz2 = null;
		int opcion = 0, opcion2 = 0, opcion3 = 0, opcion4 = 0;
		System.out.println("Vamos a multiplicar 2 matrices");
		while (salir == true) {
			System.out.println("Indique el tamaño del alto de la matriz 1");
			opcion = s.nextInt();
			System.out.println("Indique el tamaño del ancho de la matriz 1");
			opcion2 = s.nextInt();
			matriz = generar_matriz(opcion, opcion2);
			visualizar(matriz);
			System.out.println("Indique el tamaño del alto de la matriz 2");
			opcion3 = s.nextInt();
			System.out.println("Indique el tamaño del ancho de la matriz 2");
			opcion4 = s.nextInt();
			matriz2 = generar_matriz(opcion3, opcion4);
			visualizar(matriz2);
			if (opcion2 == opcion3) {
				salir = false;
			} else {
				System.out.println("Estas matrices no pueden ser multiplicadas, vuelva a introducir los datos");
			}
		}
		
		int[][] matrizresul = multiplicacionMatrices(matriz,matriz2);
		
		System.out.println();
		
		visualizar(matrizresul);
		
	}
}
