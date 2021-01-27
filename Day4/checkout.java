package Assignment;

public class checkout
{
	private int i=0;
	public checkout() {
		// TODO Auto-generated constructor stub
	}
	
	DessertItem cashRegister[]=new DessertItem [10]; 
		
   private double totalcost=0;
   
	public void item(DessertItem e)
	{
		

		this.cashRegister[i]=e;
		//System.out.println(cashRegister[i].name() );
		
		
		totalcost=totalcost+cashRegister[i].cost();
		//System.out.println(totalcost);
		i++;
		
	}
	private int k=0;
	
	public void itemName()
	{
		while(k<i)
		{
		System.out.println(cashRegister[k].name());
		k++;
		}
	}
	
	public double getTotalcost() {
		return totalcost;
	}
	
	public void clearCart()
	{
		if (cashRegister == null) {
			System.err.println("cart is empty");
			
		}
		else
		{
			cashRegister=null;
			i=0;
			System.out.println("cleared");
		}
	}
	public int noOfItem()
	{
		if(i==0)
		{
			return i;
		}
		else
		return i-1;
	}
}