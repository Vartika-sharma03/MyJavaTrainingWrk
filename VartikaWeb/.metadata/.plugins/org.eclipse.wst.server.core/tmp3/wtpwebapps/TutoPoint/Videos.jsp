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
					
				</div>
			</div>
		</div>
		<div class="top-menu">
			<div class="container">
				<div class="row">
					<div class="col-xs-2">
						<div id="fh5co-logo"><a href="index.html"><i class="icon-study"></i>TUTO.<span>.</span></a></div>
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
							<li class="active"><a href="Videos.jsp">Videos</a></li>
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
		   	<li style="background-image: url(pics/29.jpg);">
		   		<div class="overlay-gradient"></div>
		   		<div class="container">
		   			<div class="row">
			   			<div class="col-md-8 col-md-offset-2 text-center slider-text">
			   				<div class="slider-text-inner">
			   					<h1 class="heading-section">Our Videos</h1>
									<h2> <a href="https://www.youtube.com/watch?v=r59xYe3Vyks&list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al" target="_blank">Start Streaming Now !!! </a></h2>
			   				</div>
			   			</div>
			   		</div>
		   		</div>
		   	</li>
		  	</ul>
	  	</div>
	</aside>



	
	<br>
	<br>
	<br>

	
	<div class="row">
				<div class="col-lg-4 col-md-4">
					<div class="fh5co-blog animate-box">
					
						<a href="Videos/google.mp4" class="blog-img-holder" style="background-image: url(images/sp.jpg);"></a>
						<div class="blog-text">
							<h3><a href="Videos/google.mp4">Sundar Pichai</a></h3>
							<span class="posted_on">Oct. 15th</span>
							<span class="comment">21<i class="icon-speech-bubble"></i></span>
							<p>Pichai Sundararajan, also known as Sundar Pichai, is an American business executive. He is an engineer and the chief executive..</p>
						</div> 
					</div>
				</div>
				<div class="col-lg-4 col-md-4">
					<div class="fh5co-blog animate-box">
						<a href="Videos/vids1.mp4" class="blog-img-holder" style="background-image: url(images/vids1.png);"></a>
						<div class="blog-text">
							<h3><a href="vids/vids1.mp4">Oops Concepts</a></h3>
							<span class="posted_on">Dec. 25th</span>
							<span class="comment"><a href="">21<i class="icon-speech-bubble"></i></a></span>
							<p>OOPS Concepts or Object-Oriented Programming Concepts are very important. Without having an idea about OOPS concepts,.....</p>
						</div> 
					</div>
				</div>
				<div class="col-lg-4 col-md-4">
					<div class="fh5co-blog animate-box">
						<a href="Videos/vids2.mp4" class="blog-img-holder" style="background-image: url(images/vids2.PNG);"></a>
						<div class="blog-text">
							<h3><a href="Videos/vids2.mp4">Servlet Introduction</a></h3>
							<span class="posted_on">March. 15th</span>
							<span class="comment"><a href="">21<i class="icon-speech-bubble"></i></a></span>
							<p>Servlets work on the server-side. Servlets capable of handling complex request obtained from web server....</p>
						</div> 
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<br>
	<br>
	
   <div class="row">
				<div class="col-lg-4 col-md-4">
					<div class="fh5co-blog animate-box">
						<a href="Videos/vids3.mp4" class="blog-img-holder" style="background-image: url(images/vids3.PNG);"></a>
						<div class="blog-text">
							<h3><a href="Videos/vids3.mp4">Collection And Collections</a></h3>
							<span class="posted_on">Aug. 15th</span>
							<span class="comment"><a href="">21<i class="icon-speech-bubble"></i></a></span>
<p>Collection is a top level interface of java collection framework where as Collections is an utility class. ArrayList, Vector, HashSet, LinkedHashSet, PriorityQueue are some indirect implementations of Collection interface. ..</p>						</div> 
					</div>
				</div>
				<div class="col-lg-4 col-md-4">
					<div class="fh5co-blog animate-box">
						<a href="Videos/vids4.webm" class="blog-img-holder" style="background-image: url(images/vids4.PNG);"></a>
						<div class="blog-text">
							<h3><a href="Videos/vids4.webm">Data Science</a></h3>
							<span class="posted_on">Feb. 11th</span>
							<span class="comment"><a href="">21<i class="icon-speech-bubble"></i></a></span>
<p>Data science is a multi-disciplinary field that uses scientific methods, processes, algorithms and systems to extract knowledge and insights from structured and unstructured data.</p>						</div> 
					</div>
				</div>
				<div class="col-lg-4 col-md-4">
					<div class="fh5co-blog animate-box">
						<a href="Videos/vids5.mp4" class="blog-img-holder" style="background-image: url(images/vids5.PNG);"></a>
						<div class="blog-text">
							<h3><a href="Videos/vids5.mp4">The First Ever Robo Citizen-Sophia</a></h3>
							<span class="posted_on">May. 17th</span>
							<span class="comment"><a href="">21<i class="icon-speech-bubble"></i></a></span>
							<p>Sophia is a realistic humanoid robot capable of displaying humanlike expressions and interacting with people. It's designed for research, education, and ....</p>
						</div> 
					</div>
				</div>
			</div>
		</div>
	</div>



<br>
<br>
	<footer id="fh5co-footer" role="contentinfo" style="background-image: url(images/img_bg_4.jpg);">
		<div class="overlay"></div>
		<div class="container">
			<div class="row row-pb-md">
				<div class="col-md-3 fh5co-widget">
					<h3>About Education</h3>
<p>“Education is the most powerful weapon which you can use to change the world.”<br>Nelson Mandela</p>				</div>
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
	<script>
    var d = new Date(new Date().getTime() + 1000 * 120 * 120 * 2000);

    // default example
    simplyCountdown('.simply-countdown-one', {
        year: d.getFullYear(),
        month: d.getMonth() + 1,
        day: d.getDate()
    });

    //jQuery example
    $('#simply-countdown-losange').simplyCountdown({
        year: d.getFullYear(),
        month: d.getMonth() + 1,
        day: d.getDate(),
        enableUtc: false
    });
	</script>


</body>
</html>