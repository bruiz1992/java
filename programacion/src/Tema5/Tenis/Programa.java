package Tema5.Tenis;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean salir = false;

		Jugador L1 = new Jugador("rafa");
		Jugador L2 = new Jugador("carlos");
		Jugador V1 = new Jugador("cosa");
		Jugador V2 = new Jugador("roco");
		Equipo local = new Equipo();
		Equipo Visitante = new Equipo();
		Partido Semifinal = new Partido(local, Visitante);
		local.AñadirJugador(L1);
		local.AñadirJugador(L2);
		Visitante.AñadirJugador(V1);
		Visitante.AñadirJugador(V2);
		
		

		System.out.println("\n El partido va a comenzar \n" + "Indique el nombre del equipo Local \n");
		String nombreL = entrada.nextLine();
		local.setNombre(nombreL);
		System.out.println("\n Gracias \n" + "Indique el nombre del primer tenista del equipo local \n");
		String nombreL1 = entrada.nextLine();
		L1.setNombre(nombreL1);
		System.out.println("\n Gracias \n" + "Indique el nombre del Segundo tenista del equipo local \n");
		String nombreL2 = entrada.nextLine();
		L2.setNombre(nombreL2);
		System.out.println("Indique el nombre del equipo Visitante \n");
		String nombreV = entrada.nextLine();
		Visitante.setNombre(nombreV);
		System.out.println("\n Gracias \n" + "Indique el nombre del primer tenista del equipo visitante \n");
		String nombreV1 = entrada.nextLine();
		V1.setNombre(nombreV1);
		System.out.println("\n Gracias \n" + "Indique el nombre del Segundo tenista del equipo visitante \n");
		String nombreV2 = entrada.nextLine();
		V2.setNombre(nombreV2);
		System.out.println("El partido entre " + local.getNombre() + " contra " + Visitante.getNombre() + " Comienza");

		while (salir == false) {
			try {

				System.out.println("Indique El suceso en el partido \n" + "1.Contabilizar punto ganador \n"
						+ "2.Contabiliza error no forzado \n" + "3.Contabiliza saque directo \n"
						+ "4.Finalizar Partido \n" + "5.Mostrar estadisticas de un jugador \n"
						+ "6.Mostrar estadisticas de un Equipo ");
				int opcion = entrada.nextInt();

				if (opcion == 1) {
					System.out.println("indique el nombre del jugador que ha anotado el punto ganador");
					String nombr = entrada.nextLine();
					nombr = entrada.nextLine();
					if (Semifinal.AñadirPuntoganador(nombr) == 1) {
						System.out.println("Se ha añadido punto ganador a: " + nombr);
					} else if (Semifinal.AñadirPuntoganador(nombr) == 0) {
						System.out.println("no se ha añadido ningun punto, el jugador " + nombr
								+ " no forma parte de ningun equipo.");
					}

				}
				if (opcion == 2) {
					System.out.println("indique el nombre del jugador que ha cometido un error no forzado");
					String nombr = entrada.nextLine();
					nombr = entrada.nextLine();
					Jugador Prueba = new Jugador(nombr);
					if (Semifinal.AñadirErrorNoforzado(nombr) == 1) {
						System.out.println("Se ha añadido Error no forzado a: " + nombr);
					} else if (Semifinal.AñadirErrorNoforzado(nombr) == 0) {
						System.out.println("no se ha añadido ningun Error no forzado, el jugador " + nombr
								+ " no forma parte de ningun equipo.");
					}

				}
				if (opcion == 3) {
					System.out.println("indique el nombre del jugador que ha anotado un saque directo");
					String nombr = entrada.nextLine();
					nombr = entrada.nextLine();
					if (Semifinal.AñadirSaquedirecto(nombr) == 1) {
						System.out.println("Se ha añadido saque directo a: " + nombr);
					} else if (Semifinal.AñadirSaquedirecto(nombr) == 0) {
						System.out.println("no se ha añadido ningun saque directo, el jugador " + nombr
								+ " no forma parte de ningun equipo.");
					}

				}
				if (opcion == 4) {
					salir = true;
					System.out.println("Muchas gracias el resultado final del partido es:");
					System.out.println(Semifinal.estadisticasPartido());

				}
				if (opcion == 5) {
					System.out.println("indique el nombre del Jugador del que desea comprobar sus estadisticas");
					String nombr = entrada.nextLine();
					nombr = entrada.nextLine();
					System.out.println(Semifinal.comprobarEstadisticas(nombr));

				}
				if (opcion == 6) {
					System.out.println("indique el nombre del equipo del que desea comprobar sus estadisticas");
					String nombr = entrada.nextLine();
					nombr = entrada.nextLine();
					System.out.println(Semifinal.comprobarEstadisticaseq(nombr));

				}
			} catch (java.util.InputMismatchException a) {
				System.out.println("el parametro indicado es incorrecto reviselo ");
				entrada.next();
			}

		}
		entrada.close();
	}
}
