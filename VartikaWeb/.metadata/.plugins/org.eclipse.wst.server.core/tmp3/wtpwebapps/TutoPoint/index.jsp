<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/discourse-plugin" version="0.8.18">
    if(api.getCurrentUser() != null) {
        $("#logged-in-user").text(" " + api.getCurrentUser().username);
    }
</script>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Education &mdash; Free Website Template, Free HTML5
	Template by freehtml5.co</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description"
	content="Free HTML5 Website Template by freehtml5.co" />
<meta name="keywords"
	content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
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
					
					</div>
				</div>
			</div>
			<div class="top-menu">
				<div class="container">
					<div class="row">
						<div class="col-xs-2">
							<div id="fh5co-logo">
								<a href="index.jsp"><i class="icon-study"></i>Tuto<span>.</span></a>
							</div>
						</div>
						<div class="col-xs-10 text-right menu-1">
							<ul>
								<li class="active"><a href="index.jsp">Home</a></li>
								<!-- <li><a href="courses.html">Courses</a> -->
								<li class="has-dropdown"><a href="courses.jsp">Courses</a>
									<ul class="dropdown">
										<li><a href="login.html">Java</a></li>
										<li><a href="login.html">C++</a></li>
										<li><a href="login.html">Python</a></li>
									</ul></li>



								<li><a href="Videos.jsp">Videos</a></li>
								<li><a href="about.jsp">About</a></li>

								
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
					<li style="background-image: url(pics/1.jpg);">
						<div class="overlay-gradient"></div>
						<div class="container">
							<div class="row">
								<div class="col-md-8 col-md-offset-2 text-center slider-text">
									<div class="slider-text-inner">
										<h1>The Roots of Education are Bitter, But the Fruit is
											Sweet</h1>
										<h2>
											<a href="" target="_blank">Tutorial</a>
										</h2>
										<p>
											<a class="btn btn-primary btn-lg"
												href="https://www.w3schools.in/">Start Learning Now!</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</li>
					<li style="background-image: url(pics/3.jpeg);">
						<div class="overlay-gradient"></div>
						<div class="container">
							<div class="row">
								<div class="col-md-8 col-md-offset-2 text-center slider-text">
									<div class="slider-text-inner">
										<h1>The Great Aim of Education is not Knowledge, But
											Action</h1>
										<h2>
											<a href="" target="_blank">Tutorial</a>
										</h2>
										<p><p></p></p>
			
																		

									</div>
								</div>
							</div>
						</div>
					</li>
					<li style="background-image: url(pics/21.jpg);">
						<div class="overlay-gradient"></div>
						<div class="container">
							<div class="row">
								<div class="col-md-8 col-md-offset-2 text-center slider-text">
									<div class="slider-text-inner">
										<h1>We Help You to Learn New Things</h1>
										<h2>
											<a href="" target="_blank">Tutorial</a>
										</h2>
											<p>
											<a class="btn btn-primary btn-lg"
												href="https://www.w3schools.in/">Start Learning Now!</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</aside>

		<div id="fh5co-course">
			<div class="container">
				<div class="row animate-box">
					<div class="col-md-6 col-md-offset-3 text-center fh5co-heading">
						<h3>Knowledge is Power</h3>
						<!-- <p>Dignissimos asperiores vitae velit veniam totam fuga molestias accusamus alias autem provident. Odit ab aliquam dolor eius.</p> -->
					</div>
				</div>
				<div class="row">
					<div class="col-md-6 animate-box">
						<div class="course">
							<a href="#" class="course-img"
								style="background-image: url(pics/47.jpg);"> </a>
							<div class="desc">
								<h3>
									<a href="#">Articles</a>
								</h3>
								<p>IBM announced last week it has moved its cognitive
									computing system into the cloud to form the Watson Discovery
									Advisor, allowing researchers, academics and anyone else trying
									to leverage big data the ability to..</p>
								<span><a
									href="https://www.forbes.com/sites/benkerschberg/2018/02/09/best-technology-articles-you-should-read-today-29/#54ee7c941be6"
									class="btn btn-primary btn-sm btn-course">Click Here</a></span>
							</div>
						</div>
					</div>
					<div class="col-md-6 animate-box">
						<div class="course">
							<a href="#" class="course-img"
								style="background-image: url(pics/42.jpg);"> </a>
							<div class="desc">
								<h3>
									<a href="#">Q/A</a>
								</h3>
								<p>General Knowledge (GK), Current Affairs and General
									Knowledge Gk Quiz and Question Answers on different topics and
									subjects related to exams. Find out pages like General
									Knowledge, Current Affairs for preparation of competitive exams
									and online test and interviews.</p>
								<span><a
									href="https://www.gkduniya.com/computer-science2
"
									class="btn btn-primary btn-sm btn-course">Click Here</a></span>
							</div>
						</div>
					</div>
					<div class="col-md-6 animate-box">
						<div class="course">
							<a href="#" class="course-img"
								style="background-image: url(pics/43.jpg);"> </a>
							<div class="desc">
								<h3>
									<a href="#"> Interview Questions and Answers</a>
								</h3>
								<p>There are given interview questions and answers on 100+
									topics such as HR, C, C++, Java, .Net, PHP, Android, Hadoop,
									SQL, Oracle, DBMS, Ruby, Perl, Python, Servlet, JSP, Spring,
									Hibernate, WordPress, CodeIgniter, C#, ADO.Net, ASP.Net,
									MongoDB, MariaDBetc.</p>
								<span><a
									href="https://www.javatpoint.com/interview-questions-and-answers"
									class="btn btn-primary btn-sm btn-course">Click Here</a></span>
							</div>
						</div>
					</div>
					<div class="col-md-6 animate-box">
						<div class="course">
							<a href="#" class="course-img"
								style="background-image: url(pics/22.jpg);"> </a>
							<div class="desc">
								<h3>
									<a href="#">Emerging Technologies</a>
								</h3>
								<p>The 10 technologies named in the report were ranked
									according to the near-term business and financial opportunities
									each creates for IT firms and other business technology
									companies, and selected by the organization's Emerging
									Technology Community..</p>
								<span><a
									href="https://www.techrepublic.com/article/top-10-emerging-technologies-of-2019/"
									class="btn btn-primary btn-sm btn-course">Click Here</a></span>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		

	
		<div id="fh5co-gallery" class="fh5co-bg-section">
			<div class="row text-center">
				<h2>
					<span>Our Tuto Gallery</span>
				</h2>
			</div>
			<div class="row">
				<div class="col-md-3 col-padded">
					<a href="#" class="gallery"
						style="background-image: url(pics/17.jpg);"></a>
				</div>
				<div class="col-md-3 col-padded">
					<a href="#" class="gallery"
						style="background-image: url(pics/16.jpg);"></a>
				</div>
				<div class="col-md-3 col-padded">
					<a href="#" class="gallery"
						style="background-image: url(pics/18.jpg);"></a>
				</div>
				<div class="col-md-3 col-padded">
					<a href="#" class="gallery"
						style="background-image: url(pics/19.jpg);"></a>
				</div>
			</div>
		</div>
		<br> <br> <br>
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