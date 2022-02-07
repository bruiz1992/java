package productorconsumidor;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

/* Este es el objeto compartido por consumidor y productor
** el productor lo usa para guardar un elemento
*  el consumidor lo usa para recoger el elemento o -1 si no hay disponible
*/
public class Cola {
	   private static final int MAX_AVAILABLE = 15;
	   private final Semaphore available = new Semaphore(MAX_AVAILABLE, true);
	private int elementoProducido;
	ArrayList<Integer> arrayvalores = new ArrayList<Integer>();
	private boolean disponible = false; //indica si hay o no elementos producidos
	
	public synchronized void put(int valor) { //metodo protegido
		
		arrayvalores.add(valor);
		//elementoProducido = valor; //almaceno el numero
		if(arrayvalores.size()==15) {
			disponible = true;			// cambio a disponible
			notifyAll();
		}
							// "aviso" a los hilos de que ha terminado
	}
	
	public synchronized int get() { //metodo protegido
		//Si hay un elemento, lo entrego
		if (disponible) {
			if(arrayvalores.size() == 0) {
			try {
				available.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			disponible = false;
			}else {
			elementoProducido = arrayvalores.get(0);
			arrayvalores.remove(0);
			notifyAll(); 				//"aviso" a los hilos de que ha terminado
		
			return elementoProducido;
			}}
		//Si no hay elementos, devuelvo -1
		notify();
		return -1;
		
	}

}
