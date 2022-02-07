package tema2;
import java.util.Scanner;
public class Dinero {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a500 = 500, a200 = 200, a100 = 100, a50 = 50, a20 = 20, a10 = 10, a5 = 5, a2 = 2, a1 = 1;
		int c500 = 0, c200 = 0, c100 = 0, c50 = 0, c20 = 0, c10 = 0, c5 = 0, c2 = 0, c1 = 0;
		
		System.out.print("Introduce un importe ");
		int a = s.nextInt();
		int b = a;
	while (a != 0) {
		
		if (a500 < a ) {
		a = a - a500;
		c500++;
		}
		else if (a200 < a ) {
		a = a - a200;
		c200++;
		}	
		else if (a100 < a ) {
		a = a - a100;
		c100++;
		}	
		else if (a50 < a ) {
		a = a - 50;
		c50++;
		}	
		else if (a20 < a ) {
		a = a - a10;
		c10++;
		}	
		else if (a10 < a ) {
		a = a - a10;
		c10++;
		}	
		else if (a5 < a ) {
		a = a - a5;
		c5++;
		}	
		else if (a2 < a ) {
		a = a - a2;
		c2++;
		}	
		else if (a1 <= a ) {
		a = a - a1;
		c1++;
		}	
		
		}
	System.out.println("El cambio de " + b + "son: " + c500++ + " billetes de 500, mas " + c200++ + " billetes de 200, mas " + c100++ + " billetes de 100, mas "  + c50++ + " billetes de 50, mas "  + c20++ + " billetes de 20, mas "  + c10++ + " billetes de 10, mas "  + c5++ + " billetes de 5 mas "  + c2++ + " monedas de 2, mas "  + c1++ +" monedas de 1"   );
	
	}
		
}
