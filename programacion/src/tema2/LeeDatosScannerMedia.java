package tema2;


/**
* Lectura de datos desde teclado usando la clase Scanner
*
* El siguiente programa de ejemplo calcula la media de tres números decimales. Para
*  leer cada uno de los números en la misma línea se utiliza s.nextDouble.
*/
import java.util.Scanner;

public class LeeDatosScannerMedia {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce tres números (pueden contener decimales) separados por espacios: ");

		double x1 = s.nextDouble();
		double x2 = s.nextDouble();
		double x3 = s.nextDouble();

		double media = (x1 + x2 + x3) / 3;
		System.out.println("La media de esos tres números es " + media);
	}
}