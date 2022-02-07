package practica1;

import java.io.File;

public class ejercicio4 {

	public void ej4() {
		String ruta = "src/";

		File carpeta = new File(ruta + "2DAM/");
		String[] listado = carpeta.list();
		if (listado == null || listado.length == 0) {
			System.out.println("No hay elementos dentro de la carpeta actual");
			return;
		} else {
			for (int i = 0; i < listado.length; i++) {
				System.out.println(listado[i]);
			}
		}

	}

}
