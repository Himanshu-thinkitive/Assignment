package com.thinkitive;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Myclass {
	
	@RequestMapping(value = "/nary",method=RequestMethod.GET)
	public ModelAndView hello(String userType,String word,String meaning,String getMeaning)
	{
		if(userType.equalsIgnoreCase("admin"))
		{
			Configuration cfg = new Configuration();

			SessionFactory factory = cfg.configure().buildSessionFactory();

			Session session = factory.openSession(); // CONNECTION OPEN

			Transaction tx = session.beginTransaction();
			Dictionary e=new Dictionary(word,meaning);
			session.save(e);
			
			tx.commit();
			session.close();

			System.out.println("authenticate");
			ModelAndView model = new ModelAndView();
		
			model.setViewName("index.jsp");
		   return model;	
		}
		else 
		{
			Configuration cfg = new Configuration();
			
			SessionFactory factory =cfg.configure().buildSessionFactory();
			
			Session session = factory.openSession();
			Transaction t=session.beginTransaction();
			//l=session.createQuery("From Dictionary where word").list();
			Criteria c=session.createCriteria(Dictionary.class);
			c.add(Restrictions.eq("word", getMeaning));
			List l=c.list();
		
			//session.save(d);
			t.commit();
			session.close();
			factory.close();
			
		
			System.out.println(l);
		
			ModelAndView model = new ModelAndView();
			model.addObject("meaning", l);
			model.setViewName("index.jsp");
		   return model;
		
		}
			
		
		
		
	}

}
