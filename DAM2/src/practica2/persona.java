package practica2;

public class persona {

	String dNI;
	String nombre;
	String apellidos; 
	String telefono;
	String fecha; 
	
	
	public persona(String dNI, String nombre, String apellidos, String telefono,String fecha) {
		this.dNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.fecha = fecha;
	}


	public String getdNI() {
		return dNI;
	}


	public void setdNI(String dNI) {
		this.dNI = dNI;
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


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	@Override
	public String toString() {
		return "persona [dNI=" + dNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", fecha=" + fecha + "]";
	}
	
	
	
}
