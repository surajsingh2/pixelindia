package com.pixelindia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pixelindia.model.MessageDetails;

public class MessageDAO {
	public boolean  addMessageRecord(MessageDetails msgobj) 
	{
		//System.out.println("INSIDE ADD RECORD METHOD IN DAO");
		//System.out.println(userobj.getEmail() + "  "+ userobj.getCountry());
		
		Connection connectionobject = null;
		PreparedStatement pst = null;
		boolean f = false;
		try
		{
	         connectionobject = DBConnect.getMySQLConnection();
		     
	         pst = connectionobject.prepareStatement("insert into message values(?,?,?)");

		     pst.setString(1, msgobj.getName());
		     pst.setString(2, msgobj.getEmailid());
		     pst.setString(3, msgobj.getQuery());
		     	
		     
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
	public List<MessageDetails> displayAllMRecord() 
	{
		Connection connectionobject = null;
		PreparedStatement pst = null;
		ResultSet rs =null;
		List<MessageDetails> photolist = new ArrayList<MessageDetails>();
		try
		{
	         connectionobject = DBConnect.getMySQLConnection();
		        	 	         
	         pst = connectionobject.prepareStatement("select * from message");
	        		     
	         rs = pst.executeQuery();
		     
		     while(rs.next())
		     {
		    	 //CREATE STUDENT DETAIL OBJECT
		    	MessageDetails pcobj = new MessageDetails();
		    	 
		    	 //FETCH FROM RESULTSET & STORE VALUE WITIN OBJECT
		    	
		 		pcobj.setName(rs.getString(1));
		    	pcobj.setEmailid(rs.getString(2));
                pcobj.setQuery(rs.getString(3));
		 	
				
				//ADDED TO THE ARRAYLIST
		 		photolist.add(pcobj);
				
		     }
	    }catch(SQLException e){System.out.print(e.toString());}
		finally 
	     {
			DBConnect.closeMySQLPreaparedStatementConnection(pst);
			DBConnect.closeMySQLResulsetConnection(rs);
			DBConnect.closeMySQLConnection(connectionobject);
		 }
		System.out.println(photolist.size());
		System.out.println("inside the list");
	    return photolist;
	}
	
	public List<MessageDetails> searchRecord(String emailid) 
	{
		//System.out.println("DAO "+emailid);
		Connection connectionobject = null;
		PreparedStatement pst = null;
		ResultSet rs =null;
		List<MessageDetails> msglist= new ArrayList<MessageDetails>();
		try
		{
	        connectionobject = DBConnect.getMySQLConnection();
		         
	        pst = connectionobject.prepareStatement("select * from message where emailid= ?");
		    pst.setString(1, emailid);
		    		    	     
		    rs = pst.executeQuery();
		     
		    while(rs.next())
		     {
		    	 //CREATE STUDENT DETAIL OBJECT
		    	 MessageDetails mobj = new MessageDetails();
		    	 
		    	 //FETCH FROM RESULTSET & STORE VALUE WITIN OBJECT

			 	 mobj.setName(rs.getString(1));
		    	 mobj.setEmailid(rs.getString(2));
			 	 mobj.setQuery(rs.getString(3));
		 						
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
		//System.out.println("LIST SIZE DAO " + studentlist.size());
	    return msglist;
	}
}


