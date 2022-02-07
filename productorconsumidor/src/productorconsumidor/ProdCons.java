package productorconsumidor;

public class ProdCons {

	public static void main(String[] args) throws InterruptedException {
		
		Cola cola = new Cola(); //el objeto cola hace de "intermediario"
		Productor prod = new Productor(cola); 
		Consumidor cons = new Consumidor(cola);
	
		//for (int i = 0 ; i<1; i++) {

			Thread p1 = new Thread(prod); //creo los hilos productor y consumidorç
			Thread p2 = new Thread(prod); //creo los hilos productor y consumidor
			Thread c1 = new Thread(cons);
			p1.start();	//los lanzo y espero a que terminen para que mantengan el orden
			p1.join();
			p2.start();	//los lanzo y espero a que terminen para que mantengan el orden
			p2.join();
			c1.start();
			c1.join();
		//}
	}

}
