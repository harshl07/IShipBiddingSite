<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Load Details</title>
</head>
<body>
<h3>List of Auction</h3>
	<table style="border:2px">
	<tr>
		<th>Delivery Load</th>
		<!-- <th>Customer Id</th> -->
		<th>Delivery Address</th>
		<th>Description</th>
	</tr>	
		<tr>
			<td>
			<a href="items/${shippingLoad.shippingLoadID}">Items</a>
			
			</td>
			<%-- <td>${shippingLoad.customer.CustomerID}</td> --%>
			<td>${shippingLoad.street},
				${shippingLoad.city},
				${shippingLoad.state}
				${shippingLoad.pincode}
			</td>
			<td>${shippingLoad.description}</td>
		</tr>
</table>
</body>
</html>
