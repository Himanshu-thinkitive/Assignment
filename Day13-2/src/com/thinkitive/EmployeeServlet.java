package com.thinkitive;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
      String id=request.getParameter("empid");
      
      
    	   int empid=Integer.parseInt(id);
       
       
       String ename=request.getParameter("empname");
       
       String sal=request.getParameter("esalary");
       
      // response.getWriter().println("id is "+id+" ename is "+ename+"  salary is"+sal);
       
     
       
    	  int salary=Integer.parseInt(sal);
      
    	   
       Employee e=new Employee(empid,ename,salary);
       //response.getWriter().println(e);
		
       MyDBConnection1 db=new MyDBConnection1();
       db.delete(e);
      //db.insert(e);
      //db.select();
       
		}
		catch(NullPointerException e)
		{
			response.getWriter().println("fields cannot be blank");
		}
		catch(NumberFormatException n)
		{
			response.getWriter().println("fill in wright format");
		}
	}

}
