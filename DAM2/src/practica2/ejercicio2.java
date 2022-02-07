package practica2;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.lang.reflect.Array;

public class ejercicio2 {

	public void ej2() {
		Scanner entrada = new Scanner(System.in);
		String ruta = "src/";
		String fichero = "ejercicio2.txt";
		File AUX = new File(ruta, fichero);// creo fichero
		int suma = 0;
		int entero = 1;

		try {
			AUX.createNewFile();
			ArrayList<Integer> numeros = new ArrayList<Integer>();

			BufferedWriter escribir = new BufferedWriter(new FileWriter(AUX));
			while (entero != 0) {// introduzco los numeros en un arraylist hasta pulsar el cero

				System.out.println("Introduce un numero entero");
				entero = entrada.nextInt();
				String numeString = Integer.toString(entero);
				numeros.add(entero);
				suma = suma + entero;
				escribir.write(numeString + "\n");
			}
			String sumaString = Integer.toString(suma);
			escribir.write(sumaString);
			escribir.close();
			/*ArrayList<String> ArrayStrings = new ArrayList<String>();
			for (int i = 0; i < numeros.size(); i++) {
				ArrayStrings.add(Integer.toString(numeros.get(i)));
			}*/
			String Linea;
			BufferedReader leer = new BufferedReader(new FileReader(AUX));
			while ((Linea = leer.readLine()) != null) {
				System.out.println(Linea);
			}
				leer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
