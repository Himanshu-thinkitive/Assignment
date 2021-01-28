package com.thinkitive;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class first
 */
@WebServlet("/first")
public class first extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Integer counter = 0;
   int c=0;
	public first() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		c++;	
			session.setAttribute("count",c);
		RequestDispatcher d=request.getRequestDispatcher("second");
		d.include(request, response);
		
				//response.getWriter().println("c value of is" + session.getValue("count"));
				
	}
	
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		counter = (Integer) session.getAttribute("count");
		if (counter != null) {
			counter++;
			session.setAttribute("count", counter);
		} else {
			counter = 0;
			counter++;
			session.setAttribute("count", counter);
		}
		response.getWriter().println("SERLVET TWO VISITOR:" + counter);

	}*/

}
