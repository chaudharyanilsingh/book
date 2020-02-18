<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products List</title>
</head>
<body>

	<h3>Products List</h3>
	<table border="1" cellpadding="2" cellspacing="2">
		<tr>
			<th>Tittle</th>
			<th>Author</th>
			<th>ISBN </th>
			<th>Publisher</th>
			<th>Publish date</th>
			<th>Category</th>
			<th>Number of books in Stock </th>	
		</tr>
			<c:forEach var="product" items="${products }">
			<tr>
				<td><c:out value="${product.publisher}" /></td>
				 
				  <td><c:out value="${product.author}" /></td>
			
				
			</tr>
		</c:forEach>
	</table>

</body>
</html>