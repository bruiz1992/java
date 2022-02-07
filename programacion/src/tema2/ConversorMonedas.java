package tema2;

//Lectura de datos desde teclado usando la clase Scanner
import java.util.Scanner;

public class ConversorMonedas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce importe en euros para su conversion: ");
		double euro = entrada.nextDouble();
		double libra = 0.91 * euro;
		double dolar = euro * 1.17;

		System.out.print("El importe " + euro + " euros hace un total de " + libra + " libras esterlinas y " + dolar
				+ " dolares americanos");

	}

}
