package com.system.management.college.common_module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DAO {

	private static DAO d = null;
	private DAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static DAO getDAOInstance(){
	if(d==null)
		d = new DAO();

	return d;
	}
	
	Scanner scanObj = new Scanner(System.in);
	Connection conn = null;
	PreparedStatement ptmt = null;
	
	public Connection getConnection(String driver, String url, String usr, String pwd)
	{

	
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(url,usr,pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return conn;
	}
}
