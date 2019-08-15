package com.pixelindia.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.pixelindia.dao.MessageDAO;
import com.pixelindia.model.MessageDetails; 

public class MessageAction extends ActionSupport implements ModelDriven<MessageDetails>{
	private static final long serialVersionUID = 1L;
private MessageDetails msgobj = new MessageDetails();
@Override
	public MessageDetails getModel() 
	{
		return msgobj;
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
	
	public String msgPageDisplay()
	{
		return "MESSAGEPAGEVIEW";
	}
		
	public String addmessageRecord()
	{
		System.out.println("INSIDE ADD USER RECORD");
		
		 MessageDAO msgdaoobj = new MessageDAO();
        boolean reply = msgdaoobj.addMessageRecord(msgobj);
        
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


}
