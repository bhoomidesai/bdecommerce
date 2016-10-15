

<jsp:include page="header.jsp" > <jsp:param name="" value=""/> </jsp:include>

<div ng-app="myApp" ng-controller="namesCtrl">
		<p>
			<input type="text" ng-model="test">
		</p>
		<table border="1" width="50%">
			<tr>
				<th ng-click="orderByMe('name')">Name</th>
				<th ng-click="orderByMe('country')">Country</th>
			</tr>
			<tr ng-repeat="x in names | orderBy:myOrderBy | filter:test">
				<td>{{x.name}}</td>
				<td>{{x.brand}}</td>
			</tr>
		</table>
	</div>
	<script src="resources/js/ex.js"></script> 

<jsp:include page="footer.jsp" > <jsp:param name="" value=""/> </jsp:include>

