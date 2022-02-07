package practica1;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class MenuPractica1 {

	public static void main(String[] args) {

		boolean salir = false;
		Scanner entrada = new Scanner(System.in);
		int opcionMenu;
		ejercicio1 ej1 = new ejercicio1();
		ejercicio2 ej2 = new ejercicio2();
		ejercicio3 ej3 = new ejercicio3();
		ejercicio4 ej4 = new ejercicio4();
		ejercicio5 ej5 = new ejercicio5();
		ejercicio6 ej6 = new ejercicio6();
		
		while (salir == false) {

			System.out.println("OPCIONES DE MENU");
			System.out.println("ejercicio 1");
			System.out.println("ejercicio 2");
			System.out.println("ejercicio 3");
			System.out.println("ejercicio 4");
			System.out.println("ejercicio 5");
			System.out.println("ejercicio 6");
			System.out.println("Salir 7");
			opcionMenu = entrada.nextInt();
			if (opcionMenu == 1) {
				ej1.ejercicio();

			}
			if (opcionMenu == 2) {
				ej2.ej2();

			}
			if (opcionMenu == 3) {
				ej3.ej3();
			}
			if (opcionMenu == 4) {
				ej4.ej4();

			}
			if (opcionMenu == 5) {
				ej5.ej5();

			}
			if (opcionMenu == 6) {
				ej6.ej6();
				
				

			}
			if (opcionMenu == 7) {
				salir = true;
				System.out.println("Adios");
			}
			

		}
	}
}
