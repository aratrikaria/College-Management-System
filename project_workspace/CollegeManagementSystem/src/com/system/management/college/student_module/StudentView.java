package com.system.management.college.student_module;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentView {

	private String studentId;
	private ArrayList<String> listDet = null;
	private StudentProcess studentProcess = null;
	private StudentPersonalModel studentPersonalObj = null;
	private BufferedReader bin = null;
	
	public StudentView(String studentId) {
		this.studentId = studentId;
	}

	public void modifyStudDet() throws IOException {
			
		studentPersonalObj.setStudentId(studentId);
		
		if(studentProcess.modifyPersonalDetails(studentPersonalObj))
			System.out.println("Successfully updated");
		else
			System.out.println("Unsuccessful!!");
	}

	public void viewStudDet() throws IOException {

		studentPersonalObj.setStudentId(studentId);
		
		listDet = studentProcess.viewStudentDetails(studentPersonalObj);
		
		//show the student details from listDet
	}	
	
	public void mainStudentFunc()
	{
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		studentProcess = new StudentProcess();
		studentPersonalObj = new StudentPersonalModel();
		
		System.out.println("\n\tEnter your choice: \n\t1.View details\n\t2.Modify personal details: \n\tEnter your choice: ");
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
				viewStudDet();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
			
		else if(choice == 2){
			
			try {
				modifyStudDet();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}
