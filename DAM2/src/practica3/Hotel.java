package practica3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hotel {

	private int IdHotel;
	private String nombre;
	private String Ciudad;
	private Date llegada;
	private int numNoches;
	private float precioNoche;
	private float totalHotel;
	private static int contador = 0;
	private boolean Asociado = false;
	DateFormat id = new SimpleDateFormat("dd/MM/yyyy");

	public Hotel(String nombre, String ciudad, Date llegada, int numNoches, float precioNoche) {

		setIdHotel(contador);
		setContador(contador + 1);
		this.nombre = nombre;
		this.Ciudad = ciudad;
		this.llegada = llegada;
		this.numNoches = numNoches;
		this.precioNoche = precioNoche;
		setTotalHotel(precioNoche * numNoches);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public Date getLlegada() {
		return llegada;
	}

	public void setLlegada(Date llegada) {
		this.llegada = llegada;
	}

	public int getNumNoches() {
		return numNoches;
	}

	public void setNumNoches(int numNoches) {
		this.numNoches = numNoches;
	}

	public float getPrecioNoche() {
		return precioNoche;
	}

	public void setPrecioNoche(float precioNoche) {
		this.precioNoche = precioNoche;
	}

	public float getTotalHotel() {
		return totalHotel;
	}

	public void setTotalHotel(float totalHotel) {
		this.totalHotel = totalHotel;
	}

	public int getIdHotel() {
		return IdHotel;
	}

	public void setIdHotel(int idHotel) {
		IdHotel = idHotel;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Hotel.contador = contador;
	}

	public String isAsociado() {
		if (Asociado == false) {
			return "Pendiente";
		} else {
			return "Asociado";
		}
	}
	
	public Boolean iAsociado() {
		return Asociado;
			
	}

	public void setAsociado(boolean asociado) {
		Asociado = asociado;
	}

	@Override
	public String toString() {
		return IdHotel +"\t" + nombre+"\t" + Ciudad+"\t"  + id.format(llegada)+"\t"
				+  numNoches+"\t"  + precioNoche+ "\t" + "Total: " + totalHotel+"\t"
				+ "Asociado:" + isAsociado();
	}

}
