package GasMonkeyGaraje;

public class Reparacion extends Trabajo {

	private int costePiezas;
	private double coste;
	

	


	public Reparacion(String descripcion) {
		super(descripcion);
		
	}

	public int getCostePiezas() {
		return costePiezas;
	}

	public void setCostePiezas(int costePiezas) {
		this.costePiezas = costePiezas;
	}
	public double calcularCoste(int costePieza) {
		double aux = calcularCosteHoras() * coste;

		setCostePiezas(costePiezas + getCostePiezas());
		double Total = getCostePiezas() + aux;
		return Total;
	}
	public void añadirPiezas(int piezas) {
		setCostePiezas(getCostePiezas() + piezas);
		
	}
	

}
