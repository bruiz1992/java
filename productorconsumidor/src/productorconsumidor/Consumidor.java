package productorconsumidor;

/*El consumidor comparte el objeto cola con el productor
Si hay disponibles, cogera un número
*/

public class Consumidor implements Runnable { // mejor que extender Thread
	private Cola cola;
	private int numero;

	public Consumidor(Cola c) { // en el construcctor pasamos la cola compartida
		this.cola = c;
	}

	// los hilos entraran en este metodo
	public void run() {
		for (int i = 0; i <= 20; i++) {
			this.numero = this.cola.get(); // consumo el numero de la cola
			System.out.println("Se ha consumido un numero: " + this.numero);
		}
	}
}
