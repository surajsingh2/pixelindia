package com.pixelindia.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.pixelindia.dao.PhotographerDAO;
import com.pixelindia.model.PhotographerDetails; 

public class RegistrationAction extends ActionSupport implements ModelDriven<PhotographerDetails>{
	private static final long serialVersionUID = 1L;
	private int pid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid=pid;
	}
private PhotographerDetails userobj = new PhotographerDetails();
@Override
	public PhotographerDetails getModel() 
	{
		return userobj;
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
		
	public String addPhotographerRecord()
	{
		System.out.println("INSIDE ADD USER RECORD");
		
		PhotographerDAO userdaoobj = new PhotographerDAO();
        boolean reply = userdaoobj.addRecord(userobj);
        
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
		if("".equals(userobj.getEmail()))
		{
			addFieldError("email", "EMAIL CAN'T BE BLANK");
		}
		
		if("".equals(userobj.getPassword()))
		{
			addFieldError("password", "PASSWORD CAN'T BE BLANK");
		}
		
		if(userobj.getPassword() != null)
		{
		   if((userobj.getPassword().length() > 0) && (userobj.getPassword().length() < 8))
		   {
			  addFieldError("password", "PASSWORD SHOULD BE MIN 8 CHAR");
		   }
		}
		
		if("".equals(userobj.getMobileno()))
		{
			addFieldError("mobileno", "MOBILE NO CAN'T BE BLANK");
		}
		
		if(userobj.getMobileno() != null)
		{
		   if((userobj.getMobileno().length() > 0) && (userobj.getMobileno().length() != 10))
		   {
		  	  addFieldError("mobileno", "MOBILE NO SHOULD BE 10 DIGIT");
		   }
		}
	}
}
