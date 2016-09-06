package com.system.management.college.common_module.login;

import java.sql.Connection;

import com.system.management.college.common_module.DAO;


public class LoginProcess {

	private Connection conn = null;
	private DAO dao = null;
	
	public void validateUser(LoginModel login)
	{
		dao = DAO.getDAOInstance();
		conn = dao.getConnection("driver", "url", "usr", "pwd");
		//validate user
		boolean status = false;
		login.setStatus(status);	
	}
	
	public void insertUser(LoginModel login)
	{
		dao = DAO.getDAOInstance();
		conn = dao.getConnection("driver", "url", "usr", "pwd");
		//insert user
		boolean status = false;
		login.setStatus(status); 			
	}
	

}
