package abc;

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
 * Servlet implementation class LoginControll
 */
@WebServlet("/LoginControll")
public class LoginControll extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//String user=request.getWriter();
		String user=request.getParameter("user");
		String pass=request.getParameter("pwd");
		if(user.equals("vartika"))
		{
			out.println("welocme"+user);
			HttpSession session =request.getSession(true);
			session.setAttribute("user", user);
			session.setMaxInactiveInterval(30);
			response.sendRedirect("Home.jsp");
			
			
		}

		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			out.println("<font color=red> Either user name or password is wrong </font>");
            rd.include(request, response);
			
		}
	}

}
