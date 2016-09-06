package com.system.management.college.student_module;

import java.sql.Connection;
import java.util.ArrayList;

import com.system.management.college.common_module.DAO;

public class StudentProcess {

	private Connection conn = null;
	private DAO dao = null;	
	
	public ArrayList<String> viewStudentDetails(StudentPersonalModel student)
	{
		ArrayList<String> listStudentDet = new ArrayList<String>();
		dao = DAO.getDAOInstance();
		conn = dao.getConnection("driver", "url", "usr", "pwd");
		
		//get studentId and retrieve the student details from DB and return it as list to StudentView
		
		return listStudentDet;
	}
	
	public boolean modifyPersonalDetails(StudentPersonalModel student)
	{
		dao = DAO.getDAOInstance();
		conn = dao.getConnection("driver", "url", "usr", "pwd");
		
		//get studentId and personal details to be modified and 
		//retrieve the student details from DB and return if successfully modified
		
		return false;
	}
	 
}
