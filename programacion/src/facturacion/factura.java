package facturacion;

import java.util.ArrayList;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class factura {
	private boolean estado = true;
	private ArrayList<pedido> Pedidos = new ArrayList<pedido>();
	private double Total;
	private cliente Cliente;
	private String Nfac;
	private static int contador = 0;

	// con este contructor se añade a traves de la clase date y sus clases format un
	// ID de factura con fecha y hora.
	public factura(cliente cliente) {
		Date date = new Date();
		DateFormat hourdateFormat = new SimpleDateFormat("MMddHHmmss");
		String ID = hourdateFormat.format(date) + ".fac";
		setPedidos(cliente.getListapedidos());
		Cliente = cliente;
		setNfac(ID);
	}

	public ArrayList<pedido> getPedidos() {
		return Pedidos;
	}

	public String isEstado() {
		String devolver;
		if (estado == true) {
			devolver = "Pendiente";
		} else {
			devolver = "Finalizado";
		}

		return devolver;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public void setPedidos(ArrayList<pedido> pedidos) {
		Pedidos = pedidos;
	}

	public double getTotal() {
		return Total;
	}

	public void setTotal(double total) {
		Total = total;
	}


	public cliente getCliente() {
		return Cliente;
	}

	public void setCliente(cliente cliente) {
		Cliente = cliente;
	}

	public String getNfac() {
		return Nfac;
	}

	public void setNfac(String nfac) {
		Nfac = nfac;
	}

	public String toString() {
		return "factura estado=" + isEstado() + ", Pedidos=" + Pedidos + ", Total=" + Total + ","
				+ ", Nfac=" + Nfac + "";
	}
	public void añadirClientefac(cliente entra) {
		Cliente = entra;
	}
	public void añadirpedidofac(ArrayList<pedido> entra) {
		Pedidos.addAll(entra);
	}
	public double calcularTotal(pedido entra) {
		double salir= entra.calcularLinea();
		return salir;
	}
	public String lineasPedido() {
		String salida = " ";
		for(int i = 0; i < Pedidos.size();i++) {
			salida = salida + Pedidos.get(i).toString();
		}
		return salida;
	}
	public double calcularTotal() {
		double salida = 0;
		for(int i = 0; i < Pedidos.size();i++) {
			salida = salida + Pedidos.get(i).calcularLinea();
		}
		salida = salida * 0.9;
		return salida;
	}
	public String dibujarfactura() {
		setTotal(calcularTotal());
		double total = Pedidos.get(0).calcularLinea();
		String devolver = "factura estado=" + isEstado() + "\t" + "Nfac=" + Nfac + "\n" + 
		"Pedidos:" +"\n" + lineasPedido() + "\n" + "Descuento = " + Cliente.getDescuento() + "% " + "\n" 
				+ "Total = " + Total;
				
		
		
		
		return devolver;
	}
	public void finalizarfactura() {
		setEstado(false);
	}

}
