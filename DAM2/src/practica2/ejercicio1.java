package practica2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ejercicio1 {

	public void eje1(String dNI, String nombre, String apellidos,String fecha, String telefono) {
		String ruta = "src/";
		String fichero = "ejercicio1.txt";
		File AUX = new File(ruta + fichero);

		try {
			AUX.createNewFile();

			String[] datos = { dNI + " " + nombre + " " + apellidos + " "+ fecha +" " + telefono };

			try {
				FileWriter escribir = new FileWriter(AUX);

				for (int i = 0; i < datos.length; i++) {

					escribir.write(datos[i]);
				}
				escribir.close();
				int caracter;
				@SuppressWarnings("resource")
				
				FileReader leer = new FileReader(AUX);


				while((caracter = leer.read())!=-1) {;
				System.out.print((char)caracter);}
				System.out.println();
				leer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
