package com.pixelindia.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.pixelindia.dao.PhotographerDAO;
import com.pixelindia.model.PhotographerDetails;

public class SearchPhotographerAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	   private String email="";
	   
	   private String searcherrmsg = "";
	   private List<PhotographerDetails> photographerlist1 = null;
	   
	    public String searchPageDisplay()
		{
			return "SEARCHPAGEVIEW";
		}
		
	    public String searchPhotographer()
		{
	    	PhotographerDAO Photographerdaoobj = new PhotographerDAO();
	    	photographerlist1 = Photographerdaoobj.searchPRecord(email.trim());
		    if(photographerlist1.size()>0)
		    {
		    	return "PHOTOGRAPHERFOUND";
		    }
		    else
		    {
		    	searcherrmsg = "PLEASE ENTER CORRECT EMAIL ID";
		    	return "PHOTOGRAPHERNOTFOUND";
		    }
		}
	    
	    public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSearcherrmsg() {
			return searcherrmsg;
		}

		public void setSearcherrmsg(String searcherrmsg) {
			this.searcherrmsg = searcherrmsg;
		}

		public List<PhotographerDetails> getPhotographerlist1() {
			return photographerlist1;
		}

		public void setPhotographerlist1(List<PhotographerDetails> photographerlist1) {
			this.photographerlist1 = photographerlist1;
		}
}
