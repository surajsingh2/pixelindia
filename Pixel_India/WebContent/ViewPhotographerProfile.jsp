<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="Stylesheet" type="text/css" href="Style1.css">
<style> 
table, td, th {border: 1px solid black;}
table {border-collapse: collapse;width: 60%;}
th {height: 30px;}
.button {background: #e3e3e3;color: #333;cursor: pointer;}
.button:hover {background: #333;color: #e3e3e3;}
</style>
</head>
<body>
<div style="margin-top: 40px;">
	
			<table>
				<thead>
					<tr style="background-color: #000000;">
						<th>P ID</th>
						<th>EMAIL ID</th>
						<th>PASSWORD</th>
						<th>NAME</th>
						<th>MOBILENO</th>
						<th>GENDER</th>
						<th>CITY</th>
						<th>CATEGORY</th>
						<th>WEBSITE</th>
						<th>BOOKING</th>
					</tr>
				</thead>
				<s:iterator value="photographerlist1">
					<tr style="background-color: #333;color: #fff;">
						<td><s:property value="pid" /></td>
						<td><s:property value="email" /></td>
						<td><s:property value="password" /></td>
						<td><s:property value="name" /></td>
						<td><s:property value="mobileno" /></td>
						<td><s:property value="gender" /></td>
						<td><s:property value="city" /></td>
						<td><s:property value="category" /></td>
						<td><s:property value="website" /></td>
						<td>
							<a href="viewbooking.action?pid=<s:property value="pid"/>">
								<button class="button">View Bookings</button>
							</a>
						</td>
					</tr>
				</s:iterator>
			</table>
	</div>
	<div>
	<span style="color: red;"><s:property value="searcherrmsg" /></span>
</div>
	
</body>
</html>