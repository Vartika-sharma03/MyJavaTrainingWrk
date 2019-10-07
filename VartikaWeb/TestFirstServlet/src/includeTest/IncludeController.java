package includeTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IncludeController
 */
@WebServlet("/IncludeController")
public class IncludeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void destroy() {
		// TODO Auto-generated method stub
	}
/*	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("username");
		String pwd=request.getParameter("pwd");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<b>welcome to includecontroller first servlet</b>");
		out.println("<b>user name is "+un +"</b>");
		out.println("<b>");
		out.println("<b>");
		out.println("<b>");
		out.println("<b>");
		RequestDispatcher dis=request.getRequestDispatcher("/TestController");
		dis.include(request, response);
	}

}
