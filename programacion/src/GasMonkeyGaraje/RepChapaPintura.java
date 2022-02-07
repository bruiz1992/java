package GasMonkeyGaraje;

public class RepChapaPintura extends Reparacion {

	private static double coste = 1.3;

	public RepChapaPintura(String descripcion) {
		super(descripcion);

	}

	public static double getCoste() {
		return coste;
	}

	public static void setCoste(double coste) {
		RepChapaPintura.coste = coste;
	}
	public String toString() {
		double Total = calcularCosteHoras() + getCostePiezas() ;
		return "Tipo: Reparacion Chapa y pintura "+ "\t" + "Id Trabajo=" + getId() + "\t" +   " Estado: " + isEstado()  + "\n" + "Descripcion: " + getDescripcion() + "\n" +
				"Total horas = " + getHoras() + "\t" 
				+ "Coste Horas = " + calcularCosteHoras() + "\t" + "Coste de piezas=" + getCostePiezas()+ "\t" 
				+ "Total =" + Total + "\n";
	}

}
