package facturacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		facturacion Prueba = new facturacion();
		Prueba.añadirProducto("AAA",5);
		Prueba.añadirProducto("BBB",2);
		Prueba.añadirProducto("CCC",8);
		Prueba.añadirCliente("111", "hola", "apellidos", 8885522);
		Prueba.añadirCliente("222", "hola", "apellidos", 8885522);
		Prueba.añadirCliente("333", "hola", "apellidos", 8885522);
		Prueba.addStockProductos("AAA", 20);
		Prueba.addStockProductos("BBB", 20);
		Prueba.addStockProductos("CCC", 20);
		Prueba.generarNuevopedido("111", "AAA", 2);
		Prueba.generarNuevopedido("111", "BBB", 4);
		Prueba.añadirfacturacliente("111");
		System.out.println(Prueba.imprimirFacCliente("111"));
		Prueba.borrarPedidos("111");
		//System.out.println(Prueba.imprimirFacCliente("111"));
		String nombre = entrada.nextLine();
		Prueba.generarNuevopedido("111", "CCC", 2);
		Prueba.generarNuevopedido("111", "BBB", 4);
		Prueba.añadirfacturacliente("111");
		Prueba.imprimirFacCliente("111");
		System.out.println(Prueba.imprimirFacCliente("111"));
		
		

	}

}
