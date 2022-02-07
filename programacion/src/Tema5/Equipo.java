package Tema5;

public class Equipo {
	
	//Atributos:
	String nombre_equipo;
	Jugador jugador1;
	Jugador jugador2;
		
		
	//Constructor:
	Equipo (String nombre_equipo, Jugador jugador1, Jugador jugador2) { 
		this.nombre_equipo = nombre_equipo;
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}
	Equipo () { 

	}
		
	//METODOS GET, SET, toString
		
	public String getNombre_equipo() {
		return nombre_equipo;
	}
	public void setNombre_equipo(String nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}
	public Jugador getJugador1() {
		return jugador1;
	}
	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}
	public Jugador getJugador2() {
		return jugador2;
	}
	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}
	public String toString() {
		String cadena = "Equipo " + nombre_equipo + " : " + jugador1 + " , " + jugador2 + "\n";
		return (cadena);
	}
	// Metodos :
	
	/* Metodo para ver si existe el nombre del jugador
	 * 
	 */

	public boolean existeJugador(String nombre) {
		if(getJugador1().checkName(nombre)) {
			return true;
		} else if (getJugador2().checkName(nombre)) {
			return true;
		}
		return false;
	}
	

	public void añadirEstadistica(int opcion, String Nombre) {
		if(getJugador1().checkName(Nombre)) {
			if(opcion == 1) {
				getJugador1().añadirPuntos_ganadores();
			} else if(opcion == 2) {
				
			}
		}
	}
}
	
	
	

