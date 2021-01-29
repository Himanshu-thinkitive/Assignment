package com.thinkitive;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;

/**
 * Servlet implementation class CalServlet
 */
@WebServlet("/CalServlet")
public class CalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalServlet() {
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
		// TODO Auto-generated method stub
		String p=request.getParameter("firstNo");
		String q=request.getParameter("secondNo");
		
		//RequestDispatcher rs=request.getRequestDispatcher("index.jsp");
    	//request.setAttribute("msg", "successful dude");
          
		//String p=new String("10");
     	//String q=new String("20");

		Calculator c=new Calculator();
		String a=c.add(p, q);
		request.setAttribute("add",a);
		
		//response.getWriter().println(a);
		
		
		String s=c.sub(p, q);
		request.setAttribute("sub", s);
		
		String m=c.mul(p, q);
		request.setAttribute("mul", m);
		
		String d=c.div(p, q);
		request.setAttribute("div", d);
		
		//rs.include(request, response); 
		
		RequestDispatcher rs=request.getRequestDispatcher("index.jsp");
		rs.include(request, response);
		
		
	}

}
