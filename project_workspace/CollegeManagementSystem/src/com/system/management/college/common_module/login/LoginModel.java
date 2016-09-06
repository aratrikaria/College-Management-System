package com.system.management.college.common_module.login;

public class LoginModel {
	
	private String userId;
	private String pwd;
	private int privilege_level;
	private boolean status;
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public int getPrivelege_level() {
		return privilege_level;
	}
	
	public void setPrivelege_level(int privelege_level) {
		this.privilege_level = privelege_level;
	}
	
}
