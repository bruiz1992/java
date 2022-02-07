package practica1;

import java.io.File;

public class ejercicio5 {

	public void ej5() {
		String ruta = "src/";
		File carpeta = new File(ruta + "2DAM/");
		String[] listado = carpeta.list();
		
		for (int i = 0; i < listado.length; i++) {
			System.out.println(listado[i]);
			File directorio = new File(carpeta.getAbsolutePath(), listado[i]);
			if (directorio.isDirectory()) {
				String[] listadointerno = directorio.list();
				for (int a = 0; a < listadointerno.length; a++) {
					System.out.println(listadointerno[a]);
				}

			}

		}
	}
}
