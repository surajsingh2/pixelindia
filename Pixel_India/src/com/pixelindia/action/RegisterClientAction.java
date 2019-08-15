package com.pixelindia.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.pixelindia.dao.ClientDAO;
import com.pixelindia.model.ClientDetails; 

public class RegisterClientAction extends ActionSupport implements ModelDriven<ClientDetails> {
	private static final long serialVersionUID = 1L;
private ClientDetails clientobj = new ClientDetails();
@Override
	public ClientDetails getModel() 
	{
		return clientobj;
	}

	private String jsppagemsg = "";
	
	public String getJsppagemsg() 
	{
		return jsppagemsg;
	}

	public void setJsppagemsg(String jsppagemsg) 
	{
		this.jsppagemsg = jsppagemsg;
	}
	
	public String regPageDisplay()
	{
		return "REGISTRATIONPAGEVIEW";
	}
		
	public String addClientRecord()
	{
		System.out.println("INSIDE ADD USER RECORD");
		
		ClientDAO clientdaoobj = new ClientDAO();
        boolean reply = clientdaoobj.addClRecord(clientobj);
        
        if(reply)
        {
        	jsppagemsg = "REGISTRATION SUCCESSFULL";
        	
        }
        else
        {
        	jsppagemsg = "ERROR OCCURRED";
        	
        }	
        
        return "REGREPLY";
	}

	public void validate()
	{
		if("".equals(clientobj.getEmail()))
		{
			addFieldError("email", "EMAIL CAN'T BE BLANK");
		}
		
		if("".equals(clientobj.getPassword()))
		{
			addFieldError("password", "PASSWORD CAN'T BE BLANK");
		}
		
		if(clientobj.getPassword() != null)
		{
		   if((clientobj.getPassword().length() > 0) && (clientobj.getPassword().length() < 8))
		   {
			  addFieldError("password", "PASSWORD SHOULD BE MIN 8 CHAR");
		   }
		}
		
		if("".equals(clientobj.getMobileno()))
		{
			addFieldError("mobileno", "MOBILE NO CAN'T BE BLANK");
		}
		
		if(clientobj.getMobileno() != null)
		{
		   if((clientobj.getMobileno().length() > 0) && (clientobj.getMobileno().length() != 10))
		   {
		  	  addFieldError("mobileno", "MOBILE NO SHOULD BE 10 DIGIT");
		   }
		}
	}

}
