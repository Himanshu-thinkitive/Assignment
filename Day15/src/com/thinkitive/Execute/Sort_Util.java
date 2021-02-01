package com.thinkitive.Execute;

import java.util.Collections;
import java.util.List;



public class Sort_Util {
	
	List l;
	public void  SortByName(List l)
	
	{
		this.l=l;
		ByName n=new ByName();
		Collections.sort(l,n);
	}
	
	public void sortByPrice(List l)
	{
		this.l=l;
		ByPrice p=new ByPrice();
		Collections.sort(l,p);
	}

}
