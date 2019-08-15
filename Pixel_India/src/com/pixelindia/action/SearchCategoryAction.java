package com.pixelindia.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.pixelindia.dao.PhotographerDAO;
import com.pixelindia.model.PhotographerDetails;


public class SearchCategoryAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	   private String category="";
	   
	   private String searcherrmsg = "";
	   private List<PhotographerDetails> usrlist1 = null;
	   
	    public String searchPageDisplay()
		{
			return "SEARCHPAGEVIEW";
		}
		
	    public String searchCategory()
		{
	    	PhotographerDAO cdaoobj = new PhotographerDAO();
	    	usrlist1 = cdaoobj.searchRecord(category.trim());
		    if(usrlist1.size()>0)
		    {
		    	return "USERFOUND";
		    }
		    else
		    {
		    	searcherrmsg = "NO DATA FOUND FOR THE SELECTED CATEGORY";
		    	return "USERNOTFOUND";
		    }
		}
	    
	 		public String getSearcherrmsg() {
			return searcherrmsg;
		}

		public void setSearcherrmsg(String searcherrmsg) {
			this.searcherrmsg = searcherrmsg;
		}

		public List<PhotographerDetails> getUsrlist1() {
			return usrlist1;
		}

		public void setUsrlist1(List<PhotographerDetails> usrlist1) {
			this.usrlist1 = usrlist1;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}
}
