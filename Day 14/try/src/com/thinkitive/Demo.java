
package com.thinkitive;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo 
{
	public static void main(String[] args) 
	{
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Address a1 = new Address(1, "avMumbai");
		Address a2 = new Address(2, "avNasik");
		Address a3 = new Address(3, "avNew York");
		Address a4 = new Address(4, "avMumbai");
		Address a5 = new Address(5, "avNasik");
		Address a6 = new Address(6, "avNew York");
	
		
				Set<Address> l = new HashSet<Address>(); 
	  
			
		
		l.add(a2);
		l.add(a1);
		l.add(a6);
		l.add(a3);
		l.add(a4);
		l.add(a5);
		
		Employee e1 = new Employee(25, "Himanshu", 36980, l);

		session.update(e1);

		t.commit();
		session.close();
		factory.close();
	}

}