

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
	
	List <T> al=new ArrayList<T>();
	
	
	public void push( T data)
	{
		al.add(data);
	}
	
	
	public T pop()
	{
		T data = (T)  al.remove(al.size()-1);
		return data;
	}


	public void showAllEmploy(MyStack m) {
		// TODO Auto-generated method stub
		System.out.println(al);
		
	}


	@Override
	public String toString() {
		return "MyStack [l=" + al + "]";
	}
	
   
}
