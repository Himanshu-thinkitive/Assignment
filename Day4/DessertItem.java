package Assignment;

public abstract class DessertItem {
	 String name;
	
	public DessertItem()
	{
		
	}
	
	public DessertItem(String name)
	{ 
		this.name=name;
	   	
	}
	
	public abstract double cost();
	
	public final String name()
	{  
		return this.name;
		
	}
	
	
	
	

}
