package com.cityschool;

import java.util.List;
import java.util.Scanner;

public class StudentRecord {

	public static List<Student> addStudent(Scanner sc, List<Student> students) {

		System.out.println("Enter Student First Name:");
		String firstName = sc.nextLine();

		System.out.println("Enter Student Last Name:");
		String lastName = sc.nextLine();

		System.out.println("Enter Student ID:");
		int id = sc.nextInt();

		System.out.println("Enter Student grades :");
		int marks = sc.nextInt();

		Student student = new Student(firstName, lastName, id, grades);

		students.add(student);

		return students;

	}

	public static int linearSearch(List<Student> student, String keyName) {
		Student keyStudent = new Student(keyName);
		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).equals(keyStudent)) {
				return i;
			}
		}
		return -1;
	}

	public static int recBinarySearch(List<Student> student, String keyName) {
		int left = 0, right = student.size() - 1;
		return recBinarySearch(student, keyName, left, right);
	}

	public static int recBinarySearch(List<Student> student, String keyName, int left, int right) {
		if (left > right)
			return -1;

		int mid, index;

		mid = (left + right) / 2;
		Student keyStudent = new Student(keyName);
		if (keyStudent.equals(student.get(mid)))
			return mid;
		if (keyStudent.compareTo(student.get(mid)) < 0)
			index = recBinarySearch(student, keyName, left, mid - 1);
		else
			index = recBinarySearch(student, keyName, mid + 1, right);
		return index;
	}

	public static List<Student> swap(List<Student> tempStudent, int i, int j) {
		List<Student> students = tempStudent;
		Student temp1 = students.get(i);
		Student temp2 = students.get(j);
		students.remove(j);
		students.remove(i);
		students.add(i, temp2);
		students.add(j, temp1);
		return students;
	}

	public static List<Student> selectionSortByMarks(List<Student> tempStudent) {
		List<Student> student = tempStudent;
		System.out.println("Unsorted-" + student.toString());
		int pass = 0, itr = 0, swap = 0;
		for (int i = 0; i < student.size() - 1; i++) {
			pass++;
			for (int j = i + 1; j < student.size(); j++) {
				itr++;
				if (student.get(i).getGrades() > student.get(j).getGrades()) {
					swap++;
					student = swap(student, i, j);
				}
			}
		}
		return student;
		//		System.out.println("Pass = "+pass+" itr = "+itr+" swap = "+swap);
	}
	
	public static List<Student> selectionSortByFirstName(List<Student> tempStudent) {
		List<Student> student = tempStudent;
		for (int i = 0; i < student.size() - 1; i++) {
			for (int j = i + 1; j < student.size(); j++) {
				if ((student.get(i).getFirstName()).compareTo(student.get(j).getFirstName()) > 0) {
					student = swap(student, i, j);
				}
			}
		}
		return student;
	}

	public static List<Student> bubbleSortByMarks(List<Student> tempStudent) {
		List<Student> student = tempStudent;
		Boolean flag = false;
		int pass = 0, itr = 0, swap = 0;
		for (int j = 1; j < student.size(); j++) {
			pass++;
			for (int i = 0; i < student.size() - j; i++) {
				itr++;
				if (student.get(i).getGrades() > student.get(i + 1).getGrades()) {
					swap++;
					student = swap(student, i, i + 1);
					flag = true;
				}
			}
			if (flag == false)
				break;
		}
		return student;
		//		System.out.println("Pass = "+pass+" itr = "+itr+" swap = "+swap);
	}

	public static List<Student> insertionSortByMarks(List<Student> tempStudent) {
		List<Student> student = tempStudent;
		for (int i = 1; i < student.size(); i++) {
			int j;
			Student temp = student.get(i);
			for (j = i - 1; j >= 0 && student.get(j).getGrades() > temp.getGrades(); j--) { // if first condition false
				// second condition is not
				// evaluated ==> &&
				//				arr[j+1] = arr[j];

				student.remove(j + 1);
				student.add(j + 1, student.get(j));
			}
			student.remove(j + 1);
			student.add(j + 1, temp);
		}
		return student;
	}
}
