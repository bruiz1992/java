package PSP;

public class Lanzador2 {

	public Lanzador2() {
		
	}

	public static void main(String[] args) {
		int numHilos = 10; //cantidad de hilos a lanzar
		String nombreHilo; //para dar nombre a los hilos
		Thread[] hilos = new Thread[numHilos]; //para guardar los hilos
		
		
		//creo los hilos
		for (int i=0; i<numHilos; i++) {
			 
			nombreHilo = Integer.toString(i); //doy nombre al hilo
			
			Contador2 cont2 = new Contador2(); //Objeto que contiene el codigo a ejecutar los hilos
			if (i%2== 0) {
			
				hilos[i] = new Thread(cont2::incrementar); //creo el hilo
				hilos[i].setName(nombreHilo);//doy nombre al hilo
				
				
				hilos[i].start();//lanzo el hilo, ira al metodo incrementar
				//hilos[i].run();;//lanzo el hilo, ira al metodo incrementar
				
				
			}else {
				hilos[i] = new Thread(cont2::decrementar); //creo el hilo
				hilos[i].setName(nombreHilo);//doy nombre al hilo
				hilos[i].start();//lanzo el hilo, ira al metodo decrementar
			
			}	
			
			try {
				hilos[i].join(); //Los hilos se van ejecutando
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}

	}

}