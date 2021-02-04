package com.thinkitive;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

@Service
public class MyDBConnection1 {
	
	public List select()
	{
		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); // CONNECTION OPEN

		Transaction tx = session.beginTransaction();
		
		Query q= session.createQuery("From Employee");
		
		List l=q.list();
		//System.out.println(l);

		tx.commit();

		session.close();
		factory.close();
		return l;
	}
	
	public void delete(int id,String name,int sal)
	{

		
		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); // CONNECTION OPEN

		Transaction tx = session.beginTransaction();
		
		Employee e=new Employee(id,name,sal);
		
	        session.delete(e);

		tx.commit();

		session.close();
		factory.close();
	}
	
	public void update(int id,String name,int sal)
	{

		
		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); // CONNECTION OPEN

		Transaction tx = session.beginTransaction();
		Employee e=new Employee(id,name,sal);
		
	        session.update(e);

		tx.commit();

		session.close();
		factory.close();
	}
	
	public void insert(int id,String name,int sal)
	{
		System.out.println("in insert");
		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); // CONNECTION OPEN

		Transaction tx = session.beginTransaction();
		Employee e=new Employee(id,name,sal);
		session.save(e);
		
		tx.commit();
		session.close();
		
		
	}

	

	

}
