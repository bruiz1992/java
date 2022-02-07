package tema2;
import java.util.Scanner;


public class OpercionifAnidado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String a = "uno", b = ", dos", c = ", tres", d = ", cuatro", e = ", cinco", f = ", seis", g = ", siete", h = ", ocho", i = ", nueve", j = ", diez";
		
		
		System.out.print("Por favor, introduce un numero del 1 al 10: ");
		int numero = (entrada.nextInt());
		
		if (numero == 1) {
			System.out.print("El resultado es " + a);
			}
		else if (numero == 2) {
			System.out.print("El resultado es " + a + b);
		}
		else if (numero == 3) {
			System.out.print("El resultado es " + a + b + c);
		}
		else if (numero == 4) {
			System.out.print("El resultado es " + a + b + c + d);
		}
		else if (numero == 5) {
			System.out.print("El resultado es " + a + b + c + d + e);
		}
		else if (numero == 6) {
			System.out.print("El resultado es " + a + b + c + d + e + f);
		}
		else if (numero == 7) {
			System.out.print("El resultado es " + a + b + c + d + e + f + g);
		}
		else if (numero == 8) {
			System.out.print("El resultado es " + a + b + c + d + e + f + g + h);
		}
		else if (numero == 9) {
			System.out.print("El resultado es " + a + b + c + d + e + f + g + h + i);
		}
		else if (numero == 10) {
			System.out.print("El resultado es " + a + b + c + d + e + f + g + h + i + j);
		}
		else {
			System.out.print("El numero indicado no esta entre 1 y 10 ");
		}
		
		
		
		
		
		
	}
}
