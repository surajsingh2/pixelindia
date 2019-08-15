<%@taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CLIENT SIGNIN PAGE</title>
<link rel="Stylesheet" type="text/css" href="Style1.css">
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
<li><a href="registrationinputclient.action">New User</a></li>
</ul>


 <div style="color: red;">
	   <s:property value="jsppagemsg" />
 </div>
<div class="login-box">
<h2 style="text-align:center">Sign In Here</h2>
<s:form  class="signinform" action="loginclient.action" method="post" namespace="/">
<br>
<br>
<h2>Sign in Here</h2>

          <s:textfield class="label" label="EMAIL ID" name="email" value=""  />

          <s:password class="label" label="PASSWORD" name="password" value="" />
 
          <s:submit value="LOGIN" align="center" />
          <br>
          <br>
          <br>
          <br>
          
</s:form>
</div>
</body>
</html>