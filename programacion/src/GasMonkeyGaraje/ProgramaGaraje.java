package GasMonkeyGaraje;

import java.util.Scanner;

public class ProgramaGaraje {

	public static void main(String[] args) {
		boolean salir = true;
		Scanner entrada = new Scanner(System.in);
		String observaciones;
		revision pruebarevision = new revision("pruebas");
		ReparacionMecanica pruebaReparacionMecanica = new ReparacionMecanica("pruebas");
		Reparacion pruebaReparacionMecanica2 = new Reparacion("pruebas");
		RepChapaPintura pruebaRepChapaPintura = new RepChapaPintura("pruebas");
		Taller taller = new Taller();
		taller.añadirTrabajo(pruebarevision);
		taller.añadirTrabajo(pruebaRepChapaPintura);
		taller.añadirTrabajo(pruebaReparacionMecanica2);
		taller.añadirTrabajo(pruebaReparacionMecanica);

		while (salir == true) {
			System.out.println("1. Registra nuevo trabajo" + "\n" + "2. Aumentar horas" + "\n"
					+ "3. Aumentar coste de piezas" + "\n" + "4. Finaliza trabajo" + "\n" + "5. Muestra trabajo" + "\n"
					+ "6. Salir" + "\n" + "Elige una opción (1-6):");

			int opcion = entrada.nextInt();

			if (opcion == 1) {
				System.out.println("Elegiste Registra nuevo trabajo " + "/n" + " Selecione el tipo de nuevo trabajo"
						+ "\n" + "1. Reparacion Chapa y pintura" + "\n" + "2. Reparacion Mecanica" + "\n"
						+ "3. Revision" + "\n");
				int opcion2 = entrada.nextInt();

				if (opcion2 == 1 || opcion2 == 2 || opcion2 == 3) {
					if (opcion2 == 1) {
						System.out.println("Elegiste Reparacion Chapa y pintura" + "\n"
								+ "Indique Las observaciones de la reparacion:");
						observaciones = entrada.nextLine();
						observaciones = entrada.nextLine();
						taller.queTrabajo(opcion2, observaciones);
						System.out.println();
					}
					if (opcion2 == 2) {
						System.out.println(
								"Elegiste Reparacio nMecanica" + "\n" + "Indique Las observaciones de la reparacion:");
						observaciones = entrada.nextLine();
						observaciones = entrada.nextLine();
						taller.queTrabajo(opcion2, observaciones);
						System.out.println();
					}
					if (opcion2 == 3) {
						System.out.println("Elegiste Revision" + "\n" + "Indique Las observaciones de la reparacion:");
						observaciones = entrada.nextLine();
						observaciones = entrada.nextLine();
						taller.queTrabajo(opcion2, observaciones);
						System.out.println();
					}

				}

			}
			if (opcion == 2) {
				System.out.println("Elegiste ** Aumentar horas ** ");
				System.out.println("Por favor indique el ID del trabajo del que quiere aumentar horas");
				int ID = entrada.nextInt();
				System.out.println("Por favor indique la cantidad de horas que quiere aumentar");
				int añadir = entrada.nextInt();
				int resultadoHoras = taller.aumentarHoras(ID, añadir);
				if (resultadoHoras == 1) {
					System.out.println("El ID de trabajo no exste, por favor indique uno valido");
				} else if (resultadoHoras == 0) {
					System.out.println("Se han añadido " + añadir + " a el trabajo con ID: " + ID);

				}else {
					System.out.println("El ID indicado ya esta finalizado no es posible realizar modificaciones");
				}

			}
			if (opcion == 3) {
				System.out.println("Elegiste ** Aumentar coste de piezas ** ");
				System.out.println("Por favor indique el ID del trabajo del que quiere El coste de piezas");
				int ID = entrada.nextInt();

				System.out.println("Por favor indique el coste de la pieza");
				int añadir = entrada.nextInt();
				int resultadoPiezas = taller.costePiezas(ID, añadir);
				if (resultadoPiezas == 1) {
					System.out.println("El ID de trabajo no exste, por favor indique uno valido");
				} else if (resultadoPiezas == 0) {
					System.out.println("Se ha añadido " + añadir + " de coste en piezas a el trabajo con ID: " + ID);

				}else {
					System.out.println("El ID indicado ya esta finalizado no es posible realizar modificaciones");
				}

			}
			if (opcion == 4) {
				System.out.println("Elegiste ** Finaliza trabajo ** ");
				System.out.println("Por favor indique el ID del trabajo del que quiere finalizar");
				int ID = entrada.nextInt();
				int resultadofinalizar = taller.finalizarTrabajo(ID);
				if (resultadofinalizar == 1) {
					System.out.println("El ID de trabajo no exste, por favor indique uno valido");
				} else if (resultadofinalizar == 0) {
					System.out.println("Se ha añadido finalizado el trabajo " + ID);
					taller.Imprimir(ID);
				}else {
					System.out.println("El ID indicado ya esta finalizado no es posible realizar modificaciones");
				}

			}
			if (opcion == 5) {
				System.out.println("Elegiste ** Muestra trabajo ** ");
				System.out.println("Por favor indique el ID del trabajo del que quiere mostrar");
				int ID = entrada.nextInt();
				boolean resultadomostrar = taller.ExiteTrabajo(ID);
				if (resultadomostrar == false) {
					System.out.println("El ID de trabajo no exste, por favor indique uno valido");
				} else if (resultadomostrar == true) {
					System.out.println(taller.Imprimir(ID));

				}

			}
			if (opcion == 6) {

				System.out.println("Elegiste ** Salir ** ");
				salir = false;
			}

		}
	}
}
