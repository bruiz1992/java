package practica1;

import javax.swing.*;

import java.io.File;
import java.util.ArrayList;

import javax.swing.JFrame;



public class ejercicio6 {

	public ArrayList<String> ej6() {
		String ruta = "src/";
		File carpeta = new File(ruta + "2DAM/");
		String[] listado = carpeta.list();
		ArrayList<String> ventana= new ArrayList<String>() ;
		
		
		for (int i = 0; i < listado.length; i++) { 
			ventana.add(listado[i]);
			File directorio = new File(carpeta.getAbsolutePath(), listado[i]);
			if (directorio.isDirectory()) {
				String[] listadointerno = directorio.list();
				for (int a = 0; a < listadointerno.length; a++) {
					ventana.add(listadointerno[a]);
					
				}

			}

		}
		return ventana;
	}
}
