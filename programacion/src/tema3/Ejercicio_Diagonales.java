package tema3;

import java.util.Scanner;

public class Ejercicio_Diagonales {
	
	public static int[][] generar_matriz(int n) {
		int[][] matriz = new int[n][n];
		int aleatorio = (int) ((Math.random() * 10));
		for (int x=0; x < matriz.length; x++) {
			  for (int y=0; y < matriz[x].length; y++) {
			    matriz[x][y] = (int) (Math.random()*10);
				
			  }
			  
			}
		
		return (matriz);
	}
    static void visualizar(int[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Indique el tama�o de la matriz con un numero entero positivo");
		int opcion = s.nextInt();
		
		int[][] matriz = generar_matriz(opcion);
		visualizar(matriz);
        for (int f=0 ; f < matriz.length ; f++){
            matriz[f][f]=1;                           
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("matriz con una diagonal");
        visualizar(matriz);
        int x=0;
        int y = matriz.length - 1;
        for (x=0 ; y != -1 ; y--){
            matriz[x][y]=1;  
            x++;
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("matriz con una doble diagonal");
        visualizar(matriz);
	
		
	
	}

}
