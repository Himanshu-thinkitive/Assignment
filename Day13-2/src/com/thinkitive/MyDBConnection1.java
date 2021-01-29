package com.thinkitive;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyDBConnection1 {
	
	public void select()
	{
		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); // CONNECTION OPEN

		Transaction tx = session.beginTransaction();
		
		Query q= session.createQuery("From Employee");
		
		List l=q.list();
		System.out.println(l);

		tx.commit();

		session.close();
		factory.close();
	}
	
	public void delete(Employee e1)
	{
          Employee e=e1;
		
		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); // CONNECTION OPEN

		Transaction tx = session.beginTransaction();
		
	        session.delete(e);

		tx.commit();

		session.close();
		factory.close();
	}
	
	public void update(Employee e1)
	{
       Employee e=e1;
		
		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); // CONNECTION OPEN

		Transaction tx = session.beginTransaction();
		
	        session.update(e);

		tx.commit();

		session.close();
		factory.close();
	}
	
	public void insert(Employee e1)
	{
		Employee e=e1;
		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); // CONNECTION OPEN

		Transaction tx = session.beginTransaction();
		session.save(e);
		
		tx.commit();
		session.close();
		
		
	}

	

	

}

