package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
ApplicationContext con= new AnnotationConfigApplicationContext("com.thinkitive");
		
		
		
		List <Address>l=new ArrayList<Address>(); 
		Address a1=con.getBean(Address.class);
		Address a2=con.getBean(Address.class);
		Address a3=con.getBean(Address.class);
		a1.setPin(470002);
		a2.setSal("Sagar");
		l.add(a1);
		l.add(a2);
		l.add(a3);
		Employee e=con.getBean(Employee.class);
		
		e.setId(1);
		e.setName("himanshu");
		e.setSal(100);
		e.setA(l);
		System.out.println(e);
		//System.out.println(a1);
		//System.out.println(l);
		
	}
}
