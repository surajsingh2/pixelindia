<%@taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SEND MESSAGE</title>
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

<s:form action="message.action" method="post">
<br>
<br>
<br>
<br>
<h2>We Will Get Back To You Soon</h2>

          <s:textfield label="NAME" name="name" value=""  />
          <s:textfield label="EMAIL ID" name="emailid" value=""  />
          <s:textarea label="QUERY" name="query" value=""  />
          <s:submit value="SUBMIT" align="center" />
</s:form>

</body>
</html>