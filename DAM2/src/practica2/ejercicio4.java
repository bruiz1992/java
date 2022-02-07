package practica2;

import java.io.*;
import java.util.ArrayList;

public class ejercicio4 {

	public void escribir(ArrayList<String> personas) {

		String ruta = "src/";
		String fichero = "ejercicio4.txt";
		File AUX = new File(ruta + fichero);
		try {
			AUX.createNewFile();
			BufferedWriter escribir = new BufferedWriter((new FileWriter(AUX.getAbsoluteFile(), true)));

			for (int i = 0; i < personas.size(); i++) {
				escribir.write(personas.get(i) + "\t");
			}
			escribir.write("\n");

			escribir.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public void leerNombres() {
		try {
			String ruta = "src/";
			String fichero = "ejercicio4.txt";
			File AUX = new File(ruta + fichero);
			String Linea;
			BufferedReader leer = new BufferedReader(new FileReader(AUX));
			while ((Linea = leer.readLine()) != null) {
				String[] lineaEntera = Linea.split("\t");

				System.out.println(lineaEntera[1]);
			}

			leer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void cantidad(int cantidad) {
		try {
			String ruta = "src/";
			String fichero = "ejercicio4.txt";
			File AUX = new File(ruta + fichero);
			String Linea;
			BufferedReader leer = new BufferedReader(new FileReader(AUX));
			while ((Linea = leer.readLine()) != null) {
				if (cantidad != 0) {
					cantidad--;
				System.out.println(Linea);}
			}

			leer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void leerDNI(String DNI) {
		try {
			String ruta = "src/";
			String fichero = "ejercicio4.txt";
			File AUX = new File(ruta + fichero);
			String Linea;
			BufferedReader leer = new BufferedReader(new FileReader(AUX));
			while ((Linea = leer.readLine()) != null) {
				String[] lineaEntera = Linea.split("\t");
				if (lineaEntera[0].equals(DNI)) {
				System.out.println(Linea);
			}}

			leer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
