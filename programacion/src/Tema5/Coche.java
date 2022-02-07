package Tema5;

public class Coche extends Vehiculo {

	String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	Coche(int kmRecorridos, int kmTotales, String marca, int ruedas) {
		super(kmRecorridos, kmTotales, ruedas);
		this.marca = marca;
		ruedas = 4;

	}
	public String quemaRueda() {
		String quema = "i i i i iiiiii i iiii Sa'matao Paco!!!!!!";
		return quema;
	}
	public void andacoche(int recorre) {
		setKmRecorridos(recorre);
		setKmTotales(getKmRecorridos() + getKmTotales() );
		
	}

}
