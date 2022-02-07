package Tema5.Tenis;

import Tema4.Colegio.Alumno;

public class Equipo {

	private String nombre;
	private Jugador Jugador1;
	private Jugador Jugador2;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Jugador getJugador1() {
		return Jugador1;
	}

	public void setJugador1(Jugador jugador1) {
		Jugador1 = jugador1;
	}

	public Jugador getJugador2() {
		return Jugador2;
	}

	public void setJugador2(Jugador jugador2) {
		Jugador2 = jugador2;
	}

	public Equipo(String nombre) {
		this.nombre = nombre;
	}

	public Equipo() {

	}

	// comprobamos si el jugador ya existe en el equipo
	public boolean ExisteJugador(String nombre) {
		boolean esta = false;
		Jugador C = new Jugador(nombre);
		if (C.equals(Jugador1)) {
			esta = true;
		} else if (C.equals(Jugador2)) {
			esta = true;
		}

		return esta;

	}

	// añade el jugador al equipo siempre y cuando el nombre no se repita y el
	// equipo no este completo.
	public String AñadirJugador(Jugador L) {
		String devolver = null;

		if ((ExisteJugador(L.getNombre()) == true)) {
			devolver = "El numero del Jugador ya a sido elegido por favor indique otro nombre";
		}

		else if (Jugador1 == null) {
			Jugador1 = L;
			devolver = "Primer Jugador añadido correctamente";
		} else if (Jugador2 == null) {
			Jugador2 = L;
			devolver = "Segundo Jugador añadido correctamente";
		} else {
			devolver = "Este equipo ya esta completo";

		}

		return devolver;

	}

//compara los nombres de los equipos para saber si los objetos son iguales.
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	// suma las estadisticas de los dos miembros del equipo y las convierte en
	// string para imprimir por pantalla.
	public String EstadisticasEquipo() {
		int puntoganadore = Jugador1.getPuntoganador() + Jugador2.getPuntoganador();
		int saquee = Jugador1.getSaquedirecto() + Jugador2.getSaquedirecto();
		int errore = Jugador1.getErrornoforzado() + Jugador2.getErrornoforzado();
		String cadena = "\t Nombre  " + getNombre() + "\n" + "\t Puntos ganadores " + "Tenistas: "
				+ Jugador1.getNombre() + "\t" + Jugador2.getNombre() + "\n" + "\t Saquedirecto: " + puntoganadore + "\n"
				+ "\t Saquedirecto: " + saquee + "\n" + "\t Error no forzado: " + errore + "\n\n";
		return cadena;
	}

	// borra los nombres de los componentes del equipo.
	public void BorrarNombreJ() {
		Jugador1.setNombre(null);
		Jugador2.setNombre(null);
	}

//crea un jugador aux con el nombre que entra en el metodo para comparar si es igual a alguno de los miembros del equipo
	// sí no es asi devolvera un 0, si esta en el equipo devolvera 1 o 2 dependiendo
	// de si es el jugador1 o el jugador2
	public int RevisionEnEquipo(String nombre) {
		int es = 0;

		Jugador aux = new Jugador(nombre);
		if (aux.equals(Jugador1)) {
			es = 1;
		} else if (aux.equals(Jugador2)) {
			es = 2;
		}

		return es;

	}

//entra un entero que indica a que jugador debe añadir un punto ganador.
	public void AñadirPuntoGanador(int num) {

		if (num == 1) {
			Jugador1.puntoganadorMas();
		} else if (num == 2) {
			Jugador2.puntoganadorMas();
		}
	}

	// entra un entero que indica a que jugador debe añadir un saque directo.
	public void AñadirSaquedirecto(int num) {

		if (num == 1) {
			Jugador1.saquedirectoMas();
		} else if (num == 2) {
			Jugador2.saquedirectoMas();
		}
	}

	// entra un entero que indica a que jugador debe añadir un error no forzado.
	public void AñadirErrornoforzado(int num) {

		if (num == 1) {
			Jugador1.errornoforzadoMas();
		} else if (num == 2) {
			Jugador2.errornoforzadoMas();
		}
	}

	// comprueba de qye jugador y devuelve un string con las estadisticas.
	public String ComprobarEstadisticasJU(int num) {
		String nombre = null;
		if (num == 1) {
			nombre = Jugador1.EstadisticasJugador();
		} else if (num == 2) {
			nombre = Jugador2.EstadisticasJugador();
		}

		return nombre;
	}

}
