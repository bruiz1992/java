package GasMonkeyGaraje;

public class Trabajo {

	private int horas = 1;
	private static int contador = 0;
	private boolean estado = true;
	private int id;
	private String descripcion;

	public Trabajo(String descripcion) {
		this.descripcion = descripcion;
		setId(contador);
		setContador(contador + 1);
		
		

	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Trabajo.contador = contador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	public boolean getEstado() {
		return estado;
	}

	public String isEstado() {
		String devolver;
		if(estado == true) {
			devolver = "Pendiente";
		}else {
			devolver = "Finalizado";
		}
		
		return devolver;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public boolean existeTrabajo(int comprobar) {
		boolean devolver = false;
		if(comprobar >= 0 && comprobar <= contador ) {
			devolver = true;	
		}
		return devolver;
	}

	
	public void añadirHoras(int añadir) {
		setHoras(añadir + getHoras());
	}

	public void finalizarTrabajo() {
		setEstado(false);
	}
	public int calcularCosteHoras() {
		int CosteHoras = getHoras() * 30;
		
	return CosteHoras;
	}
	

	public String toString() {
		String estadoActual = "Pendiente";
		int costeHoras = calcularCosteHoras();
		if (estado == false) {
			estadoActual = "Finalizado";
		}

		return "horas=" + horas + " " + " "+ "Coste Horas:" + costeHoras + ", estado=" + estadoActual + " " + id + "\n" + descripcion;
	}
	public void añadirhoras(int horas) {
		setHoras(getHoras() + horas);
		
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trabajo other = (Trabajo) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (id != other.id)
			return false;
		return true;
	}
	

	



}
