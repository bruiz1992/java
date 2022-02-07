package GasMonkeyGaraje;

public class ReparacionMecanica extends Reparacion {

	private static double coste = 1.1;

	public ReparacionMecanica(String descripcion) {
		super(descripcion);

	}

	public static double getCoste() {
		return coste;
	}

	public static void setCoste(double coste) {
		ReparacionMecanica.coste = coste;
	}
	
	public String toString() {
		double Total = calcularCosteHoras() + getCostePiezas() ;
		return "Tipo: Reparacion Mecanica "+ "\t" + "Id Trabajo=" + getId() + "\t" +   " Estado: " + isEstado()  + "\n" + "Descripcion: " + getDescripcion() + "\n" +
				"Total horas = " + getHoras() + "\t" 
				+ "Coste Horas = " + calcularCosteHoras() + "\t" + "Coste de piezas=" + getCostePiezas()+ "\t" 
				+ "Total =" + Total + "\n";
	}
	

	
}
