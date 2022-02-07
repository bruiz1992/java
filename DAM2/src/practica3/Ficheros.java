package practica3;

import java.util.ArrayList;
import java.util.Date;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ficheros {

	ArrayList<Paquete> Paquetes = new ArrayList<Paquete>();
	ArrayList<Vuelo> Vuelos = new ArrayList<Vuelo>();
	ArrayList<Hotel> Hoteles = new ArrayList<Hotel>();
	File Practica3FPaq = new File("src/" + "FPAQ.txt");
	File Practica3FVu = new File("src/" + "FVU.txt");
	File Practica3FHo = new File("src/" + "FHO.txt");

	public Ficheros() {

		try {
			Practica3FPaq.createNewFile();
			Practica3FVu.createNewFile();
			Practica3FHo.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String CrearVuelo(String empresa, Date ida, Date vuelta, float precioV, String destino) {

		String salida;
		if (ida.before(vuelta) == false) {
			salida = "La fecha es erronea compruebela";
		} else {
			Vuelo nuevo = new Vuelo(empresa, ida, vuelta, precioV, destino);
			Vuelos.add(nuevo);

			salida = "Vuelo añadidos a BBDD";
		}
		return salida;
	}

	public String CrearHotel(String nombre, String ciudad, Date llegada, int numNoches, float precioNoche) {
		String salida;
		Hotel nuevo = new Hotel(nombre, ciudad, llegada, numNoches, precioNoche);
		Hoteles.add(nuevo);
		salida = "Hotel añadido a BBDD";
		return salida;
	}

	public String CrearPaquete(String nombre, int idVuelo, int idHotel) {

		String salida;
		Hotel HotelP = Hoteles.get(idHotel);
		Vuelo vueloP = Vuelos.get(idVuelo);

		if (HotelP.iAsociado() == true) {
			salida = "No añadido. El Hotel indicado ya esta asociado a otro paquete";
		} else if (vueloP.iAsociado() == true) {
			salida = "No añadido. El Vuelo indicado ya esta asociado a otro paquete";
		} else {
			Hoteles.get(idHotel).setAsociado(true);
			HotelP.setAsociado(true);
			Vuelos.get(idVuelo).setAsociado(true);
			vueloP.setAsociado(true);
			Paquete nuevo = new Paquete(nombre, vueloP, HotelP);
			Paquetes.add(nuevo);
			salida = "Paquete añadidos a BBDD";
		}
		return salida;
	}

	public String ListarVuelos() {

		String salida = "La lista de Vuelos actual es:" + "\n";
		for (int i = 0; i < Vuelos.size(); i++) {
			salida = salida + Vuelos.get(i).toString() + "\n";
		}

		return salida;

	}

	public String ListarHotel() {

		String salida = "La lista de Hoteles actual es:" + "\n";

		for (int i = 0; i < Hoteles.size(); i++) {
			salida = salida + Hoteles.get(i).toString() + "\n";
		}

		return salida;

	}

	public String ListarPaquetes() {

		String salida = "La lista de Paquetes actual es:" + "\n";
		for (int i = 0; i < Paquetes.size(); i++) {
			salida = salida + Paquetes.get(i).toString() + "\n";
		}
		return salida;

	}
	/*
	 * public void ContarBBDD() { int nvuelos = Vuelos.size(); int nhotel =
	 * Hoteles.size(); int npaquete = Paquetes.size(); if (nvuelos == 0) {
	 * 
	 * } else { Vuelos.get(0).setContador(nvuelos); } if (nhotel == 0) { } else {
	 * Hoteles.get(0).setContador(nhotel); } if (npaquete == 0) { } else {
	 * Paquetes.get(0).setContador(npaquete); } }
	 */

	public void AddArrays() {
		try {
			try {
				// añade los Vuelos desde el fichero al array de vuelos
				String Linea, empresa, destino, idaS, vueltas, precioS;
				float precioV;
				Date ida, vuelta;
				BufferedReader leerV = new BufferedReader(new FileReader(Practica3FVu));
				DateFormat id = new SimpleDateFormat("dd/MM/yyyy");
				while ((Linea = leerV.readLine()) != null) {
					String[] lineaEntera = Linea.split("\t");
					empresa = lineaEntera[1];
					idaS = lineaEntera[2];
					ida = id.parse(idaS);
					vueltas = lineaEntera[3];
					vuelta = id.parse(vueltas);
					precioS = lineaEntera[4];
					precioV = Float.parseFloat(precioS);
					destino = lineaEntera[5];
					Vuelo nuevo = new Vuelo(empresa, ida, vuelta, precioV, destino);
					Vuelos.add(nuevo);
				}
				// añade los hoteles desde el fichero al array hoteles

				String nombre, ciudad;
				int numNoches;
				float precioNoche;
				Date Hllegada;
				BufferedReader leerH = new BufferedReader(new FileReader(Practica3FHo));
				while ((Linea = leerH.readLine()) != null) {
					String[] lineaEntera = Linea.split("\t");
					nombre = lineaEntera[1];
					ciudad = lineaEntera[2];
					String llegadas = lineaEntera[3];
					Hllegada = id.parse(llegadas);
					String numNochesS = lineaEntera[4];
					numNoches = Integer.parseInt(numNochesS);
					String precioSH = lineaEntera[5];
					precioNoche = Float.parseFloat(precioSH);
					Hotel nuevo = new Hotel(nombre, ciudad, Hllegada, numNoches, precioNoche);
					Hoteles.add(nuevo);
				}

				BufferedReader leerP = new BufferedReader(new FileReader(Practica3FPaq));
				while ((Linea = leerP.readLine()) != null) {
					String[] lineaEntera = Linea.split("\t");
					nombre = lineaEntera[1];
					String idV = lineaEntera[2];
					String idH = lineaEntera[9];
					int idVuelo = Integer.parseInt(idV);
					int idHotel = Integer.parseInt(idH);
					Hotel HotelP = Hoteles.get(idHotel);
					Vuelo vueloP = Vuelos.get(idVuelo);
					Hoteles.get(idHotel).setAsociado(true);
					HotelP.setAsociado(true);
					Vuelos.get(idVuelo).setAsociado(true);
					vueloP.setAsociado(true);
					Paquete nuevo = new Paquete(nombre, vueloP, HotelP);
					Paquetes.add(nuevo);
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (

		ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String ModDate(int id, Date ida, Date vuelta) {
		String salida = " ";
		if (ida.before(vuelta) == false) {
			salida = "La fecha es erronea compruebela";
		} else {
			Vuelos.get(id).setIda(ida);
			Vuelos.get(id).setIda(vuelta);
			salida = "Fechas modificadas correctamente";
		}
		return salida;
	}

	public String ModDate(int id, Date llegada) {
		String salida = " ";
		Hoteles.get(id).setLlegada(llegada);
		salida = "Fechas modificadas correctamente";
		return salida;
	}

	public String ModPrecio(int id, Float precio) {
		Vuelos.get(id).setPrecioV(precio);
		String salida = "Precio modificado";
		return salida;
	}

	public String ModDestino(int id, String destino) {

		Vuelos.get(id).setDestino(destino);
		String salida = "Destino modificado";
		return salida;
	}

	public String BorrarVuelo(int id) {
		String salida = "Elemento eliminado";
		Vuelos.remove(id);
		return salida;
	}

	public String BorrarHotel(int id) {
		String salida = "Elemento eliminado";
		Hoteles.remove(id);
		return salida;
	}

	public String BorrarPaquete(int id) {
		String salida = "Elemento eliminado";
		Paquetes.get(id).getVueloP().setAsociado(false);
		Paquetes.get(id).getHotelp().setAsociado(false);
		Paquetes.remove(id);
		return salida;

	}

	public void pisarFichero() {
		try {
			BufferedWriter escribir = new BufferedWriter((new FileWriter(Practica3FVu.getAbsoluteFile(), false)));
			for (int i = 0; i < Vuelos.size(); i++) {
				escribir.write(Vuelos.get(i).toString() + "\n");
			}
			BufferedWriter escribir1 = new BufferedWriter((new FileWriter(Practica3FPaq.getAbsoluteFile(), false)));
			for (int i = 0; i < Paquetes.size(); i++) {
				escribir1.write(Paquetes.get(i).toString() + "\n");
			}
			BufferedWriter escribir2 = new BufferedWriter((new FileWriter(Practica3FHo.getAbsoluteFile(), false)));
			for (int i = 0; i < Hoteles.size(); i++) {
				escribir2.write(Hoteles.get(i).toString() + "\n");
			}
			escribir.close();
			escribir1.close();
			escribir2.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String ModPrecioH(int id, float precio) {
		Hoteles.get(id).setPrecioNoche(precio);
		String salida = "Precio modificado";
		return salida;
	}

	public String ModNnoches(int id, int noches) {
		Hoteles.get(id).setNumNoches(noches);
		String salida = "modificado";
		return salida;
	}
}
