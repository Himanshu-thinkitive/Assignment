package com.thinkitive.Execute;

import java.util.Comparator;
import com.thinkitive.Base.Book;

public class ByPrice implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		
		if(o1.getPrice()>o2.getPrice())
		{
			return 1;
		}
		else if(o1.getPrice()<o2.getPrice())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	
}
}