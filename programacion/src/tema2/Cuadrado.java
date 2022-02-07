package tema2;

public class Cuadrado {

	public static void main(String[] args) {
		System.out.print("Estos son los 9 primero numeros elevados al cuadrado: ");
		int contador = 1;
		int Numeroa = 1;
		int Cuenta = contador;
		while (contador <= 9) {
			System.out.println("El cuadrado de " + contador + " es " + Cuenta + " " );
			contador = contador + 1 ;
			Numeroa = contador;
			Cuenta = Numeroa * Numeroa;
		}
	}

}
