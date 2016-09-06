package com.system.management.college.faculty_module;

import java.sql.Connection;
import java.util.ArrayList;

import com.system.management.college.common_module.DAO;
import com.system.management.college.student_module.StudentCurrAcademicModel;

public class FacultyProcess {

	private Connection conn = null;
	private DAO dao = null;	
	
	public ArrayList<String> viewProfile(FacultyPersonalModel facultyPersonalObj)
	{
		dao = DAO.getDAOInstance();
		conn = dao.getConnection("driver", "url", "usr", "pwd");
		
		//get facultyId and retrieve personal profile, store it in a list and return it to FacultyView
		
		return null;		
	}

	public boolean updatePersonalProfile(FacultyPersonalModel facultyPersonalObj)
	{
		dao = DAO.getDAOInstance();
		conn = dao.getConnection("driver", "url", "usr", "pwd");
		
		//get facultyId and personal details to be updated and return status 
		return false;		
	}
	
	public boolean updateStudentAcademicProfile(StudentCurrAcademicModel studentAcadObj)
	{
		dao = DAO.getDAOInstance();
		conn = dao.getConnection("driver", "url", "usr", "pwd");
		
		//get studentId and facultyId and personal details to be updated and return status 
		//check the departmentId of Student and Faculty are the same
		return false;		
	}
	
}

