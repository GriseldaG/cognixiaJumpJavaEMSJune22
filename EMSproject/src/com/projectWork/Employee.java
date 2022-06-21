package com.projectWork;

//import java.util.List;

// min have first name last name, id that is unique, date , salary, department
public class Employee {

	public static final int defaultKey = 0;
	private static final String defaultDate = "05/31/06"; //mm/dd/yy
	
	private int id;
	private int salary;
	
	// date a string, number or a date class..string mm/dd/yy
	private String date;
	
	
	// should i make them separate or an array or list...
	private String firstName;
	private String LastName;
	
	private String department;
	
	
	// constructor
	public Employee() {
		super();
		
		this.id = defaultKey;
		this.salary = 0;
		this.date = defaultDate;
		this.firstName = "First";
		LastName = "Last";
		this.department = "NA";
		
	}

	// id, salary, date, first, last , dept.
	public Employee(int id, int salary, String date, String firstName, String lastName, String department) {
		super();
		this.id = id;
		this.salary = salary;
		this.date = date;
		this.firstName = firstName;
		LastName = lastName;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [ID = " + id + ", salary = " + salary + ", date = " + date
				+ ", firstName = " + firstName + ", LastName = " + LastName + ", department = " + department + "]";
	}


	
	// getter/ setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
