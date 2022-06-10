package com.mycom.collections.list;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentListHandler {

	public static void main(String[] args) {
		Student student = new Student();
		// To add student pojos to arraylist

		ArrayList<Student> studentList = new ArrayList<Student>();

		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter 1st Student Details:");
		System.out.println("Enter student id, name, marks");
		// do not use variables to input the values and send to setters
//		int id = scnr.nextInt();
//		student.setId(id);
		student.setId(scnr.nextInt());
		scnr.nextLine();
		student.setName(scnr.nextLine());
		student.setMarks(scnr.nextFloat());
		scnr.nextLine();

		// add the student object to studentList
		studentList.add(student);
		student = null;
		student = new Student();

		System.out.println("Enter 2nd student details");
		System.out.println("Enter student id, name, marks");
		// do not use variables to input the values and send to setters

		student.setId(scnr.nextInt());
		scnr.nextLine();
		student.setName(scnr.nextLine());
		student.setMarks(scnr.nextFloat());
		scnr.nextLine();

		// add the student object to studentList
		studentList.add(student);

		for (Student studentobj : studentList) {
			System.out.println("Student Id: " + studentobj.getId() + "\tStudent Name: " + studentobj.getName()
					+ "\tStudent Marks: " + studentobj.getMarks());
		}
	}

}
