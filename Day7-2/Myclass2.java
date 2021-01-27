package Myhread;

public class Myclass2 implements Runnable{

	@Override
	public void run() {
		
			for(char a='a';a<='z';a++)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(a);
			}
		}

		
	}
	
		

