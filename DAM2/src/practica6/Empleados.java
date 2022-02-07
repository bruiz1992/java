package practica6;


public class Empleados {

	String DNI;
	String nombre;
	String apellido;
	Double salario;

	public Empleados(String dNI, String nombre, String apellido, Double salario) {

		this.DNI = dNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
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

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	
	public String toString() {
		return DNI + "\t" + nombre + "\t"  + apellido + "\t"   + salario;
	}

}

