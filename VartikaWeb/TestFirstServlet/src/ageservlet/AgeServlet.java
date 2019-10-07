package ageservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AgeServlet")
public class AgeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("user");
		int age=Integer.parseInt(request.getParameter("age"));

			RequestDispatcher rd=request.getRequestDispatcher("/AgeSecondServlet");
		if(age>18)
		{

			rd.forward(request,response);
		}
		else
		{
			PrintWriter out1=response.getWriter();
			String user=request.getParameter("user");
			out1.println("you are under age :  " +user);
		}


	}

}
