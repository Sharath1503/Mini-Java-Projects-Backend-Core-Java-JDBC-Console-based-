package com.generics.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {

	String name;
	int rollNo;
	String gender;
	String group;
	String address;

	void Student(String name, int rollNo, String gender, String group, String address) {

		this.name = name;
		this.rollNo = rollNo;
		this.gender = gender;
		this.group = group;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", gender=" + gender + ", group=" + group + ", address="
				+ address + "]";
	}
}

class Employee {
	String name;
	int id;
	String gender;
	double salary;
	String address;

	public void Employee(String name, int id, String gender, double salary, String address) {
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Gender=" + gender + ", salary=" + salary + ", address="
				+ address + "]";
	}
}

class Gen {
	public <E> void printDetails(E element) {
		System.out.println(element);
	}
}

public class GenEx1 {
	ArrayList<Employee> employeeList = new ArrayList<>();
	ArrayList<Student> studentList = new ArrayList<>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		GenEx1 obj = new GenEx1();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int choice;
		do {
			System.out.println("1. Student");
			System.out.println("2. Employee");
			System.out.println("0. Exit\n");
			System.out.println("Enter your Choice :");
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 0:
				System.exit(0);
				break;
			case 1:
				obj.Student();
				break;
			case 2:
				obj.Employee();
				break;
			default:
				System.out.println("Invalid Choice...");
			}

		} while (choice != 0);

	}

	public void Employee() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		do {
			System.out.println("\n1. Insert Employee");
			System.out.println("2. Retreiving Employees");
			System.out.println("3. Retreiving Student Details by ID");
			System.out.println("0. Exit");
			System.out.println("Choose Service : ");
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 0:
				System.exit(0);
				break;
			case 1:
				InsertEmployee();
				break;
			case 2:
				RetrieveAllEmployees();
				break;
			case 3:
				FindEmployeeByID();
				break;
			default:
				System.out.println("Invalid Choice...");
			}
		} while (choice != 0);

	}

	public void InsertEmployee() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Employee employee = new Employee();
		System.out.println("Enter Employee Name: ");
		employee.name = br.readLine();
		System.out.println("Enter Employee ID: ");
		employee.id = Integer.parseInt(br.readLine());
		System.out.println("Enter Employee Gender: ");
		employee.gender = br.readLine();
		System.out.println("Enter Employee Salary: ");
		employee.salary = Double.parseDouble(br.readLine());
		System.out.println("Enter Employee Address: ");
		employee.address = br.readLine();
		employeeList.add(employee);

	}

	public void RetrieveAllEmployees() {
		Iterator<Employee> iterator = employeeList.iterator();
		while (iterator.hasNext()) {
			Employee employee = iterator.next();
			System.out.println("\n\n\nEmployee Name: " + employee.id);
			System.out.println("Employee ID: " + employee.name);
			System.out.println("Employee Gender: " + employee.gender);
			System.out.println("Employee Salary: " + employee.salary);
			System.out.println("Employee Address:" + employee.address);
		}
	}

	public void FindEmployeeByID() throws IOException {
		int temp = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employee ID: ");
		int id = Integer.parseInt(br.readLine());
		Iterator<Employee> iterator = employeeList.iterator();
		while (iterator.hasNext()) {
			Employee employee = iterator.next();
			if (employee.id == id)
				temp = 1;
			{
				System.out.println("\n\n\nEmployee Name: " + employee.id);
				System.out.println("Employee ID: " + employee.name);
				System.out.println("Employee Gender: " + employee.gender);
				System.out.println("Employee Salary: " + employee.salary);
				System.out.println("Employee Address:" + employee.address);
			}

			if (temp == 0) {
				System.out.println("Invalid ID\n");
			}
		}

	}

	public void Student() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int choice;
		do {
			System.out.println("\n1. Insert Student");
			System.out.println("2. Retreiving Students");
			System.out.println("3. Retreiving Student Details by Rollnumber");
			System.out.println("0. Exit\n");
			System.out.println("Choose Service : ");
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 0:
				System.exit(0);
			default:
				System.out.println("Invalid Choice......");
				break;
			case 1:
				InsertStudent();
				break;
			case 2:
				AllStudents();
				break;
			case 3:
				FindStudentByRollnumber();
			}
		} while (choice != 0);

	}

	public void InsertStudent() throws IOException {

		Student student = new Student();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Student Name: ");
		student.name = br.readLine();
		System.out.println("Enter Student Rollnumber: ");
		student.rollNo = Integer.parseInt(br.readLine());
		System.out.println("Enter Student Gender: ");
		student.gender = br.readLine();
		System.out.println("Enter Student Group: ");
		student.group = br.readLine();
		System.out.println("Enter Student Address: ");
		student.address = br.readLine();
		studentList.add(student);

	}

	public void AllStudents() {
		Iterator<Student> iterator = studentList.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println("\n\n\nStudent Name: " + student.name);
			System.out.println("Student RollNumber: " + student.rollNo);
			System.out.println("Student Gender: " + student.gender);
			System.out.println("Student Group: " + student.group);
			System.out.println("Student Address:" + student.address);
		}
	}

	public void FindStudentByRollnumber() throws IOException {
		int temp = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Student ID: ");
		int rollno = Integer.parseInt(br.readLine());
		Iterator<Student> iterator = studentList.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			if (student.rollNo == rollno)
				temp = 1;

			System.out.println("\n\n\nStudent Name: " + student.name);
			System.out.println("Styudent RollNumber: " + student.rollNo);
			System.out.println("Student Gender: " + student.gender);
			System.out.println("Student Group: " + student.group);
			System.out.println("Stduent Address: " + student.address);
		}
		if (temp == 0) {
			System.out.println("Invalid ID\n");
		}
	}
}
