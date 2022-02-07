package tema3;
import java.util.Arrays;
import java.util.Scanner;
public class MatrizIdenpotente {
	static void visualizar(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
	   public static int[][] elevarMatrices ( int[][] a) {
		      int[][] c = new int[2][2];
		      
		      for (int i= 0; i<c.length; i++){//numero de columna;
		          for (int j=0; j<c[0].length; j++){//numero de fila;
		              for (int k=0; k<a.length; k++){//elevar;
		                  c[i][j] = a[i][j] * a[i][j];
		                  
		                  }}}
		      
		      return c;
		   }
		public static int[][] generar_matriz(int n, int m) {
			int[][] matriz = new int[n][m];
			int aleatorio = (int) ((Math.random() * 10));
			for (int x = 0; x < matriz.length; x++) {
				for (int y = 0; y < matriz[x].length; y++) {
					matriz[x][y] = (int) (1);
					
				}

			}

			return (matriz);
		}
	public static void main(String[] args) {
		int opcion, opcion2;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Vamos a comprobar si la siguiente matriz de 2*2 es idempotente");
		int[][] matriz1 = new int[2][2];
		
		/*System.out.println("Indique el tamaño del alto de la matriz 1");
		opcion = s.nextInt();
		System.out.println("Indique el tamaño del ancho de la matriz 1");
		opcion2 = s.nextInt();
		int[][] matriz1 = generar_matriz(opcion, opcion2);*/
		matriz1[0][0] = 1;
		matriz1[0][1] = 0;
		matriz1[1][0] = 0;
		matriz1[1][1] = 0;

		visualizar(matriz1);
		System.out.println();
		System.out.println();
		System.out.println();
		int[][] matrizresul2 = elevarMatrices(matriz1);
		visualizar(matrizresul2);
		if (Arrays.deepEquals(matriz1, matrizresul2))
			  System.out.println("Son matrices conmutables");
			else
			  System.out.println("no lo son :( :( :(");
		
		
		
	}

	}


