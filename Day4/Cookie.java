package Assignment;

public class Cookie extends DessertItem {
	private double dozenrupees;
	private int number;
	
	public Cookie() 
	{
		
	}
	
	public Cookie(String name,int number,int dozenrupees)
	{
		super(name);
		this.dozenrupees=dozenrupees;
		this.number=number;
		
		
	}
	
	
	
	@Override
	public double cost() {
		dozenrupees=(dozenrupees/12.0);
		 
	
		
		return (number*dozenrupees);
	}

}
