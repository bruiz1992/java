package practica2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ejercicio3 {

	public void ej3() {
		Date date = new Date();
		Scanner entrada = new Scanner(System.in);
		String destinatario, asunto, cuerpo;

		System.out.println("Indique por favor el destinatario");
		destinatario = entrada.nextLine();
		System.out.println("indique el Asunto");
		asunto = entrada.nextLine();
		System.out.println("indique el escriba su correo");
		cuerpo = entrada.nextLine();
		DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yy HH:mm");
		String fecha = hourdateFormat.format(date);
		String correo = "Destinatario: " + destinatario + "\n" + "Asunto: " + asunto + "\n" + "Correo: " + cuerpo + "\n"
				+ fecha;
		//System.out.println(correo);
		String ruta = "src/";
		String fichero = "ejercicio3.txt";
		File AUX = new File(ruta, fichero);// creo fichero
		try {
			AUX.createNewFile();
			BufferedWriter escribir = new BufferedWriter(new FileWriter(AUX));
			escribir.write(correo);
			escribir.close();
			BufferedReader leer = new BufferedReader(new FileReader(AUX));
			String Linea;
			while ((Linea = leer.readLine()) != null) {
				System.out.println(Linea);
			}
			leer.close();
			entrada.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
