package GasMonkeyGaraje;

public class revision extends Trabajo {

	private int Fijo = 20;

	public revision(String descripcion) {
		super(descripcion);
		this.Fijo = Fijo;
	}

	public int getFijo() {
		return Fijo;
	}
	public String toString() {
		double Total = calcularCosteHoras() + getFijo();
		return "Tipo: revision "+ "\t" + "Id Trabajo=" + getId() + "\t" +   " Estado: " + isEstado()  + "\n" + "Descripcion: " + getDescripcion() + "\n" +
				"Total horas = " + getHoras() + "\t" 
				+ "Coste Horas = " + calcularCosteHoras() + "\t" + "Coste fijo=" + getFijo()+ "\t" 
				+ "Total =" + Total + "\n";
	}

}
