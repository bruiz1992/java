package PSP;

public class practicaPSP1 {

	


	public static void main(String[] args) {
		Contador contador = new Contador();
		Thread[] hilos = new Thread[10];
		// hilos = new Thread[5];
		for (int i = 0; i < 10; i++) {
			hilos[i] = new Thread(contador);
			hilos[i].start();
			//System.out.println(name + " " + contador.cuenta);
			try {
				hilos[i].join();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}
}
