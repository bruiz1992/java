package ExamenPrimerTrimestre;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Practica4.Empleados;

public class Gestion {

	ArrayList<Departamento> Departamentos = new ArrayList<Departamento>();
	ArrayList<Empleado> Empleados = new ArrayList<Empleado>();
	File FDepartamentos = new File("src/"+"Departamentos.txt");
	File FEmpleados = new File("src/"+"Empleados.txt");

	public Gestion() {
		
		try {
			FDepartamentos.createNewFile();
			FEmpleados.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void AddArrays() {

		try {
			String dNI, nombre, apellido, sal, id, nombreD;
			boolean genero;
			int iDDepartamento;
			Double salario;
			BufferedReader leerEmpleados = new BufferedReader(new FileReader(FEmpleados));
			BufferedReader leerEmpleados1 = new BufferedReader(new FileReader(FDepartamentos));
			String Linea, LineaD;
			while ((Linea = leerEmpleados.readLine()) != null) {
				String[] lineaEntera = Linea.split("\t");
				
				id = lineaEntera[0];
				dNI = lineaEntera[1];
				nombre = lineaEntera[2];
				apellido = lineaEntera[3];
				 sal = lineaEntera[4];
				 String gen = lineaEntera[5];
				if (gen.equals("Mujer")) {
					genero = true;
				} else {
					genero = false;
				}
				
				iDDepartamento = Integer.valueOf(id);
				salario = Double.parseDouble(sal);
				Empleado nuevo = new Empleado(dNI, nombre, apellido, salario, genero, iDDepartamento);
				Empleados.add(nuevo);
			}

			while ((LineaD = leerEmpleados1.readLine()) != null) {
				String[] lineaEntera = LineaD.split("\t");
				nombreD = lineaEntera[1];
				Departamento nuevo1 = new Departamento(nombreD);
				Departamentos.add(nuevo1);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String addEmpleado(String dNI, String nombre, String apellidos, Double salario, boolean genero,
			int iDDepartamento) {
		Empleado nuevo = new Empleado(dNI, nombre, apellidos, salario, genero, iDDepartamento);
		Empleados.add(nuevo);

		return "Empleado añadido a base de datos.";

	}

	public String ListarEmpleados() {

		String salida = "La lista de Empleados actual es:" + "\n";
		for (int i = 0; i < Empleados.size(); i++) {
			salida = salida + Empleados.get(i).toString() + "\n";
		}

		return salida;

	}

	public String ListarEmpleadosPD(int ID) {

		String salida = "La lista de Empleados Del departamento indicado es:" + "\n";
		for (int i = 0; i < Empleados.size(); i++) {
			if (Empleados.get(i).IDDepartamento == ID) {
				salida = salida + Empleados.get(i).toString() + "\n";
			}
		}
		return salida;

	}

	public String ListarEmpleadosSueldoMas(Double Sueldo) {

		String salida = "La lista de Empleados Del departamento indicado es:" + "\n";
		for (int i = 0; i < Empleados.size(); i++) {
			if (Empleados.get(i).getSalario() > Sueldo) {
				salida = salida + Empleados.get(i).toString() + "\n";
			}
		}
		return salida;
	}

	public String ListarEmpleadosSueldomenos(Double Sueldo) {

		String salida = "La lista de Empleados Del departamento indicado es:" + "\n";
		for (int i = 0; i < Empleados.size(); i++) {
			if (Empleados.get(i).getSalario() <= Sueldo) {
				salida = salida + Empleados.get(i).toString() + "\n";
			}
		}
		return salida;
	}

	public String ListarDepartamentos() {

		String salida = "La lista de Departamentos actual es:" + "\n";
		for (int i = 0; i < Departamentos.size(); i++) {
			salida = salida + Departamentos.get(i).toString() + "\n";
		}

		return salida;

	}

	public String addDepartamento(String nombre) {
		Departamento nuevo = new Departamento(nombre);
		Departamentos.add(nuevo);
		return "Departamento creado con nombre: " + nombre;

	}

	public void pisarFichero() {

		try {
			BufferedWriter escribir = new BufferedWriter((new FileWriter(FDepartamentos.getAbsoluteFile(), false)));
			for (int i = 0; i < Departamentos.size(); i++) {
				escribir.write(Departamentos.get(i).toString() + "\n");
			}
			escribir.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			BufferedWriter escribir = new BufferedWriter((new FileWriter(FEmpleados.getAbsoluteFile(), false)));
			for (int i = 0; i < Empleados.size(); i++) {
				escribir.write(Empleados.get(i).toString() + "\n");
			}
			escribir.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void BorrarEmpleado(String DNI) {

		for (int i = 0; i < Empleados.size(); i++) {
			if (Empleados.get(i).DNI.equals(DNI) == true) {
				Empleados.remove(i);
			}

		}

	}

	public void BorrarDep(int id) {

		for (int i = 0; i < Departamentos.size(); i++) {
			if (Departamentos.get(i).IDDepartamento == id) {
				Departamentos.remove(i);
			}

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

	public String ConsultaDPID(int id) {
		String salir;

		for (int i = 0; i < Departamentos.size(); i++) {
			if (Departamentos.get(i).IDDepartamento == id) {
				return salir = Departamentos.get(i).toString();
			}

		}
		return salir = "El ID no esta en el fichero";

	}

	public String ConsultaDPNombre(String nombre) {
		String salir;

		for (int i = 0; i < Departamentos.size(); i++) {
			if (Departamentos.get(i).getNombre().equals(nombre) == true) {
				return salir = Departamentos.get(i).toString();
			}

		}
		return salir = "El nombre de Departamento no esta en el fichero";

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

	public String BorrarDP(int id) {

		for (int i = 0; i < Departamentos.size(); i++) {
			if (Departamentos.get(i).IDDepartamento == id) {
				Departamentos.remove(i);
				return "El Departamento a sido eliminado";
			}

		}
		return "El ID no esta en el fichero";

	}

}
