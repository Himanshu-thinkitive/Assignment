

public class Employee
{
	static int empid=00;
	String ename;
	double basicsalary,grosssalary,hra,pf,pt=200,medical,netsalary;
	
	public Employee()
	{
	   empid++;
	  
	   
	   
	}
	
	public Employee(String ename,int basicsalary,int medical)
	{
		this();
		
		this.ename=ename;
		this.basicsalary=basicsalary;
		this.medical=medical;
		 hra=(basicsalary/2);
		   pf= (0.12*basicsalary);
		   grosssalary=(basicsalary+hra+pf+medical);
		   netsalary=(basicsalary-pf);
	}
	
	
	 
	public void print()
	{
		System.out.println(empid);
		System.out.println("name is : "+ename +"  grosssalary is: "+grosssalary +" netsalary is :" +netsalary+" hra"+hra+" pf is: "+pf+ "pt is"+pt );
	}
}

