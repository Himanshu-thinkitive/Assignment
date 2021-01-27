package Assignment;

public class Sundae extends Icecream {
	
	private int costoftopping;
	
	
	public Sundae() {
		
		// TODO Auto-generated constructor stub
	}
	
	public Sundae(String name,int costoftopping,int number)
	{
		super(name,number);
		this.costoftopping=costoftopping;
	
		
	}
      
	public double cost()
	{
		return costoftopping+super.getNumber();
	}
}
