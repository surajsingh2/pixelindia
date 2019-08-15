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
.button :hover {background: #333;color: #e3e3e3;}
</style>
</head>
<body>
<h3>Welcome <s:property value="#session.uid" /></h3>
	  
	<h2>You Have Got These Messages</h2>
	<div style="margin-top: 40px;">
			<table>
				<thead>
					<tr style="background-color: #000000;">
						<th>NAME</th>
						<th>EMAIL</th>
						<th>MESSAGE</th>
					</tr>
				</thead>
				<s:iterator value="msglist">
					<tr style="background-color: #333;color: #fff;">

						<td><s:property value="name" /></td>
						<td><s:property value="emailid" /></td>
						<td><s:property value="query" /></td>
						
					</tr>
				</s:iterator>
			</table>
		
	</div>
</body>
</html>