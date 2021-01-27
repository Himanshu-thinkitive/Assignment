package Assignment;

public class checkout1 {
	private double totalcost=0;
	
	DessertItem cashRegister[];
    
	public void addItem(DessertItem e[])
	{
	   this.cashRegister=e;	
	}
	
    public double getTotalcost()
    {
    	if(cashRegister!=null) {
    		
    	
    	for(DessertItem d:cashRegister)
    	{
    		totalcost=totalcost + d.cost();
    	}
    	return totalcost;
    	}
    	else
    	{
    		System.err.println("cart is blank");
    		return 0;
    	}
    }
    
    public void clearCart()
    {
    	if(cashRegister!=null)
    	{
    	   cashRegister=null;
    	}
    	else
    	{
    		System.out.println("clear");
    	}
    }
    public void noofItem()
    
    {
    	System.out.println(cashRegister.length);
    }
    
}
