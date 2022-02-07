package Tema5.Tenis;



public class Jugador {

	private String nombre;
	private int puntoganador = 0;
	private int errornoforzado = 0;
	private int saquedirecto = 0;

	Jugador(String nombre) {
		this.nombre = nombre;
	}

	public Jugador() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntoganador() {
		return puntoganador;
	}

	public void setPuntoganador(int puntoganador) {
		this.puntoganador = puntoganador;
	}

	public int getErrornoforzado() {
		return errornoforzado;
	}

	public void setErrornoforzado(int errornoforzado) {
		this.errornoforzado = errornoforzado;
	}

	public int getSaquedirecto() {
		return saquedirecto;
	}

	public void setSaquedirecto(int saquedirecto) {
		this.saquedirecto = saquedirecto;
	}

	public String toString() {
		return getNombre();
	}

	void puntoganadorMas() {
		puntoganador++;
	}

	void errornoforzadoMas() {
		errornoforzado++;
	}

	void saquedirectoMas() {
		puntoganador++;
	}

	//compara los nombres de los objetos para saber si son iguales.
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	//crea un string con todas las estadisticas del jugador
	public String EstadisticasJugador() {
		String cadena = "\t Nombre y apellidos: " + nombre + "\n" + "\t Puntos ganadores " + puntoganador + "\n"
				+ "\t Saquedirecto: " + saquedirecto + "\n" + "\t Error no forzado: " + errornoforzado + "\n\n";
		return cadena;
	}

}
