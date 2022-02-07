package tema2;

import java.util.Scanner;

public class Dibujar {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca numero de filas: ");
        int numFilas = s.nextInt();
        s.close();
 
        System.out.println();
        for(int altura = 1; altura<=numFilas; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" ");
            }
 
            //dolar
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
