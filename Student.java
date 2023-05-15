package com.cityschool;

import java.util.Objects;

public class Student {
	private String firstName;
	private String lastName;
	private int id;
	private int marks;

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String firstName) {
		super();
		this.firstName = firstName;
	}

	public Student(String firstName, String lastName, int id, int marks) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.marks = marks;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, id, lastName, marks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(firstName, other.firstName) && id == other.id && Objects.equals(lastName, other.lastName)
				&& marks == other.marks;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", marks=" + marks + "]";
	}

	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

}
