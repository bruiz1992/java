package tema2;

import java.util.Scanner;
public class primosAnteriores {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
 
		int numero,divisor=2;
		boolean esPrimo=true;
 
		System.out.println("Introduzca un número");
		numero= teclado.nextInt();
		numero--;
 
		while (esPrimo && divisor <numero){
 
 
			esPrimo=numero%divisor !=0;
			divisor++;
 
 
		if (esPrimo==true){
 
			System.out.println(numero);
		divisor=2;
		numero--;
		}
		else
 
			esPrimo=true;
		divisor=2;
		numero--;
 
		}
	}
}
