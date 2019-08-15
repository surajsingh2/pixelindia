<%@taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="Style1.css"> 
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
 
<s:form action="registrationclient" method="post" namespace="/">
<br>
<br>
<br>
<br>
<h2>Sign Up and get in Touch with the Best Photographers in Your City</h2>

         <s:textfield label="NAME" name="name" value=""  />
         
          <s:textfield label="EMAIL ID" name="email" value=""  />

          <s:password label="PASSWORD" name="password" value="" />
 
  
          <s:textfield label="Mobile No" name="mobileno" value="" />
           
           
          <s:textfield label="CITY" name="city"   value="" />
     
           
          <s:submit value="Resgister" align="center" />

</s:form>

   <s:set name="msg" value="jsppagemsg"/>
   
   <s:if test="%{#msg =='REGISTRATION SUCCESSFULL'}">
	   <span style="color: green;"><s:property value="jsppagemsg" /></span>
   </s:if>

   <s:if test="%{#msg=='ERROR OCCURRED'}">
      <span style="color: red;"><s:property value="jsppagemsg" /></span>
   </s:if>
<h3>Existing User?<a href="logininputclient.action">SIGN IN HERE</a></h3>
  
   <a href="index.action">GO TO INDEX PAGE</a>
   

</body>
</html>