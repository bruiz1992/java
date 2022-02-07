package tema2;
import java.util.Scanner;
//Leer varios datos en una misma linea con Scanner
 


import java.util.Scanner;

public class LeerDatosConScanner_B_04 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Introduce tu nombre y tu edad separados por un espacio: ");

		String nombre = s.next();
		int edad = s.nextInt();

		System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
	}
}