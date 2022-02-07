package practica1;

import java.io.File;

public class ejercicio1 {

	public void ejercicio() {
		String ruta = "src/";
		String fichero = "file001.txt";
		File f = new File(ruta + fichero);
		System.out.println("nombre " + f.getName());
		System.out.println("Ruta absoluta " + f.getAbsolutePath());
		System.out.println("Directorio padre " + f.getParent());

		if (f.exists()) {
			System.out.println("El fichero existe");
			System.out.println("Permisos " + f.canRead() + " " + f.canExecute() + " " + f.canWrite());
			System.out.println("Longitud fichero " + f.length() + "bytes");

		} else {
			System.out.println("El fichero no existe");
		}
	}
}
