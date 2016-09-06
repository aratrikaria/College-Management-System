package com.system.management.college.faculty_module;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.system.management.college.student_module.StudentCurrAcademicModel;

public class FacultyView {
	
	private String facultyId;
	private ArrayList<String> listProfile = null;
	private BufferedReader bin = null;
	private FacultyPersonalModel facultyPersonalObj = null;
	private FacultyProcess facultyProcess = null;
	private StudentCurrAcademicModel studentAcademicObj = null;
	
	public FacultyView(String facultyId) {
		this.facultyId = facultyId;
	}

	public void viewProfile()
	{
		facultyPersonalObj.setFacultyId(facultyId);
		
		listProfile = facultyProcess.viewProfile(facultyPersonalObj);
		
		//
	}
	
	public void updatePersonalProfile() throws IOException
	{
		facultyPersonalObj.setFacultyId(facultyId);
		
		if(facultyProcess.updatePersonalProfile(facultyPersonalObj))
			System.out.println("Successfully updated");
		else
			System.out.println("Unsuccessful!!");
	}
	
	public void updateStudentAcademicProfile() throws IOException
	{
		System.out.println("Enter student id to be updated: ");
		String studentId = bin.readLine();
		
		studentAcademicObj.setStudentId(studentId);
		facultyPersonalObj.setFacultyId(facultyId);
		
		if(facultyProcess.updateStudentAcademicProfile(studentAcademicObj))
			;
	}
	
	public void mainFacultyFunc()
	{
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		facultyPersonalObj = new FacultyPersonalModel();
		facultyProcess = new FacultyProcess();
		studentAcademicObj = new StudentCurrAcademicModel();
		
		System.out.println("\n\tEnter your choice: \n\t1.View Profile\n\t2.Modify personal details: \n\t3.Update Student academic profile\n\tEnter your choice: ");
		int choice = 0;
		try {
			choice = Integer.parseInt(bin.readLine());
		} catch (NumberFormatException e1) {
			
			e1.printStackTrace();
			
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}

		
		if(choice == 1){			
			viewProfile();
		}			
		else if(choice == 2){
			
			try {
				updatePersonalProfile();				
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		
		else if(choice == 3){
			
			try {
				updateStudentAcademicProfile();				
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
	}
}
