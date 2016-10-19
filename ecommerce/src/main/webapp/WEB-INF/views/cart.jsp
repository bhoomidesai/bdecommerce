
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<jsp:include page="header.jsp" > <jsp:param name="" value=""/> </jsp:include>
<form:form action="/admin/insert" modelattribute="sub">
    <label for="uname">Name: </label>
 <input type="text" path="uname"/>
 <label for="">Name: </label>
 <input type="text" path="uname"/>
 <label for="uname">Name: </label>
 <input type="text" path="uname"/>
 <label for="uname">Name: </label>
 <input type="text" path="uname"/>
 <label for="uname">Name: </label>
 <input type="text" path="uname"/>
   
    <input type="submit" value="Submit" />
</form:form>

<jsp:include page="footer.jsp" > <jsp:param name="" value=""/> </jsp:include>

