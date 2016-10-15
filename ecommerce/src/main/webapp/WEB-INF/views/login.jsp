

<jsp:include page="header.jsp">
	<jsp:param name="" value="" />
</jsp:include>


	<div class="container" style="height: 500px; width: 100%; align: center;" >
	<table>
		<th><label>Login</label></th>
		<tr><div class="form-group" align="center">
			<td><label for="us">Name:</label> </td>
			<td><input type="text" class="form-control" id="us" style="hight: 100px; width: 100%;"></td>
		</div></tr>
	<div class="form-group">
		<tr>
			<td><label for="pwd">Password:</label></td>
			<td><input type="password" class="form-control" id="pwd" style="hight: 100px; width: 100%;"></td>
		</tr></div>
		<tr>
		<td><button type="button" class="btn btn-primary btn-md">Login</button></td>
		</tr>
		</table>
</div>

<jsp:include page="footer.jsp">
	<jsp:param name="" value="" />
</jsp:include>

