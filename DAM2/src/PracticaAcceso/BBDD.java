package PracticaAcceso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BBDD {
	ArrayList<Medicion> Med = new ArrayList<Medicion>();
	ArrayList<cuota> cuo = new ArrayList<cuota>();
	File PracticaFinal = new File("medicion.txt");
	File Cuotas = new File("cuotas.txt");
	File Totales = new File("totales.txt");

	public BBDD() {

		try {
			PracticaFinal.createNewFile();
			Cuotas.createNewFile();
			Totales.createNewFile();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void AddArrays(String nombreTxT) {
		File PracticaFinal = new File(nombreTxT);

		try {
			PracticaFinal.createNewFile();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			String hora, min, a, b, c, d;
			int horas;
			int minutos;
			String nombre;
			/* float[] audiencia_seg = new float [4] */;
			BufferedReader leerEmpleados = new BufferedReader(new FileReader(PracticaFinal));
			String Linea;
			float niños;
			float jovenes;
			float adultos;
			float mayores;
			while ((Linea = leerEmpleados.readLine()) != null) {
				String[] lineaEntera = Linea.split(",");
				hora = lineaEntera[0];
				horas = Integer.parseInt(hora);
				min = lineaEntera[1];
				minutos = Integer.parseInt(min);
				nombre = lineaEntera[2];
				a = lineaEntera[3];
				b = lineaEntera[4];
				c = lineaEntera[5];
				d = lineaEntera[6];
				niños = Float.valueOf(a);
				jovenes = Float.valueOf(b);
				adultos = Float.valueOf(c);
				mayores = Float.valueOf(d);
				Medicion nuevo = new Medicion(horas, minutos, nombre, niños, jovenes, adultos, mayores);
				Med.add(nuevo);
				/*
				 * int contador = 0;
				 * 
				 * contador++; int AAA = Med.size(); System.out.println(Med.get(AAA -
				 * 1).toString(AAA)); if (AAA != 1) {
				 * System.out.println(Med.get(0).toString(AAA)); }
				 */

			}leerEmpleados.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String ListarMed() {

		String salida = "horas" + "\t" + "minutos" + "\t" + "nombre" + "\t" + "niños" + "\t" + "jovenes" + "\t"
				+ "adultos" + "\t" + "mayores" + "\n";
		for (int i = 0; i < Med.size(); i++) {
			salida = salida + Med.get(i).toString(i) + "\n";
		}

		return salida;

	}

	public ArrayList<Medicion> getMed() {
		return Med;
	}

	public void setMed(ArrayList<Medicion> med) {
		Med = med;
	}

	public File getPracticaFinal() {
		return PracticaFinal;
	}

	public void setPracticaFinal(File practicaFinal) {
		PracticaFinal = practicaFinal;
	}

	public void CrearFicheroTXTaXML(String NobreXML) {

		File CrearXML = new File(NobreXML + ".xml");
		try {
			CrearXML.createNewFile();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.newDocument();
			Element Mediciones = doc.createElement("Mediciones");
			doc.appendChild(Mediciones);
			Element Cadena1 = doc.createElement("Cadena1");
			Mediciones.appendChild(Cadena1);
			Element Cadena2 = doc.createElement("Cadena2");
			Mediciones.appendChild(Cadena2);
			Element Cadena3 = doc.createElement("Cadena3");
			Mediciones.appendChild(Cadena3);

			for (int i = 0; i < Med.size(); i++) {

				Element Hora = doc.createElement("Horario");
				if (Med.get(i).getNombre().equals("cad1")) {
					Cadena1.appendChild(Hora);
				}
				if (Med.get(i).getNombre().equals("cad2")) {
					Cadena2.appendChild(Hora);
				}
				if (Med.get(i).getNombre().equals("cad3")) {
					Cadena3.appendChild(Hora);
				}

				Attr attr = doc.createAttribute("Hora");
				String HH = String.valueOf(Med.get(i).getHoras());
				attr.setValue(HH);
				Hora.setAttributeNode(attr);

				Attr attr1 = doc.createAttribute("Minutos");
				String MM = String.valueOf(Med.get(i).getMinutos());
				attr1.setValue(MM);
				Hora.setAttributeNode(attr1);

				String NS = (String.valueOf(Med.get(i).getNiños() * 10000));
				Element niños = doc.createElement("niños");
				niños.appendChild(doc.createTextNode(NS));
				Hora.appendChild(niños);

				String JV = (String.valueOf(Med.get(i).getJovenes() * 10000));
				Element Jovenes = doc.createElement("Jovenes");
				Jovenes.appendChild(doc.createTextNode(JV));
				Hora.appendChild(Jovenes);

				String AD = (String.valueOf(Med.get(i).getAdultos() * 10000));
				Element Adultos = doc.createElement("Adultos");
				Adultos.appendChild(doc.createTextNode(AD));
				Hora.appendChild(Adultos);

				String MY = String.valueOf((Med.get(i).getMayores() * 10000));
				Element Mayores = doc.createElement("niños");
				Mayores.appendChild(doc.createTextNode(MY));
				Hora.appendChild(Mayores);
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(CrearXML);

				transformer.transform(source, result);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void pisarFichero() {
		try {

			cuota cad1 = new cuota("cad1", Med);
			cuota cad2 = new cuota("cad2", Med);
			cuota cad3 = new cuota("cad3", Med);

			BufferedWriter escribir = new BufferedWriter((new FileWriter(Cuotas.getAbsoluteFile(), false)));
			escribir.write(cad1.toString() + "\n");
			escribir.write(cad2.toString() + "\n");
			escribir.write(cad3.toString() + "\n");

			escribir.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void pisarFicheromed() {
		try {
			BufferedWriter escribir = new BufferedWriter((new FileWriter(Totales.getAbsoluteFile(), false)));
			for (int i = 0; i < Med.size(); i++) {
				escribir.write(Med.get(i).toString() + "\n");
			}
			escribir.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
