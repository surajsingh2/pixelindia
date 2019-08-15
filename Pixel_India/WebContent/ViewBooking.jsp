<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Work Destination</title>
<link rel="Stylesheet" type="text/css" href="Style1.css">
<style>
table, td, th {border: 1px solid black;}
table {border-collapse: collapse;width: 60%;}
th {height: 30px;}
.button-update {background-color: #008CBA;color: white;}
.button-delete {background-color: red;color: white;}
</style>
</head>
<body>
<h3>Welcome <s:property value="#session.uid" /></h3>
	  
	<h2>Your Meetings</h2>
	<div style="margin-top: 40px;">
			<table>
				<thead>
					<tr style="background-color: #000000;">
						<th>YOUR PID</th>
						<th>NAME</th>
						<th>CONTACT NO.</th>
						<th>PLACE AND TIME</th>
					</tr>
				</thead>
				<s:iterator value="blist">
					<tr style="backgroung-color: #333;color: #fff;">
						<td><s:property value="pid" /></td>
						<td><s:property value="name" /></td>
						<td><s:property value="mobileno" /></td>
						<td><s:property value="meetup" /></td>
						
					</tr>
				</s:iterator>
			</table>
		</div></body>
</html>