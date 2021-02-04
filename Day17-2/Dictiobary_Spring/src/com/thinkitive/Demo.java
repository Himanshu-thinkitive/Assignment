package com.thinkitive;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Demo {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Dictionary.class);
		SessionFactory factory =cfg.configure().buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction t=session.beginTransaction();
		//l=session.createQuery("From Dictionary where word").list();
		Criteria c=session.createCriteria(Dictionary.class);
	//	c.add(Restrictions.eq("", word));
		List l=c.list();
	
		//session.save(d);
		t.commit();
		session.close();
		factory.close();
		System.out.println(l);
	
	}

}
