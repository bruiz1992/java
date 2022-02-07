package PSP;

public class Contador implements Runnable {

	int cuenta;

	public void run() {
		long numero = Thread.currentThread().getId();
		if (numero % 2 == 0) {
			incrementar();
		} else {
			restar();
		}
		
		System.out.println(getCuenta());

	}
	
	
	
	public Contador() {
		cuenta = 0;
	}

	public synchronized void incrementar() {
		cuenta = cuenta + 1;
	}
	public synchronized void restar() {
		cuenta = cuenta - 1;
	}

	public synchronized int getCuenta() {
		return cuenta;
	}

}
