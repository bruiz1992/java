package Tema5.Tenis;

public class Partido {

	private Equipo EquipoLocal;
	private Equipo EquipoVisitante;

	public Equipo getEquipoLocal() {
		return EquipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		EquipoLocal = equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return EquipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		EquipoVisitante = equipoVisitante;
	}



	Partido(Equipo A, Equipo B) {
		this.EquipoLocal = A;
		this.EquipoVisitante = B;

	}

//llama al metodo Estadisticas equipo de cada uno de los que componen el partido para crear un conjunto de estadisticas de ambos.
	public String estadisticasPartido() {
		String cadena = EquipoLocal.EstadisticasEquipo() + EquipoVisitante.EstadisticasEquipo();
		return cadena;
	}

	// compara los nombres de los equipos para saber si los objetos son iguales.
	public boolean existeEquipo(String nombre) {
		boolean esta = false;
		Equipo aux = new Equipo(nombre);
		if (aux.equals(EquipoLocal)) {
			esta = true;
		} else if (aux.equals(EquipoVisitante)) {
			esta = true;
		}

		return esta;
	}

//borrar tanto los nombre de los equipos de los jugadores
	public void BorraNombres() {
		EquipoLocal.setNombre(null);
		EquipoVisitante.setNombre(null);
		EquipoLocal.BorrarNombreJ();
		EquipoVisitante.BorrarNombreJ();
	}

//este metodo comprueba el nombre uno a uno de los 2 jugadores de los dos equipos
	// si encuentra una coincidencia añade la informacion y devuelve uno para que en
	// el main
	// quede confirmado, si no indica 0 dado que no hay jugadores con ese nombre
	// llama a un metodo de la clase equipo que a su vez llama a un metodo de la
	// clase jugador
	public int AñadirPuntoganador(String nombre) {
		int devuelve = 0;
		if (EquipoLocal.RevisionEnEquipo(nombre) == 1) {
			EquipoLocal.AñadirPuntoGanador(1);
			devuelve = 1;
		} else if (EquipoLocal.RevisionEnEquipo(nombre) == 2) {
			EquipoLocal.AñadirPuntoGanador(2);
			devuelve = 1;
		} else if (EquipoVisitante.RevisionEnEquipo(nombre) == 1) {
			EquipoVisitante.AñadirPuntoGanador(1);
			devuelve = 1;
		} else if (EquipoVisitante.RevisionEnEquipo(nombre) == 2) {
			EquipoVisitante.AñadirPuntoGanador(2);
			devuelve = 1;
		}

		return devuelve;
	}

	// este metodo comprueba el nombre uno a uno de los 2 jugadores de los dos
	// equipos
	// si encuentra una coincidencia añade la informacion y devuelve uno para que en
	// el main
	// quede confirmado, si no indica 0 dado que no hay jugadores con ese nombre
	// llama a un metodo de la clase equipo que a su vez llama a un metodo de la
	// clase jugador
	public int AñadirSaquedirecto(String nombre) {
		int devuelve = 0;
		if (EquipoLocal.RevisionEnEquipo(nombre) == 1) {
			EquipoLocal.AñadirPuntoGanador(1);
			devuelve = 1;
		} else if (EquipoLocal.RevisionEnEquipo(nombre) == 2) {
			EquipoLocal.AñadirPuntoGanador(2);
			devuelve = 1;
		} else if (EquipoVisitante.RevisionEnEquipo(nombre) == 1) {
			EquipoVisitante.AñadirPuntoGanador(1);
			devuelve = 1;
		} else if (EquipoVisitante.RevisionEnEquipo(nombre) == 2) {
			EquipoVisitante.AñadirPuntoGanador(2);
			devuelve = 1;
		}

		return devuelve;
	}

	// este metodo comprueba el nombre uno a uno de los 2 jugadores de los dos
	// equipos
	// si encuentra una coincidencia añade la informacion y devuelve uno para que en
	// el main
	// quede confirmado, si no indica 0 dado que no hay jugadores con ese nombre
	// llama a un metodo de la clase equipo que a su vez llama a un metodo de la
	// clase jugador
	public int AñadirErrorNoforzado(String nombre) {
		int devuelve = 0;
		if (EquipoLocal.RevisionEnEquipo(nombre) == 1) {
			EquipoLocal.AñadirPuntoGanador(1);
			devuelve = 1;
		} else if (EquipoLocal.RevisionEnEquipo(nombre) == 2) {
			EquipoLocal.AñadirPuntoGanador(2);
			devuelve = 1;
		} else if (EquipoVisitante.RevisionEnEquipo(nombre) == 1) {
			EquipoVisitante.AñadirPuntoGanador(1);
			devuelve = 1;
		} else if (EquipoVisitante.RevisionEnEquipo(nombre) == 2) {
			EquipoVisitante.AñadirPuntoGanador(2);
			devuelve = 1;
		}

		return devuelve;
	}
//Comprueba si existe el equipo y de ser asi devuelve un string con las estadisticas.
	public String comprobarEstadisticas(String nombre) {

		if (EquipoLocal.RevisionEnEquipo(nombre) == 1) {
			nombre = EquipoLocal.ComprobarEstadisticasJU(1);

		} else if (EquipoLocal.RevisionEnEquipo(nombre) == 2) {
			nombre = EquipoLocal.ComprobarEstadisticasJU(2);

		} else if (EquipoVisitante.RevisionEnEquipo(nombre) == 1) {
			nombre = EquipoVisitante.ComprobarEstadisticasJU(1);

		} else if (EquipoVisitante.RevisionEnEquipo(nombre) == 2) {
			nombre = EquipoVisitante.ComprobarEstadisticasJU(2);

		}

		return nombre;
	}

	public String comprobarEstadisticaseq(String nombre) {

		if (EquipoLocal.getNombre().equals(nombre) == true) {
			nombre = EquipoLocal.EstadisticasEquipo();

		} else if (EquipoVisitante.getNombre().equals(nombre) == true) {
			nombre = EquipoVisitante.EstadisticasEquipo();
		}
		return nombre;

	}
}
