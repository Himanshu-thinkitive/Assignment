package Myhread;

public class Demo {

	public static void main(String args []) {
		Myclass m1= new Myclass();
		Myclass m2= new Myclass();
		Myclass m3= new Myclass();
		
		m1.start();
		m2.start();
		
		Myclass2  m11= new Myclass2();
        Myclass2 m12=new Myclass2();
		
		
		Thread t=new Thread(m11);
		t.start();
		
		Thread t1=new Thread(m12);
		t1.start();
		
		
	//	t.start();
		//m11.start();
		//m12.start();
		//m12.start();

		
		
	}
}
