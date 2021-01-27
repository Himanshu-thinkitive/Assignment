package Myhread;

public class Myclass extends Thread{
	@Override
	public void run() {
		for(int i=1;i<27;i++)
		{
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
	

}
