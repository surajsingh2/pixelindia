package com.pixelindia.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.pixelindia.dao.PhotographerDAO;
import com.pixelindia.model.PhotographerDetails;

public class DisplayAllUserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	List<PhotographerDetails> usrlist = null;
	private boolean noData = false;
	
	public boolean isNoData() 
	{
		return noData;
	}

	public void setNoData(boolean noData) 
	{
		this.noData = noData;
	}

	public List<PhotographerDetails> getUsrlist() 
	{
		return usrlist;
	}

	public void setUsrlist(List<PhotographerDetails> usrlist) 
	{
		this.usrlist = usrlist;
	}

	@Override
	public String execute() 
	{
		PhotographerDAO userdaoobj = new PhotographerDAO();
		usrlist = userdaoobj.displayAllPRecord();
		
		if(usrlist.size()>0)
		{
			noData = true;
		}
		else
		{
			noData = false;
		}
		
		return "DISPLAYALLUSER";
	}
	public String displayclient() 
	{
		PhotographerDAO userdaoobj = new PhotographerDAO();
		usrlist = userdaoobj.displayAllPCRecord();
		
		if(usrlist.size()>0)
		{
			noData = true;
		}
		else
		{
			noData = false;
		}
		
		return "DISPLAYALLP";
	}

}


