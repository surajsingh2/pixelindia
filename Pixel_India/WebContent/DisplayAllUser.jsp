<%@taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Of Photographers</title>
<link rel="Stylesheet" type="text/css" href="Style1.css">
<style> 
table, td, th {border: 1px solid black;}
table {border-collapse: collapse;width: 60%;}
th {height: 30px;}
.button-delete {background-color: #008CBA;color: white;cursor: pointer;}
.button-delete:hover {background-color: red;color: white;}
</style>
</head>
<body>
<h2>List Of Photographers</h2>
	<div align="right">
	   <a href="adminlogout.action">LOGOUT</a>
	</div>
	<div>
	   <a href="adminhome.action">ADMIN HOME</a>
	</div>
	<div style="margin-top: 40px;">
		<s:if test="noData==true">
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
						<th>DELETE</th>
					</tr>
				</thead>
				<s:iterator value="usrlist">
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
							<a href="deleteuser.action?email=<s:property value="email"/>">
								<button class="button-delete">Delete</button>
							</a>
						</td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
		<s:else>
			<div style="color: red;">No Data Found.</div>
		</s:else>
	</div>
	
	<br/>
	
	<div style="color: red;">
	    <s:property value="deletemsg" />
    </div>
	
	<div style="color: blue;">
	    <s:property value="updatemsg" />
    </div>
	

</body>
</html>