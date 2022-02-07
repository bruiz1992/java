package ExamenPrimerTrimestre;

public class Empleado {

	int ID;
	String DNI;
	String nombre;
	String apellidos;
	Double salario;
	boolean Genero;
	int IDDepartamento;
	private static int contador = 1;

	public Empleado(String dNI, String nombre, String apellidos, Double salario, boolean genero, int iDDepartamento) {
		setID(contador);
		setContador(contador++);
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		Genero = genero;
		IDDepartamento = iDDepartamento;
	}

	public Empleado(String dNI, String nombre, String apellidos, Double salario, boolean genero, int iDDepartamento,
			int ID) {
		this.ID = ID;
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		Genero = genero;
		IDDepartamento = iDDepartamento;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String isGenero() {

		if (Genero == false) {
			return "Hombre";

		} else {
			return "Mujer";
		}

	}

	public void setGenero(boolean genero) {
		Genero = genero;
	}

	public int getIDDepartamento() {
		return IDDepartamento;
	}

	public void setIDDepartamento(int iDDepartamento) {
		IDDepartamento = iDDepartamento;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Empleado.contador = contador;
	}

	@Override
	public String toString() {
		return ID + "\t" + DNI + "\t" + nombre + "\t" + apellidos + "\t" + salario + "\t" + isGenero() + "\t" + IDDepartamento;
	}

}
