<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>All customer</title>
</head>
<body>
<h1>List customer</h1>
<a href="adduser">Add customer</a>

<c:if test="${!empty customer}">
	<table>
		<tr>
			<th>Customer ID</th>
			<th>Customer Name</th>
			<th>Customer Address</th>
			<th>Added Date</th>
		</tr>

		<c:forEach items="${customer}" var="customer">
			<tr>
				<td><c:out value="${customer.customerid}"/></td>
				<td><c:out value="${customer.customerName}"/></td>
				<td><c:out value="${customer.customeraddress}"/></td>
				<td><c:out value="${customer.addedDate}"/></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>