package Assignment;

public class Icecream extends DessertItem{
	
	private int number;
	
	
	

	public int getNumber() {
		return number;
	}

	
	public Icecream()
	{
		
	}
	
	public Icecream(String name,int number)
	{
		super(name);
		this.number=number;
		
	}
	
	public double cost() {
		// TODO Auto-generated method stub
		
		return number;
	}

}
