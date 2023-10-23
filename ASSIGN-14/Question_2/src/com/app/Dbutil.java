package com.app;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.jar.Attributes.Name;

public class Dbutil {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/ABC";
	public static final String DB_USER = "KD4_80130_Naveenkumar";
	public static final String DB_PASSWD = "naveenp";
	
	
	static{
		try{
		Class.forName(DB_DRIVER);
	}
	
    catch(ClassNotFoundException e){
    	e.printStackTrace();
		System.exit(1);
	}
	}
	
	
	public static Connection getConnection() throws SQLException{
        Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);	
        return con;
	}
	
}
