package com.pixelindia.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.pixelindia.dao.BookingDAO;
import com.pixelindia.model.BookingDetails;


public class ViewBookingAction extends ActionSupport{
	 private static final long serialVersionUID = 1L;
	 
	   private Integer pid = null;
	   
	   private String searcherrmsg = "";
	   private List<BookingDetails> blist = null;
	   
	    public String searchMeeting()
		{
	    	BookingDAO bkdaoobj = new BookingDAO();
	    	blist = bkdaoobj.searchRecord(pid);
		    if(blist.size()>0)
		    {
		    	return "DATAFOUND";
		    }
		    else
		    {
		    	searcherrmsg = "NO CURRENT BOOKING";
		    	return "DATANOTFOUND";
		    }
		}
	    
	    		public String getSearcherrmsg() {
			return searcherrmsg;
		}

		public void setSearcherrmsg(String searcherrmsg) {
			this.searcherrmsg = searcherrmsg;
		}

		public List<BookingDetails> getBlist() {
			return blist;
		}

		public void setBlist(List<BookingDetails> blist) {
			this.blist = blist;
		}

		public Integer getPid() {
			return pid;
		}

		public void setPid(Integer pid) {
			this.pid = pid;
		}

}
