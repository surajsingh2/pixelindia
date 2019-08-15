package com.pixelindia.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.pixelindia.dao.MessageDAO;
import com.pixelindia.model.MessageDetails;

public class ViewMessageAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	List<MessageDetails> msglist = null;
	private boolean noData = false;
	
	public boolean isNoData() 
	{
		return noData;
	}

	public void setNoData(boolean noData) 
	{
		this.noData = noData;
	}

	public List<MessageDetails> getMsglist() 
	{
		return msglist;
	}

	public void setMsglist(List<MessageDetails> msglist) 
	{
		this.msglist = msglist;
	}

	@Override
	public String execute() 
	{
		MessageDAO userdaoobj = new MessageDAO();
		msglist = userdaoobj.displayAllMRecord();
		
		if(msglist.size()>0)
		{
			noData = true;
		}
		else
		{
			noData = false;
		}
		
		return "DISPLAYALLMESSAGE";
	}
	}

