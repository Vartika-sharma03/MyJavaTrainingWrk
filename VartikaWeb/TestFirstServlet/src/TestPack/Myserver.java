package TestPack;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Myserver")
public class Myserver extends HttpServlet {
	//private static final long serialVersionUID = 1L;
  
//    protected void doGet(HttpServletRequest req, HttpServletResponse res)
//    {
//   	System.out.println("get method called");
//   }
   
    
public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		System.out.println("post method called");
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		int a=Integer.parseInt(req.getParameter("fno"));
		int b=Integer.parseInt(req.getParameter("sno"));
		out.println("<HTML>");
		out.println("<Head>");
		out.println("<Title>");
		out.println("Welcome");
		out.println("</Title>");
		out.println("</Head>");
		out.println("<Body>");
		out.println("SUM IS: "+(a+b));
		out.println("</Body>");
		out.println("</HTML>");
		
	}
	


}








































/*public Myserver() {
    super();
    // TODO Auto-generated constructor stub
}

*//**
 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
 *//*
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	response.getWriter().append("Served at: ").append(request.getContextPath());
}

*//**
 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
 *//*
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	doGet(request, response);
}
*/