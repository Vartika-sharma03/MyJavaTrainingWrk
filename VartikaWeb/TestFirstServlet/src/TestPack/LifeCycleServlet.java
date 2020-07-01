package TestPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleServlet
 */
@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LifeCycleServlet() {
        //super();
        // TODO Auto-generated constructor stub
    	System.out.println("creating object of lifecycleservlet");
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("get called");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<b> servlet get called");
		out.println("refresh the page to check lifecycle method");

	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public void destroy()
	{
		System.out.println("destroying...");
	}
}