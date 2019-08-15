<%@taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login As Admin</title>
<link rel="stylesheet" type="text/css"
href="Style1.css">

</head>
<body>
<h1>Pixel India</h1>
<ul>
<li><a href="index.action">Home</a></li>
<li><a href="AboutUs.html">About Us</a>
</li>
<li><a href="ViewGallery.html"> Gallery </a></li>

<li><a href="ContactUs.html">Contact Us</a>
<ul>
<li><a href="messageinput.action">Send us a Message</a></li>
</ul></li>
</ul>


 <div style="color: red;">
	   <s:property value="jsppagemsg" />
 </div>
<div class="login-box">
<s:form action="adminlogin.action" method="post">
<br>
<br>
<br>
<br>
<br>
<h2>Login to get Full Access</h2>
          <s:textfield label="USER ID" name="userid" value=""  />

          <s:password label="PASSWORD" name="password" value="" />
           
 
          <s:submit value="ADMIN LOGIN" align="center" />
</s:form>

</div>
</body>
</html>