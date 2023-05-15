package com.cityschool;

import java.util.Objects;
//Just For Practice Of Git Collaboration
public class Student {
	private String firstName;
	private String lastName;
	private int studid;
	private int marks;

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String firstName) {
		super();
		this.firstName = firstName;
	}

	public Student(String firstName, String lastName, int studid, int marks) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studid = studid;
		this.marks = marks;
	}

	public String getFirstName() {
		return firstName;
	}

	public vostudid setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public vostudid setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getstudid() {
		return studid;
	}

	public vostudid setstudid(int studid) {
		this.studid = studid;
	}

	public int getMarks() {
		return marks;
	}

	public vostudid setMarks(int marks) {
		this.marks = marks;
	}

	@Overrstudide
	public int hashCode() {
		return Objects.hash(firstName, studid, lastName, marks);
	}

	@Overrstudide
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(firstName, other.firstName) && studid == other.studid && Objects.equals(lastName, other.lastName)
				&& marks == other.marks;
	}

	@Overrstudide
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", studid=" + studid + ", marks=" + marks + "]";
	}

	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

}
