package com.pixelindia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pixelindia.model.ClientDetails;


public class ClientDAO {
	public boolean  addClRecord(ClientDetails clientobj) 
	{
		//System.out.println("INSIDE ADD RECORD METHOD IN DAO");
		//System.out.println(userobj.getEmail() + "  "+ userobj.getCountry());
		
		Connection connectionobject = null;
		PreparedStatement pst = null;
		boolean f = false;
		try
		{
	         connectionobject = DBConnect.getMySQLConnection();
		     
	         pst = connectionobject.prepareStatement("insert into clientdetails values(?,?,?,?,?)");

		     pst.setString(1, clientobj.getName());
		     pst.setString(2, clientobj.getEmail());
		     pst.setString(3, clientobj.getPassword());
		     pst.setString(4, clientobj.getMobileno());  
		     pst.setString(5, clientobj.getCity()); 	
		     
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
	public boolean ClientLoginCheck(String email,String password) 
	{
		Connection connectionobject = null;
		PreparedStatement pst = null;
		ResultSet rs =null;
		boolean found = false;
		
		try
		{
	        connectionobject = DBConnect.getMySQLConnection();
		         
	        pst = connectionobject.prepareStatement("select * from clientdetails where email= ? and password = ?");
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

		
	public List<ClientDetails> searchRecord(String emailid) 
	{
		//System.out.println("DAO "+emailid);
		Connection connectionobject = null;
		PreparedStatement pst = null;
		ResultSet rs =null;
		List<ClientDetails> clientlist= new ArrayList<ClientDetails>();
		try
		{
	        connectionobject = DBConnect.getMySQLConnection();
		         
	        pst = connectionobject.prepareStatement("select * from clientdetails where email= ?");
		    pst.setString(1, emailid);
		    		    	     
		    rs = pst.executeQuery();
		     
		    while(rs.next())
		     {
		    	 //CREATE STUDENT DETAIL OBJECT
		    	 ClientDetails cobj = new ClientDetails();
		    	 
		    	 //FETCH FROM RESULTSET & STORE VALUE WITIN OBJECT

			 	 cobj.setName(rs.getString(1));
		    	 cobj.setEmail(rs.getString(2));
			 	 cobj.setPassword(rs.getString(3));
			 	 cobj.setMobileno(rs.getString(4)); 
			 	 cobj.setCity(rs.getString(5)); 
		 						
				//ADDED TO THE ARRAYLIST
		 		clientlist.add(cobj);
				
		     }
	    }catch(SQLException e){System.out.print(e.toString());}
		 finally 
	     {
			 DBConnect.closeMySQLPreaparedStatementConnection(pst);
			 DBConnect.closeMySQLResulsetConnection(rs);
			 DBConnect.closeMySQLConnection(connectionobject);
		 }
		//System.out.println("LIST SIZE DAO " + studentlist.size());
	    return clientlist;
	}
}
