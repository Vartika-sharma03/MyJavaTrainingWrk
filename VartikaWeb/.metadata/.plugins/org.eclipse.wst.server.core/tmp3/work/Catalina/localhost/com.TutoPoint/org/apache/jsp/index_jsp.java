/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.24
 * Generated at: 2019-10-04 05:14:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script type=\"text/discourse-plugin\" version=\"0.8.18\">\r\n");
      out.write("    if(api.getCurrentUser() != null) {\r\n");
      out.write("        $(\"#logged-in-user\").text(\" \" + api.getCurrentUser().username);\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<title>Education &mdash; Free Website Template, Free HTML5\r\n");
      out.write("\tTemplate by freehtml5.co</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta name=\"description\"\r\n");
      out.write("\tcontent=\"Free HTML5 Website Template by freehtml5.co\" />\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("\tcontent=\"free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive\" />\r\n");
      out.write("<meta name=\"author\" content=\"freehtml5.co\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Animate.css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("<!-- Icomoon Icon Fonts-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/icomoon.css\">\r\n");
      out.write("<!-- Bootstrap  -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Magnific Popup -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Owl Carousel  -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Flexslider  -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flexslider.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Pricing -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/pricing.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Theme style  -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Modernizr JS -->\r\n");
      out.write("<script src=\"js/modernizr-2.6.2.min.js\"></script>\r\n");
      out.write("<!-- FOR IE9 below -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("\t<script src=\"js/respond.min.js\"></script>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"fh5co-loader\"></div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"page\">\r\n");
      out.write("\t\t<nav class=\"fh5co-nav\" role=\"navigation\">\r\n");
      out.write("\t\t\t<div class=\"top\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"top-menu\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xs-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"fh5co-logo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.jsp\"><i class=\"icon-study\"></i>Tuto<span>.</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xs-10 text-right menu-1\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"active\"><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <li><a href=\"courses.html\">Courses</a> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"has-dropdown\"><a href=\"courses.jsp\">Courses</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"login.html\">Java</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"login.html\">C++</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"login.html\">Python</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"Videos.jsp\">Videos</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"about.jsp\">About</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"contactus.jsp\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t");
String n=null;
n=(String)session.getAttribute("Login_name");
      out.write('\r');
      out.write('\n');
      out.write(' ');
if (n != null){
	 System.out.println("inside if");
	 
      out.write("\r\n");
      out.write("\t \r\n");
      out.write("\t <li class=\"btn-cta\"><a href=\"LogoutServlet\"><span>logout</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<font face=\"Times New Roman\" size=\"4\">\r\n");
      out.write(" \t\t\t\t\t\t\t\t ");
String name1 = (String) session.getAttribute("Login_name");
      out.write("\r\n");
      out.write(" \t\t\t\t\t\t\t\t <br> welcome ");
      out.print(name1);
      out.write("</font>\r\n");
      out.write("\t\t\t\t\t\t\t</h3>\r\n");
      out.write(" \t\t\t\t\t\t\t\t");
   }
  								 else {
  								 	 System.out.println("inside else");
  								 
      out.write("\r\n");
      out.write("  \t\t\t\t\t\t\t\t \r\n");
      out.write("      \t\t\t\t\t\t\t\t<li class=\"btn-cta\"><a href=\"login.html\"><span>Login</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"btn-cta\"><a href=\"register.html\"><span>Create\r\n");
      out.write("\t\t\t\t\t\t\t\t\ta Course</span></a></li>\r\n");
      out.write("   \t\t\t\t\t\t\t\t\t");
 } 
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t\t<aside id=\"fh5co-hero\">\r\n");
      out.write("\t\t\t<div class=\"flexslider\">\r\n");
      out.write("\t\t\t\t<ul class=\"slides\">\r\n");
      out.write("\t\t\t\t\t<li style=\"background-image: url(pics/1.jpg);\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"overlay-gradient\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8 col-md-offset-2 text-center slider-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"slider-text-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1>The Roots of Education are Bitter, But the Fruit is\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tSweet</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"\" target=\"_blank\">Tutorial</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"btn btn-primary btn-lg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"https://www.w3schools.in/\">Start Learning Now!</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li style=\"background-image: url(pics/3.jpeg);\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"overlay-gradient\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8 col-md-offset-2 text-center slider-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"slider-text-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1>The Great Aim of Education is not Knowledge, But\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tAction</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"\" target=\"_blank\">Tutorial</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p><p></p></p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li style=\"background-image: url(pics/21.jpg);\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"overlay-gradient\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-8 col-md-offset-2 text-center slider-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"slider-text-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1>We Help You to Learn New Things</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"\" target=\"_blank\">Tutorial</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"btn btn-primary btn-lg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\thref=\"https://www.w3schools.in/\">Start Learning Now!</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</aside>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"fh5co-course\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row animate-box\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 col-md-offset-3 text-center fh5co-heading\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Knowledge is Power</h3>\r\n");
      out.write("\t\t\t\t\t\t<!-- <p>Dignissimos asperiores vitae velit veniam totam fuga molestias accusamus alias autem provident. Odit ab aliquam dolor eius.</p> -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 animate-box\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"course\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"course-img\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"background-image: url(pics/47.jpg);\"> </a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Articles</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>IBM announced last week it has moved its cognitive\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcomputing system into the cloud to form the Watson Discovery\r\n");
      out.write("\t\t\t\t\t\t\t\t\tAdvisor, allowing researchers, academics and anyone else trying\r\n");
      out.write("\t\t\t\t\t\t\t\t\tto leverage big data the ability to..</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"https://www.forbes.com/sites/benkerschberg/2018/02/09/best-technology-articles-you-should-read-today-29/#54ee7c941be6\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-primary btn-sm btn-course\">Click Here</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 animate-box\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"course\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"course-img\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"background-image: url(pics/42.jpg);\"> </a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Q/A</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>General Knowledge (GK), Current Affairs and General\r\n");
      out.write("\t\t\t\t\t\t\t\t\tKnowledge Gk Quiz and Question Answers on different topics and\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsubjects related to exams. Find out pages like General\r\n");
      out.write("\t\t\t\t\t\t\t\t\tKnowledge, Current Affairs for preparation of competitive exams\r\n");
      out.write("\t\t\t\t\t\t\t\t\tand online test and interviews.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"https://www.gkduniya.com/computer-science2\r\n");
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-primary btn-sm btn-course\">Click Here</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 animate-box\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"course\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"course-img\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"background-image: url(pics/43.jpg);\"> </a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"> Interview Questions and Answers</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>There are given interview questions and answers on 100+\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttopics such as HR, C, C++, Java, .Net, PHP, Android, Hadoop,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tSQL, Oracle, DBMS, Ruby, Perl, Python, Servlet, JSP, Spring,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tHibernate, WordPress, CodeIgniter, C#, ADO.Net, ASP.Net,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tMongoDB, MariaDBetc.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"https://www.javatpoint.com/interview-questions-and-answers\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-primary btn-sm btn-course\">Click Here</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 animate-box\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"course\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"course-img\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"background-image: url(pics/22.jpg);\"> </a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Emerging Technologies</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>The 10 technologies named in the report were ranked\r\n");
      out.write("\t\t\t\t\t\t\t\t\taccording to the near-term business and financial opportunities\r\n");
      out.write("\t\t\t\t\t\t\t\t\teach creates for IT firms and other business technology\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcompanies, and selected by the organization's Emerging\r\n");
      out.write("\t\t\t\t\t\t\t\t\tTechnology Community..</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"https://www.techrepublic.com/article/top-10-emerging-technologies-of-2019/\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-primary btn-sm btn-course\">Click Here</a></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div id=\"fh5co-gallery\" class=\"fh5co-bg-section\">\r\n");
      out.write("\t\t\t<div class=\"row text-center\">\r\n");
      out.write("\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t<span>Our Tuto Gallery</span>\r\n");
      out.write("\t\t\t\t</h2>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 col-padded\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"gallery\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"background-image: url(pics/17.jpg);\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 col-padded\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"gallery\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"background-image: url(pics/16.jpg);\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 col-padded\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"gallery\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"background-image: url(pics/18.jpg);\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 col-padded\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"gallery\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"background-image: url(pics/19.jpg);\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br> <br> <br>\r\n");
      out.write("\t\t<footer id=\"fh5co-footer\" role=\"contentinfo\"\r\n");
      out.write("\t\t\tstyle=\"background-image: url(images/img_bg_4.jpg);\">\r\n");
      out.write("\t\t\t<div class=\"overlay\"></div>\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row row-pb-md\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 fh5co-widget\">\r\n");
      out.write("\t\t\t\t\t\t<h3>About Education</h3>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tâEducation is the most powerful weapon which you can use to\r\n");
      out.write("\t\t\t\t\t\t\tchange the world.â<br>Nelson Mandela\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2 col-sm-4 col-xs-6 col-md-push-1 fh5co-widget\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Learning</h3>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"fh5co-footer-links\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"courses.html\">Course</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"about.html\">Terms</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2 col-sm-4 col-xs-6 col-md-push-1 fh5co-widget\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Learn &amp; Grow</h3>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"fh5co-footer-links\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"about.html\">Privacy</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"gototop js-top\">\r\n");
      out.write("\t\t<a href=\"#\" class=\"js-gotop\"><i class=\"icon-arrow-up\"></i></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- jQuery -->\r\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\t<!-- jQuery Easing -->\r\n");
      out.write("\t<script src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("\t<!-- Bootstrap -->\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<!-- Waypoints -->\r\n");
      out.write("\t<script src=\"js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("\t<!-- Stellar Parallax -->\r\n");
      out.write("\t<script src=\"js/jquery.stellar.min.js\"></script>\r\n");
      out.write("\t<!-- Carousel -->\r\n");
      out.write("\t<script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("\t<!-- Flexslider -->\r\n");
      out.write("\t<script src=\"js/jquery.flexslider-min.js\"></script>\r\n");
      out.write("\t<!-- countTo -->\r\n");
      out.write("\t<script src=\"js/jquery.countTo.js\"></script>\r\n");
      out.write("\t<!-- Magnific Popup -->\r\n");
      out.write("\t<script src=\"js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/magnific-popup-options.js\"></script>\r\n");
      out.write("\t<!-- Count Down -->\r\n");
      out.write("\t<script src=\"js/simplyCountdown.js\"></script>\r\n");
      out.write("\t<!-- Main -->\r\n");
      out.write("\t<script src=\"js/main.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
