package PSP;

import java.io.Serializable;
import java.util.concurrent.Semaphore;

public class semaforo implements Serializable{

	class Pool {
		   private static final int MAX_AVAILABLE = 100;
		   private final Semaphore semaforo = new Semaphore(MAX_AVAILABLE, true);
		   protected int[] numeros = new int[MAX_AVAILABLE];
		   protected boolean[] used = new boolean[MAX_AVAILABLE];

		   

		   public Object getItem() throws InterruptedException {
		     semaforo.acquire();
		     return dameElSiguiente();
		   }

		   public void putItem(int x) {
		     if (LiberaSiguiente(x))
		       semaforo.release();
		   }

		   // Not a particularly efficient data structure; just for demo

		  
		   protected synchronized int dameElSiguiente() {
		     for (int i = 0; i < MAX_AVAILABLE; ++i) {
		       if (!used[i]) {
		         used[i] = true;
		         return numeros[i];
		       }
		     }
		     return -1; // not reached
		   }

		   protected synchronized boolean LiberaSiguiente(int item) {
		     for (int i = 0; i < MAX_AVAILABLE; ++i) {
		       if (item == numeros[i]) {
		         if (used[i]) {
		           used[i] = false;
		           return true;
		         } else
		           return false;
		       }
		     }
		     return false;
		   }
		 }
	
	
}
