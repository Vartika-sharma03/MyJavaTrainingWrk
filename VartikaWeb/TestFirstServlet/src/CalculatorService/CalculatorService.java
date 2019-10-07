package CalculatorService;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorService
 */
@WebServlet("/CalculatorService")
public class CalculatorService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String A = null;
	private static final String D = null;
	private static final String B = null;
	private static final String C = null;
       
   

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO
	//	doGet(request, response);
		response.setContentType("text/html");
		String name=request.getParameter("prodname");

		int quantity=Integer.parseInt(request.getParameter("q"));
	//int price=Integer.parseInt(request.getParameter("p"));
		int pp;
		switch (name) {
	    case "A": 
	    	pp=quantity*60;
	    	
	        break; // closes it off
	    case "B":
	    	pp=quantity*80;
	    	break;
	    case "C":
	    	pp=quantity*82;
	    	break;
	    case "D":
	    	pp=quantity*72;
	    	break;
	        
	    default: // if x is none of those...
			PrintWriter out1=response.getWriter();
			out1.println("");


	}
		RequestDispatcher rd=request.getRequestDispatcher("/CalculatorService");
	rd.forward(request, response);
	
	}

}