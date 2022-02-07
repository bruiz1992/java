package Tema5;

import java.util.Objects;

public class Jugador {
		
	//Atributos:
		String nombre;
		int puntos_ganadores;
		int errores;
		int saques_directos;
		
		
	//Metodo constructor:
	Jugador (String nombre) {
		this.nombre = nombre;
		this.puntos_ganadores = 0;
		this.errores = 0;
		this.saques_directos = 0;
			
	}
	// METODOS GET, SET, toString
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getPuntos_ganadores() {
			return puntos_ganadores;
		}
		public void setPuntos_ganadores(int puntos_ganadores) {
			this.puntos_ganadores = puntos_ganadores;
		}
		public int getErrores() {
			return errores;
		}
		public void setErrores(int errores) {
			this.errores = errores;
		}
		public int getSaques_directos() {
			return saques_directos;		
		}
		public void setSaques_directos(int saques_directos){
			this.saques_directos = saques_directos;	
		}
		
		@Override
		public String toString() {
			return "Jugador nombre=" + nombre + ", puntos_ganadores=" + puntos_ganadores + ", errores=" 
					+ errores+ ", saques_directos=" + saques_directos;
		}
		
		// Metodo to equals
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Jugador other = (Jugador) obj;
			return Objects.equals(nombre, other.nombre);
		}
		
		/*Metodo obtener el nombre del jugador buscado
		 * Proporciona un objeto de tipo Jugador, a partir del nombre de dicho jugador.
		 * @param Jugador jugador.
		 */

		public boolean checkName(String nombre) {
			String nombrejugador = getNombre();
			boolean encontrado = false;
			
			if(nombrejugador.equalsIgnoreCase(nombre)) {
				encontrado = true;
			}
			return (encontrado);
		}
		public void añadirPuntos_ganadores() {
			int puntos = getPuntos_ganadores();
			puntos++;
			setPuntos_ganadores(puntos);
		}
		public void añadirErrores() {
			int errores = getErrores();
			errores++;
			setErrores(errores);
		}
		public void añadirSaques() {
			int saques = getSaques_directos();
			saques++;
			setSaques_directos(saques);
		}
}	