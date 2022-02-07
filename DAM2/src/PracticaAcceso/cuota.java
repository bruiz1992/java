package PracticaAcceso;

import java.util.ArrayList;

public class cuota {

	String nombre;
	ArrayList<Medicion> Medi = new ArrayList<Medicion>();
	float Madrugada;
	float Manana;
	float tarde;
	float Prime;
	float total;

	public cuota(String nombre, ArrayList<Medicion> Medi) {
		this.nombre = nombre;
		this.Medi = Medi;
		for (int i = 0; i < Medi.size(); i++) {
			if (Medi.get(i).getNombre().equals(getNombre())) {
				if ((Medi.get(i).getHoras() + (Medi.get(i).getMinutos()) / 10) < 7
						&& (Medi.get(i).getHoras() + (Medi.get(i).getMinutos()) / 10) >= 0) {
					// madrugada
					Medi.get(i).getTotal();
					setMadrugada(getMadrugada() + Medi.get(i).getTotal());

				}
				if ((Medi.get(i).getHoras() + (Medi.get(i).getMinutos()) / 10) < 14
						&& (Medi.get(i).getHoras() + (Medi.get(i).getMinutos()) / 10) >= 7) {
					// manana
					setManana(getManana() + Medi.get(i).getTotal());
				}
				if ((Medi.get(i).getHoras() + (Medi.get(i).getMinutos()) / 10) < 20
						&& (Medi.get(i).getHoras() + (Medi.get(i).getMinutos()) / 10) >= 14) {
					// tarde
					setTarde(getTarde() + Medi.get(i).getTotal());
				}
				if ((Medi.get(i).getHoras() + (Medi.get(i).getMinutos()) / 10) >= 20) {
					// Prime
					setPrime(getPrime() + Medi.get(i).getTotal());
				}
			}
			

		}
		setMadrugada(Madrugada*10000);
		setManana(Manana*10000);
		setTarde(tarde*10000);
		setPrime(Prime*10000);
		setTotal(total*10000);
		setTotal(Madrugada + Manana + tarde + Prime);
		

	}

	public String getCadena() {
		return nombre;
	}

	public void setCadena(String cadena) {
		nombre = cadena;
	}

	public float getMadrugada() {
		return Madrugada;
	}

	public void setMadrugada(float madrugada) {
		Madrugada = madrugada;
	}

	public float getManana() {
		return Manana;
	}

	public void setManana(float manana) {
		Manana = manana;
	}

	public float getTarde() {
		return tarde;
	}

	public void setTarde(float tarde) {
		this.tarde = tarde;
	}

	public float getPrime() {
		return Prime;
	}

	public void setPrime(float prime) {
		Prime = prime;
	}

	@Override
	public String toString() {
		int A,B,C,D;
		A = (int)Madrugada;
		B = (int)Manana;
		C = (int)tarde;
		D = (int)Prime;
		
		return nombre + "," + Madrugada + "," + Manana + "," + tarde + "," + Prime + "," + total;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Medicion> getMedi() {
		return Medi;
	}

	public void setMedi(ArrayList<Medicion> medi) {
		Medi = medi;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

}
