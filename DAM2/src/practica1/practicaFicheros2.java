package practica1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class practicaFicheros2 {

	public static void main(String[] args) {

		String ruta = "src/";
		String fichero = "file001.txt";

		File f = new File(ruta + fichero);

		try {
			FileReader fr = new FileReader(f);
			int caracter;
			try {
				while((caracter = fr.read())!=-1) {;
				System.out.print((char)caracter);
				}
			fr.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		

	}

}
