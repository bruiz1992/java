package Practica4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import practica3.Vuelo;

public class BBDD {

	ArrayList<Empleados> Empleados = new ArrayList<Empleados>();
	File Practica4 = new File("src/" + "Practica4.txt");

	public BBDD() {

		try {
			Practica4.createNewFile();

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

		try {
			String dNI, nombre, apellido, sal;
			Double salario;
			BufferedReader leerEmpleados = new BufferedReader(new FileReader(Practica4));
			String Linea;
			while ((Linea = leerEmpleados.readLine()) != null) {
				String[] lineaEntera = Linea.split("\t");
				dNI = lineaEntera[0];
				nombre = lineaEntera[1];
				apellido = lineaEntera[2];
				sal = lineaEntera[3];
				salario = Double.parseDouble(sal);
				Empleados nuevo = new Empleados(dNI, nombre, apellido, salario);
				Empleados.add(nuevo);
				
			}
		
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
			BufferedWriter escribir = new BufferedWriter((new FileWriter(Practica4.getAbsoluteFile(), false)));
			for (int i = 0; i < Empleados.size(); i++) {
				escribir.write(Empleados.get(i).toString() + "\n");
			}
			escribir.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
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

}
