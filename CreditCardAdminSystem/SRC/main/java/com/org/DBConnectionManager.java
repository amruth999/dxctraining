package com.org;

import java.io.*;
import java.sql.*;
import java.util.Properties;


public class DBConnectionManager {
	private static Connection con=null;
	private static DBConnectionManager instance;
	private InputStream is=null;
	private DBConnectionManager() throws CreditCardAdminSystemException{
		
	}
	public static DBConnectionManager getInstance() throws CreditCardAdminSystemException{
	
		if(instance==null)
			 instance=new DBConnectionManager();
		
		
		return instance;
	
	}
	public Connection getConnection() throws IOException,SQLException,ClassNotFoundException{
		Properties pros=new Properties();
		
		is=this.getClass().getResourceAsStream("/database.properties");
		pros.load(is);
		Class.forName(pros.getProperty("driver"));
		con=DriverManager.getConnection(pros.getProperty("url"),pros.getProperty("username"),pros.getProperty("password"));
		is.close();
		return con;
		
	}
	

}
