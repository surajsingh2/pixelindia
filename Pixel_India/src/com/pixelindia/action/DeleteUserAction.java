package com.pixelindia.action;

import com.opensymphony.xwork2.ActionSupport;
import com.pixelindia.dao.PhotographerDAO;

public class DeleteUserAction extends ActionSupport  {
	private static final long serialVersionUID = 1L;
	String email="";
	String deletemsg="";
	
	
	
	@Override
	public String execute() 
	{
		PhotographerDAO sdaoobj = new PhotographerDAO();
        boolean reply = sdaoobj.deleteRecord(email);
        
        if(reply)
        {
        	deletemsg = "DELETE SUCCESSFULL";
        }
        else
        {
        	deletemsg = "NOT DELETED";
        }	
        
        return "DELETEUSER";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDeletemsg() {
		return deletemsg;
	}

	public void setDeletemsg(String deletemsg) {
		this.deletemsg = deletemsg;
	}

}
