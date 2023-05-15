package com.cityschool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//made changes by sudeep
public class StudentManagementSystem {

	public static void searchMenu(Scanner sc, List<Student> student) {

		int choice = 1;
		String name = "";
		while (choice != 0) {

			System.out.println("0. Exit");
			System.out.println("1. Linear search");
			System.out.println("2. Binary search");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			if (choice != 0) {
				System.out.print("Enter student name you want to search: ");
				name = sc.next();
			}

			switch (choice) {
			case 0:
				System.out.println("Thank you!");
				break;
			case 1:
				// linear search
				int index1 = StudentRecord.linearSearch(student, name);
				if (index1 != -1) {
					System.out.println(student.get(index1).toString());
				} else {
					System.out.println("Student not found...");
				}
				break;
			case 2:
				// binary search
				List<Student> sortedStudents = StudentRecord.selectionSortByFirstName(student);
				System.out.println("\nSorted by First Name using selection sort:\n " + sortedStudents.toString());
				int index2 = StudentRecord.recBinarySearch(sortedStudents, name);
				if (index2 != -1) {
					System.out.println("\nStudent found: " + sortedStudents.get(index2).toString());
				} else {
					System.out.println("\nStudent not found...");
				}
				break;
			default:
				System.out.println("Invalid choice, Please enter valid number...");
				break;
			}
		}
	}

	public static void sortMenu(Scanner sc, List<Student> student) {

		int sortChoice = 1;
		while (sortChoice != 0) {
			System.out.println("0. Exit");
			System.out.println("1. Selection sort");
			System.out.println("2. Bubble sort");
			System.out.println("3. Insertion sort");
			System.out.println("4. Merge sort");
			System.out.println("5. Quick sort");
			System.out.print("Enter your choice: ");
			sortChoice = sc.nextInt();

			switch (sortChoice) {
			case 0:
				System.out.println("Thank you!");
				break;
			case 1:
				// Selection sort
				System.out.println(
						"\nSorted by student grades using selection sort:\n " + StudentRecord.selectionSortByGrades(student).toString());
				break;
			case 2:
				// Bubble sort
				System.out.println(
						"\nSorted by student grades using bubble sort:\n " + StudentRecord.bubbleSortByGrades(student).toString());

				break;
			case 3:
				// Insertion sort
				System.out.println(
						"\nSorted by student gardes using Insertion sort:\n " + StudentRecord.insertionSortByGrades(student).toString());

				break;
			case 4:
				// Merge sort

				break;
			case 5:
				// Quick sort
				break;
			default:
				System.out.println("Invalid choice. Please try again.\n");
				break;
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Student> students = new ArrayList<Student>();

		int choice = 0;
		boolean exit = false;

		while (!exit) {

			System.out.println("Student Management System");
			System.out.println("1. Add a Student");
			System.out.println("2. Search a Student");
			System.out.println("3. Sort Students");
			System.out.println("4. Get All Students");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you!");
				break;
			case 1:
				students.addAll(StudentRecord.addStudent(sc, students));
				break;
			case 2:
				searchMenu(sc, students);
				break;
			case 3:
				sortMenu(sc, students);
				break;
			case 4:
				System.out.println(students.toString());
				break;
			case 5:
				exit = true;
				break;
			default:
				System.out.println("Invalid choice. Please try again.\n");
				break;
			}
		}
		sc.close();
	}
}
