package Myhread;

public class Table {

	public synchronized void printTable(int a)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*a +" :" +Thread.currentThread().getName());
		}
	}
}
