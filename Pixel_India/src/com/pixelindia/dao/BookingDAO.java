package com.pixelindia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pixelindia.model.BookingDetails;


public class BookingDAO {
	public boolean  addBRecord(BookingDetails bobj) 
	{
		//System.out.println("INSIDE ADD RECORD METHOD IN DAO");
		//System.out.println(userobj.getEmail() + "  "+ userobj.getCountry());
		
		Connection connectionobject = null;
		PreparedStatement pst = null;
		boolean f = false;
		try
		{
	         connectionobject = DBConnect.getMySQLConnection();
		     
	         pst = connectionobject.prepareStatement("insert into booking values(?,?,?,?)");

	         pst.setInt(1, bobj.getPid());
	         pst.setString(2, bobj.getName());
		     pst.setString(3, bobj.getMobileno());
		     pst.setString(4, bobj.getMeetup());
		     	
		     
		     int i = pst.executeUpdate();
		     
		     System.out.println(i);
		     
		     if(i > 0 )
		    	 f = true;
           
	    }catch(SQLException e){e.printStackTrace();}
	     finally 
	     {
	    	 DBConnect.closeMySQLPreaparedStatementConnection(pst);
	    	 DBConnect.closeMySQLConnection(connectionobject);
		 }
		
	    return f;
	}
	
	public List<BookingDetails> searchRecord(Integer pid) 
	{
		//System.out.println("DAO "+emailid);
		Connection connectionobject = null;
		PreparedStatement pst = null;
		ResultSet rs =null;
		List<BookingDetails> msglist= new ArrayList<BookingDetails>();
		try
		{
	        connectionobject = DBConnect.getMySQLConnection();
		         
	        pst = connectionobject.prepareStatement("select * from booking where pid=?");
		  
			pst.setInt(1, pid);
		    		    	     
		    rs = pst.executeQuery();
		     
		    while(rs.next())
		     {
		    	 //CREATE STUDENT DETAIL OBJECT
		    	 BookingDetails mobj = new BookingDetails();
		    	 
		    	 //FETCH FROM RESULTSET & STORE VALUE WITIN OBJECT

			 	 mobj.setPid(rs.getInt(1));
		    	 mobj.setName(rs.getString(2));
			 	 mobj.setMobileno(rs.getString(3));
			 	 mobj.setMeetup(rs.getString(4));
		 						
				//ADDED TO THE ARRAYLIST
		 		msglist.add(mobj);
				
		     }
	    }catch(SQLException e){System.out.print(e.toString());}
		 finally 
	     {
			 DBConnect.closeMySQLPreaparedStatementConnection(pst);
			 DBConnect.closeMySQLResulsetConnection(rs);
			 DBConnect.closeMySQLConnection(connectionobject);
		 }
		System.out.println("No. Of BOOKING " + msglist.size());
	    return msglist;
	}
	}



