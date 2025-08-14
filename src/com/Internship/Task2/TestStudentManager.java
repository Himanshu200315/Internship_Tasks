package com.Internship.Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudentManager {
	 ArrayList<Student> StudentsList = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	public void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student's Grade: ");
        String grade = scanner.nextLine();

        StudentsList.add(new Student(id, name, grade));
        System.out.println("Student added successfully!\n");
    }
	 public void removeStudent() {
	        System.out.print("Enter Student ID to remove: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();

	        boolean found = false;
	        for (Student s : StudentsList) {
	            if (s.getId() == id) {
	                StudentsList.remove(s);
	                found = true;
	                System.out.println("Student removed successfully!\n");
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Student with ID " + id + " not found.\n");
	        }
	    
	 }
	 public void displayStudents() {
	        if (StudentsList.isEmpty()) {
	            System.out.println("Students is not available.\n");
	        } else {
	            System.out.println("---- Student List ----");
	            for (Student s : StudentsList) {
	                System.out.println(s);
	            }
	            System.out.println();
	        }
	    }
	 public void menu() {
	        int choice;
	        do {
	            System.out.println("1. Add Student");
	            System.out.println("2. Remove Student");
	            System.out.println("3. Display Students");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    addStudent();
	                    break;
	                case 2:
	                    removeStudent();
	                    break;
	                case 3:
	                    displayStudents();
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice!\n");
	            }
	        } while (choice != 4);
	    }

	   
	    public static void main(String[] args) {
	        TestStudentManager Maneger = new TestStudentManager();

	        
	        Maneger.StudentsList.add(new Student(101, "Anujan", "A"));
	        Maneger.StudentsList.add(new Student(102, "Bablu", "B"));
	        Maneger.StudentsList.add(new Student(103, "Chaitali", "A"));
	        Maneger.StudentsList.add(new Student(104, "DJ", "B"));
	        Maneger.StudentsList.add(new Student(105, "Himanshu", "A"));
	        Maneger.StudentsList.add(new Student(106, "Bablu", "B"));

	       
	        Maneger .menu();
	    }
	}

	
	

