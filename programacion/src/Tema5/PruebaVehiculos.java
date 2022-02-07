package Tema5;

import java.util.Scanner;



public class PruebaVehiculos {

	public static void main(String[] args) {

		boolean salir = true;
		Coche coche1 = new Coche(0, 0, null, 0);
		Bicicleta Bici = new Bicicleta(0, 0, 0, null);
		Coche coche2 = new Coche(0, 0, null, 0);
		Bicicleta Bici2 = new Bicicleta(0, 0, 0, null);

		Scanner entrada = new Scanner(System.in);
		while (salir == true) {
			System.out.println("1. Anda con la bicicleta" + "\n" + "2. Haz el caballito con la bicicleta" + "\n"
					+ "3. Anda con el coche" + "\n" + "4. Quema rueda con el coche" + "\n"
					+ "5. Ver kilometraje de la bicicleta" + "\n" + "6. Ver kilometraje del coche" + "\n"
					+ "7. Ver cantidad de vehiculos" + "\n" + "8. Salir" + "\n" + "Elige una opción (1-8):");

			int opcion = entrada.nextInt();
			

			if (opcion == 1) {
				System.out.println("Elegiste Anda en Bicicleta " + "/n" + " Cuanto has recorrido:");
				int recorrido = entrada.nextInt();
				Bici.andabici(recorrido);				
			} else if (opcion == 2) {
				System.out.println("Elegiste ** hacer un caballito con la bici ** ");
				System.out.println(Bici.caballito());
			} else if (opcion == 3) {
				System.out.println("Elegiste Anda en coche " + "/n" + " Cuanto has recorrido:");
				int recorrido = entrada.nextInt();
				coche1.andacoche(recorrido);
			} else if (opcion == 4) {
				System.out.println("Elegiste ** quemar ruedas con el coche ** ");
				System.out.print(coche1.quemaRueda());
			} else if (opcion == 5) {
				System.out.println("Elegiste ** ver kilometraje Bicicleta** ");
				System.out.println(Bici.getKmRecorridos());
			} else if (opcion == 6) {
				System.out.println("Elegiste ** ver kilometrajes coche ** ");
				System.out.println(coche1.getKmRecorridos());
			} else if (opcion == 7) {
				System.out.println("Elegiste ** Ver cantidad de vehiculos creados ** ");
				System.out.println(coche1.getVehiculosCreados());

			} else if (opcion == 8) {

				System.out.println("Elegiste ** Salir ** ");
				salir = false;
			}

		}

	}

	private static char[] getVehiculosCreados() {
		// TODO Auto-generated method stub
		return null;
	}

}
