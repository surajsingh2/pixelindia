package com.pixelindia.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.pixelindia.dao.ClientDAO;

public class LoginLogoutClientAction extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;

	private String email;
	private String password;
	private String jsppagemsg = "";
	private Map<String, Object> sessionMap;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJsppagemsg() {
		return jsppagemsg;
	}
	public void setJsppagemsg(String jsppagemsg) {
		this.jsppagemsg = jsppagemsg;
	}
	public Map<String, Object> getSessionMap() {
		return sessionMap;
	}
	public void setSessionMap(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}
	public String loginPageDisplay()
	{
		return "LOGINPAGEVIEW";
	}
	
	// FOR SESSION CREATION
	@Override
	public void setSession(Map<String, Object> sessionMap) 
	{
		this.sessionMap = sessionMap;
	}
	
	public String ClientLoginCheck()
	{
		ClientDAO clientdaoobj = new ClientDAO();
        boolean reply = clientdaoobj.ClientLoginCheck(email, password);
        
	    if(reply)
	    {
	    	sessionMap.put("uname", email);
	                 	        
		    return "SUCCESS";
	    }
	    else
	    {
	    	jsppagemsg = "INVALID USERID OR PASSWORD";
		    return "INVALID";
	    }
	}
	 public String logout() 
    {
        // remove userName from the session
        if (sessionMap.containsKey("uname")) 
        {
            sessionMap.remove("uname");
        }
        return "HOME";
    }
	
	
	public void validate()
	{
		if("".equals(email))
		{
			addFieldError("email", "EMAIL CAN'T BE BLANK");
		}
		
		if("".equals(password))
		{
			addFieldError("password", "PASSWORD CAN'T BE BLANK");
		}
	}



}


