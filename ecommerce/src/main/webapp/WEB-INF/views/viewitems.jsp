<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="cp" value="${pageContext.request.contextPath}"/>

<jsp:include page="header.jsp">
	<jsp:param name="" value="" />
</jsp:include>

	<div ng-app="myApp" ng-controller="myCtrl" ng-init="test='${pro}'">
		<div class="container" align="center">
			<div class="panel panel-default">
				<div class="panel-heading"><B>${pro} List</B></div>
				<div class="panel-body">
					<input type="text" class="form-control input-lg" ng-model="test" placeholder="Search"><br />
					<table class="table table-responsive">
						<tr>
				<th ng-click="orderByMe('id')">ID</th>			
				<th ng-click="orderByMe('name')">Name</th>
				<th ng-click="orderByMe('desc')">Version</th>
				<th ng-click="orderByMe('price')">Price</th>
				<th ng-click="orderByMe('Supplier')">Suppier</th>
				
							<th align="center">View Edit Delete Add To Cart</th>
						</tr>
						<tr ng-repeat="x in names | orderBy:myOrderBy | filter:test">
				<td align="center">{{x.id}}</td>
				<td align="center">{{x.name}}</td>
				<td align="center">{{x.desc}}</td>
				<td align="center">{{x.price}}</td>
				<td align="center">{{x.Supplier}}</td>
							<td><a href="<c:url value="${cp }{{x.id}}" />"><button class="button button1">View</button></a> <a
								href="<c:url value="${cp }viewedit" />" id="iphn"><button class="button button2">Edit</button></a> <a
								href="<c:url value="${cp }viewdel" />" id="iphn"><button class="button button3">Delete</button></a> <a
								href="<c:url value="${cp }add" />" id="iphn"><button class="button button5">Add To Cart</button></a></td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</div><script src="resources/js/ex.js"></script> 
	<jsp:include page="footer.jsp">
		<jsp:param name="" value="" />
	</jsp:include>