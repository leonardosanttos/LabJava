package mythreads;

import java.lang.Thread;

public class Traco implements Runnable{


	public void run()
	{
	
		try{ 
			for(int i = 0; i < 10; i++)
			{
		
				System.out.print(" _ \n");
				Thread.sleep(2000);	
	
			}

		
	   	}
		catch (InterruptedException e)
		{


		}

	}
}		