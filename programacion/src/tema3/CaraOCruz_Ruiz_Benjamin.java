package tema3;
import java.util.Scanner;
public class CaraOCruz_Ruiz_Benjamin {

	public static void main(String[] args) {
		boolean salir = true;
		Scanner s = new Scanner(System.in);
		while (salir == true) {
		System.out.println("pulse 0 para lanzar una moneda ");
		System.out.println("pulse 1 para salir ");
		int opcion = s.nextInt();
		if (opcion == 1) {
			salir = false;
			System.out.println("hasta pronto ");
		}
		else {
		
			for (int i = 1; i < 2; i++) {
			float moneda = ((int)(Math.random() *10));
			if ( moneda >= 5 ) {
			System.out.println("cara");
		}
			else {
			System.out.println("cruz");
		}
		}}


	}}



	}


