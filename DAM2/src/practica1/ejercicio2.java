package practica1;

import java.io.File;
import java.io.IOException;

public class ejercicio2 {

	public void ej2() {
		String ruta = "src/";
		File dam2 = new File(ruta + "2DAM/");

		dam2.mkdir();
		ruta = ruta + "2DAM/";
		File misNotas = new File(ruta + "misNotas.txt");
		File ad = new File(ruta + "AD/");
		File psp = new File(ruta + "PSP/");
		ad.mkdir();
		psp.mkdir();
		try {
			misNotas.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String rutaad = ruta + "AD/";
		String rutapsp = ruta + "PSP/";
		File aa = new File(rutaad + "P1.txt");
		File bb = new File(rutaad + "U1.txt");
		File cc = new File(rutaad + "U2.txt");
		File DD = new File(rutapsp + "U1.txt");
		File EE = new File(rutapsp + "U2.txt");
		try {
			aa.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bb.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			cc.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			DD.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			EE.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
