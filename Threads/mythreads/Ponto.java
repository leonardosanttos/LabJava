package mythreads;

import java.lang.Thread;

public class Ponto implements Runnable{


	public void run()
	{
	
		try{ 
			for(int i = 0; i < 10; i++)
			{
		
				System.out.print(".\n");
				Thread.sleep(2000);	
	
			}


	   	}
		catch (InterruptedException e)
		{


		}

	}
}		