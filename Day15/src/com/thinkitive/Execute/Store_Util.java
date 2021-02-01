package com.thinkitive.Execute;

import java.util.ArrayList;
import java.util.List;
//import com.thinkitive.Base.Book;

public class Store_Util<T> {
	
	public List <T> l=new ArrayList<T>() ;
	
	private static int count;
	T a;
	
	public Store_Util() {
		super();
	}

	public  void addRecords(T b)
	{
		this.a=b;
	   l.add(a);	
	   count++;
	}
	
	public List getRecords()
	{
		return l;
	}
	
	public int getNumberOfBooks()
	{
	    return count;	
	}

}
