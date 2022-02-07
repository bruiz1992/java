package practica3;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vuelo {

	private int IdVuelo;
	private String Empresa;
	private Date ida;
	private Date vuelta;
	private float precioV;
	private String destino;
	private static int contador = 0;
	private boolean Asociado = false;
	DateFormat id = new SimpleDateFormat("dd/MM/yyyy");

	public Vuelo(String empresa, Date ida, Date vuelta, float precioV, String destino) {
		setIdVuelo(contador);
		setContador(contador + 1);
		this.Empresa = empresa;
		this.ida = ida;
		this.vuelta = vuelta;
		this.precioV = precioV;
		this.destino = destino;
	}
	public Boolean iAsociado() {
		return Asociado;
			
	}

	public String getEmpresa() {
		return Empresa;
	}

	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}

	public Date getIda() {
		return ida;
	}

	public void setIda(Date ida) {
		this.ida = ida;
	}

	public Date getVuelta() {
		return vuelta;
	}

	public void setVuelta(Date vuelta) {
		this.vuelta = vuelta;
	}

	public Float getPrecioV() {
		return precioV;
	}

	public void setPrecioV(int precioV) {
		this.precioV = precioV;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getIdVuelo() {
		return IdVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		IdVuelo = idVuelo;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Vuelo.contador = contador;
	}

	public void setPrecioV(float precioV) {
		this.precioV = precioV;
	}

	public String isAsociado() {
		if (Asociado == false) {
			return "Pendiente";
		} else {
			return "Asociado";
		}
	}

	public void setAsociado(boolean asociado) {
		Asociado = asociado;
	}

	@Override
	public String toString() {
		return IdVuelo + "\t" + Empresa + "\t" + id.format(ida) + "\t" + id.format(vuelta) + "\t" + precioV + "\t" + destino
				+ "\t" + " Asociado: " + isAsociado();
	}


}
