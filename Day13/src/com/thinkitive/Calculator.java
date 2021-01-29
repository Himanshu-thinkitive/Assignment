package com.thinkitive;

public class Calculator {

	private int a;
	private int b;
	
	public String add(String p,String q)
	{
		 this.a=Integer.parseInt(p);
		 this.b=Integer.parseInt(q);
		int c=a+b;
		String s=String.valueOf(c);
		return s;
		
	}
	public String sub(String p,String q)
	{
		 this.a=Integer.parseInt(p);
		 this.b=Integer.parseInt(q);
		
		int c= a-b;
		String s=String.valueOf(c);
		return s;
	}
	public String mul(String p,String q)
	{
		 this.a=Integer.parseInt(p);
		 this.b=Integer.parseInt(q);
		int c=a*b;
		String s=String.valueOf(c);
		return s;
		
	}
	public String div(String p,String q)
	{
		 this.a=Integer.parseInt(p);
		 this.b=Integer.parseInt(q);
		
		 int c=a/b;
		 String s=String.valueOf(c);
			return s;
		
	}
}
