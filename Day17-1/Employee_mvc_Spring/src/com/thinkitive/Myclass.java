package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Myclass {
	
	@Autowired
	MyDBConnection1 t;
	//Task t;
	

	@RequestMapping(value = "/hi",method=RequestMethod.GET)
	public ModelAndView myadd(Integer id,String name,Integer sal,String operation) 
	{
	
		
			if(operation.equalsIgnoreCase("insert"))
		{
				
			ModelAndView model = new ModelAndView();
		   try {
			  // System.out.println(id);
			//	System.out.println(name);
			//Task t=new Task();	
			//Employee e=new Employee(id,name,sal);
			t.insert(id,name,sal);
		   }
		   catch(NullPointerException e)
		   {
			   System.out.println("dial value");
		   }
			model.setViewName("index.jsp");
			return model;
		}
		
		
		else if(operation.equalsIgnoreCase("update"))
		{
	
			ModelAndView model = new ModelAndView();
	
			 try {
				 //Task t=new Task();
				   t.update(id, name, sal);
				   }
				   catch(NullPointerException e)
				   {
					   System.out.println("dial value");
				   }
	       
		model.setViewName("index.jsp");
		return model;
		}
		
		
		else if(operation.equalsIgnoreCase("delete"))
		{
	
			ModelAndView model = new ModelAndView();
			try {
				//Task t=new Task();
				//Employee e=new Employee(id,name,sal);
				t.delete(id,name,sal);
				   }
				   catch(NullPointerException e)
				   {
					   System.out.println("dial value");
				   }
	          
	
	
		model.setViewName("index.jsp");
		return model;
		}
	
			
		else if(operation.equalsIgnoreCase("showAll"))
		{
			//Task t=new Task();
			ModelAndView model = new ModelAndView();
	
	     // System.out.println( t.select());
			List l=t.select();
			System.out.println(l);
			model.addObject("showAll", l);
		model.setViewName("index.jsp");
		return model;
		}
			
		else
		{
			ModelAndView model = new ModelAndView();
	
	     // System.out.println( t.showAll());
		model.setViewName("index.jsp");
		return model;
		}
	
	
}
	

	

}
