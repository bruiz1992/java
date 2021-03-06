package productorconsumidor;

import java.util.ArrayList;

/* El productor produce n?meros aleatorios y los pasa 
 * a la cola compartida con el consumidor. Este codigo sera lanzado en hilos
 */
public class Productor implements Runnable { // mejor que extender la clase thread
	private int numero;
	private Cola cola = new Cola();

	public Productor(Cola c) { // en el constructor le pasamos la cola compartida
		this.cola = c;
	}

	// los hilos entraran en este metodo
	public void run() {
		for (int i = 0; i < 15; i++) {
			this.cola.put(this.numero); // pone el numero en la cola para ser consumido
			System.out.println("Se ha producido un numero " + this.numero);
			numero++;
		}
	}
}
