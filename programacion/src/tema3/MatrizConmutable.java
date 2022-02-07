package tema3;

import java.util.Arrays;

public class MatrizConmutable {
	static void visualizar(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
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
		System.out.println("Vamos a comprobar si las siguientes matrices de 2*2 son conmutables");
		int[][] matriz1 = new int[2][2];
		int[][] matriz2 = new int[2][2];
		matriz1[0][0] = 1;
		matriz1[0][1] = 0;
		matriz1[1][0] = 0;
		matriz1[1][1] = 0;
		matriz2[0][0] = 1;
		matriz2[0][1] = 0;
		matriz2[1][0] = 0;
		matriz2[1][1] = 0;
		
		visualizar(matriz1);
		System.out.println();
		System.out.println();
		System.out.println();
		visualizar(matriz1);
		System.out.println();
		System.out.println();
		int[][] matrizresul1 = multiplicacionMatrices(matriz1,matriz2);
		visualizar(matrizresul1);
		System.out.println();
		System.out.println();
		int[][] matrizresul2 = multiplicacionMatrices(matriz2,matriz1);
		visualizar(matrizresul2);
		System.out.println();
		System.out.println();
		if (Arrays.deepEquals(matrizresul1, matrizresul2))
			  System.out.println("Son matrices idenpotentes");
			else
			  System.out.println("no lo son :( :( :(");
		
		
		
	}

}
