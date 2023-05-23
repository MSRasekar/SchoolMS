package com.cityschool;

import java.util.Objects;
//Just For Practice Of Git Collaboration
public class Student {
	private String firstName;
	private String lastName;

	private int studentID;
	private int marks;


	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String firstName) {
		super();
		this.firstName = firstName;
	}

	public Student(String firstName, String lastName, int studentID, int marks) {

		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.marks = marks;
	}

	public String getFirstName() {
		return firstName;
	}

	public vostudentID setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public vostudentID setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getstudentID() {
		return studentID;
	}

	public vostudentID setstudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getGrades() {
		return marks;
	}


	public vostudentID setMarks(int marks) {

		this.marks = marks;
	}

	@OverrstudentIDe
	public int hashCode() {
		return Objects.hash(firstName, studentID, lastName, marks);
	}

	@OverrstudentIDe
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(firstName, other.firstName) && studentID == other.studentID && Objects.equals(lastName, other.lastName)
				&& marks == other.marks;
	}

	@OverrstudentIDe
	public String toString() {

		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", studentID=" + studentID + ", marks=" + marks + "]";

	}

	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

}
