package com.system.management.college.admin_module;

import java.sql.Connection;

import com.system.management.college.common_module.DAO;
import com.system.management.college.department_module.DepartmentModel;
import com.system.management.college.faculty_module.FacultyPersonalModel;
import com.system.management.college.faculty_module.FacultyProfModel;
import com.system.management.college.student_module.StudentPersonalModel;
import com.system.management.college.student_module.StudentPrevAcademicModel;

public class AdminProcess {
	
	private Connection conn = null;
	private DAO dao = null;	
	
	public boolean addUserDetails(String userId,final int privilege,DepartmentModel department)
	{
		dao = DAO.getDAOInstance();
		conn = dao.getConnection("driver", "url", "usr", "pwd");
		//adds student/faculty userId ,privilege and department id
		return false;		
	}
	
	public boolean addDepartmentDet(DepartmentModel department)
	{
		dao = DAO.getDAOInstance();
		conn = dao.getConnection("driver", "url", "usr", "pwd");
		
		//add department details
		return false;
	}
	
	public boolean deleteStudent(StudentPersonalModel student)
	{
		dao = DAO.getDAOInstance();
		conn = dao.getConnection("driver", "url", "usr", "pwd");
		
		//delete student details from database
		return false;
	}
	
	public boolean deleteFaculty(FacultyPersonalModel faculty)
	{
		dao = DAO.getDAOInstance();
		conn = dao.getConnection("driver", "url", "usr", "pwd");
		
		//delete faculty details from database
		return false;
	}
	
	public boolean updateFacultyProfDet(FacultyProfModel facultyProfObj)
	{
		dao = DAO.getDAOInstance();
		conn = dao.getConnection("driver", "url", "usr", "pwd");
		
		//update faculty professional details
		return false;
	}
	
	public boolean updateStudentPrevAcademicDet(StudentPrevAcademicModel studentPrevAcadObj)
	{
		dao = DAO.getDAOInstance();
		conn = dao.getConnection("driver", "url", "usr", "pwd");
		
		//update student previous academic details 
		return false;
	}
	
}
