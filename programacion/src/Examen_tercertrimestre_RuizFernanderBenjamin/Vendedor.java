package Examen_tercertrimestre_RuizFernanderBenjamin;

public class Vendedor {
	
	
	private int comision;
	private int DNI;
	private String Nombre;

	public Vendedor(int dNI, String nombre, int comision) {
		DNI = dNI;
		Nombre = nombre;
		this.comision = comision;
	}

	public Vendedor(int dNI, String nombre) {
		DNI = dNI;
		Nombre = nombre;

	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getComision() {
		return comision;
	}

	public void setComision(int comision) {
		this.comision = comision;
	}

	public String toString() {
		return "comision=" + comision + "  Nombre=" + Nombre + "  DNI=" + DNI + "" + "\n";
	}

	public void añadircomision(int entra) {
		setComision((getComision() + entra));

	}

}
