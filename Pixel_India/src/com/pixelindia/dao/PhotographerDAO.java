package com.pixelindia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pixelindia.model.PhotographerDetails;  
import com.pixelindia.dao.DBConnect;



public class PhotographerDAO {
	public boolean  addRecord(PhotographerDetails userobj) 
	{
		//System.out.println("INSIDE ADD RECORD METHOD IN DAO");
		//System.out.println(userobj.getEmail() + "  "+ userobj.getCountry());
		
		Connection connectionobject = null;
		PreparedStatement pst = null;
		boolean f = false;
		try
		{
	         connectionobject = DBConnect.getMySQLConnection();
		     
	         pst = connectionobject.prepareStatement("insert into photographerdetails values(null,?,?,?,?,?,?,?,?)");
		     
		     pst.setString(1, userobj.getEmail());
		     pst.setString(2, userobj.getPassword());
		     pst.setString(3, userobj.getName());
		     pst.setString(4, userobj.getMobileno()); 
		     pst.setString(5, userobj.getGender()); 
		     pst.setString(6, userobj.getCity());
		     pst.setString(7, userobj.getCategory());
		     pst.setString(8, userobj.getWebsite());
		     
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
	public List<PhotographerDetails> displayAllPRecord() 
	{
		Connection connectionobject = null;
		PreparedStatement pst = null;
		ResultSet rs =null;
		List<PhotographerDetails> photographerlist = new ArrayList<PhotographerDetails>();
		try
		{
	         connectionobject = DBConnect.getMySQLConnection();
		        	 	         
	         pst = connectionobject.prepareStatement("select * from photographerdetails");
	        		     
	         rs = pst.executeQuery();
		     
		     while(rs.next())
		     {
		    	 //CREATE STUDENT DETAIL OBJECT
		    	PhotographerDetails pobj = new PhotographerDetails();
		    	 
		    	 //FETCH FROM RESULTSET & STORE VALUE WITIN OBJECT
		    	pobj.setPid(rs.getInt(1));
		    	pobj.setEmail(rs.getString(2));
		 		pobj.setPassword(rs.getString(3));
		 		pobj.setName(rs.getString(4));
		 		pobj.setMobileno(rs.getString(5));
		 		pobj.setGender(rs.getString(6));
		 		pobj.setCity(rs.getString(7));
		 		pobj.setCategory(rs.getString(8));
		 		pobj.setWebsite(rs.getString(9));
		 						
				//ADDED TO THE ARRAYLIST
		 		photographerlist.add(pobj);
				
		     }
	    }catch(SQLException e){System.out.print(e.toString());}
		finally 
	     {
			DBConnect.closeMySQLPreaparedStatementConnection(pst);
			DBConnect.closeMySQLResulsetConnection(rs);
			DBConnect.closeMySQLConnection(connectionobject);
		 }
		System.out.println(photographerlist.size());
	    return photographerlist;
	}
	
	public List<PhotographerDetails> displayAllPCRecord() 
	{
		Connection connectionobject = null;
		PreparedStatement pst = null;
		ResultSet rs =null;
		List<PhotographerDetails> photolist = new ArrayList<PhotographerDetails>();
		try
		{
	         connectionobject = DBConnect.getMySQLConnection();
		        	 	         
	         pst = connectionobject.prepareStatement("select * from photographerdetails");
	        		     
	         rs = pst.executeQuery();
		     
		     while(rs.next())
		     {
		    	 //CREATE STUDENT DETAIL OBJECT
		    	PhotographerDetails pcobj = new PhotographerDetails();
		    	 
		    	 //FETCH FROM RESULTSET & STORE VALUE WITIN OBJECT
		    	pcobj.setPid(rs.getInt(1));
		    	pcobj.setEmail(rs.getString(2));
		 		pcobj.setName(rs.getString(4));
		 		pcobj.setMobileno(rs.getString(5));
		 		pcobj.setGender(rs.getString(6));
		 		pcobj.setCity(rs.getString(7));
		 		pcobj.setCategory(rs.getString(8));
		 		pcobj.setWebsite(rs.getString(9));
		 						
				
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
	
	public boolean deleteRecord(String email) 
	{
		Connection connectionobject = null;
		PreparedStatement pst = null;
		boolean f = false;
		try
		{
	         connectionobject = DBConnect.getMySQLConnection();
		     
	         pst = connectionobject.prepareStatement("delete from photographerdetails where email= ?");
		     pst.setString(1, email);
		    		    	     
		     int noofrecorddeleted = pst.executeUpdate();
		     
		     if(noofrecorddeleted > 0)
		     {
		    	 f = true;
		     }
	    }catch(SQLException e){System.out.print(e.toString());}
		finally 
	     {
			DBConnect.closeMySQLPreaparedStatementConnection(pst);
			DBConnect.closeMySQLConnection(connectionobject);
		 }
		
	    return f;
	}
	public boolean userLoginCheck(String email,String password) 
	{
		Connection connectionobject = null;
		PreparedStatement pst = null;
		ResultSet rs =null;
		boolean found = false;
		
		try
		{
	        connectionobject = DBConnect.getMySQLConnection();
		         
	        pst = connectionobject.prepareStatement("select * from photographerdetails where email= ? and password = ?");
		    pst.setString(1, email);
		    pst.setString(2, password);
		    		    	     
		    rs = pst.executeQuery();
		     
		   if(rs.next())
		   {
			   found = true;
				
		   }
	    }catch(SQLException e){System.out.print(e.toString());}
		 finally 
	     {
			 DBConnect.closeMySQLPreaparedStatementConnection(pst);
			 DBConnect.closeMySQLResulsetConnection(rs);
			 DBConnect.closeMySQLConnection(connectionobject);
		 }
		
	    return found;
	}
	public boolean updateRecord(PhotographerDetails sobj) 
	{
		Connection connectionobject = null;
		PreparedStatement pst = null;
		boolean f = false;
		try
		{
	         connectionobject = DBConnect.getMySQLConnection();
		     
	         pst = connectionobject.prepareStatement("update photographerdetails set  name=?, mobileno =?,gender=?,city=? where email=?");
		     
	         pst.setString(1, sobj.getName());
	         pst.setString(2, sobj.getMobileno());
	         pst.setString(3, sobj.getGender());
	         pst.setString(4, sobj.getCity()); 
		    		    	     
		     int noofrecorddeleted = pst.executeUpdate();
		     
		     if(noofrecorddeleted > 0)
		     {
		    	 f = true;
		     }
	    }catch(SQLException e){System.out.print(e.toString());}
		finally 
	     {
			DBConnect.closeMySQLPreaparedStatementConnection(pst);
			DBConnect.closeMySQLConnection(connectionobject);
		 }
		
	    return f;
		
	}
	
	public List<PhotographerDetails> searchRecord(String category) 
	{
		//System.out.println("DAO "+emailid);
		Connection connectionobject = null;
		PreparedStatement pst = null;
		ResultSet rs =null;
		List<PhotographerDetails> phlist= new ArrayList<PhotographerDetails>();
		try
		{
	        connectionobject = DBConnect.getMySQLConnection();
		         
	        pst = connectionobject.prepareStatement("select * from photographerdetails where category= ?");
		    pst.setString(1,category);
		    		    	     
		    rs = pst.executeQuery();
		     
		    while(rs.next())
		     {
		    	 //CREATE STUDENT DETAIL OBJECT
		    	 PhotographerDetails sobj = new PhotographerDetails();
		    	 
		    	 //FETCH FROM RESULTSET & STORE VALUE WITIN OBJECT
		    	 sobj.setPid(rs.getInt(1));
		    	 sobj.setEmail(rs.getString(2));
			 	 sobj.setName(rs.getString(4));
			 	 sobj.setMobileno(rs.getString(5)); 
			 	 sobj.setGender(rs.getString(6)); 
			 	 sobj.setCity(rs.getString(7));
			 	 sobj.setCategory(rs.getString(8));
			 	sobj.setWebsite(rs.getString(9));
		 						
				//ADDED TO THE ARRAYLIST
		 		phlist.add(sobj);
				
		     }
	    }catch(SQLException e){System.out.print(e.toString());}
		 finally 
	     {
			 DBConnect.closeMySQLPreaparedStatementConnection(pst);
			 DBConnect.closeMySQLResulsetConnection(rs);
			 DBConnect.closeMySQLConnection(connectionobject);
		 }
		System.out.println("LIST SIZE DAO " + phlist.size());
	    return phlist;
	}
 
	public List<PhotographerDetails> searchPRecord(String email) 
	{
		//System.out.println("DAO "+emailid);
		Connection connectionobject = null;
		PreparedStatement pst = null;
		ResultSet rs =null;
		List<PhotographerDetails> phlist2= new ArrayList<PhotographerDetails>();
		try
		{
	        connectionobject = DBConnect.getMySQLConnection();
		         
	        pst = connectionobject.prepareStatement("select * from photographerdetails where email= ?");
		    pst.setString(1,email);
		    		    	     
		    rs = pst.executeQuery();
		     
		    while(rs.next())
		     {
		    	 //CREATE STUDENT DETAIL OBJECT
		    	 PhotographerDetails phobj = new PhotographerDetails();
		    	 
		    	 //FETCH FROM RESULTSET & STORE VALUE WITIN OBJECT
		    	 phobj.setPid(rs.getInt(1));
		    	 phobj.setEmail(rs.getString(2));
		    	 phobj.setPassword(rs.getString(3));
			 	 phobj.setName(rs.getString(4));
			 	 phobj.setMobileno(rs.getString(5)); 
			 	 phobj.setGender(rs.getString(6)); 
			 	 phobj.setCity(rs.getString(7));
			 	 phobj.setCategory(rs.getString(8));
			 	 phobj.setWebsite(rs.getString(9));
		 						
				//ADDED TO THE ARRAYLIST
		 		phlist2.add(phobj);
				
		     }
	    }catch(SQLException e){System.out.print(e.toString());}
		 finally 
	     {
			 DBConnect.closeMySQLPreaparedStatementConnection(pst);
			 DBConnect.closeMySQLResulsetConnection(rs);
			 DBConnect.closeMySQLConnection(connectionobject);
		 }
		System.out.println("LIST SIZE DAO " + phlist2.size());
	    return phlist2;
	}
 

}
