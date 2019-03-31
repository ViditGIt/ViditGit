package com.nt.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

	public Connection getConnection(String url,String user,String pass)throws SQLException
	{
		return DriverManager.getConnection(url,user,pass);
	}
}
