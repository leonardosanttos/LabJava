
package mythreads;

import java.lang.Thread;

public class Progresso implements Runnable{


	public void run()
	{
	
		try{ 
			for(int i = 0; i < 11; i++)
			{
		
				System.out.print( i+ "0% concluido...\n");
				Thread.sleep(3000);	
	
			}
			
		System.out.println("Teste concluído com sucesso!\n");

	   	}
		catch (InterruptedException e)
		{


		}

	}
}	