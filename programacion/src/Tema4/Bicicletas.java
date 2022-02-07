package Tema4;
import java.util.Scanner;
public class Bicicletas {

	public static void main(String[] args) {


		boolean salir =false;
		Scanner entrada = new Scanner (System.in);
		Bicicleta miBicicleta = new Bicicleta();
		
		while (salir == false) {
			System.out.println(" *** INTRODUZCA NUMERO DE OPCION ***");
			System.out.println();
			System.out.println(" *1* ACELERAR");
			System.out.println(" *2* FRENAR");
			System.out.println(" *3* CAMBIAR PLATO");
			System.out.println(" *4* CAMBIAR PIÑON");
			System.out.println();
			miBicicleta.marcador();
			/*System.out.println("LA BICICLETA VA A " + miBicicleta.velocidadActual + "KM/H");
			System.out.println("LA BICICLETA ESTA EN EL PIÑON " + miBicicleta.piñonActual);
			System.out.println("LA BICICLETA ESTA EN EL PLATO " + miBicicleta.platoActual);*/

			int numero = entrada.nextInt();

			if(numero == 1) {
				miBicicleta.acelerar();
		//		System.out.println("LA BICICLETA VA A " + miBicicleta.velocidadActual + "KM/H");

			}else if(numero == 2) {
				miBicicleta.frenar();
				//System.out.println("LA BICICLETA VA A " + miBicicleta.velocidadActual + "KM/H");
		
			}else if (numero ==3) {
				System.out.println("¿QUE PLATO QUIERES?");
				int plato = entrada.nextInt();
				miBicicleta.cambiarPlato(plato);
				
			}else if (numero ==4) {
				System.out.println("¿QUE PIÑON QUIERES?");
				int piñon = entrada.nextInt();
				miBicicleta.cambiarPiñon(piñon);
			}		
		}
	}
}
