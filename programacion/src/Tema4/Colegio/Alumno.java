package Tema4.Colegio;

import java.util.Scanner;

public class Alumno {

	String nombre;
	String apellido;
	String DNI;
	String direccion;
	Double nota;
	String calificacion;

	Alumno(String nombre, String apellido, String DNI, String direccion,Double nota) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.DNI = DNI;
		this.direccion = direccion;
		this.nota = nota;	
		//this.calificacion = obtenerCalificaion(nota);
		
	}
	
	void obtenerCalificacion (int nota){
		if (nota == 0) {this.calificacion = "no presentado";}
		if (nota < 5) {this.calificacion = "Suspendido";}
		if (nota >= 5 && nota < 7) {this.calificacion = "Aprobado";}
		if (nota >= 7 && nota < 9) {this.calificacion = "Notable";}
		if (nota >= 9 && nota < 10) {this.calificacion = "Sobresaliente";}
		if (nota == 10) {this.calificacion = "Matricula";}
		
	}


	public String getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}


	public String getNotaL() {
		return calificacion;
	}

	public void setNotaL(String calificacion) {
		this.calificacion = calificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	/*public boolean equals(Alumno Alu) {
		if (this == Alu) {
			return true;
		} else
			return false;
	}*/


	public String toString1() {

		String str = "Alumno: " + getNombre() + " " + getApellido()  +  " \n" +
		  getDNI() +  " " + getDireccion() + "\n "
				+ getNota() + " " + getCalificacion();

		return str;
	}

}
