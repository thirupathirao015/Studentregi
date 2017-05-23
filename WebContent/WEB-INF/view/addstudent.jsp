<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head><title>Add customer</title></head>
<body>
<h1>Add customer</h1>


<a href="listuser">Show All customer</a>

<br />
<br /> 
<form:form modelAttribute="customer" method="POST" action="savecustomer">
<form:label path="studentId">studentId</form:label>
	<%-- <form:label path="customerName">customer Name:</form:label>
	<form:input path="customerName" />
	<br />
	<form:label path="customeraddress">Customer Address:</form:label>
	<form:textarea path="customeraddress" />
	<br /> --%>
	<input type="submit" value="Save customer" />
</form:form>

</body>
</html>