package PSP;

class NumerosAleatorios implements Runnable {

	static int contador = 0;

	public void run() {

		Thread hilo = Thread.currentThread();
		long numero = Thread.currentThread().getId();
		if (numero % 2 == 0) {
			contador++;
		} else {
			contador--;
		}
		String nombreHilo = hilo.getName();
		System.out.println(nombreHilo + " " + contador);

	}
}

public class LanzadorHilos {

	public static void main(String[] args) {
		Thread[] hilos = new Thread[15];
		// hilos = new Thread[5];
		String name = "";
		for (int i = 0; i < 15; i++) {

			NumerosAleatorios na = new NumerosAleatorios();
			hilos[i] = new Thread(na);
			int numero = (int) (Math.random() * 10 + 1);
			name = "El hilo " + i + " contiene el: ";
			hilos[i].setName(name);
			hilos[i].start();

			try {
				hilos[i].join();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			
			

		}
	}
}