

public class UseMystack { 
	public static void main(String [] args)
	{
		MyStack <String> s=new MyStack <String>();
		
		s.push("1");
		s.push("2");
		s.push("Himanshu");
		
		
		//System.out.println(s.pop());
		//System.out.println(s.pop());
		
		MyStack<Integer> s1=new MyStack<Integer>();
		s1.push(1);
		s1.push(2);
		//
		//System.out.println(s1.pop());
		
		
		Employ e1=new Employ(1,"Himanshu",100,10);
		Employ e2=new Employ(3,"Divyanshhu",1000,10);
		Employ e3=new Employ(2,"Himanshu",1000,10);
		
		MyStack <Employ> s11=new MyStack <Employ>();
		s11.push(e1);
		s11.push(e2);
		e1.printEmploy();
		s11.push(null);
		
		System.out.println(s11.pop());
		
  		
		
		
	}

	

}
