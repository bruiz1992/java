package PracticaAcceso;

import java.io.Serializable;
import java.util.Arrays;

public class Medicion implements Serializable {
	int horas;
	int minutos;
	String nombre;
	float niños;
	float jovenes;
	float adultos;
	float mayores;
	float total;

	public Medicion(int horas, int minutos, String nombre, float niños, float jovenes, float adultos, float mayores) {
		this.horas = horas;
		this.minutos = minutos;
		this.nombre = nombre;
		this.niños = niños;
		this.jovenes = jovenes;
		this.adultos = adultos;
		this.mayores = mayores;
		setTotal(niños + jovenes + adultos + mayores);

	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*
	 * public float[] getAudiencia_seg() { return audiencia_seg; }
	 */

	/*
	 * public void setAudiencia_seg(float[] audiencia_seg) { this.audiencia_seg =
	 * audiencia_seg; }
	 */

	public String toString(int a) {
		return horas + "\t" + minutos + "\t" + nombre + "\t" + niños + "\t" + jovenes + "\t" + adultos + "\t" + mayores
				+ "\t" + total;
	}

	public String toString() {
		return horas + "," + minutos + "," + nombre + "," + niños + "," + jovenes + "," + adultos + "," + mayores + ","
				+ total;
	}

	public float getNiños() {
		return niños;
	}

	public void setNiños(float niños) {
		this.niños = niños;
	}

	public float getJovenes() {
		return jovenes;
	}

	public void setJovenes(float jovenes) {
		this.jovenes = jovenes;
	}

	public float getAdultos() {
		return adultos;
	}

	public void setAdultos(float adultos) {
		this.adultos = adultos;
	}

	public float getMayores() {
		return mayores;
	}

	public void setMayores(float mayores) {
		this.mayores = mayores;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

}
