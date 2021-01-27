package Assignment;

public class Usecheckout {
	public static void main (String args [])
	{
	    checkout c=new checkout();
	    
	    Candy candy=new Candy("Candy",1000,10);
	    
	    Cookie cookie=new Cookie("Cookie",10,12);
	    Icecream icecream=new Icecream("Icecream",10);
	    Sundae sundae=new Sundae("Sundae",10,10);
	    
	  
         
         c.item(candy);
	    c.item(cookie);
	    c.item(sundae);
	    c.item(icecream);
	    
	    c.itemName();
	   
	    
	    System.out.println("\n"+c.getTotalcost());
	    c.clearCart();
	    
	    
	    
	    
	    //System.out.println(candy.name());
	
	
	
	
	}
}
