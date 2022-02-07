package PSP;


public class Lanzador {

	public Lanzador() {
		
	}

	public static void main(String[] args) {
		
		
		int numHilos = 5; //cantidad de hilos a lanzar
		String nombreHilo; //para dar nombre a los hilos
		Thread[] hilos = new Thread[numHilos]; //para guardar los hilos
		
		
		//creo los hilos
		for (int i=0; i<numHilos; i++) {
			 
			nombreHilo = Integer.toString(i); //doy nombre al hilo
			
			Contador cont = new Contador(); //Objeto que contiene el codigo a ejecutar los hilos
			
			hilos[i] = new Thread(cont); //creo el hilo
			
			hilos[i].setName(nombreHilo);//doy nombre al hilo
			
			hilos[i].start();//lanzo el hilo, ira al metodo run del objeto
			
			try {
				hilos[i].join(); //Los hilos se van ejecutando
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
