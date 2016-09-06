package com.system.management.college.common_module.login;

public class LoginView {

	private String userId;
	private String pwd;
	private int privilege_level;
	
	public boolean signIn(String userId,String pwd,int privilegeLevel){
		this.userId = userId;
		this.pwd = pwd;
		this.privilege_level = privilegeLevel;
		
		//Call LoginModel setter and pass the object of LoginModel to LoginProcess
		
		//validate user and if successful returns true else false
		LoginModel login = new LoginModel();
		login.setUserId(userId);
		login.setPwd(pwd);
		login.setPrivelege_level(privilegeLevel);
		
		if(login.isStatus())
			;
		return false;
	}
	
	public boolean signUp(String userId,String pwd,int privilegeLevel){
		this.userId = userId;
		this.pwd = pwd;
		this.privilege_level = privilegeLevel;
		
		//Call LoginModel setter and pass the object of LoginModel to LoginProcess
		//sign up user and if successful returns true else false
		//call LoginMOdel insertionOrValidationStatus()
		LoginModel login = new LoginModel();
		login.setUserId(userId);
		login.setPwd(pwd);
		login.setPrivelege_level(privilegeLevel);
		
		if(login.isStatus())
			;
		return false;
	}

}
