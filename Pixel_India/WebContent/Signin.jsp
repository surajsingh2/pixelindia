<%@taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SIGN IN PAGE</title>
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
<br>
<br>

 <div style="color: red;">
	  
 </div>
 
 <div >

  <s:form  action="loginuser.action" method="post">
  <br>
  <br>
  <br>
          <h2>Sign In Here</h2>
          <s:textfield label="EMAIL ID" name="email" value=""  />

          <s:password label="PASSWORD" name="password" value="" />
 
          <s:submit value="LOGIN" align="center" />
          <br>
          <br>
          <br>
          <br>
</s:form>
  <h3>New Photographer?<a href="registrationinput.action">Register Here</a></h3>
  </div>
</body>
</html>