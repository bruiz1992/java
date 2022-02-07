package GasMonkeyGaraje;

import java.util.*;

public class Taller {
	private ArrayList<Trabajo> Trabajos = new ArrayList<Trabajo>();

	public Taller() {

	}

	public ArrayList<Trabajo> getTrabajos() {
		return Trabajos;
	}

	public void setTrabajos(ArrayList<Trabajo> trabajos) {
		Trabajos = trabajos;
	}

	public void añadirTrabajo(Trabajo entra) {
		Trabajos.add(entra);

	}

	public void queTrabajo(int ID, String observaciones) {
		if (ID == 1) {
			RepChapaPintura nuevoChapa = new RepChapaPintura(observaciones);
			añadirTrabajo(nuevoChapa);}
			else if (ID == 2) {
				ReparacionMecanica nuevoMecanica = new ReparacionMecanica(observaciones);
				añadirTrabajo(nuevoMecanica);}
				else if (ID == 3) {
					revision nuevoRevision = new revision(observaciones);
					añadirTrabajo(nuevoRevision);

				}
			
		
	}

	// metodo para comprobar si es una revision o una reparacion
	// si saca un 1 esque el trabajo no existe.
	// si saca un 2 es que es una revision
	// si saca un 0 esta todo bien para seguir.
	public int tienePiezas(int ID) {
		int salida = 0;
		boolean comprobar = Trabajos.get(ID).existeTrabajo(ID);

		if (comprobar == false) {
			salida = 1;
		}
		revision AUX = new revision(null);
		if (Trabajos.get(ID).equals(AUX)) {
			salida = 2;
		}
		return salida;
	}

	// si ve que esta finalizado sale con 3
	// si comprueba si existe el trabajo añade horas llamando al metodo añadir horas
	public int aumentarHoras(int ID, int añadir) {
		boolean estado = Trabajos.get(ID).getEstado();
		int salir = 0;
		if (estado == false) {
			salir = 3;
		}
		boolean comprobar = Trabajos.get(ID).existeTrabajo(ID);
		if (comprobar == false) {
			salir = 1;
		} else {
			Trabajos.get(ID).añadirhoras(añadir);
		}

		return salir;
	}
	// si ve que esta finalizado sale con 3
	// si existe no existe trabajo devuelve un 1
	public int costePiezas(int ID, int añadir) {
		
		boolean estado = Trabajos.get(ID).getEstado();
		int salir = 0;
		if (estado == false) {
			salir = 3;
		}
		Reparacion AUX = new Reparacion(Trabajos.get(ID).getDescripcion());
		boolean comprobar = Trabajos.get(ID).existeTrabajo(ID);
		if (comprobar == false) {
			salir = 1;
		} else {
			AUX.añadirPiezas(añadir);
			Trabajos.set(ID, AUX);
			salir = 2;

		}

		return salir;
	}

	public int finalizarTrabajo(int ID) {
		boolean estado = Trabajos.get(ID).getEstado();
		int salir = 0;
		if (estado == false) {
			salir = 3;
		}
		boolean comprobar = Trabajos.get(ID).existeTrabajo(ID);
		if (comprobar == false) {
			salir = 1;
		} else {
			Trabajos.get(ID).finalizarTrabajo();
		}

		return salir;
	}

	public String Imprimir(int posicion) {

		String Salida = Trabajos.get(posicion).toString();
		return Salida;
	}

	public boolean ExiteTrabajo(int ID) {
		int aux = Trabajos.get(0).getContador();
		if (ID < aux && ID >= 0) {
			return true;
		}
		return false;
	}

}