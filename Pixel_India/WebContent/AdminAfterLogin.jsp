<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logged In As Admin</title>
<link rel="stylesheet" type="text/css"
href="Style1.css">

</head>
<body> 
 <h3>Welcome <s:property value="#session.uid" />, you have logged in successfully!</h3>
  <br/>
  <br/>
  <h1>Pixel India</h1>
<ul>
<li><a href="index.action">Home</a></li>
<li><a href="AboutUs.html">About Us</a>
</li>
<li><a href="ViewGallery.html"> Gallery </a></li>
</ul>
<ul>
<li><a href="viewmessage" >View Messages</a>
</li>
<li><a href="displayalluser">Our Photographers </a></li>

<li><a href="adminlogout.action">Logout</a>
</li>
</ul>
      
</body>
</html>