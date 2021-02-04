package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.thinkitive.*;

public class Task {
	
	private int id;
	private String name;
    private int sal;	
	 List l= new ArrayList<>();
	private int index;
	//private int count=0;
	public void insert(int id,String name,int sal)
	{
		//count++;
		this.id=id;
		this.name=name;
		this.sal=sal;
		Employee e=new Employee(id,name,sal);
		l.add(e);
		//index=l.indexOf(e);
		
		System.out.println(l);
	}
    
	public void update(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
		Employee e=new Employee(id,name,sal);
		//l.add(id, e);
		//int index=l.indexOf(e);
		index=id-1;
		l.set(index, e);
		System.out.println(l);
	}
   
	public void delete(Employee e)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
		
		l.remove(e);
		System.out.println(l);
		
		//return l;
		
	}
	
	
	
	public void showAll()
	{
		//count++;
		System.out.println("showAll"+l);
		//System.out.println("list");
		//return l;
	}

}
