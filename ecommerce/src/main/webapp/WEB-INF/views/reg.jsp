

<jsp:include page="header.jsp">
	<jsp:param name="" value="" />
</jsp:include>

<div class="container" align="center">
	<br />
	<br />
	<div class="panel panel-default" style="hight: 100px; width: 40%;">
		<div class="panel-heading" align="center">
			<b>Registration</b>
		</div>
		<div class="panel-body">
			<input class="form-control" id="ex3" type="text"
				placeholder="Firstname Lastname" style="hight: 100px; width: 100%;">
		</div>
		<div class="panel-body">
			<input class="form-control" id="ex3" type="email" placeholder="Email"
				style="hight: 100px; width: 100%;">
		</div>
		<div class="panel-body">
			<input class="form-control" id="ex3" type="password"
				placeholder="Password" style="hight: 100px; width: 100%;">
		</div>

		<div class="panel-body" align="left">
			<label for="inputlg">Gender</label> <input type="radio" name="female"
				id="gen">Female <input type="radio" name="male" id="gen">Male
		</div>
		<div class="panel-body">
			<textarea class="form-control" placeholder="Address" rows="5"
				id="comment" style="hight: 100px; width: 100%;"></textarea>
		</div>
		<div class="panel-body">
			<td><button type="button" class="btn btn-primary btn-md">Submit</button></td>
		</div>
	</div>
</div>


<jsp:include page="footer.jsp">
	<jsp:param name="" value="" />
</jsp:include>

