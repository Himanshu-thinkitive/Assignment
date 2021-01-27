

public class Salary {

	public static void main(String[] args) {
		
		//Employ e1=new Employ();
		//e1.printEmploy();
		Employ e=new Employ(10,"divyanshu",100,10);
         e.printEmploy();
		Manager m=new Manager(10,"himanshu",100,10);
		//Manager m1= new Manager();
		//m1.printEmploy();
		m.printEmploy();
		MarketingExecutive me=new MarketingExecutive(10,"Manu",100,10,10);
		me.printEmploy();
		
		

	}

}
