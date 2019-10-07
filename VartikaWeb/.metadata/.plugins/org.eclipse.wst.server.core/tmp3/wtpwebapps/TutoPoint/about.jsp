<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Education &mdash; Free Website Template, Free HTML5 Template by freehtml5.co</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Website Template by freehtml5.co" />
	<meta name="keywords" content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
	<meta name="author" content="freehtml5.co" />



	<!-- Animate.css -->
	<link rel="stylesheet" href="css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="css/icomoon.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="css/bootstrap.css">

	<!-- Magnific Popup -->
	<link rel="stylesheet" href="css/magnific-popup.css">

	<!-- Owl Carousel  -->
	<link rel="stylesheet" href="css/owl.carousel.min.css">
	<link rel="stylesheet" href="css/owl.theme.default.min.css">

	<!-- Flexslider  -->
	<link rel="stylesheet" href="css/flexslider.css">

	<!-- Pricing -->
	<link rel="stylesheet" href="css/pricing.css">

	<!-- Theme style  -->
	<link rel="stylesheet" href="css/style.css">

	<!-- Modernizr JS -->
	<script src="js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

	</head>

<body>

<div class="fh5co-loader"></div>

	<div id="page">
	<nav class="fh5co-nav" role="navigation">
		<div class="top">
			<div class="container">
				<div class="row">
					<!-- <div class="col-xs-12 text-right">
						<p class="site">www.yourdomainname.com</p>
						<p class="num">Call: +01 123 456 7890</p>
						<ul class="fh5co-social">
							<li><a href="#"><i class="icon-facebook2"></i></a></li>
							<li><a href="#"><i class="icon-twitter2"></i></a></li>
							<li><a href="#"><i class="icon-dribbble2"></i></a></li>
							<li><a href="#"><i class="icon-github"></i></a></li>
						</ul>
					</div> -->
				</div>
			</div>
		</div>
		<div class="top-menu">
			<div class="container">
				<div class="row">
					<div class="col-xs-2">
						<div id="fh5co-logo"><a href="index.html"><i class="icon-study"></i>TUTO<span>.</span></a></div>
					</div>
					<div class="col-xs-10 text-right menu-1">
						<ul>
							<li><a href="index.jsp">Home</a></li>
							<!-- <li><a href="courses.html">Courses</a></li> -->
							<li class="has-dropdown"><a href="courses.jsp">Courses</a>
								<ul class="dropdown">
										<li><a href="login.html">Java</a></li>
										<li><a href="login.html">C++</a></li>
										<li><a href="login.html">Python</a></li>
									</ul>
									</li>
							<li><a href="Videos.jsp">Videos</a></li>
							<li class="active"><a href="about.jsp">About</a></li>
							<!-- <li><a href="pricing.html">Pricing</a></li>
							<li class="has-dropdown">
								<a href="blog.html">Blog</a>
								<ul class="dropdown">
									<li><a href="#">Web Design</a></li>
									<li><a href="#">eCommerce</a></li>
									<li><a href="#">Branding</a></li>
									<li><a href="#">API</a></li>
								</ul>
							</li> -->
							<li><a href="contactus.jsp">Contact</a></li>
							<%String n=null;
n=(String)session.getAttribute("Login_name");%>
 <%if (n != null){
	 System.out.println("inside if");
	 %>
	 
	 <li class="btn-cta"><a href="LogoutServlet"><span>logout</span></a></li>
							<h3>
								<font face="Times New Roman" size="4">
 								 <%String name1 = (String) session.getAttribute("Login_name");%>
 								 <br> welcome <%=name1%></font>
							</h3>
 								<%   }
  								 else {
  								 	 System.out.println("inside else");
  								 %>
  								 
      								<li class="btn-cta"><a href="login.html"><span>Login</span></a></li>
									<li class="btn-cta"><a href="register.html"><span>Create
									a Course</span></a></li>
   									<% } %>  
						</ul>
					</div>
				</div>

			</div>
		</div>
	</nav>

	<aside id="fh5co-hero">
		<div class="flexslider">
			<ul class="slides">
		   	<li style="background-image: url(pics/6.jpg);">
		   		<div class="overlay-gradient"></div>
		   		<div class="container">
		   			<div class="row">
			   			<div class="col-md-8 col-md-offset-2 text-center slider-text">
			   				<div class="slider-text-inner">
			   					<h1 class="heading-section">About Us</h1>
									<h2>Tuto <a href="https://w3school.com" target="_blank">Free Course</a></h2>
			   				</div>
			   			</div>
			   		</div>
		   		</div>
		   	</li>
		  	</ul>
	  	</div>
	</aside>

	<div id="fh5co-about">
		<div class="container">
			<div class="col-md-6 animate-box">
				<span>About Our University</span>
				<h2>Welcome to Education Website</h2>
				<p>Understanding eLearning is simple. eLearning is learning utilizing electronic technologies to access educational curriculum outside of a traditional classroom.

There are many terms used to describe learning that is delivered online, via the internet, ranging from Distance Education, to computerized electronic learning, online learning, internet learning and many others.
 We define eLearning as courses that are specifically delivered via the internet to somewhere other than the classroom where the professor is teaching. It is interactive in that you can also communicate with your teachers, professors or other students in your class.
  Sometimes it is delivered live, where you can “electronically” raise your hand and interact in real time and sometimes it is a lecture that has been prerecorded.
	There is always a teacher or professor interacting /communicating with you and grading your participation, your assignments and your tests.

</p>

			</div>
			<div class="col-md-6">
				<img class="img-responsive" src="pics/51.jpg" alt="Free HTML5 Bootstrap Template">
			</div>
		</div>
	</div>


	<footer id="fh5co-footer" role="contentinfo"
			style="background-image: url(images/img_bg_4.jpg);">
			<div class="overlay"></div>
			<div class="container">
				<div class="row row-pb-md">
					<div class="col-md-3 fh5co-widget">
						<h3>About Education</h3>
						<p>
							“Education is the most powerful weapon which you can use to
							change the world.”<br>Nelson Mandela
						</p>
					</div>
					<div class="col-md-2 col-sm-4 col-xs-6 col-md-push-1 fh5co-widget">
						<h3>Learning</h3>
						<ul class="fh5co-footer-links">
							<li><a href="courses.html">Course</a></li>
							<li><a href="contact.html">Contact</a></li>
							<li><a href="about.html">Terms</a></li>
						</ul>
					</div>

					<div class="col-md-2 col-sm-4 col-xs-6 col-md-push-1 fh5co-widget">
						<h3>Learn &amp; Grow</h3>
						<ul class="fh5co-footer-links">
							<li><a href="about.html">Privacy</a></li>

						</ul>
					</div>




				</div>



			</div>
		</footer>
	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
	</div>

	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Stellar Parallax -->
	<script src="js/jquery.stellar.min.js"></script>
	<!-- Carousel -->
	<script src="js/owl.carousel.min.js"></script>
	<!-- Flexslider -->
	<script src="js/jquery.flexslider-min.js"></script>
	<!-- countTo -->
	<script src="js/jquery.countTo.js"></script>
	<!-- Magnific Popup -->
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/magnific-popup-options.js"></script>
	<!-- Count Down -->
	<script src="js/simplyCountdown.js"></script>
	<!-- Main -->
	<script src="js/main.js"></script>

	</body>
</html>