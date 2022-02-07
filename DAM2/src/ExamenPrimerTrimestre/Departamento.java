package ExamenPrimerTrimestre;

import java.util.ArrayList;

public class Departamento {

	int IDDepartamento;
	String nombre;
	private static int contador;

	public Departamento(String nombre) {
		this.nombre = nombre;
		setIDDepartamento(contador);
		setContador(contador + 1);
		
	}
	
	public Departamento(String nombre, ArrayList<Empleado> lista,int IDDepartamento) {
		this.nombre = nombre;
		this.IDDepartamento = IDDepartamento;
	}

	public int getIDDepartamento() {
		return IDDepartamento;
	}

	public void setIDDepartamento(int iDDepartamento) {
		IDDepartamento = iDDepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Departamento.contador = contador;
	}

	@Override
	public String toString() {
		return IDDepartamento +"\t" + nombre;
	}

}
