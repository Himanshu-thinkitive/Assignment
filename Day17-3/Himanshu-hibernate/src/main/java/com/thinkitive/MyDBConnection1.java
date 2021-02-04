package com.thinkitive;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class MyDBConnection1 {
	
	//ApplicationContext context=new ClassPathXmlApplicationContext("bro.xml");
	//Employee e=context.getBean(Employee.class);
	
	@Autowired
	Employee e;
	
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
		
	//	Employee e=new Employee(id,name,sal);
		
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
		//Employee e=new Employee(id,name,sal);
		e.setId(id);
		e.setName(name);
		e.setSal(sal);
		
	        session.update(e);

		tx.commit();

		session.close();
		factory.close();	}
	
	public void insert(int id,String name,int sal)
	{
		System.out.println("in insert");
		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); // CONNECTION OPEN

		Transaction tx = session.beginTransaction();
		e.setId(id);
		e.setName(name);
		e.setSal(sal);
		session.save(e);
		
		tx.commit();
		session.close();
		
		
	}

	

	

}

