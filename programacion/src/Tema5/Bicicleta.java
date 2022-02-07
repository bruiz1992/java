package Tema5;

public class Bicicleta extends Vehiculo {

	String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	Bicicleta(int kmRecorridos, int kmTotales, int ruedas, String tipo ) {
		super(kmRecorridos, kmTotales, ruedas);
		ruedas = 2;
		this.tipo = tipo;
	
	}
	public String caballito() {
		String caballito = "Mira como hago un caballito";
		return caballito;
	}
	public void andabici(int recorre) {
		setKmRecorridos(recorre);
		setKmTotales(getKmRecorridos() + getKmTotales() );
		
	}

}
