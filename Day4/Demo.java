package Assignment;

public class Demo {

	public static void main(String[] args) {
        
		checkout1 c1=new checkout1();
	    
	    Candy candy=new Candy("Candy",1000,10);
	    Cookie cookie=new Cookie("Cookie",10,12);
	    Icecream icecream=new Icecream("Icecream",10);
	    Sundae sundae=new Sundae("Sundae",10,10);
	    
	    DessertItem d[]= {candy,cookie,icecream,sundae};
	    c1.addItem(d);
	   System.out.println(c1.getTotalcost());
	    c1.noofItem();
	    c1.clearCart();
	  //  c1.noofItem();
	    
	    
	}

}
