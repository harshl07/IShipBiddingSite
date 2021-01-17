<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Auction</title>
</head>
<body>
<h3>List of Auction</h3>
	<table style="border:2px">
	<tr>
		<th>Auction</th>
		<th>Start Date</th>
		<th>End Date</th>
		<th>Status</th>
		<th>Shipping Load</th>
	</tr>	
<c:forEach var="auction" items="${auctionList}"> 
		<tr>
			<td><a href="loadDetail/${auction.auctionID}">Auction Details</a></td>
			<td>${auction.startDate}</td>
			<td>${auction.endDate}</td>
			<td>${auction.status}</td>
			<td><a href="loadDetail/${auction.shippingLoad.shippingLoadID}">Load Details</a></td>
			<td></td>
		</tr>
	</c:forEach> 
</table>
</body>
</html>