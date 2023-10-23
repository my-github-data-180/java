package com.app;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements AutoCloseable {
	
	private Connection con;

	public UserDao() throws SQLException
	{
		con=Dbutil.getConnection();
	}
	
	public void close() {
		try {
			if(con!=null)
				con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public int createtable() throws SQLException {
		String sql="CREATE table users (id  int primary key auto_increment, first_name varchar(20),last_name varchar(20), email varchar(80) unique, password varchar(20), dob date, status boolean,role varchar(20))"; 
		try(PreparedStatement stmt =con.prepareStatement(sql)){
		int cnt=stmt.executeUpdate();
		return cnt;
		}
	}
	
	public int addtoTable(Users u) throws SQLException {
		String sql="Insert into users values(default,?,?,?,?,?,true,'user')";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
			stmt.setString(1, u.getFirst_name());
			stmt.setString(2, u.getLast_name());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPassword());
//			java.util.Date Dutil =parseDate(u.getDob());
//			java.sql.Date dob=new java.sql.Date(Dutil.getTime());
//			stmt.setDate(5, dob);
			java.sql.Date dob=new java.sql.Date(u.getDob().getTime());
			stmt.setDate(5,dob);
		int cnt=stmt.executeUpdate();
		return cnt;
		}
	}
	
	// it is needed for Date conversion from String to util date
	private Date parseDate(String dob) {
		try {
		SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yy");
		Date date = (Date) sdf.parse(dob);
		return date;	
	}
	catch(ParseException e) {
		e.printStackTrace();
		return null;
	}
	}	

	public List<Users> readfromTable() throws SQLException {
		String sql="SELECT * FROM users";
		List<Users> list =new ArrayList<Users>();
		try(PreparedStatement stmt=con.prepareStatement(sql)){
			try(ResultSet rs=stmt.executeQuery()){
				while(rs.next()) {
					int id=rs.getInt("id");
					String first_name=rs.getString("first_name");
					String last_name=rs.getString("last_name");
					String email=rs.getString("email");
					String paswrd=rs.getString("password");
					Date dob=rs.getDate("dob");
					boolean st=rs.getBoolean("status");
					String role=rs.getString("role");
				  Users u=new Users(id,first_name,last_name,email,paswrd,dob,st,role);	
			          list.add(u);
				}
				
			}
			
		}
		return list;
		
	}
	
	
	
       public int updateTable(Users u) throws SQLException {
    	   String sql ="UPDATE users set email=? ,password=? where id=?";
    	   try(PreparedStatement stmt =con.prepareStatement(sql)){
    		   stmt.setString(1,u.getEmail());
    		   stmt.setString(2,u.getPassword());
    		   stmt.setInt(3,u.getId());
    		   int cnt =stmt.executeUpdate();
    		   return cnt;
    		   
    	   }
       }
       
    
       
       public int deleteByid(int id) throws SQLException{
    	String sql="DELETE from users where id=?";   
       try(PreparedStatement stmt =con.prepareStatement(sql)){
               stmt.setInt(1, id);     	   
        	   int cnt=stmt.executeUpdate();
        	    return cnt;
           }	
        
       }
}
