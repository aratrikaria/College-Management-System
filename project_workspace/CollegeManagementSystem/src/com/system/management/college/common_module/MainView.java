package com.system.management.college.common_module;

import com.system.management.college.admin_module.AdminView;
import com.system.management.college.common_module.login.LoginView;
import com.system.management.college.faculty_module.FacultyView;
import com.system.management.college.student_module.StudentView;

public class MainView {
	
	public final static int STUDENT_PRIVELEGE_LEVEL = 1;
	public final static int FACULTY_PRIVELEGE_LEVEL = 2;
	public final static int ADMIN_PRIVELEGE_LEVEL = 3;
	private LoginView login = null;

	public void admin()
	{
		
		login = new LoginView();
		//if sign in
		if(login.signIn("userId", "pwd", MainView.ADMIN_PRIVELEGE_LEVEL))
			;
		//else sign up
		else if (login.signUp("userId", "pwd", MainView.ADMIN_PRIVELEGE_LEVEL))
			;	
		AdminView adminView = new AdminView("userId");
		adminView.mainAdminFunc();
	}

	public void student()
	{
		
		login = new LoginView();
		//if sign in
		if(login.signIn("userId", "pwd", MainView.STUDENT_PRIVELEGE_LEVEL))
			;
		//else sign up
		else if (login.signUp("userId", "pwd",  MainView.STUDENT_PRIVELEGE_LEVEL))
			;
		StudentView studentView = new StudentView("userId");
		studentView.mainStudentFunc();
		
	}
	
	public void faculty()
	{
		
		login = new LoginView();
		//if sign in
		if(login.signIn("userId", "pwd", MainView.FACULTY_PRIVELEGE_LEVEL))
			;
		//else sign up
		else if (login.signUp("userId", "pwd", MainView.FACULTY_PRIVELEGE_LEVEL))
			;
		FacultyView facultyView = new FacultyView("userId");
		facultyView.mainFacultyFunc();
		
	}
	
	public static void main(String[] args) {
		
		String choice = null;
		/*
		 * 
		 * 
		 * switch (choice) {
		 * 		case 1:
			
			
			break;

		default:
			break;
		}
		 */

	}

}
