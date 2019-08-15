<%@taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SIGN UP</title>
<link rel="Stylesheet" type="text/css" href="Style1.css">
</head>
<body>
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
<div class="login-box">

<s:form action="registration" method="post" namespace="/">
<br>
<br>
<h2>Show case your Skills and connect on our marketplace</h2>

          <s:textfield label="EMAIL ID" name="email" value=""  />

          <s:password label="PASSWORD" name="password" value="" />

          <s:textfield label="NAME" name="name" value=""  />
  
          <s:textfield label="Mobile No" name="mobileno" value="" />
           
          <s:radio label="GENDER" name="gender"  list="{'Male','Female'}" value=""  />
     
          <s:textfield label="CITY" name="city"   value="" />
     
           <s:select label="CATEGORY" name="category"  list="{'Select','Fashion','Portrait','Product','Wedding','Travel'}" value="" />
         
          <s:textfield label="WEBSITE" name="website"   value="" />
           
          <s:submit value="Register" align="center" />
          <br>
          <br>
          <br>
          <br>


</s:form>
<h3>Existing User?<a href="logininput.action">SIGN IN HERE</a></h3>
</div>
   <s:set name="msg" value="jsppagemsg"/>
   
   <s:if test="%{#msg =='REGISTRATION SUCCESSFULL'}">
	   <span style="color: green;"><s:property value="jsppagemsg" /></span>
   </s:if>

   <s:if test="%{#msg=='ERROR OCCURRED'}">
      <span style="color: red;"><s:property value="jsppagemsg" /></span>
   </s:if>
  
   
   
</body>
</html>