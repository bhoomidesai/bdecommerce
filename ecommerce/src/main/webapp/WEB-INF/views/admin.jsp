<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="cp" value="${pageContext.request.contextPath}" />
<jsp:include page="header.jsp">
	<jsp:param name="" value="" />
</jsp:include>

<form:form method="GET" action="${cp}/admin/insert" modelAttribute="product">
	

		<div class="panel panel-default">
			<div class="panel-heading">
				<B>${pro} Product Details</B>
			</div>
			<div class="panel-body">
				<table class="table table-responsive" align="center">
				<c:if test="${!empty product.name}">
				<td>
					<form:input path="id" readonly="true" size="8"  disabled="true" />
					<form:hidden path="id" />
						
					<td><input path="id" />
						<errors path="id" cssclass="error" readonly="true" />
					<spring:message text="ID" /></td>
					</tr>
					</c:if>
					<div class="panel-body">
					<tr>
						<td><label path="name">Product Name</label></td>
						<td><input path="name" />
						<errors path="name" cssclass="error" /></td>
					</tr>
					</div>
					<div class="panel-body">
					<tr>
						<td><label path="desc">Version</label></td>
						<td><input path="desc" />
						<errors path="desc" cssclass="error" /></td>
					</tr>
					</div>
					<div class="panel-body">
					<tr>
						<td><label path="price">Price</label></td>
						<td><input path="price" />
						<errors path="price" cssclass="error" /></td>
					</tr>
					</div>
					<div class="panel-body">
					<tr>
						<td><label path="Supplier">Supplier</label></td>
						<td><input path="Supplier" />
						<errors path="Supplier" cssclass="error" /></td>
					</tr>
					</div>
					<div class="panel-body">
					<tr>
						<td><c:if test="${!empty product.id}">
								<a href="<c:url value="${cp }/admin/insert" />"><button
										class="button button1">Edit Product</button></a>
								<spring:message text="Edit Product" />' />
						</c:if> <c:if test="${empty product.id}">
								<a href="<c:url value="${cp }/admin/insert" />"><button
										class="button button2">Add product</button></a>
							</c:if></td>
					</tr>
					</div>
					</div>
				</table>
</form:form>

<c:if test="${!empty products}">

	<c:forEach items="${products}" var="product">

		<table class="table table-responsive" align="center">
			<tr>
			</tr>
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.price}</td>
				<td>${product.desc}</td>
				<%--  <td>${product.Supplier}</td>
 --%>
				<td>></td>
				<a href="<c:url value="${cp }/admin/edit/${product.id}" />"><button
						class="button button1">Edit</button></a>

				<td>
				<a href="<c:url value="${cp }/admin/delete/${product.id}" />"><button
						class="button button2">Delete</button></a></td>

			</tr>
		</table>

	</c:forEach>
</c:if>
<jsp:include page="footer.jsp">
	<jsp:param name="" value="" />
</jsp:include>

