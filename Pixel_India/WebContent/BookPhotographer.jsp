<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Booking of Photographer</title>
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

<s:form action="bookphotographer" method="post" namespace="/">

<br>
<br>
<br>
<br>
<h2>Feel Free to enter your choice of destination and time</h2>

         <s:textfield type="number" label="P ID" name="pid" value=""  />
         
          <s:textfield label="EMAIL ID" name="name" value=""  />

          <s:textfield label="CONTACT NO" name="mobileno" value="" />
 
  
          <s:textarea label="MEETING PLACE AND TIME" name="meetup" value="" />
           
           <s:submit value="BOOK" align="center" />

</s:form>

   <s:set name="msg" value="jsppagemsg"/>
   
   <s:if test="%{#msg =='BOOKING DONE'}">
	   <span style="color: green;"><s:property value="jsppagemsg" /></span>
   </s:if>

   <s:if test="%{#msg=='ERROR OCCURRED'}">
      <span style="color: red;"><s:property value="jsppagemsg" /></span>
   </s:if>

</body>
</html>