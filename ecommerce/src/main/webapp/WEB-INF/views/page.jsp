<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/resources/images" var="img" />
<jsp:include page="header.jsp">
	<jsp:param name="" value="" />
</jsp:include>

<div id="myContainer"
	style="height: 500px; width: 100%; overflow: hidden; cursor: pointer">
	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>

			<li data-target="#myCarousel" data-slide-to="2"></li>
			<li data-target="#myCarousel" data-slide-to="3"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="${img}/1.jpg" alt="Chania"
					style="height: 500px; width: 100%; overflow: hidden; cursor: pointer">
			</div>

			<div class="item">
				<img src="${img}/2.jpg" alt="Chania"
					style="height: 500px; width: 100%; overflow: hidden; cursor: pointer">
			</div>

			<div class="item">
				<img src="${img}/3.jpg" alt="Flower"
					style="height: 500px; width: 100%; overflow: hidden; cursor: pointer">
			</div>

		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" role="button"
			data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
			aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel" role="button"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>

</div>
<div class="row" style="height: 400px; width: 100%;">

	<ul class="nav-justified">
		<li><div class="card ">
				<img class="card-img-top" src="${img}/1.jpg" alt="Card image cap" style="height: 400px;padding:10%; width: 100%; overflow: hidden; cursor: pointer">
				<div class="card-block">
					<h4 class="card-title">Mac Books</h4>
					<p class="card-text">Some quick example text to build on the
						card title and make up the bulk of the card's content.</p>
					<a href="<c:url value="view" />" class="btn btn-primary">View</a>
				</div></div></li>
		<li><div class="card">
				<img class="card-img-top" src="${img}/3.jpg" alt="Card image cap" style="height: 400px;padding:10%; width: 100%; overflow: hidden; cursor: pointer">
				<div class="card-block">
					<h4 class="card-title">iPhones</h4>
					<p class="card-text">Some quick example text to build on the
						card title and make up the bulk of the card's content.</p>
					<a href="<c:url value="view" />" class="btn btn-primary">View</a>
				</div></div></li>
		<li><div class="card">
				<img class="card-img-top" src="${img}/2.jpg" alt="Card image cap" style="height: 400px;padding:10%; width: 100%; overflow: hidden; cursor: pointer">
				<div class="card-block">
					<h4 class="card-title">iPads</h4>
					<p class="card-text">Some quick example text to build on the
						card title and make up the bulk of the card's content.</p>
					<a href="<c:url value="view" />" class="btn btn-primary">View</a>
				</div>
				</div></li>
	</ul>
</div>



<jsp:include page="footer.jsp">
	<jsp:param name="" value="" />
</jsp:include>

