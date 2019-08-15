package com.pixelindia.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.pixelindia.dao.BookingDAO;
import com.pixelindia.model.BookingDetails;

public class PhotographerBookingAction extends ActionSupport implements ModelDriven<BookingDetails>{
	private static final long serialVersionUID = 1L;
	private BookingDetails bookingobj = new BookingDetails();
	@Override
		public BookingDetails getModel() 
		{
			return bookingobj;
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
		
		public String bkPageDisplay()
		{
			return "BOOKINGPAGEVIEW";
		}
			
		public String addBookingRecord()
		{
			System.out.println("INSIDE ADD USER RECORD");
			
			BookingDAO Bookingdaoobj = new BookingDAO();
	        boolean reply = Bookingdaoobj.addBRecord(bookingobj);
	        
	        if(reply)
	        {
	        	jsppagemsg = "BOOKING DONE";
	        	
	        }
	        else
	        {
	        	jsppagemsg = "ERROR OCCURRED";
	        	
	        }	
	        
	        return "BKREPLY";
		}
}
