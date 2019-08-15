<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
</ul>
<ul>
<li><a href="displayallphotographer">Our Photographers </a>
<ul>
<li><a href="searchcategoryinput.action">Search By Category</a></li>
</ul>
</li>
<li><a>Profile</a> 
<ul>
<li><a href="" >View Profile</a></li>
<li><a href="logoutclient.action">Log Out</a></li>
</ul></li>
</ul>

<div  class="login-box">
	<span style="color: red;"><s:property value="searcherrmsg" /></span>

<div>
<s:form action="searchphotographer.action" method="post" >
<br>
<br>
<h3>Sort Photographers by Category</h3>
<s:select label="CATEGORY" name="category"  list="{'Select','Fashion','Portrait','Product','Wedding','Travel'}" value="" />
  
          <s:submit class="button-book" value="Search" align="right" />
     
     </s:form>    
</div>
</div>
</body>
</html>