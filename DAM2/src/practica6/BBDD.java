package practica6;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.helpers.DefaultHandler;

public class BBDD {

	ArrayList<Empleados> Empleados = new ArrayList<Empleados>();
	File Practica6 = new File("src/" + "Practica6.xml");

	public BBDD() {

		try {
			Practica6.createNewFile();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String CrearEmpleado(String dNI, String nombre, String apellido, Double salario) {
		String salir = "Se ha incluido un nuevo empleado en la BBDD";
		Empleados Emp = new Empleados(dNI, nombre, apellido, salario);
		Empleados.add(Emp);
		return salir;
	}

	public String ListarEmpleados() {

		String salida = "La lista de Empleados actual es:" + "\n";
		for (int i = 0; i < Empleados.size(); i++) {
			salida = salida + Empleados.get(i).toString() + "\n";
		}

		return salida;

	}

	public void AddArrays() {

		String dNI, nombre, apellido, sal;
		Double salario;

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			try {
				dBuilder = dbFactory.newDocumentBuilder();

				Document doc;

				doc = dBuilder.parse(Practica6);

				doc.getDocumentElement().normalize();
				NodeList nList = doc.getElementsByTagName("Empleado");

				for (int temp = 0; temp < nList.getLength(); temp++) {
					Node nNode = nList.item(temp);

					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
						Element eElement = (Element) nNode;
						dNI = eElement.getElementsByTagName("DNI").item(0).getTextContent();
						nombre = eElement.getElementsByTagName("nombre").item(0).getTextContent();
						apellido = eElement.getElementsByTagName("apellido").item(0).getTextContent();
						sal = eElement.getElementsByTagName("salario").item(0).getTextContent();
						salario = Double.parseDouble(sal);
						Empleados nuevo = new Empleados(dNI, nombre, apellido, salario);
						Empleados.add(nuevo);
					}
				}
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Boolean ExisteDNI(String DNI) {

		for (int i = 0; i < Empleados.size(); i++) {
			if (Empleados.get(i).DNI.equals(DNI) == true) {
				return true;
			}
		}
		return false;
	}

	public String ConsultaCliente(String DNI) {
		String salir = " ";

		if (ExisteDNI(DNI) == true) {
			for (int i = 0; i < Empleados.size(); i++) {
				if (Empleados.get(i).DNI.equals(DNI) == true) {
					return salir = Empleados.get(i).toString();
				}
			}

			return salir = "El Dni no esta en el fichero";

		}
		return salir;
	}

	public void pisarFichero() {

		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.newDocument();
			Element eRaiz = doc.createElement("Oficina");
			doc.appendChild(eRaiz);

			for (int i = 0; i < Empleados.size(); i++) {
				Element Empleado = doc.createElement("Empleado");
				eRaiz.appendChild(Empleado);
				
				Element eDNI = doc.createElement("DNI");
				eDNI.appendChild(doc.createTextNode(Empleados.get(i).getDNI()));
				Empleado.appendChild(eDNI);
				
				Element enombre = doc.createElement("nombre");
				enombre.appendChild(doc.createTextNode(Empleados.get(i).getNombre()));
				Empleado.appendChild(enombre);
				
				Element eApellido = doc.createElement("apellido");
				eApellido.appendChild(doc.createTextNode(Empleados.get(i).getApellido()));
				Empleado.appendChild(eApellido);
				
				Element eSalario = doc.createElement("salario");
				String sal = String.valueOf(Empleados.get(i).getSalario());
				eSalario.appendChild(doc.createTextNode(sal));
				Empleado.appendChild(eSalario);

				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(Practica6);

				transformer.transform(source, result);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String ModCliente(String DNI, Double salario) {
		Double antes = 0.0;
		if (ExisteDNI(DNI) == false) {
			return "El cliente no aparece en sitemas";
		} else {
			for (int i = 0; i < Empleados.size(); i++) {
				if (Empleados.get(i).DNI.equals(DNI) == true) {
					antes = Empleados.get(i).getSalario();
					Empleados.get(i).setSalario(salario);
				}

			}
			return "Salario modificado de " + antes + " a " + salario;
		}

	}

	public String BorrarCliente(String DNI) {
		if (ExisteDNI(DNI) == false) {
			return "El cliente no aparece en sitemas";
		} else {
			for (int i = 0; i < Empleados.size(); i++) {
				if (Empleados.get(i).DNI.equals(DNI) == true) {
					Empleados.remove(i);
				}

			}
			return "Cliente Eliminado del sistema";
		}

	}

	public String LeerSAX() {
		 String salir = "";
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			DefaultHandler handler = new DefaultHandler() {
				boolean eDNI = false;
				boolean eNombre = false;
				boolean eApellidos = false;
				boolean eSalario = false;

				public void startElement(String uri, String localName, String qName, Attributes attributes)
						throws SAXException {

					if (qName.equalsIgnoreCase("DNI")) {
						eDNI = true;
					}
					if (qName.equalsIgnoreCase("nombre")) {
						eNombre = true;
					}
					if (qName.equalsIgnoreCase("apellido")) {
						eApellidos = true;
					}
					if (qName.equalsIgnoreCase("salario")) {
						eSalario = true;
					}
				}

				public void endElement(String uri, String localName, String qName) throws SAXException {
				}
				

				public void characters(char ch[], int start, int length) throws SAXException {
					
					if (eDNI) {
						System.out.println("DNI: " + new String(ch, start, length));
						eDNI = false;
					}
					if (eNombre) {
						System.out.println("Nombre: " + new String(ch, start, length));
						eNombre = false;
					}
					if (eApellidos) {
						System.out.println("Apellidos: " + new String(ch, start, length));
						eApellidos = false;
					}
					if (eSalario) {
						System.out.println("Salario " + new String(ch, start, length));
						System.out.println("\n");
						eSalario = false;
					}
				}
			};
			File file = Practica6;
			InputStream inputStream = new FileInputStream(file);
			Reader reader = new InputStreamReader(inputStream, "UTF-8");
			InputSource is = new InputSource(reader);
			is.setEncoding("UTF-8");
			saxParser.parse(is, handler);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return salir;
	}

}
