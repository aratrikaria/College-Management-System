package com.system.management.college.admin_module;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.system.management.college.common_module.MainView;
import com.system.management.college.department_module.DepartmentModel;
import com.system.management.college.faculty_module.FacultyProfModel;
import com.system.management.college.student_module.StudentPersonalModel;
import com.system.management.college.student_module.StudentPrevAcademicModel;

public class AdminView {
	
	private String adminId;
	private BufferedReader bin = null;
	private AdminProcess adminProcess= null;
	private FacultyProfModel facultyProfObj = null;
	private DepartmentModel departmentModel = null;
	private StudentPersonalModel studentPersonalModelObj = null;
	private StudentPrevAcademicModel studentPrevAcadObj = null;
	
	public AdminView(String adminId) {	
		this.adminId = adminId;
	}

	public void addUserDetails() throws NumberFormatException, IOException
	{
		System.out.println("Enter user type:\n\t1.Student\n\t2.Faculty: ");
		int userType = Integer.parseInt(bin.readLine());
		
		System.out.println("Enter user id:");
		String userId = bin.readLine();
		
		System.out.println("Enter department id: ");
		String departmentId = bin.readLine();
		
		departmentModel.setDepartmentId(departmentId);
		
		if(userType == 1){
			if(adminProcess.addUserDetails(userId, MainView.STUDENT_PRIVELEGE_LEVEL, departmentModel))
			//successfully added to the database	
				;
		}
		else if(userType == 2){
			if(adminProcess.addUserDetails(userId, MainView.FACULTY_PRIVELEGE_LEVEL, departmentModel))
			//successfully added to the database
				;			
		}
	}	
	
	public void addDepartmentDetails() throws IOException
	{
		System.out.println("Enter department id: ");
		String deptId=bin.readLine();
		
		System.out.println("Enter department name: ");
		String departmentName = bin.readLine();
		
		departmentModel.setDepartmentId(deptId);
		departmentModel.setDepartmentName(departmentName);
		
		adminProcess.addDepartmentDet(departmentModel);
	}
	
	public void deleteStudent() throws IOException
	{
		System.out.println("Enter student id : ");
		String studentId = bin.readLine();
		
		studentPersonalModelObj.setStudentId(studentId);
		
		if(adminProcess.deleteStudent(studentPersonalModelObj))
			;
	}
	
	public void deleteFaculty() throws IOException
	{
		System.out.println("Enter faculty id : ");
		String facultyId = bin.readLine();
		
		studentPersonalModelObj.setStudentId(facultyId);
		
		if(adminProcess.deleteStudent(studentPersonalModelObj))
			;
	}
	
	public void updateFacultyProfDet() throws IOException
	{
		System.out.println("Enter faculty id: ");
		String facultyId = bin.readLine();
		
		facultyProfObj.setFacultyId(facultyId);
		
		if(adminProcess.updateFacultyProfDet(facultyProfObj))
			;
	}
	
	public void updateStudentPrevProfessionalDet() throws IOException
	{
		System.out.println("Enter student id: ");
		String studentId = bin.readLine();
		
		studentPrevAcadObj.setStudentId(studentId);
		
		if(adminProcess.updateStudentPrevAcademicDet(studentPrevAcadObj))
			;
	}
	
	
	public void mainAdminFunc()
	{
		bin = new BufferedReader(new InputStreamReader(System.in));
		adminProcess = new AdminProcess();
		departmentModel = new DepartmentModel();
		studentPersonalModelObj = new StudentPersonalModel();
		studentPrevAcadObj = new StudentPrevAcademicModel();
		facultyProfObj = new FacultyProfModel();
		
		System.out.println("\n\tEnter your choice: \n\t1.Add User Details\n\t2.Add department details" +
				"\n\t3.Delete student\n\t4.delete faculty\n\t5.update faculty professional details\n\t" 
				+"6.update student previous academic details\n\tEnter your choice: ");
		int choice = 0;
		try {
			choice = Integer.parseInt(bin.readLine());
		} catch (NumberFormatException e1) {
			
			e1.printStackTrace();
			
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}

		
		if(choice == 1){
			
			try {
				addUserDetails();				
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}			
		else if(choice == 2){
			
			try {
				addDepartmentDetails();			
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		else if(choice == 3){
			
			try {
				deleteStudent();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		else if(choice == 4){
			
			try {
				deleteFaculty();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		else if(choice == 5){
			try {
				updateFacultyProfDet();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else if(choice == 6){
			try {
				updateStudentPrevProfessionalDet();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
