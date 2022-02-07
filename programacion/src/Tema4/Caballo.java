package Tema4;
import java.time.*;
public class Caballo {
	
	String nombre;
	//String sexo;		// Todos los caballos son del sexo masculino
	LocalDate fechaNacimiento;
	String color;
	double peso;
	
	int carrerasGanadas;
	
	// DEFINICION DE CONSTRUCTORES
	
	Caballo(){
		//this.sexo = "masculino";
		this.fechaNacimiento = LocalDate.now();
		this.color = "negro";
		this.carrerasGanadas = 0;
	}
	
	
	Caballo(String nombre, LocalDate fechaNacimiento, String color, double peso){
		this.nombre = nombre;
		this.fechaNacimiento = LocalDate.of(2017, Month.FEBRUARY, 23);
		this.color = color;
		this.peso = peso;		
		this.carrerasGanadas = 0;	
	}
	
	
	// ACCIONES QUE PUEDE REALIZAR UN CABALLO
	
	String dimeNombre(){
		return this.nombre;
	}
	
	void cambiarNombre(String nuevoNombre){
		this.nombre = nuevoNombre;
	}
	
	String dimeFechaNacimiento(){
		String frase = "";
		frase = "Naci en " + this.fechaNacimiento.getMonth() + " de " + this.fechaNacimiento.getYear();
		return(frase);
	}
	
	String dimeColor(){
		return this.color;
	}
	
	double dimePeso(){
		return this.peso;
	}
	
	void engordar(int kg) {
		this.peso = this.peso + kg;
	}
	
	void adelgazar(int kg) {
		this.peso = this.peso + kg;
	}
	
	void ganarCarrera() {
		this.carrerasGanadas++;
	}
	
		
	void galopar(){}

}
