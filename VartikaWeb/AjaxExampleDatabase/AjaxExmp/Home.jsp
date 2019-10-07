    <%@ page import="java.sql.*"%>  
      
    <%  
    String s=request.getParameter("val");  
    if(s==null || s.trim().equals("")){  
    out.print("Please enter id");  
    }else{  
    int id=Integer.parseInt(s);  
    out.print(id);  
    try{  
    	Class.forName("com.mysql.jdbc.Driver");   
  Connection con =DriverManager.getConnection("jdbc:mysql://localhost/AjaxExample","root","root");
  PreparedStatement ps=con.prepareStatement("select * from ajaxExampleData1 where id=?");  
    ps.setInt(1,id);  
    //ps.setString(2,name);
    ResultSet rs=ps.executeQuery();  
    while(rs.next()){  
    out.print(rs.getInt(1)+" "+ rs.getString(2)+" "+ rs.getString(3));  
    }  
    con.close();  
    }catch(Exception e){e.printStackTrace();}  
    }  
    %>  