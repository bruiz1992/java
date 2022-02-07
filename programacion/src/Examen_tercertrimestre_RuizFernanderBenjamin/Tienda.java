package Examen_tercertrimestre_RuizFernanderBenjamin;

import java.util.*;
import java.util.Map.Entry;

public class Tienda {

	private String nombre;
	private Map<Integer, Vendedor> Vendedores = new HashMap<Integer, Vendedor>();
	ValueComparator bvc = new ValueComparator(Vendedores);
	TreeMap<Integer, Vendedor> sorted_Vendedores = new TreeMap<Integer, Vendedor>(bvc);

	public Tienda() {
		
		
	}

	public void setMediaMarkt(String nombre) {
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<Integer, Vendedor> getVendedores() {
		return Vendedores;
	}

	public void setVendedores(Map<Integer, Vendedor> vendedores) {
		Vendedores = vendedores;
	}

	public void nuevoVendedor(Vendedor Entra) {
		int key = Entra.getDNI();
		Vendedores.put(key, Entra);

	}

	public int nuevoVendedor(int DNI, String Entra) {
		Vendedor AUX = new Vendedor(DNI, Entra, 0);
		if (Vendedores.containsKey(DNI) == true) {
			return -1;
		}
		Vendedores.put(DNI, AUX);
		return 1;
	}

	public String imprimirVendedores() {
		
		

		
		
		String salir = "";
		ValueComparator bvc = new ValueComparator(Vendedores);
		TreeMap<Integer, Vendedor> sorted_Vendedores = new TreeMap<Integer, Vendedor>(bvc);
		sorted_Vendedores.putAll(Vendedores);
		
		Collection c = sorted_Vendedores.values();
		Iterator itr = c.iterator();
		
		for (int i = 0; i < 3; i++) {
			salir = salir + " = " + sorted_Vendedores.toString() + "\n";
		}

		return salir;
	}

	public int nuevaVenta(int DNI, int importe) {
		if (Vendedores.containsKey(DNI) == true) {
			double comision = calcularComision(importe);
			return 1;
		}

		return -1;
	}

	public double calcularComision(double importe) {

		importe = (importe * 0.05);

		return importe;
	}

	public String datosVendedor(int DNI) {
		Vendedor AUX = new Vendedor(DNI, " ", 0);
		String salir = "El DNI indicado no corresponde a ningun Vendedor";
		if (Vendedores.containsKey(DNI) == true) {
			salir = Vendedores.get(DNI).toString();
			return salir;
		}

		return salir;
	}


}
