package Assignment;

public class Candy extends DessertItem {
	
	private double fudge;
	private int price;
	
	
	public Candy()
	{
		
	}
	
	
	public Candy(String name,int fudge,int price)
	{
	
		super(name);
		this.fudge=fudge;
		this.price=price;
	
	}
	
			
	public double cost()
	{
		fudge=fudge/1000;
		
	return (fudge*price);
	}
	

}
