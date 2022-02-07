package PSP;

public class Contador2 implements Runnable {
	
	private static int suma =0;
	
	
	public synchronized void incrementar () {
		String hilo = Thread.currentThread().getName(); //recupero el nombre del hilo
		suma++;
		System.out.println("Soy el hilo " + hilo +" ahora vale: " + suma);
		{
	        try
	        {
	            Thread.sleep(15000);
	        }catch(InterruptedException e){}
	    }
	}
	
	public synchronized void  decrementar () {
		String hilo = Thread.currentThread().getName(); //recupero el nombre del hilo
		suma--;
		System.out.println("Soy el hilo " + hilo +" ahora vale: " + suma);
		{
	        try
	        {
	            Thread.sleep(15000);
	        }catch(InterruptedException e){}
	    }
	}
	
	public int getContador2 () {
		return suma;
	}

	@Override
	public void run() {
		String hilo = Thread.currentThread().getName(); //recupero el nombre del hilo
		System.out.println("Soy el hilo " + hilo +" estoy en el metodo run" );
	}

	
}
