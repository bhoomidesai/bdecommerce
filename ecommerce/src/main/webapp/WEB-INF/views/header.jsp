<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/resources/css" var="css" />
<spring:url value="/resources/js" var="js" />
<spring:url value="/resources/images" var="img" />


<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.js"></script>
<html>
<head>
<title>hello</title>
<script src="${js}/jquery.min.js"></script>
<script src="${js}/bootstrap.js"></script>
<link rel="stylesheet" href="${css}/bootstrap.min.css" />
</head>
<body>

	<nav role="navigation" class="navbar navbar-inverse" >
 <div class="navbar-header">
            <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<c:url value="home" />">iStore</a>
  </div>	
		 <div id="navbarCollapse" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="<c:url value="home" />">Home</a></li>
				<li><a href="<c:url value="contact" />">Contact Us</a></li>
				<li><a href="<c:url value="about" />">About Us</a></li>
				<li><a href="<c:url value="view" />">View all</a></li>
				
			</ul>
			<ul class="nav navbar-nav navbar-right">
			<li><a href="<c:url value="cart" />">Cart</a></li>
				<li><a href="<c:url value="reg" />"><span class="glyphicon glyphicon-user"></span>
						Sign Up</a></li>
				<li><a href="<c:url value="login" />"><span class="glyphicon glyphicon-log-in"></span>
						Login</a></li>
			</ul>
		</div>
	</nav>

