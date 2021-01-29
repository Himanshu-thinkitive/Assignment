package com.thinkitive;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class DictionaryServlet
 */
@WebServlet("/DictionaryServlet")
public class DictionaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       String word;
   	String operation;
   	String meaning;
   	String word_For_Meaning;
   	List l;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DictionaryServlet() {
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
		
		 this.operation=request.getParameter("optradio");
		 //response.getWriter().println(operation);
		 
		 if(operation.equalsIgnoreCase("add_WordAndMeaning"))
		 {
			// response.getWriter().println("value2");
			 this.word=request.getParameter("word");
			 this.meaning=request.getParameter("meaning");
			 MyClass m=new MyClass();
			  m.add(word, meaning);
			  
			 
			 
		 }
		 //response.getWriter().println(operatio);
		 
		 else if(operation.equalsIgnoreCase("Give_Meaning"))
		 {
			 this.word_For_Meaning=request.getParameter("word_For_Meaning");
			 
			 //response.getWriter().println(word_For_Meaning);
			 
			 MyClass m=new MyClass();
			 l= m.meaning(word_For_Meaning);
			 
			 if(l.equals(null))
			 {
				 
			 }
			 else
			 {
			 //response.getWriter().println(l);
			 
			 request.setAttribute("means", l);
			 
			 RequestDispatcher d=request.getRequestDispatcher("DictionaryJsp.jsp");
			 d.include(request, response);
			 }
		 }
	
	
	
	}

}
