import java.*;
import mythreads.Ponto;
import mythreads.Traco;
import mythreads.Progresso;

public class Teste{


	public static void main (String [] args) throws InterruptedException {
	
	
	Thread mythread0 = new Thread (new Ponto());
	Thread mythread1 = new Thread (new Traco());
	Thread mythread2 = new Thread (new Progresso());	

	mythread0.start();
	mythread1.start();
	mythread2.start();
	
	mythread0.join();
	mythread1.join();	
	mythread2.join();


	}
}


