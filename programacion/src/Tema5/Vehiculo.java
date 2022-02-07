package Tema5;

public class Vehiculo {

	private static int vehiculosCreados;
	protected int kmTotales;
	protected int kmRecorridos;
	private int ruedas;

	public int getVehiculosCreados() {
		return vehiculosCreados;
	}

	public int setVehiculosCreados(int vehiculosCreados) {
		return this.vehiculosCreados = vehiculosCreados;
	}

	public int getKmTotales() {
		return kmTotales;
	}

	public void setKmTotales(int kmTotales) {
		this.kmTotales = kmTotales;
	}

	public int getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(int kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	Vehiculo(int kmRecorridos, int kmTotales, int ruedas) {
		this.kmRecorridos = kmRecorridos;
		this.kmTotales = kmTotales;
		this.ruedas = ruedas;
		SumarVehiculo();
	}

	public void SumarVehiculo() {
		int A = getVehiculosCreados() + 1;
		setVehiculosCreados(A);
	}

}