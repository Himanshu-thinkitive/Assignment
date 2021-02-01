package com.thinkitive.Util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.thinkitive.Base.Book;
import com.thinkitive.Execute.Print_Util;
import com.thinkitive.Execute.Sort_Util;
import com.thinkitive.Execute.Store_Util;

public class Main {
	
	public static void main(String[] args) 
	{
		Set<String> author=new HashSet<String>(); 
		author.add("himanshu");
		author.add("divyanshu");
		Book b=new Book(10,"himansu",author,100); 
		
		
	//	Set<String> author1=new HashSet<String>(); 
		//author.add("anshu");

		
		Store_Util<Book> s=new Store_Util<Book>();
		
		s.addRecords(b);
		List <Book>l=new ArrayList<Book>();
		
		l=s.getRecords();
		System.out.println(s.getNumberOfBooks());
		
		Print_Util p=new Print_Util();
		p.printRecords(l);
		Sort_Util so=new Sort_Util();
		so.SortByName(l);
		p.printRecords(l);
		so.sortByPrice(l);
		p.printRecords(l);
		
		
		Set<String> author1=new HashSet<String>(); 
		author.add("anshu");
		author.add("vyanshu");
		Book b1=new Book(10,"giansu",author,99); 
		
		
		Store_Util<Book> s1=new Store_Util<Book>();
		
		s.addRecords(b1);
		List <Book>l1=new ArrayList<Book>();
		
		l1=s.getRecords();
		System.out.println(s.getNumberOfBooks());
		
		//Print_Util p=new Print_Util();
		p.printRecords(l);
		//Sort_Util so=new Sort_Util();
		so.SortByName(l);
		p.printRecords(l);
		so.sortByPrice(l);
		p.printRecords(l);

		
	 }
}
