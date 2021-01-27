
public class SerializeAndDeSerialize {
	public static void main(String[] args) {
		
		Address a1=new Address(470002,"Motinagar");
		Address a2=new Address(470001,"Sadar");
		
		
		Employee e1=new Employee(10,"abc",100);
		Employee e2=new Employee();
		
		
		Employee e3=new Employee(11,"abcd",100,20,a1);
		Employee e4=new Employee();
	
		
		e3.doSerialization();
		
		System.out.println(e1);
		//e2 =e2.doDeSerialization();
		//System.out.println(e2);
		
		//System.out.println(e3);
		//System.out.println(e4);
		//e3.doSerialization();
		//e2.doSerialization();
		
		e4=e4.doDeSerialization();
		
		System.out.println(e4);
	}

}
