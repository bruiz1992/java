package practica3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Paquete {

	
	private String Nombre;
	private int IdPaquete;
	private Vuelo VueloP;
	private Hotel Hotelp;
	private float precioTotal;
	private static int contador = 0;
	DateFormat id = new SimpleDateFormat("dd/MM/yyyy");
	
	public Paquete(String nombre, Vuelo vueloP, Hotel hotelp) {
		
		
		setIdPaquete(contador);
		setContador(contador + 1);
		this.Nombre = nombre;
		this.VueloP = vueloP;
		this.Hotelp = hotelp;
		setPrecioTotal(VueloP.getPrecioV() + Hotelp.getTotalHotel());
		VueloP.setAsociado(true);
		Hotelp.setAsociado(true);
		
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getIdPaquete() {
		return IdPaquete;
	}

	public void setIdPaquete(int idPaquete) {
		IdPaquete = idPaquete;
	}

	public Vuelo getVueloP() {
		return VueloP;
	}

	public void setVueloP(Vuelo vueloP) {
		VueloP = vueloP;
	}

	public Hotel getHotelp() {
		return Hotelp;
	}

	public void setHotelp(Hotel hotelp) {
		Hotelp = hotelp;
	}

	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Paquete.contador = contador;
	}

	@Override
	public String toString() {
		return "ID paquete: "+IdPaquete +"\t" + Nombre +"\t" + VueloP +"\t" + Hotelp
				+ "\t" +"Precio Total: "+ precioTotal;
	}
	

	
	
}
